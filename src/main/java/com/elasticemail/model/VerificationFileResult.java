/*
 * Elastic Email REST API
 * This API is based on the REST API architecture, allowing the user to easily manage their data with this resource-based approach.    Every API call is established on which specific request type (GET, POST, PUT, DELETE) will be used.    The API has a limit of 20 concurrent connections and a hard timeout of 600 seconds per request.    To start using this API, you will need your Access Token (available <a target=\"_blank\" href=\"https://elasticemail.com/account#/settings/new/manage-api\">here</a>). Remember to keep it safe. Required access levels are listed in the given request’s description.    This is the documentation for REST API. If you’d like to read our legacy documentation regarding Web API v2 click <a target=\"_blank\" href=\"https://api.elasticemail.com/public/help\">here</a>.    Downloadable library clients can be found in our Github repository <a target=\"_blank\" href=\"https://github.com/ElasticEmail?tab=repositories&q=%22rest+api%22+in%3Areadme\">here</a>
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
import com.elasticemail.model.FileUploadResult;
import com.elasticemail.model.VerificationStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Simple verification file result info
 */
@ApiModel(description = "Simple verification file result info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T10:01:55.764174Z[Etc/UTC]")
public class VerificationFileResult {
  public static final String SERIALIZED_NAME_VERIFICATION_I_D = "VerificationID";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_I_D)
  private String verificationID;

  public static final String SERIALIZED_NAME_FILENAME = "Filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "VerificationStatus";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatus verificationStatus = VerificationStatus.PROCESSING;

  public static final String SERIALIZED_NAME_FILE_UPLOAD_RESULT = "FileUploadResult";
  @SerializedName(SERIALIZED_NAME_FILE_UPLOAD_RESULT)
  private FileUploadResult fileUploadResult;

  public static final String SERIALIZED_NAME_DATE_ADDED = "DateAdded";
  @SerializedName(SERIALIZED_NAME_DATE_ADDED)
  private OffsetDateTime dateAdded;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;


  public VerificationFileResult verificationID(String verificationID) {
    
    this.verificationID = verificationID;
    return this;
  }

   /**
   * Identifier of this verification result
   * @return verificationID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of this verification result")

  public String getVerificationID() {
    return verificationID;
  }


  public void setVerificationID(String verificationID) {
    this.verificationID = verificationID;
  }


  public VerificationFileResult filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Origin file name
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Origin file name")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public VerificationFileResult verificationStatus(VerificationStatus verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerificationStatus getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(VerificationStatus verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public VerificationFileResult fileUploadResult(FileUploadResult fileUploadResult) {
    
    this.fileUploadResult = fileUploadResult;
    return this;
  }

   /**
   * Get fileUploadResult
   * @return fileUploadResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileUploadResult getFileUploadResult() {
    return fileUploadResult;
  }


  public void setFileUploadResult(FileUploadResult fileUploadResult) {
    this.fileUploadResult = fileUploadResult;
  }


  public VerificationFileResult dateAdded(OffsetDateTime dateAdded) {
    
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Date of creation in YYYY-MM-DDThh:ii:ss format
   * @return dateAdded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of creation in YYYY-MM-DDThh:ii:ss format")

  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }


  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }


  public VerificationFileResult source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Origin file extension
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Origin file extension")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationFileResult verificationFileResult = (VerificationFileResult) o;
    return Objects.equals(this.verificationID, verificationFileResult.verificationID) &&
        Objects.equals(this.filename, verificationFileResult.filename) &&
        Objects.equals(this.verificationStatus, verificationFileResult.verificationStatus) &&
        Objects.equals(this.fileUploadResult, verificationFileResult.fileUploadResult) &&
        Objects.equals(this.dateAdded, verificationFileResult.dateAdded) &&
        Objects.equals(this.source, verificationFileResult.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationID, filename, verificationStatus, fileUploadResult, dateAdded, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationFileResult {\n");
    sb.append("    verificationID: ").append(toIndentedString(verificationID)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    fileUploadResult: ").append(toIndentedString(fileUploadResult)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

