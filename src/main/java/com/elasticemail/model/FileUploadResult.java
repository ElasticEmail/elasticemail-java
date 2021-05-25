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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileUploadResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class FileUploadResult {
  public static final String SERIALIZED_NAME_EMAILS_COUNT = "EmailsCount";
  @SerializedName(SERIALIZED_NAME_EMAILS_COUNT)
  private Integer emailsCount;

  public static final String SERIALIZED_NAME_DUPLICATED_EMAILS_COUNT = "DuplicatedEmailsCount";
  @SerializedName(SERIALIZED_NAME_DUPLICATED_EMAILS_COUNT)
  private Integer duplicatedEmailsCount;


  public FileUploadResult emailsCount(Integer emailsCount) {
    
    this.emailsCount = emailsCount;
    return this;
  }

   /**
   * How many unique emails were detected the file
   * @return emailsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many unique emails were detected the file")

  public Integer getEmailsCount() {
    return emailsCount;
  }


  public void setEmailsCount(Integer emailsCount) {
    this.emailsCount = emailsCount;
  }


  public FileUploadResult duplicatedEmailsCount(Integer duplicatedEmailsCount) {
    
    this.duplicatedEmailsCount = duplicatedEmailsCount;
    return this;
  }

   /**
   * How many email duplicates were detected
   * @return duplicatedEmailsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many email duplicates were detected")

  public Integer getDuplicatedEmailsCount() {
    return duplicatedEmailsCount;
  }


  public void setDuplicatedEmailsCount(Integer duplicatedEmailsCount) {
    this.duplicatedEmailsCount = duplicatedEmailsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadResult fileUploadResult = (FileUploadResult) o;
    return Objects.equals(this.emailsCount, fileUploadResult.emailsCount) &&
        Objects.equals(this.duplicatedEmailsCount, fileUploadResult.duplicatedEmailsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailsCount, duplicatedEmailsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadResult {\n");
    sb.append("    emailsCount: ").append(toIndentedString(emailsCount)).append("\n");
    sb.append("    duplicatedEmailsCount: ").append(toIndentedString(duplicatedEmailsCount)).append("\n");
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

