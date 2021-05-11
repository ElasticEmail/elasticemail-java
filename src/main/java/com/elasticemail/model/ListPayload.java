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
 * ListPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class ListPayload {
  public static final String SERIALIZED_NAME_LIST_NAME = "ListName";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_ALLOW_UNSUBSCRIBE = "AllowUnsubscribe";
  @SerializedName(SERIALIZED_NAME_ALLOW_UNSUBSCRIBE)
  private Boolean allowUnsubscribe;

  public static final String SERIALIZED_NAME_EMAILS = "Emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = null;


  public ListPayload listName(String listName) {
    
    this.listName = listName;
    return this;
  }

   /**
   * Name of your list.
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My List 1", value = "Name of your list.")

  public String getListName() {
    return listName;
  }


  public void setListName(String listName) {
    this.listName = listName;
  }


  public ListPayload allowUnsubscribe(Boolean allowUnsubscribe) {
    
    this.allowUnsubscribe = allowUnsubscribe;
    return this;
  }

   /**
   * True: Allow unsubscribing from this list. Otherwise, false
   * @return allowUnsubscribe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True: Allow unsubscribing from this list. Otherwise, false")

  public Boolean getAllowUnsubscribe() {
    return allowUnsubscribe;
  }


  public void setAllowUnsubscribe(Boolean allowUnsubscribe) {
    this.allowUnsubscribe = allowUnsubscribe;
  }


  public ListPayload emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public ListPayload addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Comma delimited list of existing contact emails that should be added to this list
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma delimited list of existing contact emails that should be added to this list")

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
    ListPayload listPayload = (ListPayload) o;
    return Objects.equals(this.listName, listPayload.listName) &&
        Objects.equals(this.allowUnsubscribe, listPayload.allowUnsubscribe) &&
        Objects.equals(this.emails, listPayload.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listName, allowUnsubscribe, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPayload {\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    allowUnsubscribe: ").append(toIndentedString(allowUnsubscribe)).append("\n");
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
