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
import com.elasticemail.model.InboundRouteActionType;
import com.elasticemail.model.InboundRouteFilterType;
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
 * InboundPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T09:36:05.709243Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class InboundPayload {
  public static final String SERIALIZED_NAME_FILTER = "Filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTER_TYPE = "FilterType";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPE)
  private InboundRouteFilterType filterType = InboundRouteFilterType.EMAIL_ADDRESS;

  public static final String SERIALIZED_NAME_ACTION_TYPE = "ActionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private InboundRouteActionType actionType = InboundRouteActionType.FORWARD_TO_EMAIL;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_HTTP_ADDRESS = "HttpAddress";
  @SerializedName(SERIALIZED_NAME_HTTP_ADDRESS)
  private String httpAddress;

  public InboundPayload() {
  }

  public InboundPayload filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter of the inbound data
   * @return filter
   */
  @javax.annotation.Nonnull
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }


  public InboundPayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of this route
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public InboundPayload filterType(InboundRouteFilterType filterType) {
    this.filterType = filterType;
    return this;
  }

  /**
   * Get filterType
   * @return filterType
   */
  @javax.annotation.Nonnull
  public InboundRouteFilterType getFilterType() {
    return filterType;
  }

  public void setFilterType(InboundRouteFilterType filterType) {
    this.filterType = filterType;
  }


  public InboundPayload actionType(InboundRouteActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   */
  @javax.annotation.Nonnull
  public InboundRouteActionType getActionType() {
    return actionType;
  }

  public void setActionType(InboundRouteActionType actionType) {
    this.actionType = actionType;
  }


  public InboundPayload emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email to forward the inbound to
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public InboundPayload httpAddress(String httpAddress) {
    this.httpAddress = httpAddress;
    return this;
  }

  /**
   * Address to notify about the inbound
   * @return httpAddress
   */
  @javax.annotation.Nullable
  public String getHttpAddress() {
    return httpAddress;
  }

  public void setHttpAddress(String httpAddress) {
    this.httpAddress = httpAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundPayload inboundPayload = (InboundPayload) o;
    return Objects.equals(this.filter, inboundPayload.filter) &&
        Objects.equals(this.name, inboundPayload.name) &&
        Objects.equals(this.filterType, inboundPayload.filterType) &&
        Objects.equals(this.actionType, inboundPayload.actionType) &&
        Objects.equals(this.emailAddress, inboundPayload.emailAddress) &&
        Objects.equals(this.httpAddress, inboundPayload.httpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, name, filterType, actionType, emailAddress, httpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundPayload {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    httpAddress: ").append(toIndentedString(httpAddress)).append("\n");
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
    openapiFields.add("Filter");
    openapiFields.add("Name");
    openapiFields.add("FilterType");
    openapiFields.add("ActionType");
    openapiFields.add("EmailAddress");
    openapiFields.add("HttpAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Filter");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("FilterType");
    openapiRequiredFields.add("ActionType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InboundPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InboundPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundPayload is not found in the empty JSON string", InboundPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InboundPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InboundPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InboundPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Filter").toString()));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the required field `FilterType`
      InboundRouteFilterType.validateJsonElement(jsonObj.get("FilterType"));
      // validate the required field `ActionType`
      InboundRouteActionType.validateJsonElement(jsonObj.get("ActionType"));
      if ((jsonObj.get("EmailAddress") != null && !jsonObj.get("EmailAddress").isJsonNull()) && !jsonObj.get("EmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EmailAddress").toString()));
      }
      if ((jsonObj.get("HttpAddress") != null && !jsonObj.get("HttpAddress").isJsonNull()) && !jsonObj.get("HttpAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HttpAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HttpAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundPayload>() {
           @Override
           public void write(JsonWriter out, InboundPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InboundPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InboundPayload
   * @throws IOException if the JSON string is invalid with respect to InboundPayload
   */
  public static InboundPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundPayload.class);
  }

  /**
   * Convert an instance of InboundPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

