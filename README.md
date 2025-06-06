# elasticemail

Elastic Email REST API
- API version: 4.0.0
  - Build date: 2025-05-22T13:34:56.566653Z[Etc/UTC]
  - Generator version: 7.5.0

This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.

Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.

The API has a limit of 20 concurrent connections and a hard timeout of 600 seconds per request.

To start using this API, you will need your Access Token (available [here](https://app.elasticemail.com/marketing/settings/new/manage-api)). Remember to keep it safe. Required access levels are listed in the given request’s description.

Downloadable library clients can be found in our Github repository [here](https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.elasticemail</groupId>
  <artifactId>elasticemail</artifactId>
  <version>4.0.26</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'elasticemail' jar has been published to maven central.
    mavenLocal()       // Needed if the 'elasticemail' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.elasticemail:elasticemail:4.0.26"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/elasticemail-4.0.26.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String name = "name_example"; // String | Name of Campaign to delete
    try {
      apiInstance.campaignsByNameDelete(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsByNameDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```



All URIs are relative to *https://api.elasticemail.com/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
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


## Documentation for Models

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


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="apikey"></a>
### apikey

- **Type**: API key
- **API key parameter name**: X-ElasticEmail-ApiKey
- **Location**: HTTP header

<a id="ApiKeyAuthCustomBranding"></a>
### ApiKeyAuthCustomBranding

- **Type**: API key
- **API key parameter name**: X-Auth-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@elasticemail.com

