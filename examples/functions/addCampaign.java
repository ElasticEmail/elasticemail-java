/*
 * Add Campaign
 * Creates a new campaign. Status DRAFT saves it without sending; ACTIVE sends it right away.
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

public class addCampaign {
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

        Campaign campaign = new Campaign()
            .name("hello campaign")
            .status(CampaignStatus.DRAFT)
            .addContentItem(new CampaignTemplate()
                .from("myemail@domain.com")
                .replyTo("myemail@domain.com")
                .subject("Hello")
                .templateName("hello_template"))
            .recipients(new CampaignRecipient()
                .addListNamesItem("my list name"));

        try {
            Campaign created = campaigns.campaignsPost(campaign);
            System.out.println(created);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
