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

/**
 * A change to SubAccount email credits pool, with an additional note.
 */
@ApiModel(description = "A change to SubAccount email credits pool, with an additional note.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T16:27:07.739303Z[Etc/UTC]")
public class SubaccountEmailCreditsPayload {
  public static final String SERIALIZED_NAME_CREDITS = "Credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private Integer credits;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;


  public SubaccountEmailCreditsPayload credits(Integer credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * Positive or negative value; this will be added or subtracted from Subaccount&#39;s current email Credits pool.
   * @return credits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Positive or negative value; this will be added or subtracted from Subaccount's current email Credits pool.")

  public Integer getCredits() {
    return credits;
  }


  public void setCredits(Integer credits) {
    this.credits = credits;
  }


  public SubaccountEmailCreditsPayload notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Note to append to this credits change, for history.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Note to append to this credits change, for history.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubaccountEmailCreditsPayload subaccountEmailCreditsPayload = (SubaccountEmailCreditsPayload) o;
    return Objects.equals(this.credits, subaccountEmailCreditsPayload.credits) &&
        Objects.equals(this.notes, subaccountEmailCreditsPayload.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credits, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubaccountEmailCreditsPayload {\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

