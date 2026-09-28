<div align="center">

<img src=".github/ee-logo.png" alt="Elastic Email" width="96" />

# Elastic Email Java SDK

The official Java client library for the [Elastic Email](https://elasticemail.com) REST API v4.

[![JitPack](https://img.shields.io/jitpack/version/com.github.ElasticEmail/elasticemail-java?label=JitPack&color=2E7D32)](https://jitpack.io/#ElasticEmail/elasticemail-java)
[![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?logo=openjdk&logoColor=white)](https://adoptium.net)
[![API](https://img.shields.io/badge/API-v4-0A7BBB)](https://elasticemail.com/developers/api-documentation/rest-api)
[![OpenAPI Generator](https://img.shields.io/badge/generated%20by-OpenAPI%20Generator-6BA539?logo=openapiinitiative&logoColor=white)](https://openapi-generator.tech)
[![License: MIT](https://img.shields.io/github/license/ElasticEmail/elasticemail-java?color=yellow)](LICENSE)

[![Latest release](https://img.shields.io/github/v/release/ElasticEmail/elasticemail-java?logo=github&label=release)](https://github.com/ElasticEmail/elasticemail-java/releases)
[![Last commit](https://img.shields.io/github/last-commit/ElasticEmail/elasticemail-java?logo=github)](https://github.com/ElasticEmail/elasticemail-java/commits/master)
[![Open issues](https://img.shields.io/github/issues/ElasticEmail/elasticemail-java?logo=github)](https://github.com/ElasticEmail/elasticemail-java/issues)
[![GitHub stars](https://img.shields.io/github/stars/ElasticEmail/elasticemail-java?style=flat&logo=github)](https://github.com/ElasticEmail/elasticemail-java/stargazers)

[Installation](#installation) •
[Quick start](#quick-start) •
[Examples](#more-examples) •
[API reference](#api-reference) •
[Models](#models) •
[Contributing](#contributing)

</div>

---

## Features

- **Transactional and bulk email.** Send single messages, bulk campaigns or CSV merge-file sends.
- **Contacts, lists and segments.** Add, update, import, export and bulk-delete contacts.
- **Campaigns and automations.** Create, update, pause and trigger automations for a contact.
- **Templates, files and attachments.** Manage templates and uploaded files.
- **Domains.** Verify sending domains and check SPF, DKIM, tracking and certificate status.
- **Webhooks and inbound routes.** Receive delivery events and route incoming mail.
- **Statistics, events and suppressions.** Track delivery, bounces, complaints and unsubscribes.
- **Subaccounts and security.** Manage subaccounts and API keys.
- **Sync and async.** Every endpoint has a blocking method, a `…WithHttpInfo` variant that returns status code and headers, and an `…Async` method that takes an `ApiCallback`.

## Requirements

| Tool | Version |
| --- | --- |
| Java | 8 or later |
| Maven | 3.8.3 or later (or Gradle 7.2 or later) |

You'll also need an Elastic Email **API key**. You can create one in your [API settings](https://app.elasticemail.com/marketing/settings/new/manage-api). Each endpoint's documentation lists the access level it needs.

## Installation

The SDK is published on [JitPack](https://jitpack.io/#ElasticEmail/elasticemail-java). Add the JitPack repository and the dependency to your build.

**Maven** (`pom.xml`):

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.ElasticEmail</groupId>
  <artifactId>elasticemail-java</artifactId>
  <version>4.2.0</version>
</dependency>
```

**Gradle** (`build.gradle`):

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ElasticEmail:elasticemail-java:4.2.0'
}
```

Maven or Gradle pulls in the dependencies ([OkHttp](https://square.github.io/okhttp/), [Gson](https://github.com/google/gson) and [gson-fire](https://github.com/julman99/gson-fire)) for you.

<details>
<summary>Build from source instead</summary>

```bash
git clone https://github.com/ElasticEmail/elasticemail-java.git
cd elasticemail-java
mvn clean install
```

This installs `com.elasticemail:elasticemail:4.2.0` to your local Maven repository. To get a single JAR, run `mvn clean package` and use `target/elasticemail-4.2.0.jar` together with the JARs in `target/lib/`.

</details>

## Quick start

### Configure the client

```java
import com.elasticemail.api.EmailsApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.*;

ApiClient client = Configuration.getDefaultApiClient();
client.setBasePath("https://api.elasticemail.com/v4");

ApiKeyAuth apikey = (ApiKeyAuth) client.getAuthentication("apikey");
apikey.setApiKey(System.getenv("ELASTICEMAIL_API_KEY"));
```

> [!TIP]
> Keep your API key out of source code. Load it from an environment variable, a system property or a secrets manager.

### Send a transactional email

```java
EmailsApi emails = new EmailsApi(client);

EmailTransactionalMessageData message = new EmailTransactionalMessageData()
    .recipients(new TransactionalRecipient().addToItem("john.doe@example.com"))
    .content(new EmailContent()
        .from("My App <no-reply@yourdomain.com>")
        .subject("Welcome aboard!")
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.HTML)
            .content("<h1>Hello!</h1><p>Thanks for signing up.</p>"))
        .addBodyItem(new BodyPart()
            .contentType(BodyContentType.PLAIN_TEXT)
            .content("Hello! Thanks for signing up.")));

try {
    EmailSend result = emails.emailsTransactionalPost(message);
    System.out.println("Sent. TransactionID: " + result.getTransactionID()
        + ", MessageID: " + result.getMessageID());
} catch (ApiException e) {
    System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
}
```

The `from` address must use a domain you've verified in your Elastic Email account.

### Send from a template with merge fields

```java
EmailTransactionalMessageData message = new EmailTransactionalMessageData()
    .recipients(new TransactionalRecipient().addToItem("john.doe@example.com"))
    .content(new EmailContent()
        .from("My App <no-reply@yourdomain.com>")
        .templateName("welcome-template")
        .putMergeItem("firstname", "John"));

emails.emailsTransactionalPost(message);
```

### Using a proxy or custom timeouts

The client uses [OkHttp](https://square.github.io/okhttp/). Pass your own `OkHttpClient` to configure a proxy, timeouts or interceptors:

```java
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

OkHttpClient http = client.getHttpClient().newBuilder()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("myProxyUrl", 80)))
    .readTimeout(600, TimeUnit.SECONDS)
    .build();
client.setHttpClient(http);
```

> [!NOTE]
> In a multithreaded application, create one `ApiClient` instance per thread.

## More examples

More complete, runnable samples are in the **[Elastic Email examples repository](https://github.com/ElasticEmail/elasticemail-examples)**. It covers transactional email, SMTP, webhooks, inbound email, contacts and serverless platforms across 20+ languages and frameworks.

- ☕ [Java examples](https://github.com/ElasticEmail/elasticemail-examples/tree/main/java-elasticemail-examples)
- 📂 [All examples](https://github.com/ElasticEmail/elasticemail-examples)

## Authentication

| Scheme | Header | Used for |
| --- | --- | --- |
| `apikey` | `X-ElasticEmail-ApiKey` | All standard API calls |
| `ApiKeyAuthCustomBranding` | `X-Auth-Token` | Custom-branding (white-label) accounts |

## API limits

- Up to **20 concurrent connections** per account
- A hard timeout of **600 seconds** per request

## API reference

All URIs are relative to `https://api.elasticemail.com/v4`. The SDK covers **114 endpoints** across 16 API classes: `CampaignsApi`, `ContactsApi`, `DomainsApi`, `EmailsApi`, `EventsApi`, `FilesApi`, `InboundRouteApi`, `ListsApi`, `SecurityApi`, `SegmentsApi`, `StatisticsApi`, `SubAccountsApi`, `SuppressionsApi`, `TemplatesApi`, `VerificationsApi` and `WebhookApi`.

<details>
<summary><strong>Show all endpoints</strong></summary>

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignsApi* | [**campaignsAutomationByNameTriggerPost**](docs/CampaignsApi.md#campaignsAutomationByNameTriggerPost) | **POST** /campaigns/automation/{name}/trigger | Trigger Automation for Contact
*CampaignsApi* | [**campaignsByNameDelete**](docs/CampaignsApi.md#campaignsByNameDelete) | **DELETE** /campaigns/{name} | Delete Campaign
*CampaignsApi* | [**campaignsByNameGet**](docs/CampaignsApi.md#campaignsByNameGet) | **GET** /campaigns/{name} | Load Campaign
*CampaignsApi* | [**campaignsByNamePausePut**](docs/CampaignsApi.md#campaignsByNamePausePut) | **PUT** /campaigns/{name}/pause | Pause Campaign
*CampaignsApi* | [**campaignsByNamePut**](docs/CampaignsApi.md#campaignsByNamePut) | **PUT** /campaigns/{name} | Update Campaign
*CampaignsApi* | [**campaignsGet**](docs/CampaignsApi.md#campaignsGet) | **GET** /campaigns | Load Campaigns
*CampaignsApi* | [**campaignsPost**](docs/CampaignsApi.md#campaignsPost) | **POST** /campaigns | Add Campaign
*ContactsApi* | [**contactsByEmailDelete**](docs/ContactsApi.md#contactsByEmailDelete) | **DELETE** /contacts/{email} | Delete Contact
*ContactsApi* | [**contactsByEmailGet**](docs/ContactsApi.md#contactsByEmailGet) | **GET** /contacts/{email} | Load Contact
*ContactsApi* | [**contactsByEmailPut**](docs/ContactsApi.md#contactsByEmailPut) | **PUT** /contacts/{email} | Update Contact
*ContactsApi* | [**contactsDeletePost**](docs/ContactsApi.md#contactsDeletePost) | **POST** /contacts/delete | Delete Contacts Bulk
*ContactsApi* | [**contactsExportByIdStatusGet**](docs/ContactsApi.md#contactsExportByIdStatusGet) | **GET** /contacts/export/{id}/status | Check Export Status
*ContactsApi* | [**contactsExportPost**](docs/ContactsApi.md#contactsExportPost) | **POST** /contacts/export | Export Contacts
*ContactsApi* | [**contactsGet**](docs/ContactsApi.md#contactsGet) | **GET** /contacts | Load Contacts
*ContactsApi* | [**contactsImportPost**](docs/ContactsApi.md#contactsImportPost) | **POST** /contacts/import | Upload Contacts
*ContactsApi* | [**contactsPost**](docs/ContactsApi.md#contactsPost) | **POST** /contacts | Add Contact
*DomainsApi* | [**domainsByDomainDelete**](docs/DomainsApi.md#domainsByDomainDelete) | **DELETE** /domains/{domain} | Delete Domain
*DomainsApi* | [**domainsByDomainGet**](docs/DomainsApi.md#domainsByDomainGet) | **GET** /domains/{domain} | Load Domain
*DomainsApi* | [**domainsByDomainPut**](docs/DomainsApi.md#domainsByDomainPut) | **PUT** /domains/{domain} | Update Domain
*DomainsApi* | [**domainsByDomainRestrictedGet**](docs/DomainsApi.md#domainsByDomainRestrictedGet) | **GET** /domains/{domain}/restricted | Check for domain restriction
*DomainsApi* | [**domainsByDomainVerificationPut**](docs/DomainsApi.md#domainsByDomainVerificationPut) | **PUT** /domains/{domain}/verification | Verify Domain
*DomainsApi* | [**domainsByEmailDefaultPatch**](docs/DomainsApi.md#domainsByEmailDefaultPatch) | **PATCH** /domains/{email}/default | Set Default
*DomainsApi* | [**domainsGet**](docs/DomainsApi.md#domainsGet) | **GET** /domains | Load Domains
*DomainsApi* | [**domainsPost**](docs/DomainsApi.md#domainsPost) | **POST** /domains | Add Domain
*EmailsApi* | [**emailsByMsgidViewGet**](docs/EmailsApi.md#emailsByMsgidViewGet) | **GET** /emails/{msgid}/view | View Email
*EmailsApi* | [**emailsByTransactionidStatusGet**](docs/EmailsApi.md#emailsByTransactionidStatusGet) | **GET** /emails/{transactionid}/status | Get Status
*EmailsApi* | [**emailsMergefilePost**](docs/EmailsApi.md#emailsMergefilePost) | **POST** /emails/mergefile | Send Bulk Emails CSV
*EmailsApi* | [**emailsPost**](docs/EmailsApi.md#emailsPost) | **POST** /emails | Send Bulk Emails
*EmailsApi* | [**emailsTransactionalPost**](docs/EmailsApi.md#emailsTransactionalPost) | **POST** /emails/transactional | Send Transactional Email
*EventsApi* | [**eventsByTransactionidGet**](docs/EventsApi.md#eventsByTransactionidGet) | **GET** /events/{transactionid} | Load Email Events
*EventsApi* | [**eventsChannelsByNameExportPost**](docs/EventsApi.md#eventsChannelsByNameExportPost) | **POST** /events/channels/{name}/export | Export Channel Events
*EventsApi* | [**eventsChannelsByNameGet**](docs/EventsApi.md#eventsChannelsByNameGet) | **GET** /events/channels/{name} | Load Channel Events
*EventsApi* | [**eventsChannelsExportByIdStatusGet**](docs/EventsApi.md#eventsChannelsExportByIdStatusGet) | **GET** /events/channels/export/{id}/status | Check Channel Export Status
*EventsApi* | [**eventsExportByIdStatusGet**](docs/EventsApi.md#eventsExportByIdStatusGet) | **GET** /events/export/{id}/status | Check Export Status
*EventsApi* | [**eventsExportPost**](docs/EventsApi.md#eventsExportPost) | **POST** /events/export | Export Events
*EventsApi* | [**eventsGet**](docs/EventsApi.md#eventsGet) | **GET** /events | Load Events
*FilesApi* | [**filesByNameDelete**](docs/FilesApi.md#filesByNameDelete) | **DELETE** /files/{name} | Delete File
*FilesApi* | [**filesByNameGet**](docs/FilesApi.md#filesByNameGet) | **GET** /files/{name} | Download File
*FilesApi* | [**filesByNameInfoGet**](docs/FilesApi.md#filesByNameInfoGet) | **GET** /files/{name}/info | Load File Details
*FilesApi* | [**filesGet**](docs/FilesApi.md#filesGet) | **GET** /files | List Files
*FilesApi* | [**filesPost**](docs/FilesApi.md#filesPost) | **POST** /files | Upload File
*InboundRouteApi* | [**inboundrouteByIdDelete**](docs/InboundRouteApi.md#inboundrouteByIdDelete) | **DELETE** /inboundroute/{id} | Delete Route
*InboundRouteApi* | [**inboundrouteByIdGet**](docs/InboundRouteApi.md#inboundrouteByIdGet) | **GET** /inboundroute/{id} | Get Route
*InboundRouteApi* | [**inboundrouteByIdPut**](docs/InboundRouteApi.md#inboundrouteByIdPut) | **PUT** /inboundroute/{id} | Update Route
*InboundRouteApi* | [**inboundrouteGet**](docs/InboundRouteApi.md#inboundrouteGet) | **GET** /inboundroute | Get Routes
*InboundRouteApi* | [**inboundrouteOrderPut**](docs/InboundRouteApi.md#inboundrouteOrderPut) | **PUT** /inboundroute/order | Update Sorting
*InboundRouteApi* | [**inboundroutePost**](docs/InboundRouteApi.md#inboundroutePost) | **POST** /inboundroute | Create Route
*ListsApi* | [**listsByListnameContactsGet**](docs/ListsApi.md#listsByListnameContactsGet) | **GET** /lists/{listname}/contacts | Load Contacts in List
*ListsApi* | [**listsByNameContactsPost**](docs/ListsApi.md#listsByNameContactsPost) | **POST** /lists/{name}/contacts | Add Contacts to List
*ListsApi* | [**listsByNameContactsRemovePost**](docs/ListsApi.md#listsByNameContactsRemovePost) | **POST** /lists/{name}/contacts/remove | Remove Contacts from List
*ListsApi* | [**listsByNameDelete**](docs/ListsApi.md#listsByNameDelete) | **DELETE** /lists/{name} | Delete List
*ListsApi* | [**listsByNameGet**](docs/ListsApi.md#listsByNameGet) | **GET** /lists/{name} | Load List
*ListsApi* | [**listsByNamePut**](docs/ListsApi.md#listsByNamePut) | **PUT** /lists/{name} | Update List
*ListsApi* | [**listsGet**](docs/ListsApi.md#listsGet) | **GET** /lists | Load Lists
*ListsApi* | [**listsPost**](docs/ListsApi.md#listsPost) | **POST** /lists | Add List
*SecurityApi* | [**securityApikeysByNameDelete**](docs/SecurityApi.md#securityApikeysByNameDelete) | **DELETE** /security/apikeys/{name} | Delete ApiKey
*SecurityApi* | [**securityApikeysByNameGet**](docs/SecurityApi.md#securityApikeysByNameGet) | **GET** /security/apikeys/{name} | Load ApiKey
*SecurityApi* | [**securityApikeysByNamePut**](docs/SecurityApi.md#securityApikeysByNamePut) | **PUT** /security/apikeys/{name} | Update ApiKey
*SecurityApi* | [**securityApikeysGet**](docs/SecurityApi.md#securityApikeysGet) | **GET** /security/apikeys | List ApiKeys
*SecurityApi* | [**securityApikeysPost**](docs/SecurityApi.md#securityApikeysPost) | **POST** /security/apikeys | Add ApiKey
*SecurityApi* | [**securitySmtpByNameDelete**](docs/SecurityApi.md#securitySmtpByNameDelete) | **DELETE** /security/smtp/{name} | Delete SMTP Credential
*SecurityApi* | [**securitySmtpByNameGet**](docs/SecurityApi.md#securitySmtpByNameGet) | **GET** /security/smtp/{name} | Load SMTP Credential
*SecurityApi* | [**securitySmtpByNamePut**](docs/SecurityApi.md#securitySmtpByNamePut) | **PUT** /security/smtp/{name} | Update SMTP Credential
*SecurityApi* | [**securitySmtpGet**](docs/SecurityApi.md#securitySmtpGet) | **GET** /security/smtp | List SMTP Credentials
*SecurityApi* | [**securitySmtpPost**](docs/SecurityApi.md#securitySmtpPost) | **POST** /security/smtp | Add SMTP Credential
*SegmentsApi* | [**segmentsByNameDelete**](docs/SegmentsApi.md#segmentsByNameDelete) | **DELETE** /segments/{name} | Delete Segment
*SegmentsApi* | [**segmentsByNameGet**](docs/SegmentsApi.md#segmentsByNameGet) | **GET** /segments/{name} | Load Segment
*SegmentsApi* | [**segmentsByNamePut**](docs/SegmentsApi.md#segmentsByNamePut) | **PUT** /segments/{name} | Update Segment
*SegmentsApi* | [**segmentsGet**](docs/SegmentsApi.md#segmentsGet) | **GET** /segments | Load Segments
*SegmentsApi* | [**segmentsPost**](docs/SegmentsApi.md#segmentsPost) | **POST** /segments | Add Segment
*StatisticsApi* | [**statisticsCampaignsByNameGet**](docs/StatisticsApi.md#statisticsCampaignsByNameGet) | **GET** /statistics/campaigns/{name} | Load Campaign Stats
*StatisticsApi* | [**statisticsCampaignsGet**](docs/StatisticsApi.md#statisticsCampaignsGet) | **GET** /statistics/campaigns | Load Campaigns Stats
*StatisticsApi* | [**statisticsChannelsByNameGet**](docs/StatisticsApi.md#statisticsChannelsByNameGet) | **GET** /statistics/channels/{name} | Load Channel Stats
*StatisticsApi* | [**statisticsChannelsGet**](docs/StatisticsApi.md#statisticsChannelsGet) | **GET** /statistics/channels | Load Channels Stats
*StatisticsApi* | [**statisticsGet**](docs/StatisticsApi.md#statisticsGet) | **GET** /statistics | Load Statistics
*SubAccountsApi* | [**subaccountsByEmailApikeyGet**](docs/SubAccountsApi.md#subaccountsByEmailApikeyGet) | **GET** /subaccounts/{email}/apikey | Get SubAccount ApiKey
*SubAccountsApi* | [**subaccountsByEmailCreditsPatch**](docs/SubAccountsApi.md#subaccountsByEmailCreditsPatch) | **PATCH** /subaccounts/{email}/credits | Add, Subtract Email Credits
*SubAccountsApi* | [**subaccountsByEmailDelete**](docs/SubAccountsApi.md#subaccountsByEmailDelete) | **DELETE** /subaccounts/{email} | Delete SubAccount
*SubAccountsApi* | [**subaccountsByEmailGet**](docs/SubAccountsApi.md#subaccountsByEmailGet) | **GET** /subaccounts/{email} | Load SubAccount
*SubAccountsApi* | [**subaccountsByEmailSettingsEmailPut**](docs/SubAccountsApi.md#subaccountsByEmailSettingsEmailPut) | **PUT** /subaccounts/{email}/settings/email | Update SubAccount Email Settings
*SubAccountsApi* | [**subaccountsGet**](docs/SubAccountsApi.md#subaccountsGet) | **GET** /subaccounts | Load SubAccounts
*SubAccountsApi* | [**subaccountsPost**](docs/SubAccountsApi.md#subaccountsPost) | **POST** /subaccounts | Add SubAccount
*SuppressionsApi* | [**suppressionsBouncesGet**](docs/SuppressionsApi.md#suppressionsBouncesGet) | **GET** /suppressions/bounces | Get Bounce List
*SuppressionsApi* | [**suppressionsBouncesImportPost**](docs/SuppressionsApi.md#suppressionsBouncesImportPost) | **POST** /suppressions/bounces/import | Add Bounces Async
*SuppressionsApi* | [**suppressionsBouncesPost**](docs/SuppressionsApi.md#suppressionsBouncesPost) | **POST** /suppressions/bounces | Add Bounces
*SuppressionsApi* | [**suppressionsByEmailDelete**](docs/SuppressionsApi.md#suppressionsByEmailDelete) | **DELETE** /suppressions/{email} | Delete Suppression
*SuppressionsApi* | [**suppressionsByEmailGet**](docs/SuppressionsApi.md#suppressionsByEmailGet) | **GET** /suppressions/{email} | Get Suppression
*SuppressionsApi* | [**suppressionsComplaintsGet**](docs/SuppressionsApi.md#suppressionsComplaintsGet) | **GET** /suppressions/complaints | Get Complaints List
*SuppressionsApi* | [**suppressionsComplaintsImportPost**](docs/SuppressionsApi.md#suppressionsComplaintsImportPost) | **POST** /suppressions/complaints/import | Add Complaints Async
*SuppressionsApi* | [**suppressionsComplaintsPost**](docs/SuppressionsApi.md#suppressionsComplaintsPost) | **POST** /suppressions/complaints | Add Complaints
*SuppressionsApi* | [**suppressionsGet**](docs/SuppressionsApi.md#suppressionsGet) | **GET** /suppressions | Get Suppressions
*SuppressionsApi* | [**suppressionsUnsubscribesGet**](docs/SuppressionsApi.md#suppressionsUnsubscribesGet) | **GET** /suppressions/unsubscribes | Get Unsubscribes List
*SuppressionsApi* | [**suppressionsUnsubscribesImportPost**](docs/SuppressionsApi.md#suppressionsUnsubscribesImportPost) | **POST** /suppressions/unsubscribes/import | Add Unsubscribes Async
*SuppressionsApi* | [**suppressionsUnsubscribesPost**](docs/SuppressionsApi.md#suppressionsUnsubscribesPost) | **POST** /suppressions/unsubscribes | Add Unsubscribes
*TemplatesApi* | [**templatesByNameDelete**](docs/TemplatesApi.md#templatesByNameDelete) | **DELETE** /templates/{name} | Delete Template
*TemplatesApi* | [**templatesByNameGet**](docs/TemplatesApi.md#templatesByNameGet) | **GET** /templates/{name} | Load Template
*TemplatesApi* | [**templatesByNamePut**](docs/TemplatesApi.md#templatesByNamePut) | **PUT** /templates/{name} | Update Template
*TemplatesApi* | [**templatesGet**](docs/TemplatesApi.md#templatesGet) | **GET** /templates | Load Templates
*TemplatesApi* | [**templatesPost**](docs/TemplatesApi.md#templatesPost) | **POST** /templates | Add Template
*VerificationsApi* | [**verificationsByEmailDelete**](docs/VerificationsApi.md#verificationsByEmailDelete) | **DELETE** /verifications/{email} | Delete Email Verification Result
*VerificationsApi* | [**verificationsByEmailGet**](docs/VerificationsApi.md#verificationsByEmailGet) | **GET** /verifications/{email} | Get Email Verification Result
*VerificationsApi* | [**verificationsByEmailPost**](docs/VerificationsApi.md#verificationsByEmailPost) | **POST** /verifications/{email} | Verify Email
*VerificationsApi* | [**verificationsFilesByIdDelete**](docs/VerificationsApi.md#verificationsFilesByIdDelete) | **DELETE** /verifications/files/{id} | Delete File Verification Result
*VerificationsApi* | [**verificationsFilesByIdResultDownloadGet**](docs/VerificationsApi.md#verificationsFilesByIdResultDownloadGet) | **GET** /verifications/files/{id}/result/download | Download File Verification Result
*VerificationsApi* | [**verificationsFilesByIdResultGet**](docs/VerificationsApi.md#verificationsFilesByIdResultGet) | **GET** /verifications/files/{id}/result | Get Detailed File Verification Result
*VerificationsApi* | [**verificationsFilesByIdVerificationPost**](docs/VerificationsApi.md#verificationsFilesByIdVerificationPost) | **POST** /verifications/files/{id}/verification | Start verification
*VerificationsApi* | [**verificationsFilesPost**](docs/VerificationsApi.md#verificationsFilesPost) | **POST** /verifications/files | Upload File with Emails
*VerificationsApi* | [**verificationsFilesResultGet**](docs/VerificationsApi.md#verificationsFilesResultGet) | **GET** /verifications/files/result | Get Files Verification Results
*VerificationsApi* | [**verificationsGet**](docs/VerificationsApi.md#verificationsGet) | **GET** /verifications | Get Emails Verification Results
*WebhookApi* | [**webhookByPublicidDelete**](docs/WebhookApi.md#webhookByPublicidDelete) | **DELETE** /webhook/{publicid} | Delete Webhook
*WebhookApi* | [**webhookByPublicidGet**](docs/WebhookApi.md#webhookByPublicidGet) | **GET** /webhook/{publicid} | Load Webhook
*WebhookApi* | [**webhookByPublicidPut**](docs/WebhookApi.md#webhookByPublicidPut) | **PUT** /webhook/{publicid} | Update Webhook
*WebhookApi* | [**webhookGet**](docs/WebhookApi.md#webhookGet) | **GET** /webhook | Load Webhooks
*WebhookApi* | [**webhookPost**](docs/WebhookApi.md#webhookPost) | **POST** /webhook | Add Webhook



</details>

## Models

<details>
<summary><strong>Show all 98 models</strong></summary>

 - [AccessLevel](docs/AccessLevel.md)
 - [AccountStatusEnum](docs/AccountStatusEnum.md)
 - [ApiKey](docs/ApiKey.md)
 - [ApiKeyPayload](docs/ApiKeyPayload.md)
 - [BodyContentType](docs/BodyContentType.md)
 - [BodyPart](docs/BodyPart.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignOptions](docs/CampaignOptions.md)
 - [CampaignRecipient](docs/CampaignRecipient.md)
 - [CampaignStatus](docs/CampaignStatus.md)
 - [CampaignTemplate](docs/CampaignTemplate.md)
 - [CertificateValidationStatus](docs/CertificateValidationStatus.md)
 - [ChannelLogStatusSummary](docs/ChannelLogStatusSummary.md)
 - [CompressionFormat](docs/CompressionFormat.md)
 - [ConsentData](docs/ConsentData.md)
 - [ConsentTracking](docs/ConsentTracking.md)
 - [Contact](docs/Contact.md)
 - [ContactActivity](docs/ContactActivity.md)
 - [ContactPayload](docs/ContactPayload.md)
 - [ContactSource](docs/ContactSource.md)
 - [ContactStatus](docs/ContactStatus.md)
 - [ContactUpdatePayload](docs/ContactUpdatePayload.md)
 - [ContactsList](docs/ContactsList.md)
 - [DKIMRecord](docs/DKIMRecord.md)
 - [DeliveryOptimizationType](docs/DeliveryOptimizationType.md)
 - [DomainData](docs/DomainData.md)
 - [DomainDetail](docs/DomainDetail.md)
 - [DomainOwner](docs/DomainOwner.md)
 - [DomainPayload](docs/DomainPayload.md)
 - [DomainUpdatePayload](docs/DomainUpdatePayload.md)
 - [EmailContent](docs/EmailContent.md)
 - [EmailData](docs/EmailData.md)
 - [EmailJobFailedStatus](docs/EmailJobFailedStatus.md)
 - [EmailJobStatus](docs/EmailJobStatus.md)
 - [EmailMessageData](docs/EmailMessageData.md)
 - [EmailPredictedValidationStatus](docs/EmailPredictedValidationStatus.md)
 - [EmailRecipient](docs/EmailRecipient.md)
 - [EmailSend](docs/EmailSend.md)
 - [EmailStatus](docs/EmailStatus.md)
 - [EmailTransactionalMessageData](docs/EmailTransactionalMessageData.md)
 - [EmailValidationResult](docs/EmailValidationResult.md)
 - [EmailValidationStatus](docs/EmailValidationStatus.md)
 - [EmailView](docs/EmailView.md)
 - [EmailsPayload](docs/EmailsPayload.md)
 - [EncodingType](docs/EncodingType.md)
 - [EventType](docs/EventType.md)
 - [EventsOrderBy](docs/EventsOrderBy.md)
 - [ExportFileFormats](docs/ExportFileFormats.md)
 - [ExportLink](docs/ExportLink.md)
 - [ExportStatus](docs/ExportStatus.md)
 - [FileInfo](docs/FileInfo.md)
 - [FilePayload](docs/FilePayload.md)
 - [FileUploadResult](docs/FileUploadResult.md)
 - [InboundPayload](docs/InboundPayload.md)
 - [InboundRoute](docs/InboundRoute.md)
 - [InboundRouteActionType](docs/InboundRouteActionType.md)
 - [InboundRouteFilterType](docs/InboundRouteFilterType.md)
 - [ListPayload](docs/ListPayload.md)
 - [ListUpdatePayload](docs/ListUpdatePayload.md)
 - [LogJobStatus](docs/LogJobStatus.md)
 - [LogStatusSummary](docs/LogStatusSummary.md)
 - [MergeEmailPayload](docs/MergeEmailPayload.md)
 - [MessageAttachment](docs/MessageAttachment.md)
 - [MessageCategory](docs/MessageCategory.md)
 - [MessageCategoryEnum](docs/MessageCategoryEnum.md)
 - [NewApiKey](docs/NewApiKey.md)
 - [NewSmtpCredentials](docs/NewSmtpCredentials.md)
 - [Options](docs/Options.md)
 - [RecipientEvent](docs/RecipientEvent.md)
 - [Segment](docs/Segment.md)
 - [SegmentPayload](docs/SegmentPayload.md)
 - [SmtpCredentials](docs/SmtpCredentials.md)
 - [SmtpCredentialsPayload](docs/SmtpCredentialsPayload.md)
 - [SortOrderItem](docs/SortOrderItem.md)
 - [SplitOptimizationType](docs/SplitOptimizationType.md)
 - [SplitOptions](docs/SplitOptions.md)
 - [SubAccountInfo](docs/SubAccountInfo.md)
 - [SubaccountEmailCreditsPayload](docs/SubaccountEmailCreditsPayload.md)
 - [SubaccountEmailSettings](docs/SubaccountEmailSettings.md)
 - [SubaccountEmailSettingsPayload](docs/SubaccountEmailSettingsPayload.md)
 - [SubaccountPayload](docs/SubaccountPayload.md)
 - [SubaccountSettingsInfo](docs/SubaccountSettingsInfo.md)
 - [SubaccountSettingsInfoPayload](docs/SubaccountSettingsInfoPayload.md)
 - [Suppression](docs/Suppression.md)
 - [Template](docs/Template.md)
 - [TemplatePayload](docs/TemplatePayload.md)
 - [TemplateScope](docs/TemplateScope.md)
 - [TemplateType](docs/TemplateType.md)
 - [TrackingType](docs/TrackingType.md)
 - [TrackingValidationStatus](docs/TrackingValidationStatus.md)
 - [TransactionalRecipient](docs/TransactionalRecipient.md)
 - [Utm](docs/Utm.md)
 - [VerificationFileResult](docs/VerificationFileResult.md)
 - [VerificationFileResultDetails](docs/VerificationFileResultDetails.md)
 - [VerificationStatus](docs/VerificationStatus.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreatePayload](docs/WebhookCreatePayload.md)
 - [WebhookUpdatePayload](docs/WebhookUpdatePayload.md)

</details>

## Tests

The `src/test` directory holds generated JUnit 5 test stubs for every API class and model. The API tests are marked `@Disabled` because they call the live API. Run the suite with:

```bash
mvn test
```

## Versioning

The SDK follows the Elastic Email API v4. Versions and release notes are listed on [JitPack](https://jitpack.io/#ElasticEmail/elasticemail-java) and in [GitHub Releases](https://github.com/ElasticEmail/elasticemail-java/releases).

<details>
<summary>Build details</summary>

- API version: 4.0.0
- SDK version: 4.2.0
- Generator version: 7.11.0
- Build package: `org.openapitools.codegen.languages.JavaClientCodegen`

</details>

## Contributing

Contributions are welcome! Most of this SDK is generated from the [OpenAPI specification](api/openapi.yaml), so please read [CONTRIBUTING.md](CONTRIBUTING.md) before opening a pull request.

- 🐛 [Report a bug](https://github.com/ElasticEmail/elasticemail-java/issues/new?template=bug_report.md)
- 💡 [Request a feature](https://github.com/ElasticEmail/elasticemail-java/issues/new?template=feature_request.md)
- 🔒 [Report a security issue](SECURITY.md)

This project follows the [Contributor Covenant Code of Conduct](CODE_OF_CONDUCT.md).

## Support

> [!IMPORTANT]
> The fastest way to get help is the **chat widget on [elasticemail.com](https://elasticemail.com)**. Our support team can help with your account, sending, deliverability and API questions.

- 💬 [Chat with support on elasticemail.com](https://elasticemail.com) (preferred)
- 📚 [API documentation](https://elasticemail.com/developers/api-documentation/rest-api)
- 🧪 [Examples repository](https://github.com/ElasticEmail/elasticemail-examples)
- 🐛 [GitHub issues](https://github.com/ElasticEmail/elasticemail-java/issues), for bugs in this SDK only

## License

Released under the [MIT License](LICENSE). Copyright © 2021–2026 Elastic Email.
