# ListsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listsByListnameContactsGet**](ListsApi.md#listsByListnameContactsGet) | **GET** /lists/{listname}/contacts | Load Contacts in List |
| [**listsByNameContactsPost**](ListsApi.md#listsByNameContactsPost) | **POST** /lists/{name}/contacts | Add Contacts to List |
| [**listsByNameContactsRemovePost**](ListsApi.md#listsByNameContactsRemovePost) | **POST** /lists/{name}/contacts/remove | Remove Contacts from List |
| [**listsByNameDelete**](ListsApi.md#listsByNameDelete) | **DELETE** /lists/{name} | Delete List |
| [**listsByNameGet**](ListsApi.md#listsByNameGet) | **GET** /lists/{name} | Load List |
| [**listsByNamePut**](ListsApi.md#listsByNamePut) | **PUT** /lists/{name} | Update List |
| [**listsGet**](ListsApi.md#listsGet) | **GET** /lists | Load Lists |
| [**listsPost**](ListsApi.md#listsPost) | **POST** /lists | Add List |


<a id="listsByListnameContactsGet"></a>
# **listsByListnameContactsGet**
> List&lt;Contact&gt; listsByListnameContactsGet(listname, limit, offset)

Load Contacts in List

Returns a list of contacts. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String listname = "My List 1"; // String | Name of your list.
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Contact> result = apiInstance.listsByListnameContactsGet(listname, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByListnameContactsGet");
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
| **listname** | **String**| Name of your list. | |
| **limit** | **Integer**| Maximum number of returned items. | [optional] |
| **offset** | **Integer**| How many items should be returned ahead. | [optional] |

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsByNameContactsPost"></a>
# **listsByNameContactsPost**
> ContactsList listsByNameContactsPost(name, emailsPayload)

Add Contacts to List

Add existing Contacts to specified list. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String name = "My List 1"; // String | Name of your list.
    EmailsPayload emailsPayload = new EmailsPayload(); // EmailsPayload | Provide either rule or a list of emails, not both.
    try {
      ContactsList result = apiInstance.listsByNameContactsPost(name, emailsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByNameContactsPost");
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
| **name** | **String**| Name of your list. | |
| **emailsPayload** | [**EmailsPayload**](EmailsPayload.md)| Provide either rule or a list of emails, not both. | |

### Return type

[**ContactsList**](ContactsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsByNameContactsRemovePost"></a>
# **listsByNameContactsRemovePost**
> listsByNameContactsRemovePost(name, emailsPayload)

Remove Contacts from List

Remove specified Contacts from your list. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String name = "My List 1"; // String | Name of your list.
    EmailsPayload emailsPayload = new EmailsPayload(); // EmailsPayload | Provide either rule or a list of emails, not both.
    try {
      apiInstance.listsByNameContactsRemovePost(name, emailsPayload);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByNameContactsRemovePost");
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
| **name** | **String**| Name of your list. | |
| **emailsPayload** | [**EmailsPayload**](EmailsPayload.md)| Provide either rule or a list of emails, not both. | |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsByNameDelete"></a>
# **listsByNameDelete**
> listsByNameDelete(name)

Delete List

Deletes List and removes all the Contacts from it (does not delete Contacts). Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String name = "My List 1"; // String | Name of your list.
    try {
      apiInstance.listsByNameDelete(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByNameDelete");
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
| **name** | **String**| Name of your list. | |

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

<a id="listsByNameGet"></a>
# **listsByNameGet**
> ContactsList listsByNameGet(name)

Load List

Returns detailed information about specified list. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String name = "My List 1"; // String | Name of your list.
    try {
      ContactsList result = apiInstance.listsByNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByNameGet");
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
| **name** | **String**| Name of your list. | |

### Return type

[**ContactsList**](ContactsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsByNamePut"></a>
# **listsByNamePut**
> ContactsList listsByNamePut(name, listUpdatePayload)

Update List

Update existing list. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    String name = "My List 1"; // String | Name of your list.
    ListUpdatePayload listUpdatePayload = new ListUpdatePayload(); // ListUpdatePayload | 
    try {
      ContactsList result = apiInstance.listsByNamePut(name, listUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsByNamePut");
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
| **name** | **String**| Name of your list. | |
| **listUpdatePayload** | [**ListUpdatePayload**](ListUpdatePayload.md)|  | |

### Return type

[**ContactsList**](ContactsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsGet"></a>
# **listsGet**
> List&lt;ContactsList&gt; listsGet(limit, offset)

Load Lists

Returns all your existing lists. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<ContactsList> result = apiInstance.listsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsGet");
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

[**List&lt;ContactsList&gt;**](ContactsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listsPost"></a>
# **listsPost**
> ContactsList listsPost(listPayload)

Add List

Add a new list. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    ListPayload listPayload = new ListPayload(); // ListPayload | 
    try {
      ContactsList result = apiInstance.listsPost(listPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listsPost");
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
| **listPayload** | [**ListPayload**](ListPayload.md)|  | |

### Return type

[**ContactsList**](ContactsList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

