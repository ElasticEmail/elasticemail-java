/*
 * Upload Contacts
 * Uploads contacts from a CSV file (files/contacts.csv) to a list.
 * The CSV needs an Email column. Optional columns include FirstName, LastName, Status,
 * AllowUnsubscribe, ConsentDate, ConsentIP and ConsentTracking.
 *
 * Required access level: ModifyContacts
 */

import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;

import java.io.File;

public class uploadContacts {
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

        File csv = new File("files/contacts.csv");
        String listName = "example list";

        try {
            contacts.contactsImportPost(listName, "utf-8", null, csv);
            System.out.println("Contacts uploaded.");
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
