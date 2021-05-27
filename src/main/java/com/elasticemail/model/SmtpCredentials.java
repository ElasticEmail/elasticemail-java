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
 * SMTP Credentials info
 */
@ApiModel(description = "SMTP Credentials info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-27T12:28:45.459634Z[Etc/UTC]")
public class SmtpCredentials {
  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "AccessLevel";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private AccessLevel accessLevel = null;

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


  public SmtpCredentials accessLevel(AccessLevel accessLevel) {
    
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * Access level of this Smtp Credential.
   * @return accessLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access level of this Smtp Credential.")

  public AccessLevel getAccessLevel() {
    return accessLevel;
  }


  public void setAccessLevel(AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
  }


  public SmtpCredentials name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the key.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the key.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SmtpCredentials dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date this SmtpCredential was created.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this SmtpCredential was created.")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public SmtpCredentials lastUse(OffsetDateTime lastUse) {
    
    this.lastUse = lastUse;
    return this;
  }

   /**
   * Date this SmtpCredential was last used.
   * @return lastUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this SmtpCredential was last used.")

  public OffsetDateTime getLastUse() {
    return lastUse;
  }


  public void setLastUse(OffsetDateTime lastUse) {
    this.lastUse = lastUse;
  }


  public SmtpCredentials expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Date this SmtpCredential expires.
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this SmtpCredential expires.")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public SmtpCredentials restrictAccessToIPRange(List<String> restrictAccessToIPRange) {
    
    this.restrictAccessToIPRange = restrictAccessToIPRange;
    return this;
  }

  public SmtpCredentials addRestrictAccessToIPRangeItem(String restrictAccessToIPRangeItem) {
    if (this.restrictAccessToIPRange == null) {
      this.restrictAccessToIPRange = new ArrayList<String>();
    }
    this.restrictAccessToIPRange.add(restrictAccessToIPRangeItem);
    return this;
  }

   /**
   * Which IPs can use this SmtpCredential
   * @return restrictAccessToIPRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which IPs can use this SmtpCredential")

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
    SmtpCredentials smtpCredentials = (SmtpCredentials) o;
    return Objects.equals(this.accessLevel, smtpCredentials.accessLevel) &&
        Objects.equals(this.name, smtpCredentials.name) &&
        Objects.equals(this.dateCreated, smtpCredentials.dateCreated) &&
        Objects.equals(this.lastUse, smtpCredentials.lastUse) &&
        Objects.equals(this.expires, smtpCredentials.expires) &&
        Objects.equals(this.restrictAccessToIPRange, smtpCredentials.restrictAccessToIPRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, name, dateCreated, lastUse, expires, restrictAccessToIPRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmtpCredentials {\n");
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

