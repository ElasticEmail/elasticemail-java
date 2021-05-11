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
import java.util.ArrayList;
import java.util.List;

/**
 * Provide either rule or a list of emails, not both.
 */
@ApiModel(description = "Provide either rule or a list of emails, not both.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class EmailsPayload {
  public static final String SERIALIZED_NAME_RULE = "Rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_EMAILS = "Emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = null;


  public EmailsPayload rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * SQL-like rule. Sending &#39;All&#39; as a value loads all resources of the given type.
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SQL-like rule. Sending 'All' as a value loads all resources of the given type.")

  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public EmailsPayload emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public EmailsPayload addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Comma delimited list of contact emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma delimited list of contact emails")

  public List<String> getEmails() {
    return emails;
  }


  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailsPayload emailsPayload = (EmailsPayload) o;
    return Objects.equals(this.rule, emailsPayload.rule) &&
        Objects.equals(this.emails, emailsPayload.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailsPayload {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
