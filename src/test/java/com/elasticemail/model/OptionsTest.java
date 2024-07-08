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

import com.elasticemail.model.EncodingType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for Options
 */
public class OptionsTest {
    private final Options model = new Options();

    /**
     * Model tests for Options
     */
    @Test
    public void testOptions() {
        // TODO: test Options
    }

    /**
     * Test the property 'timeOffset'
     */
    @Test
    public void timeOffsetTest() {
        // TODO: test timeOffset
    }

    /**
     * Test the property 'poolName'
     */
    @Test
    public void poolNameTest() {
        // TODO: test poolName
    }

    /**
     * Test the property 'channelName'
     */
    @Test
    public void channelNameTest() {
        // TODO: test channelName
    }

    /**
     * Test the property 'encoding'
     */
    @Test
    public void encodingTest() {
        // TODO: test encoding
    }

    /**
     * Test the property 'trackOpens'
     */
    @Test
    public void trackOpensTest() {
        // TODO: test trackOpens
    }

    /**
     * Test the property 'trackClicks'
     */
    @Test
    public void trackClicksTest() {
        // TODO: test trackClicks
    }

}
