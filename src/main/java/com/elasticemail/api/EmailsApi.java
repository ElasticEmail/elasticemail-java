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


import com.elasticemail.model.EmailData;
import com.elasticemail.model.EmailJobStatus;
import com.elasticemail.model.EmailMessageData;
import com.elasticemail.model.EmailSend;
import com.elasticemail.model.EmailTransactionalMessageData;
import com.elasticemail.model.MergeEmailPayload;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailsApi(ApiClient apiClient) {
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
     * Build call for emailsByMsgidViewGet
     * @param msgid Message identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsByMsgidViewGetCall(String msgid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/emails/{msgid}/view"
            .replace("{" + "msgid" + "}", localVarApiClient.escapeString(msgid.toString()));

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
    private okhttp3.Call emailsByMsgidViewGetValidateBeforeCall(String msgid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'msgid' is set
        if (msgid == null) {
            throw new ApiException("Missing the required parameter 'msgid' when calling emailsByMsgidViewGet(Async)");
        }

        return emailsByMsgidViewGetCall(msgid, _callback);

    }

    /**
     * View Email
     * Returns email details for viewing or rendering. Required Access Level: None
     * @param msgid Message identifier (required)
     * @return EmailData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmailData emailsByMsgidViewGet(String msgid) throws ApiException {
        ApiResponse<EmailData> localVarResp = emailsByMsgidViewGetWithHttpInfo(msgid);
        return localVarResp.getData();
    }

    /**
     * View Email
     * Returns email details for viewing or rendering. Required Access Level: None
     * @param msgid Message identifier (required)
     * @return ApiResponse&lt;EmailData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailData> emailsByMsgidViewGetWithHttpInfo(String msgid) throws ApiException {
        okhttp3.Call localVarCall = emailsByMsgidViewGetValidateBeforeCall(msgid, null);
        Type localVarReturnType = new TypeToken<EmailData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * View Email (asynchronously)
     * Returns email details for viewing or rendering. Required Access Level: None
     * @param msgid Message identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsByMsgidViewGetAsync(String msgid, final ApiCallback<EmailData> _callback) throws ApiException {

        okhttp3.Call localVarCall = emailsByMsgidViewGetValidateBeforeCall(msgid, _callback);
        Type localVarReturnType = new TypeToken<EmailData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for emailsByTransactionidStatusGet
     * @param transactionid Transaction identifier (required)
     * @param showFailed Include Bounced email addresses. (optional, default to false)
     * @param showSent Include Sent email addresses. (optional, default to false)
     * @param showDelivered Include all delivered email addresses. (optional, default to false)
     * @param showPending Include Ready to send email addresses. (optional, default to false)
     * @param showOpened Include Opened email addresses. (optional, default to false)
     * @param showClicked Include Clicked email addresses. (optional, default to false)
     * @param showAbuse Include Reported as abuse email addresses. (optional, default to false)
     * @param showUnsubscribed Include Unsubscribed email addresses. (optional, default to false)
     * @param showErrors Include error messages for bounced emails. (optional, default to false)
     * @param showMessageIDs Include all MessageIDs for this transaction (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsByTransactionidStatusGetCall(String transactionid, Boolean showFailed, Boolean showSent, Boolean showDelivered, Boolean showPending, Boolean showOpened, Boolean showClicked, Boolean showAbuse, Boolean showUnsubscribed, Boolean showErrors, Boolean showMessageIDs, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/emails/{transactionid}/status"
            .replace("{" + "transactionid" + "}", localVarApiClient.escapeString(transactionid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (showFailed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showFailed", showFailed));
        }

        if (showSent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showSent", showSent));
        }

        if (showDelivered != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showDelivered", showDelivered));
        }

        if (showPending != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showPending", showPending));
        }

        if (showOpened != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showOpened", showOpened));
        }

        if (showClicked != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showClicked", showClicked));
        }

        if (showAbuse != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showAbuse", showAbuse));
        }

        if (showUnsubscribed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showUnsubscribed", showUnsubscribed));
        }

        if (showErrors != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showErrors", showErrors));
        }

        if (showMessageIDs != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showMessageIDs", showMessageIDs));
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
    private okhttp3.Call emailsByTransactionidStatusGetValidateBeforeCall(String transactionid, Boolean showFailed, Boolean showSent, Boolean showDelivered, Boolean showPending, Boolean showOpened, Boolean showClicked, Boolean showAbuse, Boolean showUnsubscribed, Boolean showErrors, Boolean showMessageIDs, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionid' is set
        if (transactionid == null) {
            throw new ApiException("Missing the required parameter 'transactionid' when calling emailsByTransactionidStatusGet(Async)");
        }

        return emailsByTransactionidStatusGetCall(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs, _callback);

    }

    /**
     * Get Status
     * Get status details of an email transaction. Required Access Level: ViewReports
     * @param transactionid Transaction identifier (required)
     * @param showFailed Include Bounced email addresses. (optional, default to false)
     * @param showSent Include Sent email addresses. (optional, default to false)
     * @param showDelivered Include all delivered email addresses. (optional, default to false)
     * @param showPending Include Ready to send email addresses. (optional, default to false)
     * @param showOpened Include Opened email addresses. (optional, default to false)
     * @param showClicked Include Clicked email addresses. (optional, default to false)
     * @param showAbuse Include Reported as abuse email addresses. (optional, default to false)
     * @param showUnsubscribed Include Unsubscribed email addresses. (optional, default to false)
     * @param showErrors Include error messages for bounced emails. (optional, default to false)
     * @param showMessageIDs Include all MessageIDs for this transaction (optional, default to false)
     * @return EmailJobStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmailJobStatus emailsByTransactionidStatusGet(String transactionid, Boolean showFailed, Boolean showSent, Boolean showDelivered, Boolean showPending, Boolean showOpened, Boolean showClicked, Boolean showAbuse, Boolean showUnsubscribed, Boolean showErrors, Boolean showMessageIDs) throws ApiException {
        ApiResponse<EmailJobStatus> localVarResp = emailsByTransactionidStatusGetWithHttpInfo(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs);
        return localVarResp.getData();
    }

    /**
     * Get Status
     * Get status details of an email transaction. Required Access Level: ViewReports
     * @param transactionid Transaction identifier (required)
     * @param showFailed Include Bounced email addresses. (optional, default to false)
     * @param showSent Include Sent email addresses. (optional, default to false)
     * @param showDelivered Include all delivered email addresses. (optional, default to false)
     * @param showPending Include Ready to send email addresses. (optional, default to false)
     * @param showOpened Include Opened email addresses. (optional, default to false)
     * @param showClicked Include Clicked email addresses. (optional, default to false)
     * @param showAbuse Include Reported as abuse email addresses. (optional, default to false)
     * @param showUnsubscribed Include Unsubscribed email addresses. (optional, default to false)
     * @param showErrors Include error messages for bounced emails. (optional, default to false)
     * @param showMessageIDs Include all MessageIDs for this transaction (optional, default to false)
     * @return ApiResponse&lt;EmailJobStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailJobStatus> emailsByTransactionidStatusGetWithHttpInfo(String transactionid, Boolean showFailed, Boolean showSent, Boolean showDelivered, Boolean showPending, Boolean showOpened, Boolean showClicked, Boolean showAbuse, Boolean showUnsubscribed, Boolean showErrors, Boolean showMessageIDs) throws ApiException {
        okhttp3.Call localVarCall = emailsByTransactionidStatusGetValidateBeforeCall(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs, null);
        Type localVarReturnType = new TypeToken<EmailJobStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Status (asynchronously)
     * Get status details of an email transaction. Required Access Level: ViewReports
     * @param transactionid Transaction identifier (required)
     * @param showFailed Include Bounced email addresses. (optional, default to false)
     * @param showSent Include Sent email addresses. (optional, default to false)
     * @param showDelivered Include all delivered email addresses. (optional, default to false)
     * @param showPending Include Ready to send email addresses. (optional, default to false)
     * @param showOpened Include Opened email addresses. (optional, default to false)
     * @param showClicked Include Clicked email addresses. (optional, default to false)
     * @param showAbuse Include Reported as abuse email addresses. (optional, default to false)
     * @param showUnsubscribed Include Unsubscribed email addresses. (optional, default to false)
     * @param showErrors Include error messages for bounced emails. (optional, default to false)
     * @param showMessageIDs Include all MessageIDs for this transaction (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsByTransactionidStatusGetAsync(String transactionid, Boolean showFailed, Boolean showSent, Boolean showDelivered, Boolean showPending, Boolean showOpened, Boolean showClicked, Boolean showAbuse, Boolean showUnsubscribed, Boolean showErrors, Boolean showMessageIDs, final ApiCallback<EmailJobStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = emailsByTransactionidStatusGetValidateBeforeCall(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs, _callback);
        Type localVarReturnType = new TypeToken<EmailJobStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for emailsMergefilePost
     * @param mergeEmailPayload Email data (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsMergefilePostCall(MergeEmailPayload mergeEmailPayload, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = mergeEmailPayload;

        // create path and map variables
        String localVarPath = "/emails/mergefile";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call emailsMergefilePostValidateBeforeCall(MergeEmailPayload mergeEmailPayload, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mergeEmailPayload' is set
        if (mergeEmailPayload == null) {
            throw new ApiException("Missing the required parameter 'mergeEmailPayload' when calling emailsMergefilePost(Async)");
        }

        return emailsMergefilePostCall(mergeEmailPayload, _callback);

    }

    /**
     * Send Bulk Emails CSV
     * Send bulk merge email. Required Access Level: SendHttp
     * @param mergeEmailPayload Email data (required)
     * @return EmailSend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmailSend emailsMergefilePost(MergeEmailPayload mergeEmailPayload) throws ApiException {
        ApiResponse<EmailSend> localVarResp = emailsMergefilePostWithHttpInfo(mergeEmailPayload);
        return localVarResp.getData();
    }

    /**
     * Send Bulk Emails CSV
     * Send bulk merge email. Required Access Level: SendHttp
     * @param mergeEmailPayload Email data (required)
     * @return ApiResponse&lt;EmailSend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailSend> emailsMergefilePostWithHttpInfo(MergeEmailPayload mergeEmailPayload) throws ApiException {
        okhttp3.Call localVarCall = emailsMergefilePostValidateBeforeCall(mergeEmailPayload, null);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send Bulk Emails CSV (asynchronously)
     * Send bulk merge email. Required Access Level: SendHttp
     * @param mergeEmailPayload Email data (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsMergefilePostAsync(MergeEmailPayload mergeEmailPayload, final ApiCallback<EmailSend> _callback) throws ApiException {

        okhttp3.Call localVarCall = emailsMergefilePostValidateBeforeCall(mergeEmailPayload, _callback);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for emailsPost
     * @param emailMessageData Email data (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsPostCall(EmailMessageData emailMessageData, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = emailMessageData;

        // create path and map variables
        String localVarPath = "/emails";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call emailsPostValidateBeforeCall(EmailMessageData emailMessageData, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'emailMessageData' is set
        if (emailMessageData == null) {
            throw new ApiException("Missing the required parameter 'emailMessageData' when calling emailsPost(Async)");
        }

        return emailsPostCall(emailMessageData, _callback);

    }

    /**
     * Send Bulk Emails
     * Send bulk merge email. Required Access Level: SendHttp
     * @param emailMessageData Email data (required)
     * @return EmailSend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmailSend emailsPost(EmailMessageData emailMessageData) throws ApiException {
        ApiResponse<EmailSend> localVarResp = emailsPostWithHttpInfo(emailMessageData);
        return localVarResp.getData();
    }

    /**
     * Send Bulk Emails
     * Send bulk merge email. Required Access Level: SendHttp
     * @param emailMessageData Email data (required)
     * @return ApiResponse&lt;EmailSend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailSend> emailsPostWithHttpInfo(EmailMessageData emailMessageData) throws ApiException {
        okhttp3.Call localVarCall = emailsPostValidateBeforeCall(emailMessageData, null);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send Bulk Emails (asynchronously)
     * Send bulk merge email. Required Access Level: SendHttp
     * @param emailMessageData Email data (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsPostAsync(EmailMessageData emailMessageData, final ApiCallback<EmailSend> _callback) throws ApiException {

        okhttp3.Call localVarCall = emailsPostValidateBeforeCall(emailMessageData, _callback);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for emailsTransactionalPost
     * @param emailTransactionalMessageData Email data (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsTransactionalPostCall(EmailTransactionalMessageData emailTransactionalMessageData, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = emailTransactionalMessageData;

        // create path and map variables
        String localVarPath = "/emails/transactional";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call emailsTransactionalPostValidateBeforeCall(EmailTransactionalMessageData emailTransactionalMessageData, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'emailTransactionalMessageData' is set
        if (emailTransactionalMessageData == null) {
            throw new ApiException("Missing the required parameter 'emailTransactionalMessageData' when calling emailsTransactionalPost(Async)");
        }

        return emailsTransactionalPostCall(emailTransactionalMessageData, _callback);

    }

    /**
     * Send Transactional Email
     * Send transactional emails (recipients will be known to each other). Required Access Level: SendHttp
     * @param emailTransactionalMessageData Email data (required)
     * @return EmailSend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EmailSend emailsTransactionalPost(EmailTransactionalMessageData emailTransactionalMessageData) throws ApiException {
        ApiResponse<EmailSend> localVarResp = emailsTransactionalPostWithHttpInfo(emailTransactionalMessageData);
        return localVarResp.getData();
    }

    /**
     * Send Transactional Email
     * Send transactional emails (recipients will be known to each other). Required Access Level: SendHttp
     * @param emailTransactionalMessageData Email data (required)
     * @return ApiResponse&lt;EmailSend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailSend> emailsTransactionalPostWithHttpInfo(EmailTransactionalMessageData emailTransactionalMessageData) throws ApiException {
        okhttp3.Call localVarCall = emailsTransactionalPostValidateBeforeCall(emailTransactionalMessageData, null);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send Transactional Email (asynchronously)
     * Send transactional emails (recipients will be known to each other). Required Access Level: SendHttp
     * @param emailTransactionalMessageData Email data (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call emailsTransactionalPostAsync(EmailTransactionalMessageData emailTransactionalMessageData, final ApiCallback<EmailSend> _callback) throws ApiException {

        okhttp3.Call localVarCall = emailsTransactionalPostValidateBeforeCall(emailTransactionalMessageData, _callback);
        Type localVarReturnType = new TypeToken<EmailSend>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
