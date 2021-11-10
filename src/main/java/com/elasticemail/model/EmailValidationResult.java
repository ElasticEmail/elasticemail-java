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
import com.elasticemail.model.EmailValidationStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * EmailValidationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T10:01:55.764174Z[Etc/UTC]")
public class EmailValidationResult {
  public static final String SERIALIZED_NAME_ACCOUNT = "Account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_DOMAIN = "Domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SUGGESTED_SPELLING = "SuggestedSpelling";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_SPELLING)
  private String suggestedSpelling;

  public static final String SERIALIZED_NAME_DISPOSABLE = "Disposable";
  @SerializedName(SERIALIZED_NAME_DISPOSABLE)
  private Boolean disposable;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private Boolean role;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_DATE_ADDED = "DateAdded";
  @SerializedName(SERIALIZED_NAME_DATE_ADDED)
  private OffsetDateTime dateAdded;

  public static final String SERIALIZED_NAME_RESULT = "Result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private EmailValidationStatus result = EmailValidationStatus.NONE;


  public EmailValidationResult account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Local part of an email
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Local part of an email")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public EmailValidationResult domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Name of selected domain.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example.com", value = "Name of selected domain.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public EmailValidationResult email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Full email address that was verified
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full email address that was verified")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmailValidationResult suggestedSpelling(String suggestedSpelling) {
    
    this.suggestedSpelling = suggestedSpelling;
    return this;
  }

   /**
   * Suggested spelling if a possible mistake was found
   * @return suggestedSpelling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested spelling if a possible mistake was found")

  public String getSuggestedSpelling() {
    return suggestedSpelling;
  }


  public void setSuggestedSpelling(String suggestedSpelling) {
    this.suggestedSpelling = suggestedSpelling;
  }


  public EmailValidationResult disposable(Boolean disposable) {
    
    this.disposable = disposable;
    return this;
  }

   /**
   * Does the email have a temporary domain
   * @return disposable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does the email have a temporary domain")

  public Boolean getDisposable() {
    return disposable;
  }


  public void setDisposable(Boolean disposable) {
    this.disposable = disposable;
  }


  public EmailValidationResult role(Boolean role) {
    
    this.role = role;
    return this;
  }

   /**
   * Is an email a role email (e.g. info@, noreply@ etc.)
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is an email a role email (e.g. info@, noreply@ etc.)")

  public Boolean getRole() {
    return role;
  }


  public void setRole(Boolean role) {
    this.role = role;
  }


  public EmailValidationResult reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * All detected issues
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All detected issues")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public EmailValidationResult dateAdded(OffsetDateTime dateAdded) {
    
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Date of creation in YYYY-MM-DDThh:ii:ss format
   * @return dateAdded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of creation in YYYY-MM-DDThh:ii:ss format")

  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }


  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }


  public EmailValidationResult result(EmailValidationStatus result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailValidationStatus getResult() {
    return result;
  }


  public void setResult(EmailValidationStatus result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailValidationResult emailValidationResult = (EmailValidationResult) o;
    return Objects.equals(this.account, emailValidationResult.account) &&
        Objects.equals(this.domain, emailValidationResult.domain) &&
        Objects.equals(this.email, emailValidationResult.email) &&
        Objects.equals(this.suggestedSpelling, emailValidationResult.suggestedSpelling) &&
        Objects.equals(this.disposable, emailValidationResult.disposable) &&
        Objects.equals(this.role, emailValidationResult.role) &&
        Objects.equals(this.reason, emailValidationResult.reason) &&
        Objects.equals(this.dateAdded, emailValidationResult.dateAdded) &&
        Objects.equals(this.result, emailValidationResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, domain, email, suggestedSpelling, disposable, role, reason, dateAdded, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailValidationResult {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    suggestedSpelling: ").append(toIndentedString(suggestedSpelling)).append("\n");
    sb.append("    disposable: ").append(toIndentedString(disposable)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

