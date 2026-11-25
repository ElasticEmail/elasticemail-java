# Update Campaign

`updateCampaign.java` updates an existing campaign by name. Status DRAFT keeps it unsent; ACTIVE sends it.

*Required Access Level: ModifyCampaigns*

## What's a campaign?

When you send an email to a group of contacts in Elastic Email, we call that a campaign. A campaign needs a template (the email body) and recipients (a list or a segment of contacts).

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `updateCampaign.java`. Import the SDK classes:

```java
import com.elasticemail.api.CampaignsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.Campaign;
import com.elasticemail.model.CampaignRecipient;
import com.elasticemail.model.CampaignStatus;
import com.elasticemail.model.CampaignTemplate;
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

Create a `CampaignsApi`, set the name of the campaign to update and describe the campaign as it should be after the update. The whole campaign is replaced, so send every field you want to keep. `CampaignStatus.DRAFT` keeps it unsent; `CampaignStatus.ACTIVE` sends it:

```java
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
```

Call `campaignsByNamePut` with the current name and the new campaign, and print the result:

```java
try {
    Campaign updated = campaigns.campaignsByNamePut(name, campaign);
    System.out.println(updated);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
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
```

## Run the code

With `CP` set to the SDK classpath as shown in [the examples README](../README.md):

```bash
java -cp "$CP" updateCampaign.java
```
