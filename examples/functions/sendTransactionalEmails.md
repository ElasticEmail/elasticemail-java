# Send Transactional Emails

`sendTransactionalEmails.java` sends a transactional email (up to 50 recipients), passing an Idempotency-Key.

*Required Access Level: SendHttp*

## What's a transactional email?

A transactional email is sent in response to something a user did: an account change, a receipt, a confirmation. One call takes up to 50 recipients, and they see each other's addresses. For more recipients, send a bulk email.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `sendTransactionalEmails.java`. Import the SDK classes:

```java
import com.elasticemail.api.EmailsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.EmailContent;
import com.elasticemail.model.EmailSend;
import com.elasticemail.model.EmailTransactionalMessageData;
import com.elasticemail.model.TransactionalRecipient;

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

Create an `EmailsApi` and build the message: the recipients and the content, with both an HTML and a plain-text body. The `from` address must be on a domain you have verified in Elastic Email. Then create the `Idempotency-Key` for this send:

```java
EmailsApi emails = new EmailsApi(client);

EmailTransactionalMessageData message = new EmailTransactionalMessageData()
    .recipients(new TransactionalRecipient()
        .addToItem("johnsmith@domain.com"))
    .content(new EmailContent()
        .from("myemail@domain.com")
        .replyTo("myemail@domain.com")
        .subject("Example transactional email")
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.HTML)
            .content("<strong>Mail content.</strong>")
            .charset("utf-8"))
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.PLAIN_TEXT)
            .content("Mail content.")
            .charset("utf-8")));

// One key per logical send. Reuse it only to retry this same send.
String idempotencyKey = UUID.randomUUID().toString();
```

The call passes an `Idempotency-Key`. Create one key per logical send, before the first attempt, and reuse it only to retry that same send. If a retry reaches Elastic Email after the first request went through, it returns the stored response (same `TransactionID`) and sends nothing again.

Call `emailsTransactionalPost` with the message and the key, and print the `TransactionID` next to the key:

```java
try {
    EmailSend result = emails.emailsTransactionalPost(message, idempotencyKey);
    System.out.println("TransactionID: " + result.getTransactionID()
        + ", MessageID: " + result.getMessageID()
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
 * Send Transactional Emails
 * Sends a transactional email (up to 50 recipients), passing an Idempotency-Key.
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
import com.elasticemail.model.EmailSend;
import com.elasticemail.model.EmailTransactionalMessageData;
import com.elasticemail.model.TransactionalRecipient;

import java.util.UUID;

public class sendTransactionalEmails {
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

        EmailTransactionalMessageData message = new EmailTransactionalMessageData()
            .recipients(new TransactionalRecipient()
                .addToItem("johnsmith@domain.com"))
            .content(new EmailContent()
                .from("myemail@domain.com")
                .replyTo("myemail@domain.com")
                .subject("Example transactional email")
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.HTML)
                    .content("<strong>Mail content.</strong>")
                    .charset("utf-8"))
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.PLAIN_TEXT)
                    .content("Mail content.")
                    .charset("utf-8")));

        // One key per logical send. Reuse it only to retry this same send.
        String idempotencyKey = UUID.randomUUID().toString();

        try {
            EmailSend result = emails.emailsTransactionalPost(message, idempotencyKey);
            System.out.println("TransactionID: " + result.getTransactionID()
                + ", MessageID: " + result.getMessageID()
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
java -cp "$CP" sendTransactionalEmails.java
```
