# ContactsApi

All URIs are relative to *https://api.elasticemail.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactsByEmailDelete**](ContactsApi.md#contactsByEmailDelete) | **DELETE** /contacts/{email} | Delete Contact
[**contactsByEmailGet**](ContactsApi.md#contactsByEmailGet) | **GET** /contacts/{email} | Load Contact
[**contactsByEmailHistoryGet**](ContactsApi.md#contactsByEmailHistoryGet) | **GET** /contacts/{email}/history | Load History
[**contactsByEmailPut**](ContactsApi.md#contactsByEmailPut) | **PUT** /contacts/{email} | Update Contact
[**contactsDeletePost**](ContactsApi.md#contactsDeletePost) | **POST** /contacts/delete | Delete Contacts Bulk
[**contactsExportByIdStatusGet**](ContactsApi.md#contactsExportByIdStatusGet) | **GET** /contacts/export/{id}/status | Check Export Status
[**contactsExportPost**](ContactsApi.md#contactsExportPost) | **POST** /contacts/export | Export Contacts
[**contactsGet**](ContactsApi.md#contactsGet) | **GET** /contacts | Load Contacts
[**contactsImportPost**](ContactsApi.md#contactsImportPost) | **POST** /contacts/import | Upload Contacts
[**contactsPost**](ContactsApi.md#contactsPost) | **POST** /contacts | Add Contact


<a name="contactsByEmailDelete"></a>
# **contactsByEmailDelete**
> contactsByEmailDelete(email)

Delete Contact

Deletes the provided contact. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    try {
      apiInstance.contactsByEmailDelete(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsByEmailDelete");
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
 **email** | **String**| Proper email address. |

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

<a name="contactsByEmailGet"></a>
# **contactsByEmailGet**
> Contact contactsByEmailGet(email)

Load Contact

Load detailed contact information for specified email. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    try {
      Contact result = apiInstance.contactsByEmailGet(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsByEmailGet");
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
 **email** | **String**| Proper email address. |

### Return type

[**Contact**](Contact.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="contactsByEmailHistoryGet"></a>
# **contactsByEmailHistoryGet**
> List&lt;ContactHistory&gt; contactsByEmailHistoryGet(email, limit, offset)

Load History

Returns detailed history of specified Contact. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<ContactHistory> result = apiInstance.contactsByEmailHistoryGet(email, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsByEmailHistoryGet");
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
 **email** | **String**| Proper email address. |
 **limit** | **Integer**| Maximum number of returned items. | [optional]
 **offset** | **Integer**| How many items should be returned ahead. | [optional]

### Return type

[**List&lt;ContactHistory&gt;**](ContactHistory.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="contactsByEmailPut"></a>
# **contactsByEmailPut**
> Contact contactsByEmailPut(email, contactUpdatePayload)

Update Contact

Update selected contact. Omitted contact&#39;s fields will not be changed. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String email = "mail@example.com"; // String | Proper email address.
    ContactUpdatePayload contactUpdatePayload = new ContactUpdatePayload(); // ContactUpdatePayload | 
    try {
      Contact result = apiInstance.contactsByEmailPut(email, contactUpdatePayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsByEmailPut");
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
 **email** | **String**| Proper email address. |
 **contactUpdatePayload** | [**ContactUpdatePayload**](ContactUpdatePayload.md)|  |

### Return type

[**Contact**](Contact.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="contactsDeletePost"></a>
# **contactsDeletePost**
> contactsDeletePost(emailsPayload)

Delete Contacts Bulk

Deletes provided contacts in bulk. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    EmailsPayload emailsPayload = new EmailsPayload(); // EmailsPayload | Provide either rule or a list of emails, not both.
    try {
      apiInstance.contactsDeletePost(emailsPayload);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsDeletePost");
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
 **emailsPayload** | [**EmailsPayload**](EmailsPayload.md)| Provide either rule or a list of emails, not both. |

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
**200** | OK |  -  |

<a name="contactsExportByIdStatusGet"></a>
# **contactsExportByIdStatusGet**
> ExportStatus contactsExportByIdStatusGet(id)

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
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String id = "E33EBA7A-C20D-4D3D-8F2F-5EEF42F58E6F"; // String | ID of the exported file
    try {
      ExportStatus result = apiInstance.contactsExportByIdStatusGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsExportByIdStatusGet");
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

<a name="contactsExportPost"></a>
# **contactsExportPost**
> ExportLink contactsExportPost(fileFormat, rule, emails, compressionFormat, fileName)

Export Contacts

Request an Export of specified Contacts. Required Access Level: Export

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    ExportFileFormats fileFormat = new ExportFileFormats(); // ExportFileFormats | Format of the exported file
    String rule = "Status%20=%20Engaged"; // String | Query used for filtering.
    List<String> emails = Arrays.asList(); // List<String> | Comma delimited list of contact emails
    CompressionFormat compressionFormat = new CompressionFormat(); // CompressionFormat | FileResponse compression format. None or Zip.
    String fileName = "filename.txt"; // String | Name of your file including extension.
    try {
      ExportLink result = apiInstance.contactsExportPost(fileFormat, rule, emails, compressionFormat, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsExportPost");
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
 **fileFormat** | [**ExportFileFormats**](.md)| Format of the exported file | [optional]
 **rule** | **String**| Query used for filtering. | [optional]
 **emails** | [**List&lt;String&gt;**](String.md)| Comma delimited list of contact emails | [optional]
 **compressionFormat** | [**CompressionFormat**](.md)| FileResponse compression format. None or Zip. | [optional]
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

<a name="contactsGet"></a>
# **contactsGet**
> List&lt;Contact&gt; contactsGet(limit, offset)

Load Contacts

Returns a list of contacts. Required Access Level: ViewContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<Contact> result = apiInstance.contactsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsGet");
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
 **limit** | **Integer**| Maximum number of returned items. | [optional]
 **offset** | **Integer**| How many items should be returned ahead. | [optional]

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
**200** | OK |  -  |

<a name="contactsImportPost"></a>
# **contactsImportPost**
> contactsImportPost(listName, encodingName, file)

Upload Contacts

Upload contacts from a file. Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String listName = "listName_example"; // String | Name of an existing list to add these contacts to
    String encodingName = "encodingName_example"; // String | In what encoding the file is uploaded
    File file = new File("/path/to/file"); // File | 
    try {
      apiInstance.contactsImportPost(listName, encodingName, file);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsImportPost");
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
 **listName** | **String**| Name of an existing list to add these contacts to | [optional]
 **encodingName** | **String**| In what encoding the file is uploaded | [optional]
 **file** | **File**|  | [optional]

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
**202** | Accepted |  -  |

<a name="contactsPost"></a>
# **contactsPost**
> List&lt;Contact&gt; contactsPost(contactPayload, listnames)

Add Contact

Add new Contacts to your Lists. Up to 1000 can be added (for more please refer to the import request). Required Access Level: ModifyContacts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    List<ContactPayload> contactPayload = Arrays.asList(); // List<ContactPayload> | 
    List<String> listnames = Arrays.asList(); // List<String> | Names of lists to which the uploaded contacts should be added to
    try {
      List<Contact> result = apiInstance.contactsPost(contactPayload, listnames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#contactsPost");
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
 **contactPayload** | [**List&lt;ContactPayload&gt;**](ContactPayload.md)|  |
 **listnames** | [**List&lt;String&gt;**](String.md)| Names of lists to which the uploaded contacts should be added to | [optional]

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

