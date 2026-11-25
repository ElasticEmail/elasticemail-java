/*
 * Export Contacts
 * Exports contacts to a file and prints the download link.
 *
 * Required access level: Export
 */

import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.CompressionFormat;
import com.elasticemail.model.ExportFileFormats;
import com.elasticemail.model.ExportLink;

public class exportContacts {
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

        ContactsApi contacts = new ContactsApi(client);

        ExportFileFormats fileFormat = ExportFileFormats.CSV;
        CompressionFormat compression = CompressionFormat.NONE;
        String fileName = "exported.csv";

        try {
            ExportLink export = contacts.contactsExportPost(fileFormat, null, null, compression, fileName);
            System.out.println("Download link: " + export.getLink());
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
