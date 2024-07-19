/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.6
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
import io.github.vrchatapi.model.GroupJoinState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * UpdateGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGroupRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_CODE = "shortCode";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JOIN_STATE = "joinState";
  @SerializedName(SERIALIZED_NAME_JOIN_STATE)
  private GroupJoinState joinState = GroupJoinState.OPEN;

  public static final String SERIALIZED_NAME_ICON_ID = "iconId";
  @SerializedName(SERIALIZED_NAME_ICON_ID)
  private String iconId;

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private String bannerId;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private String rules;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public UpdateGroupRequest() {
  }

  public UpdateGroupRequest name(String name) {
    
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


  public UpdateGroupRequest shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public UpdateGroupRequest description(String description) {
    
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


  public UpdateGroupRequest joinState(GroupJoinState joinState) {
    
    this.joinState = joinState;
    return this;
  }

   /**
   * Get joinState
   * @return joinState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupJoinState getJoinState() {
    return joinState;
  }


  public void setJoinState(GroupJoinState joinState) {
    this.joinState = joinState;
  }


  public UpdateGroupRequest iconId(String iconId) {
    
    this.iconId = iconId;
    return this;
  }

   /**
   * Get iconId
   * @return iconId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconId() {
    return iconId;
  }


  public void setIconId(String iconId) {
    this.iconId = iconId;
  }


  public UpdateGroupRequest bannerId(String bannerId) {
    
    this.bannerId = bannerId;
    return this;
  }

   /**
   * Get bannerId
   * @return bannerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBannerId() {
    return bannerId;
  }


  public void setBannerId(String bannerId) {
    this.bannerId = bannerId;
  }


  public UpdateGroupRequest languages(List<String> languages) {
    
    this.languages = languages;
    return this;
  }

  public UpdateGroupRequest addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * 3 letter language code
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "3 letter language code")

  public List<String> getLanguages() {
    return languages;
  }


  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  public UpdateGroupRequest links(List<String> links) {
    
    this.links = links;
    return this;
  }

  public UpdateGroupRequest addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLinks() {
    return links;
  }


  public void setLinks(List<String> links) {
    this.links = links;
  }


  public UpdateGroupRequest rules(String rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRules() {
    return rules;
  }


  public void setRules(String rules) {
    this.rules = rules;
  }


  public UpdateGroupRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateGroupRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    return Objects.equals(this.name, updateGroupRequest.name) &&
        Objects.equals(this.shortCode, updateGroupRequest.shortCode) &&
        Objects.equals(this.description, updateGroupRequest.description) &&
        Objects.equals(this.joinState, updateGroupRequest.joinState) &&
        Objects.equals(this.iconId, updateGroupRequest.iconId) &&
        Objects.equals(this.bannerId, updateGroupRequest.bannerId) &&
        Objects.equals(this.languages, updateGroupRequest.languages) &&
        Objects.equals(this.links, updateGroupRequest.links) &&
        Objects.equals(this.rules, updateGroupRequest.rules) &&
        Objects.equals(this.tags, updateGroupRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortCode, description, joinState, iconId, bannerId, languages, links, rules, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    joinState: ").append(toIndentedString(joinState)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("shortCode");
    openapiFields.add("description");
    openapiFields.add("joinState");
    openapiFields.add("iconId");
    openapiFields.add("bannerId");
    openapiFields.add("languages");
    openapiFields.add("links");
    openapiFields.add("rules");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGroupRequest is not found in the empty JSON string", UpdateGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGroupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("shortCode") != null && !jsonObj.get("shortCode").isJsonNull()) && !jsonObj.get("shortCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("iconId") != null && !jsonObj.get("iconId").isJsonNull()) && !jsonObj.get("iconId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconId").toString()));
      }
      if ((jsonObj.get("bannerId") != null && !jsonObj.get("bannerId").isJsonNull()) && !jsonObj.get("bannerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("languages") != null && !jsonObj.get("languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languages` to be an array in the JSON string but got `%s`", jsonObj.get("languages").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if ((jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) && !jsonObj.get("rules").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGroupRequest>() {
           @Override
           public void write(JsonWriter out, UpdateGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGroupRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGroupRequest
  */
  public static UpdateGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGroupRequest.class);
  }

 /**
  * Convert an instance of UpdateGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

