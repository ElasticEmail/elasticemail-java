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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * A set of lists and segments names to read recipients from
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T13:34:56.566653Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class CampaignRecipient {
  public static final String SERIALIZED_NAME_LIST_NAMES = "ListNames";
  @SerializedName(SERIALIZED_NAME_LIST_NAMES)
  private List<String> listNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEGMENT_NAMES = "SegmentNames";
  @SerializedName(SERIALIZED_NAME_SEGMENT_NAMES)
  private List<String> segmentNames = new ArrayList<>();

  public CampaignRecipient() {
  }

  public CampaignRecipient listNames(List<String> listNames) {
    this.listNames = listNames;
    return this;
  }

  public CampaignRecipient addListNamesItem(String listNamesItem) {
    if (this.listNames == null) {
      this.listNames = new ArrayList<>();
    }
    this.listNames.add(listNamesItem);
    return this;
  }

   /**
   * Names of lists from your Account to read recipients from
   * @return listNames
  **/
  @javax.annotation.Nullable
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
      this.segmentNames = new ArrayList<>();
    }
    this.segmentNames.add(segmentNamesItem);
    return this;
  }

   /**
   * Names of segments from your Account to read recipients from
   * @return segmentNames
  **/
  @javax.annotation.Nullable
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ListNames");
    openapiFields.add("SegmentNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignRecipient
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignRecipient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignRecipient is not found in the empty JSON string", CampaignRecipient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignRecipient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignRecipient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ListNames") != null && !jsonObj.get("ListNames").isJsonNull() && !jsonObj.get("ListNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListNames` to be an array in the JSON string but got `%s`", jsonObj.get("ListNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SegmentNames") != null && !jsonObj.get("SegmentNames").isJsonNull() && !jsonObj.get("SegmentNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SegmentNames` to be an array in the JSON string but got `%s`", jsonObj.get("SegmentNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignRecipient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignRecipient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignRecipient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignRecipient.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignRecipient>() {
           @Override
           public void write(JsonWriter out, CampaignRecipient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignRecipient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignRecipient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignRecipient
  * @throws IOException if the JSON string is invalid with respect to CampaignRecipient
  */
  public static CampaignRecipient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignRecipient.class);
  }

 /**
  * Convert an instance of CampaignRecipient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

