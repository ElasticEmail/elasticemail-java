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
import com.elasticemail.model.Segment;
import com.elasticemail.model.SegmentPayload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentsApi
 */
@Ignore
public class SegmentsApiTest {

    private final SegmentsApi api = new SegmentsApi();

    
    /**
     * Delete Segment
     *
     * Delete an existing segment. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentsByNameDeleteTest() throws ApiException {
        String name = null;
        api.segmentsByNameDelete(name);

        // TODO: test validations
    }
    
    /**
     * Load Segment
     *
     * Returns details for the specified segment. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentsByNameGetTest() throws ApiException {
        String name = null;
        Segment response = api.segmentsByNameGet(name);

        // TODO: test validations
    }
    
    /**
     * Update Segment
     *
     * Rename or change RULE for your segment. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentsByNamePutTest() throws ApiException {
        String name = null;
        SegmentPayload segmentPayload = null;
        Segment response = api.segmentsByNamePut(name, segmentPayload);

        // TODO: test validations
    }
    
    /**
     * Load Segments
     *
     * Returns a list of all your available Segments. Required Access Level: ViewContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentsGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<Segment> response = api.segmentsGet(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Add Segment
     *
     * Add a new segment, based on specified RULE. Required Access Level: ModifyContacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void segmentsPostTest() throws ApiException {
        SegmentPayload segmentPayload = null;
        Segment response = api.segmentsPost(segmentPayload);

        // TODO: test validations
    }
    
}
