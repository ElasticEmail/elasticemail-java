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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Suppression - Email returning Hard Bounces
 */
@ApiModel(description = "Suppression - Email returning Hard Bounces")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T10:01:55.764174Z[Etc/UTC]")
public class Suppression {
  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FRIENDLY_ERROR_MESSAGE = "FriendlyErrorMessage";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_ERROR_MESSAGE)
  private String friendlyErrorMessage;

  public static final String SERIALIZED_NAME_ERROR_CODE = "ErrorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "DateUpdated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;


  public Suppression email(String email) {
    
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


  public Suppression friendlyErrorMessage(String friendlyErrorMessage) {
    
    this.friendlyErrorMessage = friendlyErrorMessage;
    return this;
  }

   /**
   * RFC error message
   * @return friendlyErrorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mailbox not found", value = "RFC error message")

  public String getFriendlyErrorMessage() {
    return friendlyErrorMessage;
  }


  public void setFriendlyErrorMessage(String friendlyErrorMessage) {
    this.friendlyErrorMessage = friendlyErrorMessage;
  }


  public Suppression errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * SMTP Error code
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SMTP Error code")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public Suppression dateUpdated(OffsetDateTime dateUpdated) {
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Last change date
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last change date")

  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suppression suppression = (Suppression) o;
    return Objects.equals(this.email, suppression.email) &&
        Objects.equals(this.friendlyErrorMessage, suppression.friendlyErrorMessage) &&
        Objects.equals(this.errorCode, suppression.errorCode) &&
        Objects.equals(this.dateUpdated, suppression.dateUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, friendlyErrorMessage, errorCode, dateUpdated);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suppression {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    friendlyErrorMessage: ").append(toIndentedString(friendlyErrorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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

