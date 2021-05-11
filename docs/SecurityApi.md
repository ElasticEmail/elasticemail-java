# SecurityApi

All URIs are relative to *https://api.elasticemail.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**securityApikeysByNameDelete**](SecurityApi.md#securityApikeysByNameDelete) | **DELETE** /security/apikeys/{name} | Delete ApiKey
[**securityApikeysByNameGet**](SecurityApi.md#securityApikeysByNameGet) | **GET** /security/apikeys/{name} | Load ApiKey
[**securityApikeysByNamePut**](SecurityApi.md#securityApikeysByNamePut) | **PUT** /security/apikeys/{name} | Update ApiKey
[**securityApikeysGet**](SecurityApi.md#securityApikeysGet) | **GET** /security/apikeys | List ApiKeys
[**securityApikeysPost**](SecurityApi.md#securityApikeysPost) | **POST** /security/apikeys | Add ApiKey
[**securitySmtpByNameDelete**](SecurityApi.md#securitySmtpByNameDelete) | **DELETE** /security/smtp/{name} | Delete SMTP Credential
[**securitySmtpByNameGet**](SecurityApi.md#securitySmtpByNameGet) | **GET** /security/smtp/{name} | Load SMTP Credential
[**securitySmtpByNamePut**](SecurityApi.md#securitySmtpByNamePut) | **PUT** /security/smtp/{name} | Update SMTP Credential
[**securitySmtpGet**](SecurityApi.md#securitySmtpGet) | **GET** /security/smtp | List SMTP Credentials
[**securitySmtpPost**](SecurityApi.md#securitySmtpPost) | **POST** /security/smtp | Add SMTP Credential


<a name="securityApikeysByNameDelete"></a>
# **securityApikeysByNameDelete**
> securityApikeysByNameDelete(name, subaccount)

Delete ApiKey

Delete your existing ApiKey. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the ApiKey
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which ApiKey should be deleted
    try {
      apiInstance.securityApikeysByNameDelete(name, subaccount);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securityApikeysByNameDelete");
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
 **name** | **String**| Name of the ApiKey |
 **subaccount** | **String**| Email of the subaccount of which ApiKey should be deleted | [optional]

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

<a name="securityApikeysByNameGet"></a>
# **securityApikeysByNameGet**
> ApiKey securityApikeysByNameGet(name, subaccount)

Load ApiKey

Load your existing ApiKey info. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the ApiKey
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which ApiKey should be loaded
    try {
      ApiKey result = apiInstance.securityApikeysByNameGet(name, subaccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securityApikeysByNameGet");
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
 **name** | **String**| Name of the ApiKey |
 **subaccount** | **String**| Email of the subaccount of which ApiKey should be loaded | [optional]

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securityApikeysByNamePut"></a>
# **securityApikeysByNamePut**
> ApiKey securityApikeysByNamePut(name, apiKeyPayload)

Update ApiKey

Update your existing ApiKey. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the ApiKey
    ApiKeyPayload apiKeyPayload = new ApiKeyPayload(); // ApiKeyPayload | 
    try {
      ApiKey result = apiInstance.securityApikeysByNamePut(name, apiKeyPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securityApikeysByNamePut");
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
 **name** | **String**| Name of the ApiKey |
 **apiKeyPayload** | [**ApiKeyPayload**](ApiKeyPayload.md)|  |

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securityApikeysGet"></a>
# **securityApikeysGet**
> List&lt;ApiKey&gt; securityApikeysGet(subaccount)

List ApiKeys

List all your existing ApiKeys. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which ApiKeys should be loaded
    try {
      List<ApiKey> result = apiInstance.securityApikeysGet(subaccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securityApikeysGet");
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
 **subaccount** | **String**| Email of the subaccount of which ApiKeys should be loaded | [optional]

### Return type

[**List&lt;ApiKey&gt;**](ApiKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securityApikeysPost"></a>
# **securityApikeysPost**
> NewApiKey securityApikeysPost(apiKeyPayload)

Add ApiKey

Add a new ApiKey. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    ApiKeyPayload apiKeyPayload = new ApiKeyPayload(); // ApiKeyPayload | 
    try {
      NewApiKey result = apiInstance.securityApikeysPost(apiKeyPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securityApikeysPost");
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
 **apiKeyPayload** | [**ApiKeyPayload**](ApiKeyPayload.md)|  |

### Return type

[**NewApiKey**](NewApiKey.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="securitySmtpByNameDelete"></a>
# **securitySmtpByNameDelete**
> securitySmtpByNameDelete(name, subaccount)

Delete SMTP Credential

Delete your existing SMTP Credentials. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the SMTP Credential
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which credential should be deleted
    try {
      apiInstance.securitySmtpByNameDelete(name, subaccount);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securitySmtpByNameDelete");
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
 **name** | **String**| Name of the SMTP Credential |
 **subaccount** | **String**| Email of the subaccount of which credential should be deleted | [optional]

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

<a name="securitySmtpByNameGet"></a>
# **securitySmtpByNameGet**
> SmtpCredentials securitySmtpByNameGet(name, subaccount)

Load SMTP Credential

Load your existing SMTP Credential info. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the SMTP Credential
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which credential should be loaded
    try {
      SmtpCredentials result = apiInstance.securitySmtpByNameGet(name, subaccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securitySmtpByNameGet");
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
 **name** | **String**| Name of the SMTP Credential |
 **subaccount** | **String**| Email of the subaccount of which credential should be loaded | [optional]

### Return type

[**SmtpCredentials**](SmtpCredentials.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securitySmtpByNamePut"></a>
# **securitySmtpByNamePut**
> SmtpCredentials securitySmtpByNamePut(name, smtpCredentialsPayload)

Update SMTP Credential

Update your existing SMTP Credentials. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String name = "name_example"; // String | Name of the SMTP Credential
    SmtpCredentialsPayload smtpCredentialsPayload = new SmtpCredentialsPayload(); // SmtpCredentialsPayload | 
    try {
      SmtpCredentials result = apiInstance.securitySmtpByNamePut(name, smtpCredentialsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securitySmtpByNamePut");
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
 **name** | **String**| Name of the SMTP Credential |
 **smtpCredentialsPayload** | [**SmtpCredentialsPayload**](SmtpCredentialsPayload.md)|  |

### Return type

[**SmtpCredentials**](SmtpCredentials.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securitySmtpGet"></a>
# **securitySmtpGet**
> List&lt;SmtpCredentials&gt; securitySmtpGet(subaccount)

List SMTP Credentials

List all your existing SMTP Credentials. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String subaccount = "subaccount_example"; // String | Email of the subaccount of which credentials should be listed
    try {
      List<SmtpCredentials> result = apiInstance.securitySmtpGet(subaccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securitySmtpGet");
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
 **subaccount** | **String**| Email of the subaccount of which credentials should be listed | [optional]

### Return type

[**List&lt;SmtpCredentials&gt;**](SmtpCredentials.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="securitySmtpPost"></a>
# **securitySmtpPost**
> NewSmtpCredentials securitySmtpPost(smtpCredentialsPayload)

Add SMTP Credential

Add new SMTP Credential. Required Access Level: Security

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    SmtpCredentialsPayload smtpCredentialsPayload = new SmtpCredentialsPayload(); // SmtpCredentialsPayload | 
    try {
      NewSmtpCredentials result = apiInstance.securitySmtpPost(smtpCredentialsPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#securitySmtpPost");
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
 **smtpCredentialsPayload** | [**SmtpCredentialsPayload**](SmtpCredentialsPayload.md)|  |

### Return type

[**NewSmtpCredentials**](NewSmtpCredentials.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

