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
