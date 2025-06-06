/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    The API has a limit of 20 concurrent connections and a hard timeout of 600 seconds per request.    To start using this API, you will need your Access Token (available <a target=\"_blank\" href=\"https://app.elasticemail.com/marketing/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    Downloadable library clients can be found in our Github repository <a target=\"_blank\" href=\"https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme\">here</a>
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
import com.elasticemail.model.CertificateValidationStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.elasticemail.client.JSON;

/**
 * DomainUpdatePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T13:34:56.566653Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class DomainUpdatePayload {
  public static final String SERIALIZED_NAME_CERTIFICATE_STATUS = "CertificateStatus";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STATUS)
  private CertificateValidationStatus certificateStatus = CertificateValidationStatus.ERROROCCURED;

  public static final String SERIALIZED_NAME_V_E_R_P = "VERP";
  @SerializedName(SERIALIZED_NAME_V_E_R_P)
  private Boolean VERP;

  public static final String SERIALIZED_NAME_CUSTOM_BOUNCES_DOMAIN = "CustomBouncesDomain";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BOUNCES_DOMAIN)
  private String customBouncesDomain;

  public static final String SERIALIZED_NAME_IS_CUSTOM_BOUNCES_DOMAIN_DEFAULT = "IsCustomBouncesDomainDefault";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOM_BOUNCES_DOMAIN_DEFAULT)
  private Boolean isCustomBouncesDomainDefault;

  public DomainUpdatePayload() {
  }

  public DomainUpdatePayload certificateStatus(CertificateValidationStatus certificateStatus) {
    this.certificateStatus = certificateStatus;
    return this;
  }

   /**
   * Get certificateStatus
   * @return certificateStatus
  **/
  @javax.annotation.Nullable
  public CertificateValidationStatus getCertificateStatus() {
    return certificateStatus;
  }

  public void setCertificateStatus(CertificateValidationStatus certificateStatus) {
    this.certificateStatus = certificateStatus;
  }


  public DomainUpdatePayload VERP(Boolean VERP) {
    this.VERP = VERP;
    return this;
  }

   /**
   * Get VERP
   * @return VERP
  **/
  @javax.annotation.Nullable
  public Boolean getVERP() {
    return VERP;
  }

  public void setVERP(Boolean VERP) {
    this.VERP = VERP;
  }


  public DomainUpdatePayload customBouncesDomain(String customBouncesDomain) {
    this.customBouncesDomain = customBouncesDomain;
    return this;
  }

   /**
   * Get customBouncesDomain
   * @return customBouncesDomain
  **/
  @javax.annotation.Nullable
  public String getCustomBouncesDomain() {
    return customBouncesDomain;
  }

  public void setCustomBouncesDomain(String customBouncesDomain) {
    this.customBouncesDomain = customBouncesDomain;
  }


  public DomainUpdatePayload isCustomBouncesDomainDefault(Boolean isCustomBouncesDomainDefault) {
    this.isCustomBouncesDomainDefault = isCustomBouncesDomainDefault;
    return this;
  }

   /**
   * Get isCustomBouncesDomainDefault
   * @return isCustomBouncesDomainDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsCustomBouncesDomainDefault() {
    return isCustomBouncesDomainDefault;
  }

  public void setIsCustomBouncesDomainDefault(Boolean isCustomBouncesDomainDefault) {
    this.isCustomBouncesDomainDefault = isCustomBouncesDomainDefault;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUpdatePayload domainUpdatePayload = (DomainUpdatePayload) o;
    return Objects.equals(this.certificateStatus, domainUpdatePayload.certificateStatus) &&
        Objects.equals(this.VERP, domainUpdatePayload.VERP) &&
        Objects.equals(this.customBouncesDomain, domainUpdatePayload.customBouncesDomain) &&
        Objects.equals(this.isCustomBouncesDomainDefault, domainUpdatePayload.isCustomBouncesDomainDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateStatus, VERP, customBouncesDomain, isCustomBouncesDomainDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUpdatePayload {\n");
    sb.append("    certificateStatus: ").append(toIndentedString(certificateStatus)).append("\n");
    sb.append("    VERP: ").append(toIndentedString(VERP)).append("\n");
    sb.append("    customBouncesDomain: ").append(toIndentedString(customBouncesDomain)).append("\n");
    sb.append("    isCustomBouncesDomainDefault: ").append(toIndentedString(isCustomBouncesDomainDefault)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("CertificateStatus");
    openapiFields.add("VERP");
    openapiFields.add("CustomBouncesDomain");
    openapiFields.add("IsCustomBouncesDomainDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DomainUpdatePayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainUpdatePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainUpdatePayload is not found in the empty JSON string", DomainUpdatePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DomainUpdatePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DomainUpdatePayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `CertificateStatus`
      if (jsonObj.get("CertificateStatus") != null && !jsonObj.get("CertificateStatus").isJsonNull()) {
        CertificateValidationStatus.validateJsonElement(jsonObj.get("CertificateStatus"));
      }
      if ((jsonObj.get("CustomBouncesDomain") != null && !jsonObj.get("CustomBouncesDomain").isJsonNull()) && !jsonObj.get("CustomBouncesDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomBouncesDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomBouncesDomain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainUpdatePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainUpdatePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainUpdatePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainUpdatePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainUpdatePayload>() {
           @Override
           public void write(JsonWriter out, DomainUpdatePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DomainUpdatePayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DomainUpdatePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DomainUpdatePayload
  * @throws IOException if the JSON string is invalid with respect to DomainUpdatePayload
  */
  public static DomainUpdatePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainUpdatePayload.class);
  }

 /**
  * Convert an instance of DomainUpdatePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

