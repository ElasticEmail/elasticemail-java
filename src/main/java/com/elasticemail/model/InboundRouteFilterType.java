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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets InboundRouteFilterType
 */
@JsonAdapter(InboundRouteFilterType.Adapter.class)
public enum InboundRouteFilterType {
  
  EMAILADDRESS("EmailAddress"),
  
  SUBJECT("Subject");

  private String value;

  InboundRouteFilterType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InboundRouteFilterType fromValue(String value) {
    for (InboundRouteFilterType b : InboundRouteFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InboundRouteFilterType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InboundRouteFilterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InboundRouteFilterType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InboundRouteFilterType.fromValue(value);
    }
  }
}

