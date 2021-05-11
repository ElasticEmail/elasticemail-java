# EventsApi

All URIs are relative to *https://api.elasticemail.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsByTransactionidGet**](EventsApi.md#eventsByTransactionidGet) | **GET** /events/{transactionid} | Load Email Events
[**eventsChannelsByNameExportPost**](EventsApi.md#eventsChannelsByNameExportPost) | **POST** /events/channels/{name}/export | Export Channel Events
[**eventsChannelsByNameGet**](EventsApi.md#eventsChannelsByNameGet) | **GET** /events/channels/{name} | Load Channel Events
[**eventsChannelsExportByIdStatusGet**](EventsApi.md#eventsChannelsExportByIdStatusGet) | **GET** /events/channels/export/{id}/status | Check Channel Export Status
[**eventsExportByIdStatusGet**](EventsApi.md#eventsExportByIdStatusGet) | **GET** /events/export/{id}/status | Check Export Status
[**eventsExportPost**](EventsApi.md#eventsExportPost) | **POST** /events/export | Export Events
[**eventsGet**](EventsApi.md#eventsGet) | **GET** /events | Load Events


<a name="eventsByTransactionidGet"></a>
# **eventsByTransactionidGet**
> List&lt;RecipientEvent&gt; eventsByTransactionidGet(transactionid, from, to, orderBy, limit, offset)

Load Email Events

Returns a log of delivery events for the specific transaction ID. Required Access Level: ViewReports

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String transactionid = "TransactionID"; // String | ID number of transaction
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    EventsOrderBy orderBy = new EventsOrderBy(); // EventsOrderBy | 
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<RecipientEvent> result = apiInstance.eventsByTransactionidGet(transactionid, from, to, orderBy, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsByTransactionidGet");
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
 **transactionid** | **String**| ID number of transaction |
 **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **orderBy** | [**EventsOrderBy**](.md)|  | [optional] [default to null]
 **limit** | **Integer**| Maximum number of returned items. | [optional]
 **offset** | **Integer**| How many items should be returned ahead. | [optional]

### Return type

[**List&lt;RecipientEvent&gt;**](RecipientEvent.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="eventsChannelsByNameExportPost"></a>
# **eventsChannelsByNameExportPost**
> ExportLink eventsChannelsByNameExportPost(name, eventTypes, from, to, fileFormat, compressionFormat, fileName)

Export Channel Events

Export delivery events log information to the specified file format. Required Access Level: Export

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String name = "Channel01"; // String | Name of selected channel.
    List<EventType> eventTypes = Arrays.asList(Submission); // List<EventType> | Types of Events to return
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    ExportFileFormats fileFormat = new ExportFileFormats(); // ExportFileFormats | Format of the exported file
    CompressionFormat compressionFormat = new CompressionFormat(); // CompressionFormat | FileResponse compression format. None or Zip.
    String fileName = "filename.txt"; // String | Name of your file including extension.
    try {
      ExportLink result = apiInstance.eventsChannelsByNameExportPost(name, eventTypes, from, to, fileFormat, compressionFormat, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsChannelsByNameExportPost");
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
 **name** | **String**| Name of selected channel. |
 **eventTypes** | [**List&lt;EventType&gt;**](EventType.md)| Types of Events to return | [optional]
 **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **fileFormat** | [**ExportFileFormats**](.md)| Format of the exported file | [optional] [default to null]
 **compressionFormat** | [**CompressionFormat**](.md)| FileResponse compression format. None or Zip. | [optional] [default to null]
 **fileName** | **String**| Name of your file including extension. | [optional]

### Return type

[**ExportLink**](ExportLink.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |

<a name="eventsChannelsByNameGet"></a>
# **eventsChannelsByNameGet**
> List&lt;RecipientEvent&gt; eventsChannelsByNameGet(name, eventTypes, from, to, orderBy, limit, offset)

Load Channel Events

Returns a log of delivery events filtered by specified parameters. Required Access Level: ViewReports

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String name = "Channel01"; // String | Name of selected channel.
    List<EventType> eventTypes = Arrays.asList(Submission); // List<EventType> | Types of Events to return
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    EventsOrderBy orderBy = new EventsOrderBy(); // EventsOrderBy | 
    Integer limit = 56; // Integer | How many items to load. Maximum for this request is 1000 items
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<RecipientEvent> result = apiInstance.eventsChannelsByNameGet(name, eventTypes, from, to, orderBy, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsChannelsByNameGet");
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
 **name** | **String**| Name of selected channel. |
 **eventTypes** | [**List&lt;EventType&gt;**](EventType.md)| Types of Events to return | [optional]
 **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **orderBy** | [**EventsOrderBy**](.md)|  | [optional] [default to null]
 **limit** | **Integer**| How many items to load. Maximum for this request is 1000 items | [optional]
 **offset** | **Integer**| How many items should be returned ahead. | [optional]

### Return type

[**List&lt;RecipientEvent&gt;**](RecipientEvent.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="eventsChannelsExportByIdStatusGet"></a>
# **eventsChannelsExportByIdStatusGet**
> ExportStatus eventsChannelsExportByIdStatusGet(id)

Check Channel Export Status

Check the current status of the channel export. Required Access Level: Export

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String id = "E33EBA7A-C20D-4D3D-8F2F-5EEF42F58E6F"; // String | ID of the exported file
    try {
      ExportStatus result = apiInstance.eventsChannelsExportByIdStatusGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsChannelsExportByIdStatusGet");
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
 **id** | **String**| ID of the exported file |

### Return type

[**ExportStatus**](ExportStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="eventsExportByIdStatusGet"></a>
# **eventsExportByIdStatusGet**
> ExportStatus eventsExportByIdStatusGet(id)

Check Export Status

Check the current status of the export. Required Access Level: Export

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String id = "E33EBA7A-C20D-4D3D-8F2F-5EEF42F58E6F"; // String | ID of the exported file
    try {
      ExportStatus result = apiInstance.eventsExportByIdStatusGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsExportByIdStatusGet");
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
 **id** | **String**| ID of the exported file |

### Return type

[**ExportStatus**](ExportStatus.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="eventsExportPost"></a>
# **eventsExportPost**
> ExportLink eventsExportPost(eventTypes, from, to, fileFormat, compressionFormat, fileName)

Export Events

Export delivery events log information to the specified file format. Required Access Level: Export

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    List<EventType> eventTypes = Arrays.asList(Submission); // List<EventType> | Types of Events to return
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    ExportFileFormats fileFormat = new ExportFileFormats(); // ExportFileFormats | Format of the exported file
    CompressionFormat compressionFormat = new CompressionFormat(); // CompressionFormat | FileResponse compression format. None or Zip.
    String fileName = "filename.txt"; // String | Name of your file including extension.
    try {
      ExportLink result = apiInstance.eventsExportPost(eventTypes, from, to, fileFormat, compressionFormat, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsExportPost");
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
 **eventTypes** | [**List&lt;EventType&gt;**](EventType.md)| Types of Events to return | [optional]
 **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **fileFormat** | [**ExportFileFormats**](.md)| Format of the exported file | [optional] [default to null]
 **compressionFormat** | [**CompressionFormat**](.md)| FileResponse compression format. None or Zip. | [optional] [default to null]
 **fileName** | **String**| Name of your file including extension. | [optional]

### Return type

[**ExportLink**](ExportLink.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |

<a name="eventsGet"></a>
# **eventsGet**
> List&lt;RecipientEvent&gt; eventsGet(eventTypes, from, to, orderBy, limit, offset)

Load Events

Returns a log of delivery events filtered by specified parameters. Required Access Level: ViewReports

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    List<EventType> eventTypes = Arrays.asList(Submission); // List<EventType> | Types of Events to return
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Starting date for search in YYYY-MM-DDThh:mm:ss format.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Ending date for search in YYYY-MM-DDThh:mm:ss format.
    EventsOrderBy orderBy = new EventsOrderBy(); // EventsOrderBy | 
    Integer limit = 56; // Integer | How many items to load. Maximum for this request is 1000 items
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<RecipientEvent> result = apiInstance.eventsGet(eventTypes, from, to, orderBy, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsGet");
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
 **eventTypes** | [**List&lt;EventType&gt;**](EventType.md)| Types of Events to return | [optional]
 **from** | **OffsetDateTime**| Starting date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **to** | **OffsetDateTime**| Ending date for search in YYYY-MM-DDThh:mm:ss format. | [optional]
 **orderBy** | [**EventsOrderBy**](.md)|  | [optional] [default to null]
 **limit** | **Integer**| How many items to load. Maximum for this request is 1000 items | [optional]
 **offset** | **Integer**| How many items should be returned ahead. | [optional]

### Return type

[**List&lt;RecipientEvent&gt;**](RecipientEvent.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

