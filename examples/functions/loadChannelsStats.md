# Load Channels Stats

`loadChannelsStats.java` loads delivery statistics for your channels, 100 at a time.

*Required Access Level: ViewChannels*

## What statistics are returned?

Elastic Email groups the email you send over SMTP or the API into channels and counts recipients, delivered, opened, clicked, bounced, unsubscribed and other events for each channel.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `loadChannelsStats.java`. Import the SDK classes:

```java
import com.elasticemail.api.StatisticsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.ChannelLogStatusSummary;

import java.util.List;
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

Create a `StatisticsApi`. `limit` and `offset` page through the results:

```java
StatisticsApi statistics = new StatisticsApi(client);

int limit = 100;
int offset = 0;
```

Call `statisticsChannelsGet` and print the statistics for each channel:

```java
try {
    List<ChannelLogStatusSummary> stats = statistics.statisticsChannelsGet(limit, offset);
    System.out.println(stats);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
/*
 * Load Channels Stats
 * Loads delivery statistics for your channels, 100 at a time.
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

public class loadChannelsStats {
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
            List<ChannelLogStatusSummary> stats = statistics.statisticsChannelsGet(limit, offset);
            System.out.println(stats);
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
java -cp "$CP" loadChannelsStats.java
```
