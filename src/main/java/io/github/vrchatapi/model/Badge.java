/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.1
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Badge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Badge {
  public static final String SERIALIZED_NAME_ASSIGNED_AT = "assignedAt";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_AT)
  private OffsetDateTime assignedAt;

  public static final String SERIALIZED_NAME_BADGE_DESCRIPTION = "badgeDescription";
  @SerializedName(SERIALIZED_NAME_BADGE_DESCRIPTION)
  private String badgeDescription;

  public static final String SERIALIZED_NAME_BADGE_ID = "badgeId";
  @SerializedName(SERIALIZED_NAME_BADGE_ID)
  private String badgeId;

  public static final String SERIALIZED_NAME_BADGE_IMAGE_URL = "badgeImageUrl";
  @SerializedName(SERIALIZED_NAME_BADGE_IMAGE_URL)
  private String badgeImageUrl;

  public static final String SERIALIZED_NAME_BADGE_NAME = "badgeName";
  @SerializedName(SERIALIZED_NAME_BADGE_NAME)
  private String badgeName;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_SHOWCASED = "showcased";
  @SerializedName(SERIALIZED_NAME_SHOWCASED)
  private Boolean showcased;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Badge() {
  }

  public Badge assignedAt(OffsetDateTime assignedAt) {
    
    this.assignedAt = assignedAt;
    return this;
  }

   /**
   * only present in CurrentUser badges
   * @return assignedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present in CurrentUser badges")

  public OffsetDateTime getAssignedAt() {
    return assignedAt;
  }


  public void setAssignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = assignedAt;
  }


  public Badge badgeDescription(String badgeDescription) {
    
    this.badgeDescription = badgeDescription;
    return this;
  }

   /**
   * Get badgeDescription
   * @return badgeDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBadgeDescription() {
    return badgeDescription;
  }


  public void setBadgeDescription(String badgeDescription) {
    this.badgeDescription = badgeDescription;
  }


  public Badge badgeId(String badgeId) {
    
    this.badgeId = badgeId;
    return this;
  }

   /**
   * Get badgeId
   * @return badgeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bdg_a60e514a-8cb7-4702-8f24-2786992be1a8", required = true, value = "")

  public String getBadgeId() {
    return badgeId;
  }


  public void setBadgeId(String badgeId) {
    this.badgeId = badgeId;
  }


  public Badge badgeImageUrl(String badgeImageUrl) {
    
    this.badgeImageUrl = badgeImageUrl;
    return this;
  }

   /**
   * direct url to image
   * @return badgeImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "direct url to image")

  public String getBadgeImageUrl() {
    return badgeImageUrl;
  }


  public void setBadgeImageUrl(String badgeImageUrl) {
    this.badgeImageUrl = badgeImageUrl;
  }


  public Badge badgeName(String badgeName) {
    
    this.badgeName = badgeName;
    return this;
  }

   /**
   * Get badgeName
   * @return badgeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBadgeName() {
    return badgeName;
  }


  public void setBadgeName(String badgeName) {
    this.badgeName = badgeName;
  }


  public Badge hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * only present in CurrentUser badges
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present in CurrentUser badges")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public Badge showcased(Boolean showcased) {
    
    this.showcased = showcased;
    return this;
  }

   /**
   * Get showcased
   * @return showcased
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getShowcased() {
    return showcased;
  }


  public void setShowcased(Boolean showcased) {
    this.showcased = showcased;
  }


  public Badge updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * only present in CurrentUser badges
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present in CurrentUser badges")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Badge badge = (Badge) o;
    return Objects.equals(this.assignedAt, badge.assignedAt) &&
        Objects.equals(this.badgeDescription, badge.badgeDescription) &&
        Objects.equals(this.badgeId, badge.badgeId) &&
        Objects.equals(this.badgeImageUrl, badge.badgeImageUrl) &&
        Objects.equals(this.badgeName, badge.badgeName) &&
        Objects.equals(this.hidden, badge.hidden) &&
        Objects.equals(this.showcased, badge.showcased) &&
        Objects.equals(this.updatedAt, badge.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedAt, badgeDescription, badgeId, badgeImageUrl, badgeName, hidden, showcased, updatedAt);
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
    sb.append("class Badge {\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    badgeDescription: ").append(toIndentedString(badgeDescription)).append("\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
    sb.append("    badgeImageUrl: ").append(toIndentedString(badgeImageUrl)).append("\n");
    sb.append("    badgeName: ").append(toIndentedString(badgeName)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    showcased: ").append(toIndentedString(showcased)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("assignedAt");
    openapiFields.add("badgeDescription");
    openapiFields.add("badgeId");
    openapiFields.add("badgeImageUrl");
    openapiFields.add("badgeName");
    openapiFields.add("hidden");
    openapiFields.add("showcased");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("badgeDescription");
    openapiRequiredFields.add("badgeId");
    openapiRequiredFields.add("badgeImageUrl");
    openapiRequiredFields.add("badgeName");
    openapiRequiredFields.add("showcased");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Badge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Badge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Badge is not found in the empty JSON string", Badge.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Badge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Badge` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Badge.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("badgeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badgeDescription").toString()));
      }
      if (!jsonObj.get("badgeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badgeId").toString()));
      }
      if (!jsonObj.get("badgeImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badgeImageUrl").toString()));
      }
      if (!jsonObj.get("badgeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `badgeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("badgeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Badge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Badge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Badge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Badge.class));

       return (TypeAdapter<T>) new TypeAdapter<Badge>() {
           @Override
           public void write(JsonWriter out, Badge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Badge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Badge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Badge
  * @throws IOException if the JSON string is invalid with respect to Badge
  */
  public static Badge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Badge.class);
  }

 /**
  * Convert an instance of Badge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

