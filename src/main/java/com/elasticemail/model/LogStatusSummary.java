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
 * Summary of log status
 */
@ApiModel(description = "Summary of log status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class LogStatusSummary {
  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private Long recipients;

  public static final String SERIALIZED_NAME_EMAIL_TOTAL = "EmailTotal";
  @SerializedName(SERIALIZED_NAME_EMAIL_TOTAL)
  private Long emailTotal;

  public static final String SERIALIZED_NAME_SMS_TOTAL = "SmsTotal";
  @SerializedName(SERIALIZED_NAME_SMS_TOTAL)
  private Long smsTotal;

  public static final String SERIALIZED_NAME_DELIVERED = "Delivered";
  @SerializedName(SERIALIZED_NAME_DELIVERED)
  private Long delivered;

  public static final String SERIALIZED_NAME_BOUNCED = "Bounced";
  @SerializedName(SERIALIZED_NAME_BOUNCED)
  private Long bounced;

  public static final String SERIALIZED_NAME_IN_PROGRESS = "InProgress";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS)
  private Long inProgress;

  public static final String SERIALIZED_NAME_OPENED = "Opened";
  @SerializedName(SERIALIZED_NAME_OPENED)
  private Long opened;

  public static final String SERIALIZED_NAME_CLICKED = "Clicked";
  @SerializedName(SERIALIZED_NAME_CLICKED)
  private Long clicked;

  public static final String SERIALIZED_NAME_UNSUBSCRIBED = "Unsubscribed";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBED)
  private Long unsubscribed;

  public static final String SERIALIZED_NAME_COMPLAINTS = "Complaints";
  @SerializedName(SERIALIZED_NAME_COMPLAINTS)
  private Long complaints;

  public static final String SERIALIZED_NAME_INBOUND = "Inbound";
  @SerializedName(SERIALIZED_NAME_INBOUND)
  private Long inbound;

  public static final String SERIALIZED_NAME_MANUAL_CANCEL = "ManualCancel";
  @SerializedName(SERIALIZED_NAME_MANUAL_CANCEL)
  private Long manualCancel;

  public static final String SERIALIZED_NAME_NOT_DELIVERED = "NotDelivered";
  @SerializedName(SERIALIZED_NAME_NOT_DELIVERED)
  private Long notDelivered;


  public LogStatusSummary recipients(Long recipients) {
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Number of recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Number of recipients")

  public Long getRecipients() {
    return recipients;
  }


  public void setRecipients(Long recipients) {
    this.recipients = recipients;
  }


  public LogStatusSummary emailTotal(Long emailTotal) {
    
    this.emailTotal = emailTotal;
    return this;
  }

   /**
   * Number of emails
   * @return emailTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Number of emails")

  public Long getEmailTotal() {
    return emailTotal;
  }


  public void setEmailTotal(Long emailTotal) {
    this.emailTotal = emailTotal;
  }


  public LogStatusSummary smsTotal(Long smsTotal) {
    
    this.smsTotal = smsTotal;
    return this;
  }

   /**
   * Number of SMS
   * @return smsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "Number of SMS")

  public Long getSmsTotal() {
    return smsTotal;
  }


  public void setSmsTotal(Long smsTotal) {
    this.smsTotal = smsTotal;
  }


  public LogStatusSummary delivered(Long delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered messages
   * @return delivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of delivered messages")

  public Long getDelivered() {
    return delivered;
  }


  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }


  public LogStatusSummary bounced(Long bounced) {
    
    this.bounced = bounced;
    return this;
  }

   /**
   * Number of bounced messages
   * @return bounced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of bounced messages")

  public Long getBounced() {
    return bounced;
  }


  public void setBounced(Long bounced) {
    this.bounced = bounced;
  }


  public LogStatusSummary inProgress(Long inProgress) {
    
    this.inProgress = inProgress;
    return this;
  }

   /**
   * Number of messages in progress
   * @return inProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Number of messages in progress")

  public Long getInProgress() {
    return inProgress;
  }


  public void setInProgress(Long inProgress) {
    this.inProgress = inProgress;
  }


  public LogStatusSummary opened(Long opened) {
    
    this.opened = opened;
    return this;
  }

   /**
   * Number of opened messages
   * @return opened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of opened messages")

  public Long getOpened() {
    return opened;
  }


  public void setOpened(Long opened) {
    this.opened = opened;
  }


  public LogStatusSummary clicked(Long clicked) {
    
    this.clicked = clicked;
    return this;
  }

   /**
   * Number of clicked messages
   * @return clicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of clicked messages")

  public Long getClicked() {
    return clicked;
  }


  public void setClicked(Long clicked) {
    this.clicked = clicked;
  }


  public LogStatusSummary unsubscribed(Long unsubscribed) {
    
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of unsubscribed messages
   * @return unsubscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of unsubscribed messages")

  public Long getUnsubscribed() {
    return unsubscribed;
  }


  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }


  public LogStatusSummary complaints(Long complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * Number of complaint messages
   * @return complaints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of complaint messages")

  public Long getComplaints() {
    return complaints;
  }


  public void setComplaints(Long complaints) {
    this.complaints = complaints;
  }


  public LogStatusSummary inbound(Long inbound) {
    
    this.inbound = inbound;
    return this;
  }

   /**
   * Number of inbound messages
   * @return inbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of inbound messages")

  public Long getInbound() {
    return inbound;
  }


  public void setInbound(Long inbound) {
    this.inbound = inbound;
  }


  public LogStatusSummary manualCancel(Long manualCancel) {
    
    this.manualCancel = manualCancel;
    return this;
  }

   /**
   * Number of manually cancelled messages
   * @return manualCancel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Number of manually cancelled messages")

  public Long getManualCancel() {
    return manualCancel;
  }


  public void setManualCancel(Long manualCancel) {
    this.manualCancel = manualCancel;
  }


  public LogStatusSummary notDelivered(Long notDelivered) {
    
    this.notDelivered = notDelivered;
    return this;
  }

   /**
   * Number of messages flagged with &#39;Not Delivered&#39;
   * @return notDelivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Number of messages flagged with 'Not Delivered'")

  public Long getNotDelivered() {
    return notDelivered;
  }


  public void setNotDelivered(Long notDelivered) {
    this.notDelivered = notDelivered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStatusSummary logStatusSummary = (LogStatusSummary) o;
    return Objects.equals(this.recipients, logStatusSummary.recipients) &&
        Objects.equals(this.emailTotal, logStatusSummary.emailTotal) &&
        Objects.equals(this.smsTotal, logStatusSummary.smsTotal) &&
        Objects.equals(this.delivered, logStatusSummary.delivered) &&
        Objects.equals(this.bounced, logStatusSummary.bounced) &&
        Objects.equals(this.inProgress, logStatusSummary.inProgress) &&
        Objects.equals(this.opened, logStatusSummary.opened) &&
        Objects.equals(this.clicked, logStatusSummary.clicked) &&
        Objects.equals(this.unsubscribed, logStatusSummary.unsubscribed) &&
        Objects.equals(this.complaints, logStatusSummary.complaints) &&
        Objects.equals(this.inbound, logStatusSummary.inbound) &&
        Objects.equals(this.manualCancel, logStatusSummary.manualCancel) &&
        Objects.equals(this.notDelivered, logStatusSummary.notDelivered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, emailTotal, smsTotal, delivered, bounced, inProgress, opened, clicked, unsubscribed, complaints, inbound, manualCancel, notDelivered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStatusSummary {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    emailTotal: ").append(toIndentedString(emailTotal)).append("\n");
    sb.append("    smsTotal: ").append(toIndentedString(smsTotal)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    bounced: ").append(toIndentedString(bounced)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    manualCancel: ").append(toIndentedString(manualCancel)).append("\n");
    sb.append("    notDelivered: ").append(toIndentedString(notDelivered)).append("\n");
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

