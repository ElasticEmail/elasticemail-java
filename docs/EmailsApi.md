# EmailsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailsByMsgidViewGet**](EmailsApi.md#emailsByMsgidViewGet) | **GET** /emails/{msgid}/view | View Email |
| [**emailsByTransactionidStatusGet**](EmailsApi.md#emailsByTransactionidStatusGet) | **GET** /emails/{transactionid}/status | Get Status |
| [**emailsMergefilePost**](EmailsApi.md#emailsMergefilePost) | **POST** /emails/mergefile | Send Bulk Emails CSV |
| [**emailsPost**](EmailsApi.md#emailsPost) | **POST** /emails | Send Bulk Emails |
| [**emailsTransactionalPost**](EmailsApi.md#emailsTransactionalPost) | **POST** /emails/transactional | Send Transactional Email |


<a id="emailsByMsgidViewGet"></a>
# **emailsByMsgidViewGet**
> EmailData emailsByMsgidViewGet(msgid)

View Email

Returns email details for viewing or rendering. Required Access Level: None

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    String msgid = "msgid_example"; // String | Message identifier
    try {
      EmailData result = apiInstance.emailsByMsgidViewGet(msgid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#emailsByMsgidViewGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **msgid** | **String**| Message identifier | |

### Return type

[**EmailData**](EmailData.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="emailsByTransactionidStatusGet"></a>
# **emailsByTransactionidStatusGet**
> EmailJobStatus emailsByTransactionidStatusGet(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs)

Get Status

Get status details of an email transaction. Required Access Level: ViewReports

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    String transactionid = "transactionid_example"; // String | Transaction identifier
    Boolean showFailed = false; // Boolean | Include Bounced email addresses.
    Boolean showSent = false; // Boolean | Include Sent email addresses.
    Boolean showDelivered = false; // Boolean | Include all delivered email addresses.
    Boolean showPending = false; // Boolean | Include Ready to send email addresses.
    Boolean showOpened = false; // Boolean | Include Opened email addresses.
    Boolean showClicked = false; // Boolean | Include Clicked email addresses.
    Boolean showAbuse = false; // Boolean | Include Reported as abuse email addresses.
    Boolean showUnsubscribed = false; // Boolean | Include Unsubscribed email addresses.
    Boolean showErrors = false; // Boolean | Include error messages for bounced emails.
    Boolean showMessageIDs = false; // Boolean | Include all MessageIDs for this transaction
    try {
      EmailJobStatus result = apiInstance.emailsByTransactionidStatusGet(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#emailsByTransactionidStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionid** | **String**| Transaction identifier | |
| **showFailed** | **Boolean**| Include Bounced email addresses. | [optional] [default to false] |
| **showSent** | **Boolean**| Include Sent email addresses. | [optional] [default to false] |
| **showDelivered** | **Boolean**| Include all delivered email addresses. | [optional] [default to false] |
| **showPending** | **Boolean**| Include Ready to send email addresses. | [optional] [default to false] |
| **showOpened** | **Boolean**| Include Opened email addresses. | [optional] [default to false] |
| **showClicked** | **Boolean**| Include Clicked email addresses. | [optional] [default to false] |
| **showAbuse** | **Boolean**| Include Reported as abuse email addresses. | [optional] [default to false] |
| **showUnsubscribed** | **Boolean**| Include Unsubscribed email addresses. | [optional] [default to false] |
| **showErrors** | **Boolean**| Include error messages for bounced emails. | [optional] [default to false] |
| **showMessageIDs** | **Boolean**| Include all MessageIDs for this transaction | [optional] [default to false] |

### Return type

[**EmailJobStatus**](EmailJobStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="emailsMergefilePost"></a>
# **emailsMergefilePost**
> EmailSend emailsMergefilePost(mergeEmailPayload, idempotencyKey)

Send Bulk Emails CSV

Send to a list of contacts submitted in a CSV data file. The first column in the CSV must be the email address and the CSV must contain a header row. Additional fields can be included with a named header row and can be merged with the template using {merge} tags in the content.                           Example CSV:                           email, firstname, lastname              test1@gmail.com, michael, smith              test2@gmail.com, janet, smith                           Merge file must not be empty. Required Access Level: SendHttp

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    MergeEmailPayload mergeEmailPayload = new MergeEmailPayload(); // MergeEmailPayload | Email data
    String idempotencyKey = "6f1c2a7e-3b4d-4e8f-9a1b-2c3d4e5f6a7b"; // String | Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request.
    try {
      EmailSend result = apiInstance.emailsMergefilePost(mergeEmailPayload, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#emailsMergefilePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mergeEmailPayload** | [**MergeEmailPayload**](MergeEmailPayload.md)| Email data | |
| **idempotencyKey** | **String**| Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request. | [optional] |

### Return type

[**EmailSend**](EmailSend.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request, e.g. the Idempotency-Key header is not 1 to 255 printable ASCII characters. |  -  |
| **409** | A request with the same Idempotency-Key is still in progress. Retry once it has completed. |  -  |
| **422** | The Idempotency-Key was already used with a different request. |  -  |
| **503** | The Idempotency-Key could not be confirmed, so the request was not executed. Retry after the time given in Retry-After. |  * Retry-After - Seconds to wait before retrying. <br>  |

<a id="emailsPost"></a>
# **emailsPost**
> EmailSend emailsPost(emailMessageData, idempotencyKey)

Send Bulk Emails

Send bulk merge email. Required Access Level: SendHttp

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    EmailMessageData emailMessageData = new EmailMessageData(); // EmailMessageData | Email data
    String idempotencyKey = "6f1c2a7e-3b4d-4e8f-9a1b-2c3d4e5f6a7b"; // String | Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request.
    try {
      EmailSend result = apiInstance.emailsPost(emailMessageData, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#emailsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailMessageData** | [**EmailMessageData**](EmailMessageData.md)| Email data | |
| **idempotencyKey** | **String**| Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request. | [optional] |

### Return type

[**EmailSend**](EmailSend.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request, e.g. the Idempotency-Key header is not 1 to 255 printable ASCII characters. |  -  |
| **409** | A request with the same Idempotency-Key is still in progress. Retry once it has completed. |  -  |
| **422** | The Idempotency-Key was already used with a different request. |  -  |
| **503** | The Idempotency-Key could not be confirmed, so the request was not executed. Retry after the time given in Retry-After. |  * Retry-After - Seconds to wait before retrying. <br>  |

<a id="emailsTransactionalPost"></a>
# **emailsTransactionalPost**
> EmailSend emailsTransactionalPost(emailTransactionalMessageData, idempotencyKey)

Send Transactional Email

Send transactional emails (recipients will be known to each other). Required Access Level: SendHttp

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EmailsApi apiInstance = new EmailsApi(defaultClient);
    EmailTransactionalMessageData emailTransactionalMessageData = new EmailTransactionalMessageData(); // EmailTransactionalMessageData | Email data
    String idempotencyKey = "6f1c2a7e-3b4d-4e8f-9a1b-2c3d4e5f6a7b"; // String | Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request.
    try {
      EmailSend result = apiInstance.emailsTransactionalPost(emailTransactionalMessageData, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#emailsTransactionalPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailTransactionalMessageData** | [**EmailTransactionalMessageData**](EmailTransactionalMessageData.md)| Email data | |
| **idempotencyKey** | **String**| Makes a retry of this request safe. A repeated request with the same key and the same body gets the stored response of the first one and is not executed again. Generate a new key, e.g. a UUID v4, for each request and reuse it only to retry that request. Keys are scoped to the account and kept for 24 hours after the first request. | [optional] |

### Return type

[**EmailSend**](EmailSend.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request, e.g. the Idempotency-Key header is not 1 to 255 printable ASCII characters. |  -  |
| **409** | A request with the same Idempotency-Key is still in progress. Retry once it has completed. |  -  |
| **422** | The Idempotency-Key was already used with a different request. |  -  |
| **503** | The Idempotency-Key could not be confirmed, so the request was not executed. Retry after the time given in Retry-After. |  * Retry-After - Seconds to wait before retrying. <br>  |

