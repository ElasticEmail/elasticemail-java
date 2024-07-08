# SubAccountsApi

All URIs are relative to *https://api.elasticemail.com/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subaccountsByEmailCreditsPatch**](SubAccountsApi.md#subaccountsByEmailCreditsPatch) | **PATCH** /subaccounts/{email}/credits | Add, Subtract Email Credits |
| [**subaccountsByEmailDelete**](SubAccountsApi.md#subaccountsByEmailDelete) | **DELETE** /subaccounts/{email} | Delete SubAccount |
| [**subaccountsByEmailGet**](SubAccountsApi.md#subaccountsByEmailGet) | **GET** /subaccounts/{email} | Load SubAccount |
| [**subaccountsByEmailSettingsEmailPut**](SubAccountsApi.md#subaccountsByEmailSettingsEmailPut) | **PUT** /subaccounts/{email}/settings/email | Update SubAccount Email Settings |
| [**subaccountsGet**](SubAccountsApi.md#subaccountsGet) | **GET** /subaccounts | Load SubAccounts |
| [**subaccountsPost**](SubAccountsApi.md#subaccountsPost) | **POST** /subaccounts | Add SubAccount |


<a id="subaccountsByEmailCreditsPatch"></a>
# **subaccountsByEmailCreditsPatch**
> subaccountsByEmailCreditsPatch(email, subaccountEmailCreditsPayload)

Add, Subtract Email Credits

Update email credits of a subaccount by the given amount. Required Access Level: ModifySubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    String email = "mail@example.com"; // String | Email address of Sub-Account
    SubaccountEmailCreditsPayload subaccountEmailCreditsPayload = new SubaccountEmailCreditsPayload(); // SubaccountEmailCreditsPayload | Amount of email credits to add or subtract from the current SubAccount email credits pool (positive or negative value)
    try {
      apiInstance.subaccountsByEmailCreditsPatch(email, subaccountEmailCreditsPayload);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsByEmailCreditsPatch");
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
| **email** | **String**| Email address of Sub-Account | |
| **subaccountEmailCreditsPayload** | [**SubaccountEmailCreditsPayload**](SubaccountEmailCreditsPayload.md)| Amount of email credits to add or subtract from the current SubAccount email credits pool (positive or negative value) | |

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

<a id="subaccountsByEmailDelete"></a>
# **subaccountsByEmailDelete**
> subaccountsByEmailDelete(email)

Delete SubAccount

Deletes specified SubAccount. An email will be sent to confirm this change. Required Access Level: ModifySubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    String email = "mail@example.com"; // String | Email address of Sub-Account
    try {
      apiInstance.subaccountsByEmailDelete(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsByEmailDelete");
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
| **email** | **String**| Email address of Sub-Account | |

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

<a id="subaccountsByEmailGet"></a>
# **subaccountsByEmailGet**
> SubAccountInfo subaccountsByEmailGet(email)

Load SubAccount

Returns details for the specified SubAccount. Required Access Level: ViewSubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    String email = "mail@example.com"; // String | Email address of Sub-Account
    try {
      SubAccountInfo result = apiInstance.subaccountsByEmailGet(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsByEmailGet");
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
| **email** | **String**| Email address of Sub-Account | |

### Return type

[**SubAccountInfo**](SubAccountInfo.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="subaccountsByEmailSettingsEmailPut"></a>
# **subaccountsByEmailSettingsEmailPut**
> SubaccountEmailSettings subaccountsByEmailSettingsEmailPut(email, subaccountEmailSettings)

Update SubAccount Email Settings

Update SubAccount email settings. Required Access Level: ModifySubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    String email = "email_example"; // String | 
    SubaccountEmailSettings subaccountEmailSettings = new SubaccountEmailSettings(); // SubaccountEmailSettings | Updated Email Settings
    try {
      SubaccountEmailSettings result = apiInstance.subaccountsByEmailSettingsEmailPut(email, subaccountEmailSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsByEmailSettingsEmailPut");
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
| **email** | **String**|  | |
| **subaccountEmailSettings** | [**SubaccountEmailSettings**](SubaccountEmailSettings.md)| Updated Email Settings | |

### Return type

[**SubaccountEmailSettings**](SubaccountEmailSettings.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="subaccountsGet"></a>
# **subaccountsGet**
> List&lt;SubAccountInfo&gt; subaccountsGet(limit, offset)

Load SubAccounts

Returns a list of all your SubAccounts. Required Access Level: ViewSubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    Integer limit = 100; // Integer | Maximum number of returned items.
    Integer offset = 20; // Integer | How many items should be returned ahead.
    try {
      List<SubAccountInfo> result = apiInstance.subaccountsGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsGet");
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

[**List&lt;SubAccountInfo&gt;**](SubAccountInfo.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="subaccountsPost"></a>
# **subaccountsPost**
> SubAccountInfo subaccountsPost(subaccountPayload)

Add SubAccount

Add a new SubAccount to your Account. To receive an access token for this SubAccount, make a POST security/apikeys request using the &#39;subaccount&#39; parameter. Required Access Level: ModifySubAccounts

### Example
```java
// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.SubAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.elasticemail.com/v4");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    SubAccountsApi apiInstance = new SubAccountsApi(defaultClient);
    SubaccountPayload subaccountPayload = new SubaccountPayload(); // SubaccountPayload | 
    try {
      SubAccountInfo result = apiInstance.subaccountsPost(subaccountPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubAccountsApi#subaccountsPost");
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
| **subaccountPayload** | [**SubaccountPayload**](SubaccountPayload.md)|  | |

### Return type

[**SubAccountInfo**](SubAccountInfo.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

