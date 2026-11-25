# Add Template

`addTemplate.java` creates a new email template with an HTML and a plain-text body.

*Required Access Level: ModifyTemplates*

## What's a template?

A template is an email body saved under a name. You can reuse it for any number of emails and campaigns until you delete it.

## Preparation

You need Java 11 or later (the example code itself also compiles on Java 8) and the Elastic Email Java SDK on the classpath. [The examples README](../README.md) shows how to install the SDK from JitPack and build the classpath.

Create an API key with the access level above and put it in the `ELASTICEMAIL_API_KEY` environment variable:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Let's dig into the code

Create a file named `addTemplate.java`. Import the SDK classes:

```java
import com.elasticemail.api.TemplatesApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.Template;
import com.elasticemail.model.TemplatePayload;
import com.elasticemail.model.TemplateScope;
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

Create a `TemplatesApi` and describe the template: a name, a default subject, the body parts (HTML and plain text) and the scope. `TemplateScope.PERSONAL` keeps it in this account; `TemplateScope.GLOBAL` shares it with your subaccounts:

```java
TemplatesApi templates = new TemplatesApi(client);

TemplatePayload template = new TemplatePayload()
    .name("My new template")
    .subject("Default subject")
    .addBodyItem(new BodyPart()
        .contentType(BodyContentType.HTML)
        .content("<p>My template</p>")
        .charset("utf-8"))
    .addBodyItem(new BodyPart()
        .contentType(BodyContentType.PLAIN_TEXT)
        .content("My template")
        .charset("utf-8"))
    .templateScope(TemplateScope.PERSONAL);
```

Call `templatesPost` and print the new template:

```java
try {
    Template created = templates.templatesPost(template);
    System.out.println(created);
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
    System.exit(1);
}
```

On an error, the API's status code and message are printed and the program exits with status 1.

## The whole code to copy and paste

```java
/*
 * Add Template
 * Creates a new email template with an HTML and a plain-text body.
 *
 * Required access level: ModifyTemplates
 */

import com.elasticemail.api.TemplatesApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.Template;
import com.elasticemail.model.TemplatePayload;
import com.elasticemail.model.TemplateScope;

public class addTemplate {
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

        TemplatesApi templates = new TemplatesApi(client);

        TemplatePayload template = new TemplatePayload()
            .name("My new template")
            .subject("Default subject")
            .addBodyItem(new BodyPart()
                .contentType(BodyContentType.HTML)
                .content("<p>My template</p>")
                .charset("utf-8"))
            .addBodyItem(new BodyPart()
                .contentType(BodyContentType.PLAIN_TEXT)
                .content("My template")
                .charset("utf-8"))
            .templateScope(TemplateScope.PERSONAL);

        try {
            Template created = templates.templatesPost(template);
            System.out.println(created);
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
java -cp "$CP" addTemplate.java
```
