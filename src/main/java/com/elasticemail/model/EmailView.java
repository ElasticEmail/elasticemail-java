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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Email details formatted in json
 */
@ApiModel(description = "Email details formatted in json")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class EmailView {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;


  public EmailView body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Body (HTML, otherwise plain text) of email
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body (HTML, otherwise plain text) of email")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public EmailView subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Default subject of email.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello!", value = "Default subject of email.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailView from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * From email address
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From email address")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailView emailView = (EmailView) o;
    return Objects.equals(this.body, emailView.body) &&
        Objects.equals(this.subject, emailView.subject) &&
        Objects.equals(this.from, emailView.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, subject, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailView {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

