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


package com.elasticemail.model;

import com.elasticemail.model.InboundRouteActionType;
import com.elasticemail.model.InboundRouteFilterType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for InboundPayload
 */
public class InboundPayloadTest {
    private final InboundPayload model = new InboundPayload();

    /**
     * Model tests for InboundPayload
     */
    @Test
    public void testInboundPayload() {
        // TODO: test InboundPayload
    }

    /**
     * Test the property 'filter'
     */
    @Test
    public void filterTest() {
        // TODO: test filter
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'filterType'
     */
    @Test
    public void filterTypeTest() {
        // TODO: test filterType
    }

    /**
     * Test the property 'actionType'
     */
    @Test
    public void actionTypeTest() {
        // TODO: test actionType
    }

    /**
     * Test the property 'emailAddress'
     */
    @Test
    public void emailAddressTest() {
        // TODO: test emailAddress
    }

    /**
     * Test the property 'httpAddress'
     */
    @Test
    public void httpAddressTest() {
        // TODO: test httpAddress
    }

}
