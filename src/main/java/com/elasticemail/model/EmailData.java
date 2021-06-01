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
import com.elasticemail.model.EmailStatus;
import com.elasticemail.model.EmailView;
import com.elasticemail.model.FileInfo;
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

/**
 * EmailData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-01T07:02:59.691443Z[GMT]")
public class EmailData {
  public static final String SERIALIZED_NAME_PREVIEW = "Preview";
  @SerializedName(SERIALIZED_NAME_PREVIEW)
  private EmailView preview = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "Attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<FileInfo> attachments = null;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EmailStatus status = null;


  public EmailData preview(EmailView preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * Email details
   * @return preview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email details")

  public EmailView getPreview() {
    return preview;
  }


  public void setPreview(EmailView preview) {
    this.preview = preview;
  }


  public EmailData attachments(List<FileInfo> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public EmailData addAttachmentsItem(FileInfo attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<FileInfo>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments sent with the email
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attachments sent with the email")

  public List<FileInfo> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<FileInfo> attachments) {
    this.attachments = attachments;
  }


  public EmailData status(EmailStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the given resource
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the given resource")

  public EmailStatus getStatus() {
    return status;
  }


  public void setStatus(EmailStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailData emailData = (EmailData) o;
    return Objects.equals(this.preview, emailData.preview) &&
        Objects.equals(this.attachments, emailData.attachments) &&
        Objects.equals(this.status, emailData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preview, attachments, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailData {\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

