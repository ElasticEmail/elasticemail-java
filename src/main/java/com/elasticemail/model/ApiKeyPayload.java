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

/**
 * Create a new ApiKey
 */
@ApiModel(description = "Create a new ApiKey")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class ApiKeyPayload {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "AccessLevel";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private List<AccessLevel> accessLevel = null;

  public static final String SERIALIZED_NAME_EXPIRES = "Expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_RESTRICT_ACCESS_TO_I_P_RANGE = "RestrictAccessToIPRange";
  @SerializedName(SERIALIZED_NAME_RESTRICT_ACCESS_TO_I_P_RANGE)
  private List<String> restrictAccessToIPRange = null;

  public static final String SERIALIZED_NAME_SUBACCOUNT = "Subaccount";
  @SerializedName(SERIALIZED_NAME_SUBACCOUNT)
  private String subaccount;


  public ApiKeyPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the ApiKey for ease of reference.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the ApiKey for ease of reference.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApiKeyPayload accessLevel(List<AccessLevel> accessLevel) {
    
    this.accessLevel = accessLevel;
    return this;
  }

  public ApiKeyPayload addAccessLevelItem(AccessLevel accessLevelItem) {
    if (this.accessLevel == null) {
      this.accessLevel = new ArrayList<AccessLevel>();
    }
    this.accessLevel.add(accessLevelItem);
    return this;
  }

   /**
   * Access level or permission to be assigned to this ApiKey.
   * @return accessLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access level or permission to be assigned to this ApiKey.")

  public List<AccessLevel> getAccessLevel() {
    return accessLevel;
  }


  public void setAccessLevel(List<AccessLevel> accessLevel) {
    this.accessLevel = accessLevel;
  }


  public ApiKeyPayload expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Date this ApiKey expires.
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this ApiKey expires.")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public ApiKeyPayload restrictAccessToIPRange(List<String> restrictAccessToIPRange) {
    
    this.restrictAccessToIPRange = restrictAccessToIPRange;
    return this;
  }

  public ApiKeyPayload addRestrictAccessToIPRangeItem(String restrictAccessToIPRangeItem) {
    if (this.restrictAccessToIPRange == null) {
      this.restrictAccessToIPRange = new ArrayList<String>();
    }
    this.restrictAccessToIPRange.add(restrictAccessToIPRangeItem);
    return this;
  }

   /**
   * Which IPs can use this ApiKey
   * @return restrictAccessToIPRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which IPs can use this ApiKey")

  public List<String> getRestrictAccessToIPRange() {
    return restrictAccessToIPRange;
  }


  public void setRestrictAccessToIPRange(List<String> restrictAccessToIPRange) {
    this.restrictAccessToIPRange = restrictAccessToIPRange;
  }


  public ApiKeyPayload subaccount(String subaccount) {
    
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Email of the subaccount for which this ApiKey should be created
   * @return subaccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email of the subaccount for which this ApiKey should be created")

  public String getSubaccount() {
    return subaccount;
  }


  public void setSubaccount(String subaccount) {
    this.subaccount = subaccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyPayload apiKeyPayload = (ApiKeyPayload) o;
    return Objects.equals(this.name, apiKeyPayload.name) &&
        Objects.equals(this.accessLevel, apiKeyPayload.accessLevel) &&
        Objects.equals(this.expires, apiKeyPayload.expires) &&
        Objects.equals(this.restrictAccessToIPRange, apiKeyPayload.restrictAccessToIPRange) &&
        Objects.equals(this.subaccount, apiKeyPayload.subaccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accessLevel, expires, restrictAccessToIPRange, subaccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyPayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    restrictAccessToIPRange: ").append(toIndentedString(restrictAccessToIPRange)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
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
