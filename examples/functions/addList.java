/*
 * Add List
 * Creates a new contact list and adds existing contacts to it.
 *
 * Required access level: ModifyContacts
 */

import com.elasticemail.api.ListsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.ContactsList;
import com.elasticemail.model.ListPayload;

public class addList {
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

        ListsApi lists = new ListsApi(client);

        ListPayload list = new ListPayload()
            .listName("Best contacts")
            .allowUnsubscribe(true)
            .addEmailsItem("johnsmith@domain.com");

        try {
            ContactsList created = lists.listsPost(list);
            System.out.println(created);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
