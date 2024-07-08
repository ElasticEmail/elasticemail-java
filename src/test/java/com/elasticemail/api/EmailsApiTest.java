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

import com.elasticemail.client.ApiException;
import com.elasticemail.model.EmailData;
import com.elasticemail.model.EmailJobStatus;
import com.elasticemail.model.EmailMessageData;
import com.elasticemail.model.EmailSend;
import com.elasticemail.model.EmailTransactionalMessageData;
import com.elasticemail.model.MergeEmailPayload;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailsApi
 */
@Disabled
public class EmailsApiTest {

    private final EmailsApi api = new EmailsApi();

    /**
     * View Email
     *
     * Returns email details for viewing or rendering. Required Access Level: None
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailsByMsgidViewGetTest() throws ApiException {
        String msgid = null;
        EmailData response = api.emailsByMsgidViewGet(msgid);
        // TODO: test validations
    }

    /**
     * Get Status
     *
     * Get status details of an email transaction. Required Access Level: ViewReports
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailsByTransactionidStatusGetTest() throws ApiException {
        String transactionid = null;
        Boolean showFailed = null;
        Boolean showSent = null;
        Boolean showDelivered = null;
        Boolean showPending = null;
        Boolean showOpened = null;
        Boolean showClicked = null;
        Boolean showAbuse = null;
        Boolean showUnsubscribed = null;
        Boolean showErrors = null;
        Boolean showMessageIDs = null;
        EmailJobStatus response = api.emailsByTransactionidStatusGet(transactionid, showFailed, showSent, showDelivered, showPending, showOpened, showClicked, showAbuse, showUnsubscribed, showErrors, showMessageIDs);
        // TODO: test validations
    }

    /**
     * Send Bulk Emails CSV
     *
     * Send bulk merge email. Required Access Level: SendHttp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailsMergefilePostTest() throws ApiException {
        MergeEmailPayload mergeEmailPayload = null;
        EmailSend response = api.emailsMergefilePost(mergeEmailPayload);
        // TODO: test validations
    }

    /**
     * Send Bulk Emails
     *
     * Send bulk merge email. Required Access Level: SendHttp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailsPostTest() throws ApiException {
        EmailMessageData emailMessageData = null;
        EmailSend response = api.emailsPost(emailMessageData);
        // TODO: test validations
    }

    /**
     * Send Transactional Email
     *
     * Send transactional emails (recipients will be known to each other). Required Access Level: SendHttp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void emailsTransactionalPostTest() throws ApiException {
        EmailTransactionalMessageData emailTransactionalMessageData = null;
        EmailSend response = api.emailsTransactionalPost(emailTransactionalMessageData);
        // TODO: test validations
    }

}
