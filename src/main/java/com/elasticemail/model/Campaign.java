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
import com.elasticemail.model.CampaignOptions;
import com.elasticemail.model.CampaignRecipient;
import com.elasticemail.model.CampaignStatus;
import com.elasticemail.model.CampaignTemplate;
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
 * Campaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-31T08:08:48.625855188Z[Etc/UTC]")
public class Campaign {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<CampaignTemplate> content = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CampaignStatus status = CampaignStatus.DELETED;

  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private CampaignRecipient recipients;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private CampaignOptions options;

  public Campaign() { 
  }

  public Campaign content(List<CampaignTemplate> content) {
    
    this.content = content;
    return this;
  }

  public Campaign addContentItem(CampaignTemplate contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<CampaignTemplate>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Campaign&#39;s email content. Provide multiple items to send an A/X Split Campaign
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Campaign's email content. Provide multiple items to send an A/X Split Campaign")

  public List<CampaignTemplate> getContent() {
    return content;
  }


  public void setContent(List<CampaignTemplate> content) {
    this.content = content;
  }


  public Campaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Campaign name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Campaign name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Campaign status(CampaignStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignStatus getStatus() {
    return status;
  }


  public void setStatus(CampaignStatus status) {
    this.status = status;
  }


  public Campaign recipients(CampaignRecipient recipients) {
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CampaignRecipient getRecipients() {
    return recipients;
  }


  public void setRecipients(CampaignRecipient recipients) {
    this.recipients = recipients;
  }


  public Campaign options(CampaignOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignOptions getOptions() {
    return options;
  }


  public void setOptions(CampaignOptions options) {
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
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.content, campaign.content) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.status, campaign.status) &&
        Objects.equals(this.recipients, campaign.recipients) &&
        Objects.equals(this.options, campaign.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, name, status, recipients, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

