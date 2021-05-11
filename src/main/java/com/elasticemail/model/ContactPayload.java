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

import java.util.Objects;
import java.util.Arrays;
import com.elasticemail.model.ConsentData;
import com.elasticemail.model.ContactStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ContactPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class ContactPayload {
  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ContactStatus status = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "CustomFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, String> customFields = null;

  public static final String SERIALIZED_NAME_CONSENT = "Consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentData consent;


  public ContactPayload email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Proper email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mail@example.com", value = "Proper email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ContactPayload status(ContactStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the given resource
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the given resource")

  public ContactStatus getStatus() {
    return status;
  }


  public void setStatus(ContactStatus status) {
    this.status = status;
  }


  public ContactPayload firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fred", value = "First name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ContactPayload lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Flintstone", value = "Last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ContactPayload customFields(Map<String, String> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public ContactPayload putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, String>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A key-value collection of custom contact fields which can be used in the system. Only already existing custom fields will be saved.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"city\":\"New York\",\"age\":\"34\"}", value = "A key-value collection of custom contact fields which can be used in the system. Only already existing custom fields will be saved.")

  public Map<String, String> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  public ContactPayload consent(ConsentData consent) {
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsentData getConsent() {
    return consent;
  }


  public void setConsent(ConsentData consent) {
    this.consent = consent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPayload contactPayload = (ContactPayload) o;
    return Objects.equals(this.email, contactPayload.email) &&
        Objects.equals(this.status, contactPayload.status) &&
        Objects.equals(this.firstName, contactPayload.firstName) &&
        Objects.equals(this.lastName, contactPayload.lastName) &&
        Objects.equals(this.customFields, contactPayload.customFields) &&
        Objects.equals(this.consent, contactPayload.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, status, firstName, lastName, customFields, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPayload {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

