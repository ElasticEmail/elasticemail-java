/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    The API has a limit of 20 concurrent connections and a hard timeout of 600 seconds per request.    To start using this API, you will need your Access Token (available <a target=\"_blank\" href=\"https://elasticemail.com/account#/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    This is the documentation for REST API. If you’d like to read our legacy documentation regarding Web API v2 click <a target=\"_blank\" href=\"https://api.elasticemail.com/public/help\">here</a>.    Downloadable library clients can be found in our Github repository <a target=\"_blank\" href=\"https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme\">here</a>
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * ApiKey info
 */
@ApiModel(description = "ApiKey info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T16:27:07.739303Z[Etc/UTC]")
public class ApiKey {
  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "AccessLevel";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private List<AccessLevel> accessLevel = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_CREATED = "DateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_LAST_USE = "LastUse";
  @SerializedName(SERIALIZED_NAME_LAST_USE)
  private OffsetDateTime lastUse;

  public static final String SERIALIZED_NAME_EXPIRES = "Expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_RESTRICT_ACCESS_TO_I_P_RANGE = "RestrictAccessToIPRange";
  @SerializedName(SERIALIZED_NAME_RESTRICT_ACCESS_TO_I_P_RANGE)
  private List<String> restrictAccessToIPRange = null;


  public ApiKey accessLevel(List<AccessLevel> accessLevel) {
    
    this.accessLevel = accessLevel;
    return this;
  }

  public ApiKey addAccessLevelItem(AccessLevel accessLevelItem) {
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


  public ApiKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the ApiKey.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the ApiKey.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApiKey dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date this ApiKey was created.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this ApiKey was created.")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ApiKey lastUse(OffsetDateTime lastUse) {
    
    this.lastUse = lastUse;
    return this;
  }

   /**
   * Date this ApiKey was last used.
   * @return lastUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this ApiKey was last used.")

  public OffsetDateTime getLastUse() {
    return lastUse;
  }


  public void setLastUse(OffsetDateTime lastUse) {
    this.lastUse = lastUse;
  }


  public ApiKey expires(OffsetDateTime expires) {
    
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


  public ApiKey restrictAccessToIPRange(List<String> restrictAccessToIPRange) {
    
    this.restrictAccessToIPRange = restrictAccessToIPRange;
    return this;
  }

  public ApiKey addRestrictAccessToIPRangeItem(String restrictAccessToIPRangeItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKey apiKey = (ApiKey) o;
    return Objects.equals(this.accessLevel, apiKey.accessLevel) &&
        Objects.equals(this.name, apiKey.name) &&
        Objects.equals(this.dateCreated, apiKey.dateCreated) &&
        Objects.equals(this.lastUse, apiKey.lastUse) &&
        Objects.equals(this.expires, apiKey.expires) &&
        Objects.equals(this.restrictAccessToIPRange, apiKey.restrictAccessToIPRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, name, dateCreated, lastUse, expires, restrictAccessToIPRange);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKey {\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastUse: ").append(toIndentedString(lastUse)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    restrictAccessToIPRange: ").append(toIndentedString(restrictAccessToIPRange)).append("\n");
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

