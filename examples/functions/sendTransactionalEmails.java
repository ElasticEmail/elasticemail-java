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
