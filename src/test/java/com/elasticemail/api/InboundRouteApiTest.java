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
import com.elasticemail.model.InboundPayload;
import com.elasticemail.model.InboundRoute;
import com.elasticemail.model.SortOrderItem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboundRouteApi
 */
@Ignore
public class InboundRouteApiTest {

    private final InboundRouteApi api = new InboundRouteApi();

    
    /**
     * Delete Route
     *
     * Deletes the Inbound Route. Required Access Level: ModifySettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundrouteByIdDeleteTest() throws ApiException {
        String id = null;
        api.inboundrouteByIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get Route
     *
     * Load an Inbound Route. Required Access Level: ViewSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundrouteByIdGetTest() throws ApiException {
        String id = null;
        InboundRoute response = api.inboundrouteByIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update Route
     *
     * Update the Inbound Route. Required Access Level: ModifySettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundrouteByIdPutTest() throws ApiException {
        String id = null;
        InboundPayload inboundPayload = null;
        InboundRoute response = api.inboundrouteByIdPut(id, inboundPayload);

        // TODO: test validations
    }
    
    /**
     * Get Routes
     *
     * Get all your Inbound Routes. Required Access Level: ViewSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundrouteGetTest() throws ApiException {
        List<InboundRoute> response = api.inboundrouteGet();

        // TODO: test validations
    }
    
    /**
     * Update Sorting
     *
     * Required Access Level: ViewSettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundrouteOrderPutTest() throws ApiException {
        List<SortOrderItem> sortOrderItem = null;
        List<InboundRoute> response = api.inboundrouteOrderPut(sortOrderItem);

        // TODO: test validations
    }
    
    /**
     * Create Route
     *
     * Create new Inbound Route. Required Access Level: ModifySettings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inboundroutePostTest() throws ApiException {
        InboundPayload inboundPayload = null;
        InboundRoute response = api.inboundroutePost(inboundPayload);

        // TODO: test validations
    }
    
}
