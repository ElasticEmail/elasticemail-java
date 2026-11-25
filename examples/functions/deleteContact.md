# Delete Contact

`deleteContact.java` deletes one contact by email address.

*Required Access Level: ModifyContacts*

## What's a contact?

Contacts are the recipients who receive your emails. You can group them in lists and segments.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `deleteContact.java`. Import the SDK classes:

```java
import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
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

Create a `ContactsApi` and set the email address of the contact to delete. To delete many contacts in one call, see [deleteContacts](deleteContacts.md):

```java
ContactsApi contacts = new ContactsApi(client);

String email = "johnsmith@domain.com";
```

Call `contactsByEmailDelete`. It returns nothing when the contact is deleted:

```java
try {
    contacts.contactsByEmailDelete(email);
    System.out.println("Contact deleted.");
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
/*
 * Delete Contact
 * Deletes one contact by email address.
 *
 * Required access level: ModifyContacts
 */

import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;

public class deleteContact {
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

        String email = "johnsmith@domain.com";

        try {
            contacts.contactsByEmailDelete(email);
            System.out.println("Contact deleted.");
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
java -cp "$CP" deleteContact.java
```
