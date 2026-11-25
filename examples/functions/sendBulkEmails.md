# Send Bulk Emails

`sendBulkEmails.java` sends one bulk email job with per-recipient merge fields, passing an Idempotency-Key.

*Required Access Level: SendHttp*

## What's a bulk email?

A bulk email is one message sent to many recipients in one job. Each recipient can get their own merge fields, such as `{name}`, which Elastic Email fills in per recipient.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `sendBulkEmails.java`. Import the SDK classes:

```java
import com.elasticemail.api.EmailsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.EmailContent;
import com.elasticemail.model.EmailMessageData;
import com.elasticemail.model.EmailRecipient;
import com.elasticemail.model.EmailSend;

import java.util.UUID;
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

Create an `EmailsApi` and build the message: the recipients, each with their own merge fields, and the content. `{name}` in the body is replaced with each recipient's `name` field. Set both an HTML and a plain-text body. The `from` address must be on a domain you have verified in Elastic Email. Then create the `Idempotency-Key` for this send:

```java
EmailsApi emails = new EmailsApi(client);

EmailMessageData message = new EmailMessageData()
    .addRecipientsItem(new EmailRecipient()
        .email("johnsmith@domain.com")
        .putFieldsItem("name", "John"))
    .content(new EmailContent()
        .from("myemail@domain.com")
        .replyTo("myemail@domain.com")
        .subject("Example email")
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.HTML)
            .content("<strong>Hi {name}!</strong>")
            .charset("utf-8"))
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.PLAIN_TEXT)
            .content("Hi {name}!")
            .charset("utf-8")));

// One key per logical send. Reuse it only to retry this same send.
String idempotencyKey = UUID.randomUUID().toString();
```

The call passes an `Idempotency-Key`. Create one key per logical send, before the first attempt, and reuse it only to retry that same send. If a retry reaches Elastic Email after the first request went through, it returns the stored response (same `TransactionID`) and sends nothing again.

Call `emailsPost` with the message and the key, and print the `TransactionID` next to the key:

```java
try {
    EmailSend result = emails.emailsPost(message, idempotencyKey);
    System.out.println("TransactionID: " + result.getTransactionID()
        + ", Idempotency-Key: " + idempotencyKey);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
/*
 * Send Bulk Emails
 * Sends one bulk email job with per-recipient merge fields, passing an Idempotency-Key.
 *
 * Required access level: SendHttp
 */

import com.elasticemail.api.EmailsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.EmailContent;
import com.elasticemail.model.EmailMessageData;
import com.elasticemail.model.EmailRecipient;
import com.elasticemail.model.EmailSend;

import java.util.UUID;

public class sendBulkEmails {
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

        EmailsApi emails = new EmailsApi(client);

        EmailMessageData message = new EmailMessageData()
            .addRecipientsItem(new EmailRecipient()
                .email("johnsmith@domain.com")
                .putFieldsItem("name", "John"))
            .content(new EmailContent()
                .from("myemail@domain.com")
                .replyTo("myemail@domain.com")
                .subject("Example email")
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.HTML)
                    .content("<strong>Hi {name}!</strong>")
                    .charset("utf-8"))
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.PLAIN_TEXT)
                    .content("Hi {name}!")
                    .charset("utf-8")));

        // One key per logical send. Reuse it only to retry this same send.
        String idempotencyKey = UUID.randomUUID().toString();

        try {
            EmailSend result = emails.emailsPost(message, idempotencyKey);
            System.out.println("TransactionID: " + result.getTransactionID()
                + ", Idempotency-Key: " + idempotencyKey);
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
java -cp "$CP" sendBulkEmails.java
```
