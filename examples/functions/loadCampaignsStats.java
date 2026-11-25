/*
 * Load Campaigns Stats
 * Loads delivery statistics for your campaigns, 100 at a time.
 *
 * Required access level: ViewChannels
 */

import com.elasticemail.api.StatisticsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.ChannelLogStatusSummary;

import java.util.List;

public class loadCampaignsStats {
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

        StatisticsApi statistics = new StatisticsApi(client);

        int limit = 100;
        int offset = 0;

        try {
            List<ChannelLogStatusSummary> stats = statistics.statisticsCampaignsGet(limit, offset);
            System.out.println(stats);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
