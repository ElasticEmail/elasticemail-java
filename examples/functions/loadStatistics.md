# Load Statistics

`loadStatistics.java` loads account statistics for the last 30 days.

*Required Access Level: ViewReports*

## What statistics are returned?

A summary of the email sent from your account in a date range: recipients, delivered, bounced, opened, clicked, unsubscribed, complaints and more.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `loadStatistics.java`. Import the SDK classes:

```java
import com.elasticemail.api.StatisticsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.LogStatusSummary;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
```

Inside `main`, read the API key from the environment and stop with a clear message if it's missing:

```java
String apiKey = System.getenv("ELASTICEMAIL_API_KEY");
if (apiKey == null || apiKey.isEmpty()) {
    System.err.println("Set the ELASTICEMAIL_API_KEY environment variable to your Elastic Email API key.");
    System.exit(1);
}
```

Configure the client with the API base URL and the key:

```java
ApiClient client = Configuration.getDefaultApiClient();
client.setBasePath("https://api.elasticemail.com/v4");
ApiKeyAuth apikey = (ApiKeyAuth) client.getAuthentication("apikey");
apikey.setApiKey(apiKey);
```

Create a `StatisticsApi` and set the date range. `from` is required; pass `null` as `to` to count up to now:

```java
StatisticsApi statistics = new StatisticsApi(client);

OffsetDateTime to = OffsetDateTime.now(ZoneOffset.UTC);
OffsetDateTime from = to.minusDays(30);
```

Call `statisticsGet` and print the summary:

```java
try {
    LogStatusSummary summary = statistics.statisticsGet(from, to);
    System.out.println("From " + from + " to " + to);
    System.out.println(summary);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
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
```

## Run the code

With `CP` set to the SDK classpath as shown in [the examples README](../README.md):

```bash
java -cp "$CP" loadStatistics.java
```
