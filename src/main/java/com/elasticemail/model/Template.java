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
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.TemplateScope;
import com.elasticemail.model.TemplateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Template info
 */
@ApiModel(description = "Template info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-31T08:08:48.625855188Z[Etc/UTC]")
public class Template {
  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "TemplateType";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private TemplateType templateType = TemplateType.RAWHTML;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_ADDED = "DateAdded";
  @SerializedName(SERIALIZED_NAME_DATE_ADDED)
  private OffsetDateTime dateAdded;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private List<BodyPart> body = null;

  public static final String SERIALIZED_NAME_TEMPLATE_SCOPE = "TemplateScope";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_SCOPE)
  private TemplateScope templateScope = TemplateScope.PERSONAL;

  public Template() { 
  }

  public Template templateType(TemplateType templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateType getTemplateType() {
    return templateType;
  }


  public void setTemplateType(TemplateType templateType) {
    this.templateType = templateType;
  }


  public Template name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Template dateAdded(OffsetDateTime dateAdded) {
    
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


  public Template subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Default subject of email.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello!", value = "Default subject of email.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Template body(List<BodyPart> body) {
    
    this.body = body;
    return this;
  }

  public Template addBodyItem(BodyPart bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<BodyPart>();
    }
    this.body.add(bodyItem);
    return this;
  }

   /**
   * Email content of this template
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email content of this template")

  public List<BodyPart> getBody() {
    return body;
  }


  public void setBody(List<BodyPart> body) {
    this.body = body;
  }


  public Template templateScope(TemplateScope templateScope) {
    
    this.templateScope = templateScope;
    return this;
  }

   /**
   * Get templateScope
   * @return templateScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateScope getTemplateScope() {
    return templateScope;
  }


  public void setTemplateScope(TemplateScope templateScope) {
    this.templateScope = templateScope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.templateType, template.templateType) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this.dateAdded, template.dateAdded) &&
        Objects.equals(this.subject, template.subject) &&
        Objects.equals(this.body, template.body) &&
        Objects.equals(this.templateScope, template.templateScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateType, name, dateAdded, subject, body, templateScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    templateScope: ").append(toIndentedString(templateScope)).append("\n");
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

