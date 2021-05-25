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
import com.elasticemail.model.SplitOptimizationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Optional A/X split campaign options
 */
@ApiModel(description = "Optional A/X split campaign options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T13:02:35.289764Z[Etc/UTC]")
public class SplitOptions {
  public static final String SERIALIZED_NAME_OPTIMIZE_FOR = "OptimizeFor";
  @SerializedName(SERIALIZED_NAME_OPTIMIZE_FOR)
  private SplitOptimizationType optimizeFor = null;

  public static final String SERIALIZED_NAME_OPTIMIZE_PERIOD_MINUTES = "OptimizePeriodMinutes";
  @SerializedName(SERIALIZED_NAME_OPTIMIZE_PERIOD_MINUTES)
  private Integer optimizePeriodMinutes;


  public SplitOptions optimizeFor(SplitOptimizationType optimizeFor) {
    
    this.optimizeFor = optimizeFor;
    return this;
  }

   /**
   * Type of results by which to determine the winner template (content)
   * @return optimizeFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of results by which to determine the winner template (content)")

  public SplitOptimizationType getOptimizeFor() {
    return optimizeFor;
  }


  public void setOptimizeFor(SplitOptimizationType optimizeFor) {
    this.optimizeFor = optimizeFor;
  }


  public SplitOptions optimizePeriodMinutes(Integer optimizePeriodMinutes) {
    
    this.optimizePeriodMinutes = optimizePeriodMinutes;
    return this;
  }

   /**
   * For how long should the results be measured until determining the winner template (content)
   * @return optimizePeriodMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "For how long should the results be measured until determining the winner template (content)")

  public Integer getOptimizePeriodMinutes() {
    return optimizePeriodMinutes;
  }


  public void setOptimizePeriodMinutes(Integer optimizePeriodMinutes) {
    this.optimizePeriodMinutes = optimizePeriodMinutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitOptions splitOptions = (SplitOptions) o;
    return Objects.equals(this.optimizeFor, splitOptions.optimizeFor) &&
        Objects.equals(this.optimizePeriodMinutes, splitOptions.optimizePeriodMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizeFor, optimizePeriodMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitOptions {\n");
    sb.append("    optimizeFor: ").append(toIndentedString(optimizeFor)).append("\n");
    sb.append("    optimizePeriodMinutes: ").append(toIndentedString(optimizePeriodMinutes)).append("\n");
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

