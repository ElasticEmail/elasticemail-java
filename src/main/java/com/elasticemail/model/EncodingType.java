/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    To start using this API, you will need your Access Token (available <a href=\"https://elasticemail.com/account#/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    This is the documentation for REST API. If you’d like to read our legacy documentation regarding Web API v2 click <a href=\"https://api.elasticemail.com/public/help\">here</a>.
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Encoding type for the email headers
 */
@JsonAdapter(EncodingType.Adapter.class)
public enum EncodingType {
  
  USERPROVIDED("UserProvided"),
  
  NONE("None"),
  
  RAW7BIT("Raw7bit"),
  
  RAW8BIT("Raw8bit"),
  
  QUOTEDPRINTABLE("QuotedPrintable"),
  
  BASE64("Base64"),
  
  UUE("Uue");

  private String value;

  EncodingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EncodingType fromValue(String value) {
    for (EncodingType b : EncodingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EncodingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EncodingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EncodingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EncodingType.fromValue(value);
    }
  }
}
