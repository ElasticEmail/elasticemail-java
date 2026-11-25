# Elastic Email Java SDK examples

Small, runnable Java programs for common Elastic Email API v4 tasks: sending email, managing contacts, lists, templates and campaigns, and reading statistics.

Each example in [functions/](functions) is a single file with one public class named after the file and a `main` method, so you can run it straight from source with `java <name>.java`. Next to every `.java` file is a `.md` walkthrough that explains the code step by step.

## Requirements

- Java 11 or later to run the files from source (`java <name>.java`). The example code itself compiles on Java 8, so you can copy it into an existing Java 8 project.
- Maven, to download the SDK and its dependencies.
- An Elastic Email API key with the access level the example needs (listed in the table below). You can create one in your [API settings](https://help.elasticemail.com/en/articles/4799160-api-settings).

## Install the SDK and get the classpath

The examples need the SDK and its dependencies (OkHttp, Gson, gson-fire) on the classpath. Pick one of the two ways below. Both end with a `CP` shell variable that you pass to `java -cp`.

### From JitPack

The SDK is published on [JitPack](https://jitpack.io/#ElasticEmail/elasticemail-java). Create an empty folder with this `pom.xml`:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>
  <groupId>example</groupId>
  <artifactId>elasticemail-classpath</artifactId>
  <version>1.0</version>

  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.github.ElasticEmail</groupId>
      <artifactId>elasticemail-java</artifactId>
      <version>4.4.0</version>
    </dependency>
  </dependencies>
</project>
```

Then let Maven download the SDK and write its classpath to a file:

```bash
mvn dependency:build-classpath -Dmdep.outputFile=classpath.txt
CP="$(cat "$PWD/classpath.txt")"
```

### From a clone of this repository

```bash
git clone https://github.com/ElasticEmail/elasticemail-java.git
cd elasticemail-java
mvn -DskipTests package
CP="$PWD/target/elasticemail-4.4.0.jar:$PWD/target/lib/*"
```

`mvn package` builds the SDK JAR and copies its dependencies to `target/lib/`.

On Windows, separate classpath entries with `;` instead of `:`.

In your own Maven or Gradle project you don't need any of this: add the dependency as shown in the [main README](../README.md#installation) and copy the code from `main` into your application.

## Set your API key

The examples read the key from the `ELASTICEMAIL_API_KEY` environment variable and stop with a message if it isn't set:

```bash
export ELASTICEMAIL_API_KEY="your-api-key"
```

## Run an example

1. Open the example and replace the placeholder values: the sender (`myemail@domain.com`), recipients (`johnsmith@domain.com`), and list, template or campaign names. The sender must be on a domain you have verified in Elastic Email; see [How to verify your domain](https://help.elasticemail.com/en/articles/4934400-how-to-verify-your-domain).
2. Run it from the `functions` folder:

   ```bash
   cd examples/functions
   java -cp "$CP" sendTransactionalEmails.java
   ```

   A successful send prints the `TransactionID`, the `MessageID` and the `Idempotency-Key` it used.

Notes:

- `uploadContacts` reads `files/contacts.csv` relative to the current folder, so run it from `examples/functions`.
- `sendTransactionalEmailsWithAttachment` takes the file to attach as its first argument (default: `invoice.pdf` in the current folder): `java -cp "$CP" sendTransactionalEmailsWithAttachment.java invoice.pdf`.
- The send examples pass an `Idempotency-Key` so a retried send can't be delivered twice. See [Retry a send safely](../README.md#retry-a-send-safely-idempotency-key) in the main README.

## Examples

| Example | What it does | Access level | Walkthrough |
| --- | --- | --- | --- |
| [addCampaign](functions/addCampaign.java) | Creates a new campaign. Status DRAFT saves it without sending; ACTIVE sends it right away. | ModifyCampaigns | [addCampaign.md](functions/addCampaign.md) |
| [addContacts](functions/addContacts.java) | Adds contacts (up to 1000 per call), optionally to one or more lists. | ModifyContacts | [addContacts.md](functions/addContacts.md) |
| [addList](functions/addList.java) | Creates a new contact list and adds existing contacts to it. | ModifyContacts | [addList.md](functions/addList.md) |
| [addTemplate](functions/addTemplate.java) | Creates a new email template with an HTML and a plain-text body. | ModifyTemplates | [addTemplate.md](functions/addTemplate.md) |
| [deleteCampaign](functions/deleteCampaign.java) | Deletes a campaign by name. | ModifyCampaigns | [deleteCampaign.md](functions/deleteCampaign.md) |
| [deleteContact](functions/deleteContact.java) | Deletes one contact by email address. | ModifyContacts | [deleteContact.md](functions/deleteContact.md) |
| [deleteContacts](functions/deleteContacts.java) | Deletes several contacts in one call, by email address. | ModifyContacts | [deleteContacts.md](functions/deleteContacts.md) |
| [deleteList](functions/deleteList.java) | Deletes a contact list by name. The contacts on it stay in your account. | ModifyContacts | [deleteList.md](functions/deleteList.md) |
| [deleteTemplate](functions/deleteTemplate.java) | Deletes a template by name. | ModifyTemplates | [deleteTemplate.md](functions/deleteTemplate.md) |
| [exportContacts](functions/exportContacts.java) | Exports contacts to a file and prints the download link. | Export | [exportContacts.md](functions/exportContacts.md) |
| [loadCampaign](functions/loadCampaign.java) | Loads one campaign by name: status, recipients, content and options. | ViewCampaigns | [loadCampaign.md](functions/loadCampaign.md) |
| [loadCampaignsStats](functions/loadCampaignsStats.java) | Loads delivery statistics for your campaigns, 100 at a time. | ViewChannels | [loadCampaignsStats.md](functions/loadCampaignsStats.md) |
| [loadChannelsStats](functions/loadChannelsStats.java) | Loads delivery statistics for your channels, 100 at a time. | ViewChannels | [loadChannelsStats.md](functions/loadChannelsStats.md) |
| [loadList](functions/loadList.java) | Loads one contact list by name. | ViewContacts | [loadList.md](functions/loadList.md) |
| [loadStatistics](functions/loadStatistics.java) | Loads account statistics for the last 30 days. | ViewReports | [loadStatistics.md](functions/loadStatistics.md) |
| [loadTemplate](functions/loadTemplate.java) | Loads one template by name, including its body. | ViewTemplates | [loadTemplate.md](functions/loadTemplate.md) |
| [sendBulkEmails](functions/sendBulkEmails.java) | Sends one bulk email job with per-recipient merge fields, passing an Idempotency-Key. | SendHttp | [sendBulkEmails.md](functions/sendBulkEmails.md) |
| [sendTransactionalEmails](functions/sendTransactionalEmails.java) | Sends a transactional email (up to 50 recipients), passing an Idempotency-Key. | SendHttp | [sendTransactionalEmails.md](functions/sendTransactionalEmails.md) |
| [sendTransactionalEmailsWithAttachment](functions/sendTransactionalEmailsWithAttachment.java) | Sends a transactional email with a file attached, passing an Idempotency-Key. | SendHttp | [sendTransactionalEmailsWithAttachment.md](functions/sendTransactionalEmailsWithAttachment.md) |
| [updateCampaign](functions/updateCampaign.java) | Updates an existing campaign by name. Status DRAFT keeps it unsent; ACTIVE sends it. | ModifyCampaigns | [updateCampaign.md](functions/updateCampaign.md) |
| [uploadContacts](functions/uploadContacts.java) | Uploads contacts from a CSV file (files/contacts.csv) to a list. | ModifyContacts | [uploadContacts.md](functions/uploadContacts.md) |

More complete samples (web apps, webhooks, inbound email, SMTP) are in the [Elastic Email examples repository](https://github.com/ElasticEmail/elasticemail-examples/tree/main/java-elasticemail-examples).
