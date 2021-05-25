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
import com.elasticemail.model.EmailContent;
import com.elasticemail.model.MessageAttachment;
import com.elasticemail.model.Options;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MergeEmailPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class MergeEmailPayload {
  public static final String SERIALIZED_NAME_MERGE_FILE = "MergeFile";
  @SerializedName(SERIALIZED_NAME_MERGE_FILE)
  private MessageAttachment mergeFile = null;

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private EmailContent content = null;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Options options = null;


  public MergeEmailPayload mergeFile(MessageAttachment mergeFile) {
    
    this.mergeFile = mergeFile;
    return this;
  }

   /**
   * CSV file containing recipients with optional merge fields
   * @return mergeFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSV file containing recipients with optional merge fields")

  public MessageAttachment getMergeFile() {
    return mergeFile;
  }


  public void setMergeFile(MessageAttachment mergeFile) {
    this.mergeFile = mergeFile;
  }


  public MergeEmailPayload content(EmailContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Proper e-mail content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Proper e-mail content")

  public EmailContent getContent() {
    return content;
  }


  public void setContent(EmailContent content) {
    this.content = content;
  }


  public MergeEmailPayload options(Options options) {
    
    this.options = options;
    return this;
  }

   /**
   * E-mail configuration
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "E-mail configuration")

  public Options getOptions() {
    return options;
  }


  public void setOptions(Options options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeEmailPayload mergeEmailPayload = (MergeEmailPayload) o;
    return Objects.equals(this.mergeFile, mergeEmailPayload.mergeFile) &&
        Objects.equals(this.content, mergeEmailPayload.content) &&
        Objects.equals(this.options, mergeEmailPayload.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeFile, content, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeEmailPayload {\n");
    sb.append("    mergeFile: ").append(toIndentedString(mergeFile)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

