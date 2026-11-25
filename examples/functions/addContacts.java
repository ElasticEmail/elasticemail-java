/*
 * Add Contacts
 * Adds contacts (up to 1000 per call), optionally to one or more lists.
 *
 * Required access level: ModifyContacts
 */

import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.Contact;
import com.elasticemail.model.ContactPayload;
import com.elasticemail.model.ContactStatus;

import java.util.Arrays;
import java.util.List;

public class addContacts {
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

        List<ContactPayload> newContacts = Arrays.asList(
            new ContactPayload()
                .email("johnsmith@domain.com")
                .status(ContactStatus.ACTIVE)
                .firstName("John")
                .lastName("Smith"));
        List<String> listNames = Arrays.asList("New list");

        try {
            List<Contact> added = contacts.contactsPost(newContacts, listNames);
            System.out.println(added);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
