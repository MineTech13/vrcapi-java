/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: dev004
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.DynamicContentRow;
import io.github.vrchatapi.model.InfoPushDataArticle;
import io.github.vrchatapi.model.InfoPushDataClickable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.vrchatapi.JSON;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InfoPushData {
  public static final String SERIALIZED_NAME_CONTENT_LIST = "contentList";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIST)
  private DynamicContentRow contentList;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_PRESSED = "onPressed";
  @SerializedName(SERIALIZED_NAME_ON_PRESSED)
  private InfoPushDataClickable onPressed;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ARTICLE = "article";
  @SerializedName(SERIALIZED_NAME_ARTICLE)
  private InfoPushDataArticle article;

  public InfoPushData() {
  }

  public InfoPushData contentList(DynamicContentRow contentList) {
    
    this.contentList = contentList;
    return this;
  }

   /**
   * Get contentList
   * @return contentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DynamicContentRow getContentList() {
    return contentList;
  }


  public void setContentList(DynamicContentRow contentList) {
    this.contentList = contentList;
  }


  public InfoPushData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InfoPushData imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public InfoPushData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InfoPushData onPressed(InfoPushDataClickable onPressed) {
    
    this.onPressed = onPressed;
    return this;
  }

   /**
   * Get onPressed
   * @return onPressed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InfoPushDataClickable getOnPressed() {
    return onPressed;
  }


  public void setOnPressed(InfoPushDataClickable onPressed) {
    this.onPressed = onPressed;
  }


  public InfoPushData template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public InfoPushData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021.3.4", value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public InfoPushData article(InfoPushDataArticle article) {
    
    this.article = article;
    return this;
  }

   /**
   * Get article
   * @return article
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InfoPushDataArticle getArticle() {
    return article;
  }


  public void setArticle(InfoPushDataArticle article) {
    this.article = article;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoPushData infoPushData = (InfoPushData) o;
    return Objects.equals(this.contentList, infoPushData.contentList) &&
        Objects.equals(this.description, infoPushData.description) &&
        Objects.equals(this.imageUrl, infoPushData.imageUrl) &&
        Objects.equals(this.name, infoPushData.name) &&
        Objects.equals(this.onPressed, infoPushData.onPressed) &&
        Objects.equals(this.template, infoPushData.template) &&
        Objects.equals(this.version, infoPushData.version) &&
        Objects.equals(this.article, infoPushData.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentList, description, imageUrl, name, onPressed, template, version, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoPushData {\n");
    sb.append("    contentList: ").append(toIndentedString(contentList)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onPressed: ").append(toIndentedString(onPressed)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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
    openapiFields.add("contentList");
    openapiFields.add("description");
    openapiFields.add("imageUrl");
    openapiFields.add("name");
    openapiFields.add("onPressed");
    openapiFields.add("template");
    openapiFields.add("version");
    openapiFields.add("article");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InfoPushData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InfoPushData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InfoPushData is not found in the empty JSON string", InfoPushData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InfoPushData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InfoPushData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `contentList`
      if (jsonObj.get("contentList") != null && !jsonObj.get("contentList").isJsonNull()) {
        DynamicContentRow.validateJsonObject(jsonObj.getAsJsonObject("contentList"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `onPressed`
      if (jsonObj.get("onPressed") != null && !jsonObj.get("onPressed").isJsonNull()) {
        InfoPushDataClickable.validateJsonObject(jsonObj.getAsJsonObject("onPressed"));
      }
      if ((jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `article`
      if (jsonObj.get("article") != null && !jsonObj.get("article").isJsonNull()) {
        InfoPushDataArticle.validateJsonObject(jsonObj.getAsJsonObject("article"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InfoPushData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InfoPushData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InfoPushData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InfoPushData.class));

       return (TypeAdapter<T>) new TypeAdapter<InfoPushData>() {
           @Override
           public void write(JsonWriter out, InfoPushData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InfoPushData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InfoPushData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InfoPushData
  * @throws IOException if the JSON string is invalid with respect to InfoPushData
  */
  public static InfoPushData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InfoPushData.class);
  }

 /**
  * Convert an instance of InfoPushData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

