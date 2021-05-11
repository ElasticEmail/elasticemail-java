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
import java.io.File;
import com.elasticemail.model.Suppression;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SuppressionsApi
 */
@Ignore
public class SuppressionsApiTest {

    private final SuppressionsApi api = new SuppressionsApi();

    
    /**
     * Get Bounce List
     *
     * Retrieve your list of bounced emails. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsBouncesGetTest() throws ApiException {
        String search = null;
        Integer limit = null;
        Integer offset = null;
        List<Suppression> response = api.suppressionsBouncesGet(search, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Add Bounces Async
     *
     * Add Bounced. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsBouncesImportPostTest() throws ApiException {
        File file = null;
        api.suppressionsBouncesImportPost(file);

        // TODO: test validations
    }
    
    /**
     * Add Bounces
     *
     * Add Bounced. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsBouncesPostTest() throws ApiException {
        List<String> requestBody = null;
        List<Suppression> response = api.suppressionsBouncesPost(requestBody);

        // TODO: test validations
    }
    
    /**
     * Delete Suppression
     *
     * Delete Suppression. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsByEmailDeleteTest() throws ApiException {
        String email = null;
        api.suppressionsByEmailDelete(email);

        // TODO: test validations
    }
    
    /**
     * Get Suppression
     *
     * Retrieve your suppression. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsByEmailGetTest() throws ApiException {
        String email = null;
        Suppression response = api.suppressionsByEmailGet(email);

        // TODO: test validations
    }
    
    /**
     * Get Complaints List
     *
     * Retrieve your list of complaints. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsComplaintsGetTest() throws ApiException {
        String search = null;
        Integer limit = null;
        Integer offset = null;
        List<Suppression> response = api.suppressionsComplaintsGet(search, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Add Complaints Async
     *
     * Add Complaints. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsComplaintsImportPostTest() throws ApiException {
        File file = null;
        api.suppressionsComplaintsImportPost(file);

        // TODO: test validations
    }
    
    /**
     * Add Complaints
     *
     * Add Complaints. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsComplaintsPostTest() throws ApiException {
        List<String> requestBody = null;
        List<Suppression> response = api.suppressionsComplaintsPost(requestBody);

        // TODO: test validations
    }
    
    /**
     * Get Suppressions
     *
     * Retrieve your suppressions. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<Suppression> response = api.suppressionsGet(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get Unsubscribes List
     *
     * Retrieve your list of unsubscribes. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsUnsubscribesGetTest() throws ApiException {
        String search = null;
        Integer limit = null;
        Integer offset = null;
        List<Suppression> response = api.suppressionsUnsubscribesGet(search, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Add Unsubscribes Async
     *
     * Add Unsubscribes. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsUnsubscribesImportPostTest() throws ApiException {
        File file = null;
        api.suppressionsUnsubscribesImportPost(file);

        // TODO: test validations
    }
    
    /**
     * Add Unsubscribes
     *
     * Add Unsubscribes. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suppressionsUnsubscribesPostTest() throws ApiException {
        List<String> requestBody = null;
        List<Suppression> response = api.suppressionsUnsubscribesPost(requestBody);

        // TODO: test validations
    }
    
}