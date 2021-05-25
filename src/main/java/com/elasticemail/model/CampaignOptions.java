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
import com.elasticemail.model.DeliveryOptimizationType;
import com.elasticemail.model.SplitOptions;
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
 * Different send options for a Campaign
 */
@ApiModel(description = "Different send options for a Campaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class CampaignOptions {
  public static final String SERIALIZED_NAME_DELIVERY_OPTIMIZATION = "DeliveryOptimization";
  @SerializedName(SERIALIZED_NAME_DELIVERY_OPTIMIZATION)
  private DeliveryOptimizationType deliveryOptimization = null;

  public static final String SERIALIZED_NAME_TRACK_OPENS = "TrackOpens";
  @SerializedName(SERIALIZED_NAME_TRACK_OPENS)
  private Boolean trackOpens;

  public static final String SERIALIZED_NAME_TRACK_CLICKS = "TrackClicks";
  @SerializedName(SERIALIZED_NAME_TRACK_CLICKS)
  private Boolean trackClicks;

  public static final String SERIALIZED_NAME_SCHEDULE_FOR = "ScheduleFor";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FOR)
  private OffsetDateTime scheduleFor;

  public static final String SERIALIZED_NAME_SPLIT_OPTIONS = "SplitOptions";
  @SerializedName(SERIALIZED_NAME_SPLIT_OPTIONS)
  private SplitOptions splitOptions = null;


  public CampaignOptions deliveryOptimization(DeliveryOptimizationType deliveryOptimization) {
    
    this.deliveryOptimization = deliveryOptimization;
    return this;
  }

   /**
   * How to order email delivery - by recipients&#39; engagement score or by the time they open the most of the emails that were sent to them
   * @return deliveryOptimization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How to order email delivery - by recipients' engagement score or by the time they open the most of the emails that were sent to them")

  public DeliveryOptimizationType getDeliveryOptimization() {
    return deliveryOptimization;
  }


  public void setDeliveryOptimization(DeliveryOptimizationType deliveryOptimization) {
    this.deliveryOptimization = deliveryOptimization;
  }


  public CampaignOptions trackOpens(Boolean trackOpens) {
    
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Should the opens be tracked? If no value has been provided, Account&#39;s default setting will be used.
   * @return trackOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Should the opens be tracked? If no value has been provided, Account's default setting will be used.")

  public Boolean getTrackOpens() {
    return trackOpens;
  }


  public void setTrackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
  }


  public CampaignOptions trackClicks(Boolean trackClicks) {
    
    this.trackClicks = trackClicks;
    return this;
  }

   /**
   * Should the clicks be tracked? If no value has been provided, Account&#39;s default setting will be used.
   * @return trackClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Should the clicks be tracked? If no value has been provided, Account's default setting will be used.")

  public Boolean getTrackClicks() {
    return trackClicks;
  }


  public void setTrackClicks(Boolean trackClicks) {
    this.trackClicks = trackClicks;
  }


  public CampaignOptions scheduleFor(OffsetDateTime scheduleFor) {
    
    this.scheduleFor = scheduleFor;
    return this;
  }

   /**
   * Date when this Campaign is scheduled to be sent on
   * @return scheduleFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when this Campaign is scheduled to be sent on")

  public OffsetDateTime getScheduleFor() {
    return scheduleFor;
  }


  public void setScheduleFor(OffsetDateTime scheduleFor) {
    this.scheduleFor = scheduleFor;
  }


  public CampaignOptions splitOptions(SplitOptions splitOptions) {
    
    this.splitOptions = splitOptions;
    return this;
  }

   /**
   * Optional options for A/X split campaigns. Will be ignored if only one template content was provided
   * @return splitOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional options for A/X split campaigns. Will be ignored if only one template content was provided")

  public SplitOptions getSplitOptions() {
    return splitOptions;
  }


  public void setSplitOptions(SplitOptions splitOptions) {
    this.splitOptions = splitOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignOptions campaignOptions = (CampaignOptions) o;
    return Objects.equals(this.deliveryOptimization, campaignOptions.deliveryOptimization) &&
        Objects.equals(this.trackOpens, campaignOptions.trackOpens) &&
        Objects.equals(this.trackClicks, campaignOptions.trackClicks) &&
        Objects.equals(this.scheduleFor, campaignOptions.scheduleFor) &&
        Objects.equals(this.splitOptions, campaignOptions.splitOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOptimization, trackOpens, trackClicks, scheduleFor, splitOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignOptions {\n");
    sb.append("    deliveryOptimization: ").append(toIndentedString(deliveryOptimization)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    trackClicks: ").append(toIndentedString(trackClicks)).append("\n");
    sb.append("    scheduleFor: ").append(toIndentedString(scheduleFor)).append("\n");
    sb.append("    splitOptions: ").append(toIndentedString(splitOptions)).append("\n");
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

