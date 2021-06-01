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
import com.elasticemail.model.InboundRouteActionType;
import com.elasticemail.model.InboundRouteFilterType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InboundPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-01T07:02:59.691443Z[GMT]")
public class InboundPayload {
  public static final String SERIALIZED_NAME_FILTER = "Filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTER_TYPE = "FilterType";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPE)
  private InboundRouteFilterType filterType = null;

  public static final String SERIALIZED_NAME_ACTION_TYPE = "ActionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private InboundRouteActionType actionType = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_HTTP_ADDRESS = "HttpAddress";
  @SerializedName(SERIALIZED_NAME_HTTP_ADDRESS)
  private String httpAddress;


  public InboundPayload filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Filter of the inbound data
   * @return filter
  **/
  @ApiModelProperty(required = true, value = "Filter of the inbound data")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public InboundPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of this route
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of this route")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InboundPayload filterType(InboundRouteFilterType filterType) {
    
    this.filterType = filterType;
    return this;
  }

   /**
   * Type of the filter
   * @return filterType
  **/
  @ApiModelProperty(required = true, value = "Type of the filter")

  public InboundRouteFilterType getFilterType() {
    return filterType;
  }


  public void setFilterType(InboundRouteFilterType filterType) {
    this.filterType = filterType;
  }


  public InboundPayload actionType(InboundRouteActionType actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * Type of action to take
   * @return actionType
  **/
  @ApiModelProperty(required = true, value = "Type of action to take")

  public InboundRouteActionType getActionType() {
    return actionType;
  }


  public void setActionType(InboundRouteActionType actionType) {
    this.actionType = actionType;
  }


  public InboundPayload emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email to forward the inbound to
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email to forward the inbound to")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public InboundPayload httpAddress(String httpAddress) {
    
    this.httpAddress = httpAddress;
    return this;
  }

   /**
   * Address to notify about the inbound
   * @return httpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address to notify about the inbound")

  public String getHttpAddress() {
    return httpAddress;
  }


  public void setHttpAddress(String httpAddress) {
    this.httpAddress = httpAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundPayload inboundPayload = (InboundPayload) o;
    return Objects.equals(this.filter, inboundPayload.filter) &&
        Objects.equals(this.name, inboundPayload.name) &&
        Objects.equals(this.filterType, inboundPayload.filterType) &&
        Objects.equals(this.actionType, inboundPayload.actionType) &&
        Objects.equals(this.emailAddress, inboundPayload.emailAddress) &&
        Objects.equals(this.httpAddress, inboundPayload.httpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, name, filterType, actionType, emailAddress, httpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundPayload {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    httpAddress: ").append(toIndentedString(httpAddress)).append("\n");
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

