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

import com.elasticemail.client.ApiException;
import com.elasticemail.model.EmailData;
import com.elasticemail.model.EmailMessageData;
import com.elasticemail.model.EmailSend;
import com.elasticemail.model.EmailTransactionalMessageData;
import com.elasticemail.model.MergeEmailPayload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailsApi
 */
@Ignore
public class EmailsApiTest {

    private final EmailsApi api = new EmailsApi();

    
    /**
     * View Email
     *
     * Returns email details for viewing or rendering. Required Access Level: None
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailsByMsgidViewGetTest() throws ApiException {
        String msgid = null;
        EmailData response = api.emailsByMsgidViewGet(msgid);

        // TODO: test validations
    }
    
    /**
     * Send Bulk Emails CSV
     *
     * Send bulk merge email. Required Access Level: SendHttp
     *
     * @throws ApiException
     *          if the Api call fails
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
     * @throws ApiException
     *          if the Api call fails
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailsTransactionalPostTest() throws ApiException {
        EmailTransactionalMessageData emailTransactionalMessageData = null;
        EmailSend response = api.emailsTransactionalPost(emailTransactionalMessageData);

        // TODO: test validations
    }
    
}