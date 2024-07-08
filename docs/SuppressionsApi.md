# SuppressionsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**suppressionsBouncesGet**](SuppressionsApi.md#suppressionsBouncesGet) | **GET** /suppressions/bounces | Get Bounce List |
| [**suppressionsBouncesImportPost**](SuppressionsApi.md#suppressionsBouncesImportPost) | **POST** /suppressions/bounces/import | Add Bounces Async |
| [**suppressionsBouncesPost**](SuppressionsApi.md#suppressionsBouncesPost) | **POST** /suppressions/bounces | Add Bounces |
| [**suppressionsByEmailDelete**](SuppressionsApi.md#suppressionsByEmailDelete) | **DELETE** /suppressions/{email} | Delete Suppression |
| [**suppressionsByEmailGet**](SuppressionsApi.md#suppressionsByEmailGet) | **GET** /suppressions/{email} | Get Suppression |
| [**suppressionsComplaintsGet**](SuppressionsApi.md#suppressionsComplaintsGet) | **GET** /suppressions/complaints | Get Complaints List |
| [**suppressionsComplaintsImportPost**](SuppressionsApi.md#suppressionsComplaintsImportPost) | **POST** /suppressions/complaints/import | Add Complaints Async |
| [**suppressionsComplaintsPost**](SuppressionsApi.md#suppressionsComplaintsPost) | **POST** /suppressions/complaints | Add Complaints |
| [**suppressionsGet**](SuppressionsApi.md#suppressionsGet) | **GET** /suppressions | Get Suppressions |
| [**suppressionsUnsubscribesGet**](SuppressionsApi.md#suppressionsUnsubscribesGet) | **GET** /suppressions/unsubscribes | Get Unsubscribes List |
| [**suppressionsUnsubscribesImportPost**](SuppressionsApi.md#suppressionsUnsubscribesImportPost) | **POST** /suppressions/unsubscribes/import | Add Unsubscribes Async |
| [**suppressionsUnsubscribesPost**](SuppressionsApi.md#suppressionsUnsubscribesPost) | **POST** /suppressions/unsubscribes | Add Unsubscribes |


<a id="suppressionsBouncesGet"></a>
# **suppressionsBouncesGet**
> List&lt;Suppression&gt; suppressionsBouncesGet(search, limit, offset)

Get Bounce List

Retrieve your list of bounced emails. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    String search = "text"; // String | Text fragment used for searching.
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Suppression> result = apiInstance.suppressionsBouncesGet(search, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsBouncesGet");
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
| **search** | **String**| Text fragment used for searching. | [optional] |
| **limit** | **Integer**| Maximum number of returned items. | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="suppressionsBouncesImportPost"></a>
# **suppressionsBouncesImportPost**
> suppressionsBouncesImportPost(_file)

Add Bounces Async

Add Bounced. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.suppressionsBouncesImportPost(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsBouncesImportPost");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="suppressionsBouncesPost"></a>
# **suppressionsBouncesPost**
> List&lt;Suppression&gt; suppressionsBouncesPost(requestBody)

Add Bounces

Add Bounced. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | Emails to add as bounces. Limited to 1000 per request
    try {
      List<Suppression> result = apiInstance.suppressionsBouncesPost(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsBouncesPost");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Emails to add as bounces. Limited to 1000 per request | |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="suppressionsByEmailDelete"></a>
# **suppressionsByEmailDelete**
> suppressionsByEmailDelete(email)

Delete Suppression

Delete Suppression. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    try {
      apiInstance.suppressionsByEmailDelete(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsByEmailDelete");
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
| **email** | **String**| Proper email address. | |

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

<a id="suppressionsByEmailGet"></a>
# **suppressionsByEmailGet**
> Suppression suppressionsByEmailGet(email)

Get Suppression

Retrieve your suppression. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    try {
      Suppression result = apiInstance.suppressionsByEmailGet(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsByEmailGet");
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
| **email** | **String**| Proper email address. | |

### Return type

[**Suppression**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="suppressionsComplaintsGet"></a>
# **suppressionsComplaintsGet**
> List&lt;Suppression&gt; suppressionsComplaintsGet(search, limit, offset)

Get Complaints List

Retrieve your list of complaints. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    String search = "text"; // String | Text fragment used for searching.
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Suppression> result = apiInstance.suppressionsComplaintsGet(search, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsComplaintsGet");
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
| **search** | **String**| Text fragment used for searching. | [optional] |
| **limit** | **Integer**| Maximum number of returned items. | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="suppressionsComplaintsImportPost"></a>
# **suppressionsComplaintsImportPost**
> suppressionsComplaintsImportPost(_file)

Add Complaints Async

Add Complaints. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.suppressionsComplaintsImportPost(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsComplaintsImportPost");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="suppressionsComplaintsPost"></a>
# **suppressionsComplaintsPost**
> List&lt;Suppression&gt; suppressionsComplaintsPost(requestBody)

Add Complaints

Add Complaints. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | Emails to add as complaints. Limited to 1000 per request
    try {
      List<Suppression> result = apiInstance.suppressionsComplaintsPost(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsComplaintsPost");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Emails to add as complaints. Limited to 1000 per request | |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="suppressionsGet"></a>
# **suppressionsGet**
> List&lt;Suppression&gt; suppressionsGet(limit, offset)

Get Suppressions

Retrieve your suppressions. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Suppression> result = apiInstance.suppressionsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsGet");
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

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="suppressionsUnsubscribesGet"></a>
# **suppressionsUnsubscribesGet**
> List&lt;Suppression&gt; suppressionsUnsubscribesGet(search, limit, offset)

Get Unsubscribes List

Retrieve your list of unsubscribes. Required Access Level: ViewContacts, ViewSuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    String search = "text"; // String | Text fragment used for searching.
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Suppression> result = apiInstance.suppressionsUnsubscribesGet(search, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsUnsubscribesGet");
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
| **search** | **String**| Text fragment used for searching. | [optional] |
| **limit** | **Integer**| Maximum number of returned items. | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="suppressionsUnsubscribesImportPost"></a>
# **suppressionsUnsubscribesImportPost**
> suppressionsUnsubscribesImportPost(_file)

Add Unsubscribes Async

Add Unsubscribes. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.suppressionsUnsubscribesImportPost(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsUnsubscribesImportPost");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="suppressionsUnsubscribesPost"></a>
# **suppressionsUnsubscribesPost**
> List&lt;Suppression&gt; suppressionsUnsubscribesPost(requestBody)

Add Unsubscribes

Add Unsubscribes. Required Access Level: ModifyContacts, ModifySuppressions

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SuppressionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SuppressionsApi apiInstance = new SuppressionsApi(defaultClient);
    List<String> requestBody = Arrays.asList(); // List<String> | Emails to add as unsubscribes. Limited to 1000 per request
    try {
      List<Suppression> result = apiInstance.suppressionsUnsubscribesPost(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionsApi#suppressionsUnsubscribesPost");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| Emails to add as unsubscribes. Limited to 1000 per request | |

### Return type

[**List&lt;Suppression&gt;**](Suppression.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

