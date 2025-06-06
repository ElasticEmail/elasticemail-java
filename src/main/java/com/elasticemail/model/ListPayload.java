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
 * ListPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T13:34:56.566653Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class ListPayload {
  public static final String SERIALIZED_NAME_LIST_NAME = "ListName";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_ALLOW_UNSUBSCRIBE = "AllowUnsubscribe";
  @SerializedName(SERIALIZED_NAME_ALLOW_UNSUBSCRIBE)
  private Boolean allowUnsubscribe;

  public static final String SERIALIZED_NAME_EMAILS = "Emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = new ArrayList<>();

  public ListPayload() {
  }

  public ListPayload listName(String listName) {
    this.listName = listName;
    return this;
  }

   /**
   * Name of your list.
   * @return listName
  **/
  @javax.annotation.Nonnull
  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }


  public ListPayload allowUnsubscribe(Boolean allowUnsubscribe) {
    this.allowUnsubscribe = allowUnsubscribe;
    return this;
  }

   /**
   * True: Allow unsubscribing from this list. Otherwise, false
   * @return allowUnsubscribe
  **/
  @javax.annotation.Nullable
  public Boolean getAllowUnsubscribe() {
    return allowUnsubscribe;
  }

  public void setAllowUnsubscribe(Boolean allowUnsubscribe) {
    this.allowUnsubscribe = allowUnsubscribe;
  }


  public ListPayload emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public ListPayload addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Comma delimited list of existing contact emails that should be added to this list. Leave empty for all contacts
   * @return emails
  **/
  @javax.annotation.Nullable
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPayload listPayload = (ListPayload) o;
    return Objects.equals(this.listName, listPayload.listName) &&
        Objects.equals(this.allowUnsubscribe, listPayload.allowUnsubscribe) &&
        Objects.equals(this.emails, listPayload.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listName, allowUnsubscribe, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPayload {\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    allowUnsubscribe: ").append(toIndentedString(allowUnsubscribe)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
    openapiFields.add("ListName");
    openapiFields.add("AllowUnsubscribe");
    openapiFields.add("Emails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ListName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPayload is not found in the empty JSON string", ListPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ListName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Emails") != null && !jsonObj.get("Emails").isJsonNull() && !jsonObj.get("Emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Emails` to be an array in the JSON string but got `%s`", jsonObj.get("Emails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPayload>() {
           @Override
           public void write(JsonWriter out, ListPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPayload
  * @throws IOException if the JSON string is invalid with respect to ListPayload
  */
  public static ListPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPayload.class);
  }

 /**
  * Convert an instance of ListPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

