/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    The API has a limit of 20 concurrent connections and a hard timeout of 600 seconds per request.    To start using this API, you will need your Access Token (available <a target=\"_blank\" href=\"https://app.elasticemail.com/marketing/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    Downloadable library clients can be found in our Github repository <a target=\"_blank\" href=\"https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme\">here</a>
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


import com.elasticemail.model.ChannelLogStatusSummary;
import com.elasticemail.model.LogStatusSummary;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for statisticsCampaignsByNameGet
     * @param name The name of the campaign to get. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsCampaignsByNameGetCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/statistics/campaigns/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statisticsCampaignsByNameGetValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling statisticsCampaignsByNameGet(Async)");
        }

        return statisticsCampaignsByNameGetCall(name, _callback);

    }

    /**
     * Load Campaign Stats
     * Retrieve stats of an existing campaign. Required Access Level: ViewChannels
     * @param name The name of the campaign to get. (required)
     * @return ChannelLogStatusSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ChannelLogStatusSummary statisticsCampaignsByNameGet(String name) throws ApiException {
        ApiResponse<ChannelLogStatusSummary> localVarResp = statisticsCampaignsByNameGetWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Load Campaign Stats
     * Retrieve stats of an existing campaign. Required Access Level: ViewChannels
     * @param name The name of the campaign to get. (required)
     * @return ApiResponse&lt;ChannelLogStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ChannelLogStatusSummary> statisticsCampaignsByNameGetWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = statisticsCampaignsByNameGetValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<ChannelLogStatusSummary>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Campaign Stats (asynchronously)
     * Retrieve stats of an existing campaign. Required Access Level: ViewChannels
     * @param name The name of the campaign to get. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsCampaignsByNameGetAsync(String name, final ApiCallback<ChannelLogStatusSummary> _callback) throws ApiException {

        okhttp3.Call localVarCall = statisticsCampaignsByNameGetValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<ChannelLogStatusSummary>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for statisticsCampaignsGet
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsCampaignsGetCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/statistics/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statisticsCampaignsGetValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        return statisticsCampaignsGetCall(limit, offset, _callback);

    }

    /**
     * Load Campaigns Stats
     * Returns a list of your Campaigns&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @return List&lt;ChannelLogStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ChannelLogStatusSummary> statisticsCampaignsGet(Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<ChannelLogStatusSummary>> localVarResp = statisticsCampaignsGetWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * Load Campaigns Stats
     * Returns a list of your Campaigns&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @return ApiResponse&lt;List&lt;ChannelLogStatusSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ChannelLogStatusSummary>> statisticsCampaignsGetWithHttpInfo(Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = statisticsCampaignsGetValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<List<ChannelLogStatusSummary>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Campaigns Stats (asynchronously)
     * Returns a list of your Campaigns&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsCampaignsGetAsync(Integer limit, Integer offset, final ApiCallback<List<ChannelLogStatusSummary>> _callback) throws ApiException {

        okhttp3.Call localVarCall = statisticsCampaignsGetValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<List<ChannelLogStatusSummary>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for statisticsChannelsByNameGet
     * @param name The name of the channel to get. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsChannelsByNameGetCall(String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/statistics/channels/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statisticsChannelsByNameGetValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling statisticsChannelsByNameGet(Async)");
        }

        return statisticsChannelsByNameGetCall(name, _callback);

    }

    /**
     * Load Channel Stats
     * Retrieve an existing channel stats. Required Access Level: ViewChannels
     * @param name The name of the channel to get. (required)
     * @return ChannelLogStatusSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ChannelLogStatusSummary statisticsChannelsByNameGet(String name) throws ApiException {
        ApiResponse<ChannelLogStatusSummary> localVarResp = statisticsChannelsByNameGetWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Load Channel Stats
     * Retrieve an existing channel stats. Required Access Level: ViewChannels
     * @param name The name of the channel to get. (required)
     * @return ApiResponse&lt;ChannelLogStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ChannelLogStatusSummary> statisticsChannelsByNameGetWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = statisticsChannelsByNameGetValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<ChannelLogStatusSummary>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Channel Stats (asynchronously)
     * Retrieve an existing channel stats. Required Access Level: ViewChannels
     * @param name The name of the channel to get. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsChannelsByNameGetAsync(String name, final ApiCallback<ChannelLogStatusSummary> _callback) throws ApiException {

        okhttp3.Call localVarCall = statisticsChannelsByNameGetValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<ChannelLogStatusSummary>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for statisticsChannelsGet
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsChannelsGetCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/statistics/channels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statisticsChannelsGetValidateBeforeCall(Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        return statisticsChannelsGetCall(limit, offset, _callback);

    }

    /**
     * Load Channels Stats
     * Returns a list of your Channels&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @return List&lt;ChannelLogStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ChannelLogStatusSummary> statisticsChannelsGet(Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<ChannelLogStatusSummary>> localVarResp = statisticsChannelsGetWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * Load Channels Stats
     * Returns a list of your Channels&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @return ApiResponse&lt;List&lt;ChannelLogStatusSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ChannelLogStatusSummary>> statisticsChannelsGetWithHttpInfo(Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = statisticsChannelsGetValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<List<ChannelLogStatusSummary>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Channels Stats (asynchronously)
     * Returns a list of your Channels&#39; stats. Required Access Level: ViewChannels
     * @param limit Maximum number of returned items. (optional)
     * @param offset How many items should be returned ahead. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsChannelsGetAsync(Integer limit, Integer offset, final ApiCallback<List<ChannelLogStatusSummary>> _callback) throws ApiException {

        okhttp3.Call localVarCall = statisticsChannelsGetValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<List<ChannelLogStatusSummary>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for statisticsGet
     * @param from Starting date for search in YYYY-MM-DDThh:mm:ss format. (required)
     * @param to Ending date for search in YYYY-MM-DDThh:mm:ss format. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsGetCall(OffsetDateTime from, OffsetDateTime to, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/statistics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call statisticsGetValidateBeforeCall(OffsetDateTime from, OffsetDateTime to, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling statisticsGet(Async)");
        }

        return statisticsGetCall(from, to, _callback);

    }

    /**
     * Load Statistics
     * Returns basic statistics. Required Access Level: ViewReports
     * @param from Starting date for search in YYYY-MM-DDThh:mm:ss format. (required)
     * @param to Ending date for search in YYYY-MM-DDThh:mm:ss format. (optional)
     * @return LogStatusSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LogStatusSummary statisticsGet(OffsetDateTime from, OffsetDateTime to) throws ApiException {
        ApiResponse<LogStatusSummary> localVarResp = statisticsGetWithHttpInfo(from, to);
        return localVarResp.getData();
    }

    /**
     * Load Statistics
     * Returns basic statistics. Required Access Level: ViewReports
     * @param from Starting date for search in YYYY-MM-DDThh:mm:ss format. (required)
     * @param to Ending date for search in YYYY-MM-DDThh:mm:ss format. (optional)
     * @return ApiResponse&lt;LogStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LogStatusSummary> statisticsGetWithHttpInfo(OffsetDateTime from, OffsetDateTime to) throws ApiException {
        okhttp3.Call localVarCall = statisticsGetValidateBeforeCall(from, to, null);
        Type localVarReturnType = new TypeToken<LogStatusSummary>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Load Statistics (asynchronously)
     * Returns basic statistics. Required Access Level: ViewReports
     * @param from Starting date for search in YYYY-MM-DDThh:mm:ss format. (required)
     * @param to Ending date for search in YYYY-MM-DDThh:mm:ss format. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call statisticsGetAsync(OffsetDateTime from, OffsetDateTime to, final ApiCallback<LogStatusSummary> _callback) throws ApiException {

        okhttp3.Call localVarCall = statisticsGetValidateBeforeCall(from, to, _callback);
        Type localVarReturnType = new TypeToken<LogStatusSummary>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
