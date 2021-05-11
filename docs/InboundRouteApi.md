# InboundRouteApi

All URIs are relative to *https://api.elasticemail.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inboundrouteByIdDelete**](InboundRouteApi.md#inboundrouteByIdDelete) | **DELETE** /inboundroute/{id} | Delete Route
[**inboundrouteByIdGet**](InboundRouteApi.md#inboundrouteByIdGet) | **GET** /inboundroute/{id} | Get Route
[**inboundrouteByIdPut**](InboundRouteApi.md#inboundrouteByIdPut) | **PUT** /inboundroute/{id} | Update Route
[**inboundrouteGet**](InboundRouteApi.md#inboundrouteGet) | **GET** /inboundroute | Get Routes
[**inboundrouteOrderPut**](InboundRouteApi.md#inboundrouteOrderPut) | **PUT** /inboundroute/order | Update Sorting
[**inboundroutePost**](InboundRouteApi.md#inboundroutePost) | **POST** /inboundroute | Create Route


<a name="inboundrouteByIdDelete"></a>
# **inboundrouteByIdDelete**
> inboundrouteByIdDelete(id)

Delete Route

Deletes the Inbound Route. Required Access Level: ModifySettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.inboundrouteByIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundrouteByIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

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
**200** | OK |  -  |

<a name="inboundrouteByIdGet"></a>
# **inboundrouteByIdGet**
> InboundRoute inboundrouteByIdGet(id)

Get Route

Load an Inbound Route. Required Access Level: ViewSettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    String id = "123456"; // String | ID number of your attachment
    try {
      InboundRoute result = apiInstance.inboundrouteByIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundrouteByIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID number of your attachment |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="inboundrouteByIdPut"></a>
# **inboundrouteByIdPut**
> InboundRoute inboundrouteByIdPut(id, inboundPayload)

Update Route

Update the Inbound Route. Required Access Level: ModifySettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    String id = "id_example"; // String | 
    InboundPayload inboundPayload = new InboundPayload(); // InboundPayload | 
    try {
      InboundRoute result = apiInstance.inboundrouteByIdPut(id, inboundPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundrouteByIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **inboundPayload** | [**InboundPayload**](InboundPayload.md)|  |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="inboundrouteGet"></a>
# **inboundrouteGet**
> List&lt;InboundRoute&gt; inboundrouteGet()

Get Routes

Get all your Inbound Routes. Required Access Level: ViewSettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    try {
      List<InboundRoute> result = apiInstance.inboundrouteGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundrouteGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InboundRoute&gt;**](InboundRoute.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="inboundrouteOrderPut"></a>
# **inboundrouteOrderPut**
> List&lt;InboundRoute&gt; inboundrouteOrderPut(sortOrderItem)

Update Sorting

Required Access Level: ViewSettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    List<SortOrderItem> sortOrderItem = Arrays.asList(); // List<SortOrderItem> | Change the ordering of inbound routes for when matching the inbound
    try {
      List<InboundRoute> result = apiInstance.inboundrouteOrderPut(sortOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundrouteOrderPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortOrderItem** | [**List&lt;SortOrderItem&gt;**](SortOrderItem.md)| Change the ordering of inbound routes for when matching the inbound |

### Return type

[**List&lt;InboundRoute&gt;**](InboundRoute.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="inboundroutePost"></a>
# **inboundroutePost**
> InboundRoute inboundroutePost(inboundPayload)

Create Route

Create new Inbound Route. Required Access Level: ModifySettings

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.InboundRouteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    InboundRouteApi apiInstance = new InboundRouteApi(defaultClient);
    InboundPayload inboundPayload = new InboundPayload(); // InboundPayload | 
    try {
      InboundRoute result = apiInstance.inboundroutePost(inboundPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboundRouteApi#inboundroutePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboundPayload** | [**InboundPayload**](InboundPayload.md)|  |

### Return type

[**InboundRoute**](InboundRoute.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

