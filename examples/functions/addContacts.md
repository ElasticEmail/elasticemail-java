# Add Contacts

`addContacts.java` adds contacts (up to 1000 per call), optionally to one or more lists.

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

Create a file named `addContacts.java`. Import the SDK classes:

```java
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

Create a `ContactsApi` and build the contacts to add, up to 1000 per call. Pass the names of the lists to add them to, or `null` to add them to your contacts without a list:

```java
ContactsApi contacts = new ContactsApi(client);

List<ContactPayload> newContacts = Arrays.asList(
    new ContactPayload()
        .email("johnsmith@domain.com")
        .status(ContactStatus.ACTIVE)
        .firstName("John")
        .lastName("Smith"));
List<String> listNames = Arrays.asList("New list");
```

Call `contactsPost` and print the contacts that were added:

```java
try {
    List<Contact> added = contacts.contactsPost(newContacts, listNames);
    System.out.println(added);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
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
```

## Run the code

With `CP` set to the SDK classpath as shown in [the examples README](../README.md):

```bash
java -cp "$CP" addContacts.java
```
