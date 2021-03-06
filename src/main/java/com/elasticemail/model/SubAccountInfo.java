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
import com.elasticemail.model.AccountStatusEnum;
import com.elasticemail.model.SubaccountSettingsInfo;
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
 * Detailed information about SubAccount.
 */
@ApiModel(description = "Detailed information about SubAccount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-31T08:08:48.625855188Z[Etc/UTC]")
public class SubAccountInfo {
  public static final String SERIALIZED_NAME_PUBLIC_ACCOUNT_I_D = "PublicAccountID";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ACCOUNT_I_D)
  private String publicAccountID;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private SubaccountSettingsInfo settings;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "LastActivity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_EMAIL_CREDITS = "EmailCredits";
  @SerializedName(SERIALIZED_NAME_EMAIL_CREDITS)
  private Integer emailCredits;

  public static final String SERIALIZED_NAME_TOTAL_EMAILS_SENT = "TotalEmailsSent";
  @SerializedName(SERIALIZED_NAME_TOTAL_EMAILS_SENT)
  private Long totalEmailsSent;

  public static final String SERIALIZED_NAME_REPUTATION = "Reputation";
  @SerializedName(SERIALIZED_NAME_REPUTATION)
  private Double reputation;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AccountStatusEnum status = AccountStatusEnum.DISABLED;

  public static final String SERIALIZED_NAME_CONTACTS_COUNT = "ContactsCount";
  @SerializedName(SERIALIZED_NAME_CONTACTS_COUNT)
  private Integer contactsCount;

  public SubAccountInfo() { 
  }

  public SubAccountInfo publicAccountID(String publicAccountID) {
    
    this.publicAccountID = publicAccountID;
    return this;
  }

   /**
   * Public key for limited access to your Account such as contact/add so you can use it safely on public websites.
   * @return publicAccountID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EB3EBB7A-C20D-4D39-8F2F-5E6842F58E6F", value = "Public key for limited access to your Account such as contact/add so you can use it safely on public websites.")

  public String getPublicAccountID() {
    return publicAccountID;
  }


  public void setPublicAccountID(String publicAccountID) {
    this.publicAccountID = publicAccountID;
  }


  public SubAccountInfo email(String email) {
    
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


  public SubAccountInfo settings(SubaccountSettingsInfo settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubaccountSettingsInfo getSettings() {
    return settings;
  }


  public void setSettings(SubaccountSettingsInfo settings) {
    this.settings = settings;
  }


  public SubAccountInfo lastActivity(OffsetDateTime lastActivity) {
    
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Date of last activity on Account
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last activity on Account")

  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }


  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }


  public SubAccountInfo emailCredits(Integer emailCredits) {
    
    this.emailCredits = emailCredits;
    return this;
  }

   /**
   * Amount of email credits
   * @return emailCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Amount of email credits")

  public Integer getEmailCredits() {
    return emailCredits;
  }


  public void setEmailCredits(Integer emailCredits) {
    this.emailCredits = emailCredits;
  }


  public SubAccountInfo totalEmailsSent(Long totalEmailsSent) {
    
    this.totalEmailsSent = totalEmailsSent;
    return this;
  }

   /**
   * Amount of emails sent from this Account
   * @return totalEmailsSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Amount of emails sent from this Account")

  public Long getTotalEmailsSent() {
    return totalEmailsSent;
  }


  public void setTotalEmailsSent(Long totalEmailsSent) {
    this.totalEmailsSent = totalEmailsSent;
  }


  public SubAccountInfo reputation(Double reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * Numeric reputation
   * @return reputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Numeric reputation")

  public Double getReputation() {
    return reputation;
  }


  public void setReputation(Double reputation) {
    this.reputation = reputation;
  }


  public SubAccountInfo status(AccountStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountStatusEnum getStatus() {
    return status;
  }


  public void setStatus(AccountStatusEnum status) {
    this.status = status;
  }


  public SubAccountInfo contactsCount(Integer contactsCount) {
    
    this.contactsCount = contactsCount;
    return this;
  }

   /**
   * How many contacts this SubAccount has stored
   * @return contactsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many contacts this SubAccount has stored")

  public Integer getContactsCount() {
    return contactsCount;
  }


  public void setContactsCount(Integer contactsCount) {
    this.contactsCount = contactsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountInfo subAccountInfo = (SubAccountInfo) o;
    return Objects.equals(this.publicAccountID, subAccountInfo.publicAccountID) &&
        Objects.equals(this.email, subAccountInfo.email) &&
        Objects.equals(this.settings, subAccountInfo.settings) &&
        Objects.equals(this.lastActivity, subAccountInfo.lastActivity) &&
        Objects.equals(this.emailCredits, subAccountInfo.emailCredits) &&
        Objects.equals(this.totalEmailsSent, subAccountInfo.totalEmailsSent) &&
        Objects.equals(this.reputation, subAccountInfo.reputation) &&
        Objects.equals(this.status, subAccountInfo.status) &&
        Objects.equals(this.contactsCount, subAccountInfo.contactsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicAccountID, email, settings, lastActivity, emailCredits, totalEmailsSent, reputation, status, contactsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountInfo {\n");
    sb.append("    publicAccountID: ").append(toIndentedString(publicAccountID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    emailCredits: ").append(toIndentedString(emailCredits)).append("\n");
    sb.append("    totalEmailsSent: ").append(toIndentedString(totalEmailsSent)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contactsCount: ").append(toIndentedString(contactsCount)).append("\n");
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

