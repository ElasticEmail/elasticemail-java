# VerificationsApi

All URIs are relative to *https://api.elasticemail.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verificationsByEmailDelete**](VerificationsApi.md#verificationsByEmailDelete) | **DELETE** /verifications/{email} | Delete Email Verification Result
[**verificationsByEmailGet**](VerificationsApi.md#verificationsByEmailGet) | **GET** /verifications/{email} | Get Email Verification Result
[**verificationsByEmailPost**](VerificationsApi.md#verificationsByEmailPost) | **POST** /verifications/{email} | Verify Email
[**verificationsFilesByIdDelete**](VerificationsApi.md#verificationsFilesByIdDelete) | **DELETE** /verifications/files/{id} | Delete File Verification Result
[**verificationsFilesByIdResultDownloadGet**](VerificationsApi.md#verificationsFilesByIdResultDownloadGet) | **GET** /verifications/files/{id}/result/download | Download File Verification Result
[**verificationsFilesByIdResultGet**](VerificationsApi.md#verificationsFilesByIdResultGet) | **GET** /verifications/files/{id}/result | Get Detailed File Verification Result
[**verificationsFilesByIdVerificationPost**](VerificationsApi.md#verificationsFilesByIdVerificationPost) | **POST** /verifications/files/{id}/verification | Start verification
[**verificationsFilesPost**](VerificationsApi.md#verificationsFilesPost) | **POST** /verifications/files | Upload File with Emails
[**verificationsFilesResultGet**](VerificationsApi.md#verificationsFilesResultGet) | **GET** /verifications/files/result | Get Files Verification Results
[**verificationsGet**](VerificationsApi.md#verificationsGet) | **GET** /verifications | Get Emails Verification Results


<a name="verificationsByEmailDelete"></a>
# **verificationsByEmailDelete**
> verificationsByEmailDelete(email)

Delete Email Verification Result

Delete a result with given email if exists. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String email = "email_example"; // String | Email address to verification
    try {
      apiInstance.verificationsByEmailDelete(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsByEmailDelete");
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
 **email** | **String**| Email address to verification |

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

<a name="verificationsByEmailGet"></a>
# **verificationsByEmailGet**
> EmailValidationResult verificationsByEmailGet(email)

Get Email Verification Result

Returns a result of verified email. Required Access Level: ViewEmailVerifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String email = "email_example"; // String | Email address to view verification result of
    try {
      EmailValidationResult result = apiInstance.verificationsByEmailGet(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsByEmailGet");
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
 **email** | **String**| Email address to view verification result of |

### Return type

[**EmailValidationResult**](EmailValidationResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verificationsByEmailPost"></a>
# **verificationsByEmailPost**
> EmailValidationResult verificationsByEmailPost(email)

Verify Email

Verify single email address and returns result of verification. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String email = "email_example"; // String | Email address to verify
    try {
      EmailValidationResult result = apiInstance.verificationsByEmailPost(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsByEmailPost");
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
 **email** | **String**| Email address to verify |

### Return type

[**EmailValidationResult**](EmailValidationResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verificationsFilesByIdDelete"></a>
# **verificationsFilesByIdDelete**
> verificationsFilesByIdDelete(id)

Delete File Verification Result

Delete Verification Results if they exist. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String id = "E33EBA7A-C20D-4D3D-8F2F-5EEF42F58E6F"; // String | ID of the exported file
    try {
      apiInstance.verificationsFilesByIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesByIdDelete");
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

<a name="verificationsFilesByIdResultDownloadGet"></a>
# **verificationsFilesByIdResultDownloadGet**
> File verificationsFilesByIdResultDownloadGet(id)

Download File Verification Result

Download verification results as a ZIP file. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String id = "id_example"; // String | Verification ID to download
    try {
      File result = apiInstance.verificationsFilesByIdResultDownloadGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesByIdResultDownloadGet");
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
 **id** | **String**| Verification ID to download |

### Return type

[**File**](File.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/_*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A ZIP file with verification details |  -  |

<a name="verificationsFilesByIdResultGet"></a>
# **verificationsFilesByIdResultGet**
> VerificationFileResultDetails verificationsFilesByIdResultGet(id, limit, offset)

Get Detailed File Verification Result

Returns status and results (if verified) of file with given ID. Required Access Level: ViewEmailVerifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String id = "id_example"; // String | ID of the Verification to display status of
    Integer limit = 56; // Integer | Maximum number of returned email verification results
    Integer offset = 56; // Integer | How many result items should be returned ahead
    try {
      VerificationFileResultDetails result = apiInstance.verificationsFilesByIdResultGet(id, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesByIdResultGet");
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
 **id** | **String**| ID of the Verification to display status of |
 **limit** | **Integer**| Maximum number of returned email verification results | [optional]
 **offset** | **Integer**| How many result items should be returned ahead | [optional]

### Return type

[**VerificationFileResultDetails**](VerificationFileResultDetails.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verificationsFilesByIdVerificationPost"></a>
# **verificationsFilesByIdVerificationPost**
> verificationsFilesByIdVerificationPost(id)

Start verification

Start a verification of the previously uploaded file with emails. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    String id = "id_example"; // String | File ID to start verification
    try {
      apiInstance.verificationsFilesByIdVerificationPost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesByIdVerificationPost");
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
 **id** | **String**| File ID to start verification |

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

<a name="verificationsFilesPost"></a>
# **verificationsFilesPost**
> VerificationFileResult verificationsFilesPost(_file)

Upload File with Emails

Uploads a CSV file with list of emails that can then be triggered for verification. An &#39;email&#39; column is required. Required Access Level: VerifyEmails

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      VerificationFileResult result = apiInstance.verificationsFilesPost(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesPost");
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
 **_file** | **File**|  | [optional]

### Return type

[**VerificationFileResult**](VerificationFileResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verificationsFilesResultGet"></a>
# **verificationsFilesResultGet**
> List&lt;VerificationFileResult&gt; verificationsFilesResultGet()

Get Files Verification Results

Returns a list of uploaded files, their statuses and results. Required Access Level: ViewEmailVerifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    try {
      List<VerificationFileResult> result = apiInstance.verificationsFilesResultGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsFilesResultGet");
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

[**List&lt;VerificationFileResult&gt;**](VerificationFileResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verificationsGet"></a>
# **verificationsGet**
> List&lt;EmailValidationResult&gt; verificationsGet(limit, offset)

Get Emails Verification Results

Returns a results of all verified single emails. Required Access Level: ViewEmailVerifications

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<EmailValidationResult> result = apiInstance.verificationsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsGet");
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

[**List&lt;EmailValidationResult&gt;**](EmailValidationResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

