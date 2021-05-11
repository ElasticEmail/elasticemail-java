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
import com.elasticemail.model.LogJobStatus;
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
 * Status information of the specified email
 */
@ApiModel(description = "Status information of the specified email")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T10:43:12.235422Z[Etc/UTC]")
public class EmailStatus {
  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "To";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LogJobStatus status = null;

  public static final String SERIALIZED_NAME_STATUS_NAME = "StatusName";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public static final String SERIALIZED_NAME_STATUS_CHANGE_DATE = "StatusChangeDate";
  @SerializedName(SERIALIZED_NAME_STATUS_CHANGE_DATE)
  private OffsetDateTime statusChangeDate;

  public static final String SERIALIZED_NAME_DATE_SENT = "DateSent";
  @SerializedName(SERIALIZED_NAME_DATE_SENT)
  private OffsetDateTime dateSent;

  public static final String SERIALIZED_NAME_DATE_OPENED = "DateOpened";
  @SerializedName(SERIALIZED_NAME_DATE_OPENED)
  private OffsetDateTime dateOpened;

  public static final String SERIALIZED_NAME_DATE_CLICKED = "DateClicked";
  @SerializedName(SERIALIZED_NAME_DATE_CLICKED)
  private OffsetDateTime dateClicked;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "TransactionID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private String transactionID;

  public static final String SERIALIZED_NAME_ENVELOPE_FROM = "EnvelopeFrom";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_FROM)
  private String envelopeFrom;


  public EmailStatus from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Email address this email was sent from.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address this email was sent from.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public EmailStatus to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Email address this email was sent to.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address this email was sent to.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public EmailStatus date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date the email was submitted.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the email was submitted.")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public EmailStatus status(LogJobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Value of email&#39;s status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of email's status")

  public LogJobStatus getStatus() {
    return status;
  }


  public void setStatus(LogJobStatus status) {
    this.status = status;
  }


  public EmailStatus statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * Name of email&#39;s status
   * @return statusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of email's status")

  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public EmailStatus statusChangeDate(OffsetDateTime statusChangeDate) {
    
    this.statusChangeDate = statusChangeDate;
    return this;
  }

   /**
   * Date of last status change.
   * @return statusChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last status change.")

  public OffsetDateTime getStatusChangeDate() {
    return statusChangeDate;
  }


  public void setStatusChangeDate(OffsetDateTime statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
  }


  public EmailStatus dateSent(OffsetDateTime dateSent) {
    
    this.dateSent = dateSent;
    return this;
  }

   /**
   * Date when the email was sent
   * @return dateSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the email was sent")

  public OffsetDateTime getDateSent() {
    return dateSent;
  }


  public void setDateSent(OffsetDateTime dateSent) {
    this.dateSent = dateSent;
  }


  public EmailStatus dateOpened(OffsetDateTime dateOpened) {
    
    this.dateOpened = dateOpened;
    return this;
  }

   /**
   * Date when the email changed the status to &#39;opened&#39;
   * @return dateOpened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the email changed the status to 'opened'")

  public OffsetDateTime getDateOpened() {
    return dateOpened;
  }


  public void setDateOpened(OffsetDateTime dateOpened) {
    this.dateOpened = dateOpened;
  }


  public EmailStatus dateClicked(OffsetDateTime dateClicked) {
    
    this.dateClicked = dateClicked;
    return this;
  }

   /**
   * Date when the email changed the status to &#39;clicked&#39;
   * @return dateClicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the email changed the status to 'clicked'")

  public OffsetDateTime getDateClicked() {
    return dateClicked;
  }


  public void setDateClicked(OffsetDateTime dateClicked) {
    this.dateClicked = dateClicked;
  }


  public EmailStatus errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Detailed error or bounced message.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailed error or bounced message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public EmailStatus transactionID(String transactionID) {
    
    this.transactionID = transactionID;
    return this;
  }

   /**
   * ID number of transaction
   * @return transactionID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TransactionID", value = "ID number of transaction")

  public String getTransactionID() {
    return transactionID;
  }


  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }


  public EmailStatus envelopeFrom(String envelopeFrom) {
    
    this.envelopeFrom = envelopeFrom;
    return this;
  }

   /**
   * Envelope from address
   * @return envelopeFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Envelope from address")

  public String getEnvelopeFrom() {
    return envelopeFrom;
  }


  public void setEnvelopeFrom(String envelopeFrom) {
    this.envelopeFrom = envelopeFrom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailStatus emailStatus = (EmailStatus) o;
    return Objects.equals(this.from, emailStatus.from) &&
        Objects.equals(this.to, emailStatus.to) &&
        Objects.equals(this.date, emailStatus.date) &&
        Objects.equals(this.status, emailStatus.status) &&
        Objects.equals(this.statusName, emailStatus.statusName) &&
        Objects.equals(this.statusChangeDate, emailStatus.statusChangeDate) &&
        Objects.equals(this.dateSent, emailStatus.dateSent) &&
        Objects.equals(this.dateOpened, emailStatus.dateOpened) &&
        Objects.equals(this.dateClicked, emailStatus.dateClicked) &&
        Objects.equals(this.errorMessage, emailStatus.errorMessage) &&
        Objects.equals(this.transactionID, emailStatus.transactionID) &&
        Objects.equals(this.envelopeFrom, emailStatus.envelopeFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, date, status, statusName, statusChangeDate, dateSent, dateOpened, dateClicked, errorMessage, transactionID, envelopeFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailStatus {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    dateOpened: ").append(toIndentedString(dateOpened)).append("\n");
    sb.append("    dateClicked: ").append(toIndentedString(dateClicked)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    envelopeFrom: ").append(toIndentedString(envelopeFrom)).append("\n");
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
