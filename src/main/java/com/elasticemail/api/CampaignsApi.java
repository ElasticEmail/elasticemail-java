/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    To start using this API, you will need your Access Token (available <a href=\"https://elasticemail.com/account#/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    This is the documentation for REST API. If you’d like to read our legacy documentation regarding Web API v2 click <a href=\"https://api.elasticemail.com/public/help\">here</a>.
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: support@elasticemail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.elasticemail.api;

import com.elasticemail.client.ApiCallback;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.ApiResponse;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.Pair;
import com.elasticemail.client.ProgressRequestBody;
import com.elasticemail.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.elasticemail.model.Campaign;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampaignsApi {
    private ApiClient localVarApiClient;

    public CampaignsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CampaignsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for campaignsByNameDelete
     * @param name Name of Campaign to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNameDeleteCall(String name, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call campaignsByNameDeleteValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling campaignsByNameDelete(Async)");
        }
        

        okhttp3.Call localVarCall = campaignsByNameDeleteCall(name, _callback);
        return localVarCall;

    }

    /**
     * Delete Campaign
     * Delete the specific campaign.  This does not cancel in progress email, see Cancel In Progress. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void campaignsByNameDelete(String name) throws ApiException {
        campaignsByNameDeleteWithHttpInfo(name);
    }

    /**
     * Delete Campaign
     * Delete the specific campaign.  This does not cancel in progress email, see Cancel In Progress. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> campaignsByNameDeleteWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = campaignsByNameDeleteValidateBeforeCall(name, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Campaign (asynchronously)
     * Delete the specific campaign.  This does not cancel in progress email, see Cancel In Progress. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNameDeleteAsync(String name, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = campaignsByNameDeleteValidateBeforeCall(name, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for campaignsByNameGet
     * @param name Name of Campaign to get (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNameGetCall(String name, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call campaignsByNameGetValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling campaignsByNameGet(Async)");
        }
        

        okhttp3.Call localVarCall = campaignsByNameGetCall(name, _callback);
        return localVarCall;

    }

    /**
     * Load Campaign
     * Returns the specified campaign details. Required Access Level: ViewCampaigns
     * @param name Name of Campaign to get (required)
     * @return Campaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Campaign campaignsByNameGet(String name) throws ApiException {
        ApiResponse<Campaign> localVarResp = campaignsByNameGetWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Load Campaign
     * Returns the specified campaign details. Required Access Level: ViewCampaigns
     * @param name Name of Campaign to get (required)
     * @return ApiResponse&lt;Campaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Campaign> campaignsByNameGetWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = campaignsByNameGetValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Campaign (asynchronously)
     * Returns the specified campaign details. Required Access Level: ViewCampaigns
     * @param name Name of Campaign to get (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNameGetAsync(String name, final ApiCallback<Campaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = campaignsByNameGetValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for campaignsByNamePut
     * @param name Name of Campaign to update (required)
     * @param campaign JSON representation of a campaign (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNamePutCall(String name, Campaign campaign, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = campaign;

        // create path and map variables
        String localVarPath = "/campaigns/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call campaignsByNamePutValidateBeforeCall(String name, Campaign campaign, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling campaignsByNamePut(Async)");
        }
        
        // verify the required parameter 'campaign' is set
        if (campaign == null) {
            throw new ApiException("Missing the required parameter 'campaign' when calling campaignsByNamePut(Async)");
        }
        

        okhttp3.Call localVarCall = campaignsByNamePutCall(name, campaign, _callback);
        return localVarCall;

    }

    /**
     * Update Campaign
     * Updates a previously added campaign.  Only Active and Paused campaigns can be updated. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to update (required)
     * @param campaign JSON representation of a campaign (required)
     * @return Campaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Campaign campaignsByNamePut(String name, Campaign campaign) throws ApiException {
        ApiResponse<Campaign> localVarResp = campaignsByNamePutWithHttpInfo(name, campaign);
        return localVarResp.getData();
    }

    /**
     * Update Campaign
     * Updates a previously added campaign.  Only Active and Paused campaigns can be updated. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to update (required)
     * @param campaign JSON representation of a campaign (required)
     * @return ApiResponse&lt;Campaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Campaign> campaignsByNamePutWithHttpInfo(String name, Campaign campaign) throws ApiException {
        okhttp3.Call localVarCall = campaignsByNamePutValidateBeforeCall(name, campaign, null);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Campaign (asynchronously)
     * Updates a previously added campaign.  Only Active and Paused campaigns can be updated. Required Access Level: ModifyCampaigns
     * @param name Name of Campaign to update (required)
     * @param campaign JSON representation of a campaign (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsByNamePutAsync(String name, Campaign campaign, final ApiCallback<Campaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = campaignsByNamePutValidateBeforeCall(name, campaign, _callback);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for campaignsGet
     * @param search Text fragment used for searching in Campaign name (using the &#39;contains&#39; rule) (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param limit Maximum number of returned items. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsGetCall(String search, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call campaignsGetValidateBeforeCall(String search, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = campaignsGetCall(search, offset, limit, _callback);
        return localVarCall;

    }

    /**
     * Load Campaigns
     * Returns a list all of your campaigns. Limited to 1000 results. Required Access Level: ViewCampaigns
     * @param search Text fragment used for searching in Campaign name (using the &#39;contains&#39; rule) (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param limit Maximum number of returned items. (optional)
     * @return List&lt;Campaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Campaign> campaignsGet(String search, Integer offset, Integer limit) throws ApiException {
        ApiResponse<List<Campaign>> localVarResp = campaignsGetWithHttpInfo(search, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Load Campaigns
     * Returns a list all of your campaigns. Limited to 1000 results. Required Access Level: ViewCampaigns
     * @param search Text fragment used for searching in Campaign name (using the &#39;contains&#39; rule) (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param limit Maximum number of returned items. (optional)
     * @return ApiResponse&lt;List&lt;Campaign&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Campaign>> campaignsGetWithHttpInfo(String search, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = campaignsGetValidateBeforeCall(search, offset, limit, null);
        Type localVarReturnType = new TypeToken<List<Campaign>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Campaigns (asynchronously)
     * Returns a list all of your campaigns. Limited to 1000 results. Required Access Level: ViewCampaigns
     * @param search Text fragment used for searching in Campaign name (using the &#39;contains&#39; rule) (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param limit Maximum number of returned items. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsGetAsync(String search, Integer offset, Integer limit, final ApiCallback<List<Campaign>> _callback) throws ApiException {

        okhttp3.Call localVarCall = campaignsGetValidateBeforeCall(search, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<List<Campaign>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for campaignsPost
     * @param campaign JSON representation of a campaign (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsPostCall(Campaign campaign, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = campaign;

        // create path and map variables
        String localVarPath = "/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call campaignsPostValidateBeforeCall(Campaign campaign, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaign' is set
        if (campaign == null) {
            throw new ApiException("Missing the required parameter 'campaign' when calling campaignsPost(Async)");
        }
        

        okhttp3.Call localVarCall = campaignsPostCall(campaign, _callback);
        return localVarCall;

    }

    /**
     * Add Campaign
     * Add a campaign for processing. Required Access Level: ModifyCampaigns
     * @param campaign JSON representation of a campaign (required)
     * @return Campaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public Campaign campaignsPost(Campaign campaign) throws ApiException {
        ApiResponse<Campaign> localVarResp = campaignsPostWithHttpInfo(campaign);
        return localVarResp.getData();
    }

    /**
     * Add Campaign
     * Add a campaign for processing. Required Access Level: ModifyCampaigns
     * @param campaign JSON representation of a campaign (required)
     * @return ApiResponse&lt;Campaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Campaign> campaignsPostWithHttpInfo(Campaign campaign) throws ApiException {
        okhttp3.Call localVarCall = campaignsPostValidateBeforeCall(campaign, null);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Campaign (asynchronously)
     * Add a campaign for processing. Required Access Level: ModifyCampaigns
     * @param campaign JSON representation of a campaign (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call campaignsPostAsync(Campaign campaign, final ApiCallback<Campaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = campaignsPostValidateBeforeCall(campaign, _callback);
        Type localVarReturnType = new TypeToken<Campaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}