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
import com.elasticemail.model.DomainData;
import com.elasticemail.model.DomainDetail;
import com.elasticemail.model.DomainPayload;
import com.elasticemail.model.DomainUpdatePayload;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainsApi
 */
@Disabled
public class DomainsApiTest {

    private final DomainsApi api = new DomainsApi();

    /**
     * Delete Domain
     *
     * Deletes configured domain from Account. Required Access Level: ModifySettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByDomainDeleteTest() throws ApiException {
        String domain = null;
        api.domainsByDomainDelete(domain);
        // TODO: test validations
    }

    /**
     * Load Domain
     *
     * Retrieve a domain configured for this Account. Required Access Level: ViewSettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByDomainGetTest() throws ApiException {
        String domain = null;
        DomainData response = api.domainsByDomainGet(domain);
        // TODO: test validations
    }

    /**
     * Update Domain
     *
     * Updates the specified domain. Required Access Level: ModifySettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByDomainPutTest() throws ApiException {
        String domain = null;
        DomainUpdatePayload domainUpdatePayload = null;
        DomainDetail response = api.domainsByDomainPut(domain, domainUpdatePayload);
        // TODO: test validations
    }

    /**
     * Check for domain restriction
     *
     * Checking if domain is from free provider, or restricted. Required Access Level: ViewSettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByDomainRestrictedGetTest() throws ApiException {
        String domain = null;
        Boolean response = api.domainsByDomainRestrictedGet(domain);
        // TODO: test validations
    }

    /**
     * Verify Domain
     *
     * Verifies that required DNS records exist for specified domain. Required Access Level: ModifySettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByDomainVerificationPutTest() throws ApiException {
        String domain = null;
        String body = null;
        DomainData response = api.domainsByDomainVerificationPut(domain, body);
        // TODO: test validations
    }

    /**
     * Set Default
     *
     * Sets a verified email address as default sender. Required Access Level: ModifySettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsByEmailDefaultPatchTest() throws ApiException {
        String email = null;
        DomainDetail response = api.domainsByEmailDefaultPatch(email);
        // TODO: test validations
    }

    /**
     * Load Domains
     *
     * Returns a list of all domains configured for this Account. Required Access Level: ViewSettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsGetTest() throws ApiException {
        List<DomainDetail> response = api.domainsGet();
        // TODO: test validations
    }

    /**
     * Add Domain
     *
     * Add new domain to Account. Required Access Level: ModifySettings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void domainsPostTest() throws ApiException {
        DomainPayload domainPayload = null;
        DomainDetail response = api.domainsPost(domainPayload);
        // TODO: test validations
    }

}
