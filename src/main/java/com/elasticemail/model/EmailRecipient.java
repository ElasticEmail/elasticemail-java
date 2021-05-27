/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    To start using this API, you will need your Access Token (available <a target=\"_blank\" href=\"https://elasticemail.com/account#/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    This is the documentation for REST API. If you’d like to read our legacy documentation regarding Web API v2 click <a target=\"_blank\" href=\"https://api.elasticemail.com/public/help\">here</a>.    Downloadable library clients can be found in our Github repository <a target=\"_blank\" href=\"https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme\">here</a>
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
 * List of recipients (visible to others)
 */
@ApiModel(description = "List of recipients (visible to others)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-27T12:28:45.459634Z[Etc/UTC]")
public class EmailRecipient {
  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIELDS = "Fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, String> fields = null;


  public EmailRecipient email(String email) {
    
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


  public EmailRecipient fields(Map<String, String> fields) {
    
    this.fields = fields;
    return this;
  }

  public EmailRecipient putFieldsItem(String key, String fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<String, String>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * A key-value collection of merge fields which can be used in e-mail body.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"city\":\"New York\",\"age\":\"34\"}", value = "A key-value collection of merge fields which can be used in e-mail body.")

  public Map<String, String> getFields() {
    return fields;
  }


  public void setFields(Map<String, String> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRecipient emailRecipient = (EmailRecipient) o;
    return Objects.equals(this.email, emailRecipient.email) &&
        Objects.equals(this.fields, emailRecipient.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRecipient {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

