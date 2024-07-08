# StatisticsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statisticsCampaignsByNameGet**](StatisticsApi.md#statisticsCampaignsByNameGet) | **GET** /statistics/campaigns/{name} | Load Campaign Stats |
| [**statisticsCampaignsGet**](StatisticsApi.md#statisticsCampaignsGet) | **GET** /statistics/campaigns | Load Campaigns Stats |
| [**statisticsChannelsByNameGet**](StatisticsApi.md#statisticsChannelsByNameGet) | **GET** /statistics/channels/{name} | Load Channel Stats |
| [**statisticsChannelsGet**](StatisticsApi.md#statisticsChannelsGet) | **GET** /statistics/channels | Load Channels Stats |
| [**statisticsGet**](StatisticsApi.md#statisticsGet) | **GET** /statistics | Load Statistics |


<a id="statisticsCampaignsByNameGet"></a>
# **statisticsCampaignsByNameGet**
> ChannelLogStatusSummary statisticsCampaignsByNameGet(name)

Load Campaign Stats

Retrieve stats of an existing campaign. Required Access Level: ViewChannels

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String name = "name_example"; // String | The name of the campaign to get.
    try {
      ChannelLogStatusSummary result = apiInstance.statisticsCampaignsByNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsCampaignsByNameGet");
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
| **name** | **String**| The name of the campaign to get. | |

### Return type

[**ChannelLogStatusSummary**](ChannelLogStatusSummary.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="statisticsCampaignsGet"></a>
# **statisticsCampaignsGet**
> List&lt;ChannelLogStatusSummary&gt; statisticsCampaignsGet(limit, offset)

Load Campaigns Stats

Returns a list of your Campaigns&#39; stats. Required Access Level: ViewChannels

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<ChannelLogStatusSummary> result = apiInstance.statisticsCampaignsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsCampaignsGet");
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

[**List&lt;ChannelLogStatusSummary&gt;**](ChannelLogStatusSummary.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="statisticsChannelsByNameGet"></a>
# **statisticsChannelsByNameGet**
> ChannelLogStatusSummary statisticsChannelsByNameGet(name)

Load Channel Stats

Retrieve an existing channel stats. Required Access Level: ViewChannels

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String name = "name_example"; // String | The name of the channel to get.
    try {
      ChannelLogStatusSummary result = apiInstance.statisticsChannelsByNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsChannelsByNameGet");
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
| **name** | **String**| The name of the channel to get. | |

### Return type

[**ChannelLogStatusSummary**](ChannelLogStatusSummary.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="statisticsChannelsGet"></a>
# **statisticsChannelsGet**
> List&lt;ChannelLogStatusSummary&gt; statisticsChannelsGet(limit, offset)

Load Channels Stats

Returns a list of your Channels&#39; stats. Required Access Level: ViewChannels

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<ChannelLogStatusSummary> result = apiInstance.statisticsChannelsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsChannelsGet");
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

[**List&lt;ChannelLogStatusSummary&gt;**](ChannelLogStatusSummary.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="statisticsGet"></a>
# **statisticsGet**
> LogStatusSummary statisticsGet(from, to)

Load Statistics

Returns basic statistics. Required Access Level: ViewReports

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    try {
      LogStatusSummary result = apiInstance.statisticsGet(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#statisticsGet");
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
| **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | |
| **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional] |

### Return type

[**LogStatusSummary**](LogStatusSummary.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

