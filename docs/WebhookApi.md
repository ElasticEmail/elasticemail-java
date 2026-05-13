# WebhookApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**webhookByPublicidDelete**](WebhookApi.md#webhookByPublicidDelete) | **DELETE** /webhook/{publicid} | Delete Webhook |
| [**webhookByPublicidGet**](WebhookApi.md#webhookByPublicidGet) | **GET** /webhook/{publicid} | Load Webhook |
| [**webhookByPublicidPut**](WebhookApi.md#webhookByPublicidPut) | **PUT** /webhook/{publicid} | Update Webhook |
| [**webhookGet**](WebhookApi.md#webhookGet) | **GET** /webhook | Load Webhooks |
| [**webhookPost**](WebhookApi.md#webhookPost) | **POST** /webhook | Add Webhook |


<a id="webhookByPublicidDelete"></a>
# **webhookByPublicidDelete**
> webhookByPublicidDelete(publicid)

Delete Webhook

Delete the specified notifications webhook. Required Access Level: ModifyWebNotifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String publicid = "publicid_example"; // String | 
    try {
      apiInstance.webhookByPublicidDelete(publicid);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookByPublicidDelete");
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
| **publicid** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="webhookByPublicidGet"></a>
# **webhookByPublicidGet**
> Webhook webhookByPublicidGet(publicid)

Load Webhook

Load notifications webhook details. Required Access Level: ViewWebNotifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String publicid = "publicid_example"; // String | 
    try {
      Webhook result = apiInstance.webhookByPublicidGet(publicid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookByPublicidGet");
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
| **publicid** | **String**|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="webhookByPublicidPut"></a>
# **webhookByPublicidPut**
> Webhook webhookByPublicidPut(publicid, webhookUpdatePayload)

Update Webhook

Update notification webhook. Required Access Level: ModifyWebNotifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String publicid = "publicid_example"; // String | 
    WebhookUpdatePayload webhookUpdatePayload = new WebhookUpdatePayload(); // WebhookUpdatePayload | 
    try {
      Webhook result = apiInstance.webhookByPublicidPut(publicid, webhookUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookByPublicidPut");
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
| **publicid** | **String**|  | |
| **webhookUpdatePayload** | [**WebhookUpdatePayload**](WebhookUpdatePayload.md)|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="webhookGet"></a>
# **webhookGet**
> List&lt;Webhook&gt; webhookGet(limit, offset)

Load Webhooks

Returns a list of notification webhooks. Required Access Level: ViewWebNotifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Webhook> result = apiInstance.webhookGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookGet");
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
| **limit** | **Integer**| Maximum number of returned items. | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |

### Return type

[**List&lt;Webhook&gt;**](Webhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="webhookPost"></a>
# **webhookPost**
> Webhook webhookPost(webhookCreatePayload)

Add Webhook

Add a notification webhook. Required Access Level: ModifyWebNotifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebhookCreatePayload webhookCreatePayload = new WebhookCreatePayload(); // WebhookCreatePayload | 
    try {
      Webhook result = apiInstance.webhookPost(webhookCreatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#webhookPost");
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
| **webhookCreatePayload** | [**WebhookCreatePayload**](WebhookCreatePayload.md)|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

