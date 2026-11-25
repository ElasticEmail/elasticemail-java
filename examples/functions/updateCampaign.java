/*
 * Update Campaign
 * Updates an existing campaign by name. Status DRAFT keeps it unsent; ACTIVE sends it.
 *
 * Required access level: ModifyCampaigns
 */

import com.elasticemail.api.CampaignsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.Campaign;
import com.elasticemail.model.CampaignRecipient;
import com.elasticemail.model.CampaignStatus;
import com.elasticemail.model.CampaignTemplate;

public class updateCampaign {
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

        Campaign campaign = new Campaign()
            .name("hello campaign update")
            .status(CampaignStatus.DRAFT)
            .addContentItem(new CampaignTemplate()
                .from("myemail@domain.com")
                .replyTo("myemail@domain.com")
                .subject("Hello")
                .templateName("hello_template"))
            .recipients(new CampaignRecipient()
                .addListNamesItem("my list name"));

        try {
            Campaign updated = campaigns.campaignsByNamePut(name, campaign);
            System.out.println(updated);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
