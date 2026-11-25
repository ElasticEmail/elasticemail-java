/*
 * Load Statistics
 * Loads account statistics for the last 30 days.
 *
 * Required access level: ViewReports
 */

import com.elasticemail.api.StatisticsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.LogStatusSummary;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class loadStatistics {
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

        OffsetDateTime to = OffsetDateTime.now(ZoneOffset.UTC);
        OffsetDateTime from = to.minusDays(30);

        try {
            LogStatusSummary summary = statistics.statisticsGet(from, to);
            System.out.println("From " + from + " to " + to);
            System.out.println(summary);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
