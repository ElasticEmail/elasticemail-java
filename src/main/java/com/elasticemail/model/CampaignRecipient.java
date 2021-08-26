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
import java.util.ArrayList;
import java.util.List;

/**
 * A set of lists and segments names to read recipients from
 */
@ApiModel(description = "A set of lists and segments names to read recipients from")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T16:27:07.739303Z[Etc/UTC]")
public class CampaignRecipient {
  public static final String SERIALIZED_NAME_LIST_NAMES = "ListNames";
  @SerializedName(SERIALIZED_NAME_LIST_NAMES)
  private List<String> listNames = null;

  public static final String SERIALIZED_NAME_SEGMENT_NAMES = "SegmentNames";
  @SerializedName(SERIALIZED_NAME_SEGMENT_NAMES)
  private List<String> segmentNames = null;


  public CampaignRecipient listNames(List<String> listNames) {
    
    this.listNames = listNames;
    return this;
  }

  public CampaignRecipient addListNamesItem(String listNamesItem) {
    if (this.listNames == null) {
      this.listNames = new ArrayList<String>();
    }
    this.listNames.add(listNamesItem);
    return this;
  }

   /**
   * Names of lists from your Account to read recipients from
   * @return listNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Names of lists from your Account to read recipients from")

  public List<String> getListNames() {
    return listNames;
  }


  public void setListNames(List<String> listNames) {
    this.listNames = listNames;
  }


  public CampaignRecipient segmentNames(List<String> segmentNames) {
    
    this.segmentNames = segmentNames;
    return this;
  }

  public CampaignRecipient addSegmentNamesItem(String segmentNamesItem) {
    if (this.segmentNames == null) {
      this.segmentNames = new ArrayList<String>();
    }
    this.segmentNames.add(segmentNamesItem);
    return this;
  }

   /**
   * Names of segments from your Account to read recipients from
   * @return segmentNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Names of segments from your Account to read recipients from")

  public List<String> getSegmentNames() {
    return segmentNames;
  }


  public void setSegmentNames(List<String> segmentNames) {
    this.segmentNames = segmentNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRecipient campaignRecipient = (CampaignRecipient) o;
    return Objects.equals(this.listNames, campaignRecipient.listNames) &&
        Objects.equals(this.segmentNames, campaignRecipient.segmentNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listNames, segmentNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRecipient {\n");
    sb.append("    listNames: ").append(toIndentedString(listNames)).append("\n");
    sb.append("    segmentNames: ").append(toIndentedString(segmentNames)).append("\n");
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

