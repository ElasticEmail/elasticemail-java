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
 * Settings related to sending emails
 */
@ApiModel(description = "Settings related to sending emails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class SubaccountEmailSettingsPayload {
  public static final String SERIALIZED_NAME_REQUIRES_EMAIL_CREDITS = "RequiresEmailCredits";
  @SerializedName(SERIALIZED_NAME_REQUIRES_EMAIL_CREDITS)
  private Boolean requiresEmailCredits;

  public static final String SERIALIZED_NAME_EMAIL_SIZE_LIMIT = "EmailSizeLimit";
  @SerializedName(SERIALIZED_NAME_EMAIL_SIZE_LIMIT)
  private Integer emailSizeLimit;

  public static final String SERIALIZED_NAME_DAILY_SEND_LIMIT = "DailySendLimit";
  @SerializedName(SERIALIZED_NAME_DAILY_SEND_LIMIT)
  private Integer dailySendLimit;

  public static final String SERIALIZED_NAME_MAX_CONTACTS = "MaxContacts";
  @SerializedName(SERIALIZED_NAME_MAX_CONTACTS)
  private Integer maxContacts;

  public static final String SERIALIZED_NAME_ENABLE_PRIVATE_I_P_PURCHASE = "EnablePrivateIPPurchase";
  @SerializedName(SERIALIZED_NAME_ENABLE_PRIVATE_I_P_PURCHASE)
  private Boolean enablePrivateIPPurchase;

  public static final String SERIALIZED_NAME_POOL_NAME = "PoolName";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  private String poolName;


  public SubaccountEmailSettingsPayload requiresEmailCredits(Boolean requiresEmailCredits) {
    
    this.requiresEmailCredits = requiresEmailCredits;
    return this;
  }

   /**
   * True, if Account needs credits to send emails. Otherwise, false
   * @return requiresEmailCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True, if Account needs credits to send emails. Otherwise, false")

  public Boolean getRequiresEmailCredits() {
    return requiresEmailCredits;
  }


  public void setRequiresEmailCredits(Boolean requiresEmailCredits) {
    this.requiresEmailCredits = requiresEmailCredits;
  }


  public SubaccountEmailSettingsPayload emailSizeLimit(Integer emailSizeLimit) {
    
    this.emailSizeLimit = emailSizeLimit;
    return this;
  }

   /**
   * Maximum size of email including attachments in MB&#39;s
   * @return emailSizeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Maximum size of email including attachments in MB's")

  public Integer getEmailSizeLimit() {
    return emailSizeLimit;
  }


  public void setEmailSizeLimit(Integer emailSizeLimit) {
    this.emailSizeLimit = emailSizeLimit;
  }


  public SubaccountEmailSettingsPayload dailySendLimit(Integer dailySendLimit) {
    
    this.dailySendLimit = dailySendLimit;
    return this;
  }

   /**
   * Amount of emails Account can send daily
   * @return dailySendLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "Amount of emails Account can send daily")

  public Integer getDailySendLimit() {
    return dailySendLimit;
  }


  public void setDailySendLimit(Integer dailySendLimit) {
    this.dailySendLimit = dailySendLimit;
  }


  public SubaccountEmailSettingsPayload maxContacts(Integer maxContacts) {
    
    this.maxContacts = maxContacts;
    return this;
  }

   /**
   * Maximum number of contacts the Account can have. 0 means that parent account&#39;s limit is used.
   * @return maxContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of contacts the Account can have. 0 means that parent account's limit is used.")

  public Integer getMaxContacts() {
    return maxContacts;
  }


  public void setMaxContacts(Integer maxContacts) {
    this.maxContacts = maxContacts;
  }


  public SubaccountEmailSettingsPayload enablePrivateIPPurchase(Boolean enablePrivateIPPurchase) {
    
    this.enablePrivateIPPurchase = enablePrivateIPPurchase;
    return this;
  }

   /**
   * Can the SubAccount purchase Private IP for themselves
   * @return enablePrivateIPPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can the SubAccount purchase Private IP for themselves")

  public Boolean getEnablePrivateIPPurchase() {
    return enablePrivateIPPurchase;
  }


  public void setEnablePrivateIPPurchase(Boolean enablePrivateIPPurchase) {
    this.enablePrivateIPPurchase = enablePrivateIPPurchase;
  }


  public SubaccountEmailSettingsPayload poolName(String poolName) {
    
    this.poolName = poolName;
    return this;
  }

   /**
   * Name of your custom IP Pool to be used in the sending process
   * @return poolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Custom Pool", value = "Name of your custom IP Pool to be used in the sending process")

  public String getPoolName() {
    return poolName;
  }


  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubaccountEmailSettingsPayload subaccountEmailSettingsPayload = (SubaccountEmailSettingsPayload) o;
    return Objects.equals(this.requiresEmailCredits, subaccountEmailSettingsPayload.requiresEmailCredits) &&
        Objects.equals(this.emailSizeLimit, subaccountEmailSettingsPayload.emailSizeLimit) &&
        Objects.equals(this.dailySendLimit, subaccountEmailSettingsPayload.dailySendLimit) &&
        Objects.equals(this.maxContacts, subaccountEmailSettingsPayload.maxContacts) &&
        Objects.equals(this.enablePrivateIPPurchase, subaccountEmailSettingsPayload.enablePrivateIPPurchase) &&
        Objects.equals(this.poolName, subaccountEmailSettingsPayload.poolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresEmailCredits, emailSizeLimit, dailySendLimit, maxContacts, enablePrivateIPPurchase, poolName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubaccountEmailSettingsPayload {\n");
    sb.append("    requiresEmailCredits: ").append(toIndentedString(requiresEmailCredits)).append("\n");
    sb.append("    emailSizeLimit: ").append(toIndentedString(emailSizeLimit)).append("\n");
    sb.append("    dailySendLimit: ").append(toIndentedString(dailySendLimit)).append("\n");
    sb.append("    maxContacts: ").append(toIndentedString(maxContacts)).append("\n");
    sb.append("    enablePrivateIPPurchase: ").append(toIndentedString(enablePrivateIPPurchase)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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

