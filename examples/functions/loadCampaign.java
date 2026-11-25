/*
 * Load Campaign
 * Loads one campaign by name: status, recipients, content and options.
 *
 * Required access level: ViewCampaigns
 */

import com.elasticemail.api.CampaignsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.Campaign;

public class loadCampaign {
    public static void main(String[] args) {
        String apiKey = System.getenv("ELASTICEMAIL_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("Set the ELASTICEMAIL_API_KEY environment variable to your Elastic Email API key.");
            System.exit(1);
        }

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath("https://api.elasticemail.com/v4");
        ApiKeyAuth apikey = (ApiKeyAuth) client.getAuthentication("apikey");
        apikey.setApiKey(apiKey);

        CampaignsApi campaigns = new CampaignsApi(client);

        String name = "hello campaign";

        try {
            Campaign campaign = campaigns.campaignsByNameGet(name);
            System.out.println(campaign);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
