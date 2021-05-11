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


package com.elasticemail.model;

import com.elasticemail.model.AccessLevel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for SmtpCredentials
 */
public class SmtpCredentialsTest {
    private final SmtpCredentials model = new SmtpCredentials();

    /**
     * Model tests for SmtpCredentials
     */
    @Test
    public void testSmtpCredentials() {
        // TODO: test SmtpCredentials
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