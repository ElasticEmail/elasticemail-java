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
import com.elasticemail.model.ConsentTracking;
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
 * ConsentData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class ConsentData {
  public static final String SERIALIZED_NAME_CONSENT_I_P = "ConsentIP";
  @SerializedName(SERIALIZED_NAME_CONSENT_I_P)
  private String consentIP;

  public static final String SERIALIZED_NAME_CONSENT_DATE = "ConsentDate";
  @SerializedName(SERIALIZED_NAME_CONSENT_DATE)
  private OffsetDateTime consentDate;

  public static final String SERIALIZED_NAME_CONSENT_TRACKING = "ConsentTracking";
  @SerializedName(SERIALIZED_NAME_CONSENT_TRACKING)
  private ConsentTracking consentTracking = null;


  public ConsentData consentIP(String consentIP) {
    
    this.consentIP = consentIP;
    return this;
  }

   /**
   * IP address of consent to send this contact(s) your email. If not provided your current public IP address is used for consent.
   * @return consentIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.168.0.1", value = "IP address of consent to send this contact(s) your email. If not provided your current public IP address is used for consent.")

  public String getConsentIP() {
    return consentIP;
  }


  public void setConsentIP(String consentIP) {
    this.consentIP = consentIP;
  }


  public ConsentData consentDate(OffsetDateTime consentDate) {
    
    this.consentDate = consentDate;
    return this;
  }

   /**
   * Date of consent to send this contact(s) your email. If not provided current date is used for consent.
   * @return consentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of consent to send this contact(s) your email. If not provided current date is used for consent.")

  public OffsetDateTime getConsentDate() {
    return consentDate;
  }


  public void setConsentDate(OffsetDateTime consentDate) {
    this.consentDate = consentDate;
  }


  public ConsentData consentTracking(ConsentTracking consentTracking) {
    
    this.consentTracking = consentTracking;
    return this;
  }

   /**
   * Does the contant consent to have their tracking data stored.
   * @return consentTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does the contant consent to have their tracking data stored.")

  public ConsentTracking getConsentTracking() {
    return consentTracking;
  }


  public void setConsentTracking(ConsentTracking consentTracking) {
    this.consentTracking = consentTracking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentData consentData = (ConsentData) o;
    return Objects.equals(this.consentIP, consentData.consentIP) &&
        Objects.equals(this.consentDate, consentData.consentDate) &&
        Objects.equals(this.consentTracking, consentData.consentTracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentIP, consentDate, consentTracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentData {\n");
    sb.append("    consentIP: ").append(toIndentedString(consentIP)).append("\n");
    sb.append("    consentDate: ").append(toIndentedString(consentDate)).append("\n");
    sb.append("    consentTracking: ").append(toIndentedString(consentTracking)).append("\n");
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

