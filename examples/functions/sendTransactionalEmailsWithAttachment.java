/*
 * Send Transactional Emails with an Attachment
 * Sends a transactional email with a file attached, passing an Idempotency-Key.
 * Pass the file path as the first argument (default: invoice.pdf in the current directory).
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
import com.elasticemail.model.MessageAttachment;
import com.elasticemail.model.TransactionalRecipient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class sendTransactionalEmailsWithAttachment {
    public static void main(String[] args) throws IOException {
        String apiKey = System.getenv("ELASTICEMAIL_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("Set the ELASTICEMAIL_API_KEY environment variable to your Elastic Email API key.");
            System.exit(1);
        }

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath("https://api.elasticemail.com/v4");
        ApiKeyAuth apikey = (ApiKeyAuth) client.getAuthentication("apikey");
        apikey.setApiKey(apiKey);

        Path attachment = Paths.get(args.length > 0 ? args[0] : "invoice.pdf");
        if (!Files.isRegularFile(attachment)) {
            System.err.println("Attachment file not found: " + attachment.toAbsolutePath());
            System.exit(1);
        }
        byte[] fileBytes = Files.readAllBytes(attachment);

        EmailsApi emails = new EmailsApi(client);

        EmailTransactionalMessageData message = new EmailTransactionalMessageData()
            .recipients(new TransactionalRecipient()
                .addToItem("johnsmith@domain.com"))
            .content(new EmailContent()
                .from("myemail@domain.com")
                .replyTo("myemail@domain.com")
                .subject("Example transactional email with attachment")
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.HTML)
                    .content("<strong>Your invoice is attached.</strong>")
                    .charset("utf-8"))
                .addBodyItem(new BodyPart()
                    .contentType(BodyContentType.PLAIN_TEXT)
                    .content("Your invoice is attached.")
                    .charset("utf-8"))
                .addAttachmentsItem(new MessageAttachment()
                    .binaryContent(fileBytes)
                    .name(attachment.getFileName().toString())
                    .contentType("application/pdf")));

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
