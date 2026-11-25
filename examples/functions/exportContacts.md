# Export Contacts

`exportContacts.java` exports contacts to a file and prints the download link.

*Required Access Level: Export*

## What's a contact?

Contacts are the recipients who receive your emails. You can group them in lists and segments.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `exportContacts.java`. Import the SDK classes:

```java
import com.elasticemail.api.ContactsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.CompressionFormat;
import com.elasticemail.model.ExportFileFormats;
import com.elasticemail.model.ExportLink;
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

Create a `ContactsApi` and choose the export options: the file format (`CSV`, `XML` or `JSON`), the compression (`NONE` or `ZIP`) and the file name. To export only some contacts, pass a `rule` (for example `"Status = Engaged"`) or a list of emails instead of `null`:

```java
ContactsApi contacts = new ContactsApi(client);

ExportFileFormats fileFormat = ExportFileFormats.CSV;
CompressionFormat compression = CompressionFormat.NONE;
String fileName = "exported.csv";
```

Call `contactsExportPost`. It returns an `ExportLink` with the URL to download the file from:

```java
try {
    ExportLink export = contacts.contactsExportPost(fileFormat, null, null, compression, fileName);
    System.out.println("Download link: " + export.getLink());
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
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
```

## Run the code

With `CP` set to the SDK classpath as shown in [the examples README](../README.md):

```bash
java -cp "$CP" exportContacts.java
```
