# CampaignsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**campaignsByNameDelete**](CampaignsApi.md#campaignsByNameDelete) | **DELETE** /campaigns/{name} | Delete Campaign |
| [**campaignsByNameGet**](CampaignsApi.md#campaignsByNameGet) | **GET** /campaigns/{name} | Load Campaign |
| [**campaignsByNamePut**](CampaignsApi.md#campaignsByNamePut) | **PUT** /campaigns/{name} | Update Campaign |
| [**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /campaigns | Load Campaigns |
| [**campaignsPost**](CampaignsApi.md#campaignsPost) | **POST** /campaigns | Add Campaign |


<a id="campaignsByNameDelete"></a>
# **campaignsByNameDelete**
> campaignsByNameDelete(name)

Delete Campaign

Delete the specific campaign.  This does not cancel in progress email, see Cancel In Progress. Required Access Level: ModifyCampaigns

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of Campaign to delete | |

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

<a id="campaignsByNameGet"></a>
# **campaignsByNameGet**
> Campaign campaignsByNameGet(name)

Load Campaign

Returns the specified campaign details. Required Access Level: ViewCampaigns

### Example
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
    String name = "name_example"; // String | Name of Campaign to get
    try {
      Campaign result = apiInstance.campaignsByNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsByNameGet");
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
| **name** | **String**| Name of Campaign to get | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="campaignsByNamePut"></a>
# **campaignsByNamePut**
> Campaign campaignsByNamePut(name, campaign)

Update Campaign

Updates a previously added campaign.  Only Active and Paused campaigns can be updated. Required Access Level: ModifyCampaigns

### Example
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
    String name = "name_example"; // String | Name of Campaign to update
    Campaign campaign = new Campaign(); // Campaign | JSON representation of a campaign
    try {
      Campaign result = apiInstance.campaignsByNamePut(name, campaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsByNamePut");
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
| **name** | **String**| Name of Campaign to update | |
| **campaign** | [**Campaign**](Campaign.md)| JSON representation of a campaign | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="campaignsGet"></a>
# **campaignsGet**
> List&lt;Campaign&gt; campaignsGet(search, offset, limit)

Load Campaigns

Returns a list all of your campaigns. Limited to 1000 results. Required Access Level: ViewCampaigns

### Example
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
    String search = "search_example"; // String | Text fragment used for searching in Campaign name (using the 'contains' rule)
    Integer offset = 20; // Integer | How many items should be returned ahead.
    Integer limit = 100; // Integer | Maximum number of returned items.
    try {
      List<Campaign> result = apiInstance.campaignsGet(search, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsGet");
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
| **search** | **String**| Text fragment used for searching in Campaign name (using the &#39;contains&#39; rule) | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |
| **limit** | **Integer**| Maximum number of returned items. | [optional] |

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="campaignsPost"></a>
# **campaignsPost**
> Campaign campaignsPost(campaign)

Add Campaign

Add a campaign for processing. Required Access Level: ModifyCampaigns

### Example
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
    Campaign campaign = new Campaign(); // Campaign | JSON representation of a campaign
    try {
      Campaign result = apiInstance.campaignsPost(campaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsPost");
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
| **campaign** | [**Campaign**](Campaign.md)| JSON representation of a campaign | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

