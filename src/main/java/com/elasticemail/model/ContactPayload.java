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
import com.elasticemail.model.ConsentData;
import com.elasticemail.model.ContactStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * ContactPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T09:36:05.709243Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ContactPayload {
  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ContactStatus status = ContactStatus.TRANSACTIONAL;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "CustomFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, String> customFields = new HashMap<>();

  public static final String SERIALIZED_NAME_CONSENT = "Consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentData consent;

  public ContactPayload() {
  }

  public ContactPayload email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Proper email address.
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public ContactPayload status(ContactStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ContactStatus getStatus() {
    return status;
  }

  public void setStatus(ContactStatus status) {
    this.status = status;
  }


  public ContactPayload firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ContactPayload lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ContactPayload customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ContactPayload putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

  /**
   * A key-value collection of custom contact fields which can be used in the system. Only already existing custom fields will be saved.
   * @return customFields
   */
  @javax.annotation.Nullable
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  public ContactPayload consent(ConsentData consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
   */
  @javax.annotation.Nullable
  public ConsentData getConsent() {
    return consent;
  }

  public void setConsent(ConsentData consent) {
    this.consent = consent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPayload contactPayload = (ContactPayload) o;
    return Objects.equals(this.email, contactPayload.email) &&
        Objects.equals(this.status, contactPayload.status) &&
        Objects.equals(this.firstName, contactPayload.firstName) &&
        Objects.equals(this.lastName, contactPayload.lastName) &&
        Objects.equals(this.customFields, contactPayload.customFields) &&
        Objects.equals(this.consent, contactPayload.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, status, firstName, lastName, customFields, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPayload {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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
    openapiFields.add("Email");
    openapiFields.add("Status");
    openapiFields.add("FirstName");
    openapiFields.add("LastName");
    openapiFields.add("CustomFields");
    openapiFields.add("Consent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Email");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContactPayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContactPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactPayload is not found in the empty JSON string", ContactPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContactPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
      // validate the optional field `Status`
      if (jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) {
        ContactStatus.validateJsonElement(jsonObj.get("Status"));
      }
      if ((jsonObj.get("FirstName") != null && !jsonObj.get("FirstName").isJsonNull()) && !jsonObj.get("FirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FirstName").toString()));
      }
      if ((jsonObj.get("LastName") != null && !jsonObj.get("LastName").isJsonNull()) && !jsonObj.get("LastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastName").toString()));
      }
      // validate the optional field `Consent`
      if (jsonObj.get("Consent") != null && !jsonObj.get("Consent").isJsonNull()) {
        ConsentData.validateJsonElement(jsonObj.get("Consent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactPayload>() {
           @Override
           public void write(JsonWriter out, ContactPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContactPayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContactPayload
   * @throws IOException if the JSON string is invalid with respect to ContactPayload
   */
  public static ContactPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactPayload.class);
  }

  /**
   * Convert an instance of ContactPayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

