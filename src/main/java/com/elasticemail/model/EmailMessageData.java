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
import com.elasticemail.model.EmailContent;
import com.elasticemail.model.EmailRecipient;
import com.elasticemail.model.Options;
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
 * Email data
 */
@ApiModel(description = "Email data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-31T08:08:48.625855188Z[Etc/UTC]")
public class EmailMessageData {
  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<EmailRecipient> recipients = new ArrayList<EmailRecipient>();

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private EmailContent content;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Options options;

  public EmailMessageData() { 
  }

  public EmailMessageData recipients(List<EmailRecipient> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public EmailMessageData addRecipientsItem(EmailRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * List of recipients
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of recipients")

  public List<EmailRecipient> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<EmailRecipient> recipients) {
    this.recipients = recipients;
  }


  public EmailMessageData content(EmailContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailContent getContent() {
    return content;
  }


  public void setContent(EmailContent content) {
    this.content = content;
  }


  public EmailMessageData options(Options options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Options getOptions() {
    return options;
  }


  public void setOptions(Options options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMessageData emailMessageData = (EmailMessageData) o;
    return Objects.equals(this.recipients, emailMessageData.recipients) &&
        Objects.equals(this.content, emailMessageData.content) &&
        Objects.equals(this.options, emailMessageData.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, content, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMessageData {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

