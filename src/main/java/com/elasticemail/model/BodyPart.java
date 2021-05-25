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
import com.elasticemail.model.BodyContentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Email body part with user-provided MIME type (text/html, text/plain, etc)
 */
@ApiModel(description = "Email body part with user-provided MIME type (text/html, text/plain, etc)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class BodyPart {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "ContentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private BodyContentType contentType = null;

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CHARSET = "Charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;


  public BodyPart contentType(BodyContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Type of the body part
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the body part")

  public BodyContentType getContentType() {
    return contentType;
  }


  public void setContentType(BodyContentType contentType) {
    this.contentType = contentType;
  }


  public BodyPart content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Actual content of the body part
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actual content of the body part")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public BodyPart charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Text value of charset encoding for example: iso-8859-1, windows-1251, utf-8, us-ascii, windows-1250 and more…
   * @return charset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text value of charset encoding for example: iso-8859-1, windows-1251, utf-8, us-ascii, windows-1250 and more…")

  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyPart bodyPart = (BodyPart) o;
    return Objects.equals(this.contentType, bodyPart.contentType) &&
        Objects.equals(this.content, bodyPart.content) &&
        Objects.equals(this.charset, bodyPart.charset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, content, charset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyPart {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
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

