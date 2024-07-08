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
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.MessageAttachment;
import com.elasticemail.model.Utm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Proper e-mail content
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T09:36:05.709243Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class EmailContent {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private List<BodyPart> body = new ArrayList<>();

  public static final String SERIALIZED_NAME_MERGE = "Merge";
  @SerializedName(SERIALIZED_NAME_MERGE)
  private Map<String, String> merge = new HashMap<>();

  public static final String SERIALIZED_NAME_ATTACHMENTS = "Attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<MessageAttachment> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS = "Headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = new HashMap<>();

  public static final String SERIALIZED_NAME_POSTBACK = "Postback";
  @SerializedName(SERIALIZED_NAME_POSTBACK)
  private String postback;

  public static final String SERIALIZED_NAME_ENVELOPE_FROM = "EnvelopeFrom";
  @SerializedName(SERIALIZED_NAME_ENVELOPE_FROM)
  private String envelopeFrom;

  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_REPLY_TO = "ReplyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "TemplateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_ATTACH_FILES = "AttachFiles";
  @SerializedName(SERIALIZED_NAME_ATTACH_FILES)
  private List<String> attachFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_UTM = "Utm";
  @SerializedName(SERIALIZED_NAME_UTM)
  private Utm utm;

  public EmailContent() {
  }

  public EmailContent body(List<BodyPart> body) {
    this.body = body;
    return this;
  }

  public EmailContent addBodyItem(BodyPart bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<>();
    }
    this.body.add(bodyItem);
    return this;
  }

  /**
   * List of e-mail body parts, with user-provided MIME types (text/html, text/plain etc)
   * @return body
   */
  @javax.annotation.Nullable
  public List<BodyPart> getBody() {
    return body;
  }

  public void setBody(List<BodyPart> body) {
    this.body = body;
  }


  public EmailContent merge(Map<String, String> merge) {
    this.merge = merge;
    return this;
  }

  public EmailContent putMergeItem(String key, String mergeItem) {
    if (this.merge == null) {
      this.merge = new HashMap<>();
    }
    this.merge.put(key, mergeItem);
    return this;
  }

  /**
   * A key-value collection of custom merge fields, shared between recipients. Should be used in e-mail body like so: {firstname}, {lastname} etc.
   * @return merge
   */
  @javax.annotation.Nullable
  public Map<String, String> getMerge() {
    return merge;
  }

  public void setMerge(Map<String, String> merge) {
    this.merge = merge;
  }


  public EmailContent attachments(List<MessageAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmailContent addAttachmentsItem(MessageAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Attachments provided by sending binary data
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<MessageAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<MessageAttachment> attachments) {
    this.attachments = attachments;
  }


  public EmailContent headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public EmailContent putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * A key-value collection of custom e-mail headers.
   * @return headers
   */
  @javax.annotation.Nullable
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public EmailContent postback(String postback) {
    this.postback = postback;
    return this;
  }

  /**
   * Postback header.
   * @return postback
   */
  @javax.annotation.Nullable
  public String getPostback() {
    return postback;
  }

  public void setPostback(String postback) {
    this.postback = postback;
  }


  public EmailContent envelopeFrom(String envelopeFrom) {
    this.envelopeFrom = envelopeFrom;
    return this;
  }

  /**
   * E-mail with an optional name to be used as the envelope from address (e.g.: John Doe &lt;email@domain.com&gt;)
   * @return envelopeFrom
   */
  @javax.annotation.Nullable
  public String getEnvelopeFrom() {
    return envelopeFrom;
  }

  public void setEnvelopeFrom(String envelopeFrom) {
    this.envelopeFrom = envelopeFrom;
  }


  public EmailContent from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Your e-mail with an optional name (e.g.: John Doe &lt;email@domain.com&gt;)
   * @return from
   */
  @javax.annotation.Nonnull
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public EmailContent replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

  /**
   * To what address should the recipients reply to (e.g. John Doe &lt;email@domain.com&gt;)
   * @return replyTo
   */
  @javax.annotation.Nullable
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public EmailContent subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Default subject of email.
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailContent templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Name of template.
   * @return templateName
   */
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public EmailContent attachFiles(List<String> attachFiles) {
    this.attachFiles = attachFiles;
    return this;
  }

  public EmailContent addAttachFilesItem(String attachFilesItem) {
    if (this.attachFiles == null) {
      this.attachFiles = new ArrayList<>();
    }
    this.attachFiles.add(attachFilesItem);
    return this;
  }

  /**
   * Names of previously uploaded files that should be sent as downloadable attachments
   * @return attachFiles
   */
  @javax.annotation.Nullable
  public List<String> getAttachFiles() {
    return attachFiles;
  }

  public void setAttachFiles(List<String> attachFiles) {
    this.attachFiles = attachFiles;
  }


  public EmailContent utm(Utm utm) {
    this.utm = utm;
    return this;
  }

  /**
   * Get utm
   * @return utm
   */
  @javax.annotation.Nullable
  public Utm getUtm() {
    return utm;
  }

  public void setUtm(Utm utm) {
    this.utm = utm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailContent emailContent = (EmailContent) o;
    return Objects.equals(this.body, emailContent.body) &&
        Objects.equals(this.merge, emailContent.merge) &&
        Objects.equals(this.attachments, emailContent.attachments) &&
        Objects.equals(this.headers, emailContent.headers) &&
        Objects.equals(this.postback, emailContent.postback) &&
        Objects.equals(this.envelopeFrom, emailContent.envelopeFrom) &&
        Objects.equals(this.from, emailContent.from) &&
        Objects.equals(this.replyTo, emailContent.replyTo) &&
        Objects.equals(this.subject, emailContent.subject) &&
        Objects.equals(this.templateName, emailContent.templateName) &&
        Objects.equals(this.attachFiles, emailContent.attachFiles) &&
        Objects.equals(this.utm, emailContent.utm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, merge, attachments, headers, postback, envelopeFrom, from, replyTo, subject, templateName, attachFiles, utm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailContent {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    postback: ").append(toIndentedString(postback)).append("\n");
    sb.append("    envelopeFrom: ").append(toIndentedString(envelopeFrom)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    attachFiles: ").append(toIndentedString(attachFiles)).append("\n");
    sb.append("    utm: ").append(toIndentedString(utm)).append("\n");
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
    openapiFields.add("Body");
    openapiFields.add("Merge");
    openapiFields.add("Attachments");
    openapiFields.add("Headers");
    openapiFields.add("Postback");
    openapiFields.add("EnvelopeFrom");
    openapiFields.add("From");
    openapiFields.add("ReplyTo");
    openapiFields.add("Subject");
    openapiFields.add("TemplateName");
    openapiFields.add("AttachFiles");
    openapiFields.add("Utm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("From");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmailContent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmailContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailContent is not found in the empty JSON string", EmailContent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmailContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailContent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmailContent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Body") != null && !jsonObj.get("Body").isJsonNull()) {
        JsonArray jsonArraybody = jsonObj.getAsJsonArray("Body");
        if (jsonArraybody != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Body").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Body` to be an array in the JSON string but got `%s`", jsonObj.get("Body").toString()));
          }

          // validate the optional field `Body` (array)
          for (int i = 0; i < jsonArraybody.size(); i++) {
            BodyPart.validateJsonElement(jsonArraybody.get(i));
          };
        }
      }
      if (jsonObj.get("Attachments") != null && !jsonObj.get("Attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("Attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Attachments` to be an array in the JSON string but got `%s`", jsonObj.get("Attachments").toString()));
          }

          // validate the optional field `Attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            MessageAttachment.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if ((jsonObj.get("Postback") != null && !jsonObj.get("Postback").isJsonNull()) && !jsonObj.get("Postback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Postback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Postback").toString()));
      }
      if ((jsonObj.get("EnvelopeFrom") != null && !jsonObj.get("EnvelopeFrom").isJsonNull()) && !jsonObj.get("EnvelopeFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EnvelopeFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EnvelopeFrom").toString()));
      }
      if (!jsonObj.get("From").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `From` to be a primitive type in the JSON string but got `%s`", jsonObj.get("From").toString()));
      }
      if ((jsonObj.get("ReplyTo") != null && !jsonObj.get("ReplyTo").isJsonNull()) && !jsonObj.get("ReplyTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReplyTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReplyTo").toString()));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("TemplateName") != null && !jsonObj.get("TemplateName").isJsonNull()) && !jsonObj.get("TemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AttachFiles") != null && !jsonObj.get("AttachFiles").isJsonNull() && !jsonObj.get("AttachFiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AttachFiles` to be an array in the JSON string but got `%s`", jsonObj.get("AttachFiles").toString()));
      }
      // validate the optional field `Utm`
      if (jsonObj.get("Utm") != null && !jsonObj.get("Utm").isJsonNull()) {
        Utm.validateJsonElement(jsonObj.get("Utm"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailContent.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailContent>() {
           @Override
           public void write(JsonWriter out, EmailContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailContent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmailContent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmailContent
   * @throws IOException if the JSON string is invalid with respect to EmailContent
   */
  public static EmailContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailContent.class);
  }

  /**
   * Convert an instance of EmailContent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

