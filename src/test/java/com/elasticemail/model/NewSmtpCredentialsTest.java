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

import com.elasticemail.model.AccessLevel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for NewSmtpCredentials
 */
public class NewSmtpCredentialsTest {
    private final NewSmtpCredentials model = new NewSmtpCredentials();

    /**
     * Model tests for NewSmtpCredentials
     */
    @Test
    public void testNewSmtpCredentials() {
        // TODO: test NewSmtpCredentials
    }

    /**
     * Test the property 'token'
     */
    @Test
    public void tokenTest() {
        // TODO: test token
    }

    /**
     * Test the property 'accessLevel'
     */
    @Test
    public void accessLevelTest() {
        // TODO: test accessLevel
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {
        // TODO: test dateCreated
    }

    /**
     * Test the property 'lastUse'
     */
    @Test
    public void lastUseTest() {
        // TODO: test lastUse
    }

    /**
     * Test the property 'expires'
     */
    @Test
    public void expiresTest() {
        // TODO: test expires
    }

    /**
     * Test the property 'restrictAccessToIPRange'
     */
    @Test
    public void restrictAccessToIPRangeTest() {
        // TODO: test restrictAccessToIPRange
    }

}
