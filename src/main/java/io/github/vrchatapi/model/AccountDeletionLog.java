/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.5
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
 * AccountDeletionLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountDeletionLog {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = "Deletion requested";

  public static final String SERIALIZED_NAME_DELETION_SCHEDULED = "deletionScheduled";
  @SerializedName(SERIALIZED_NAME_DELETION_SCHEDULED)
  private OffsetDateTime deletionScheduled;

  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private OffsetDateTime dateTime;

  public AccountDeletionLog() {
  }

  public AccountDeletionLog message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Typically \&quot;Deletion requested\&quot; or \&quot;Deletion canceled\&quot;. Other messages like \&quot;Deletion completed\&quot; may exist, but are these are not possible to see as a regular user.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Deletion requested", value = "Typically \"Deletion requested\" or \"Deletion canceled\". Other messages like \"Deletion completed\" may exist, but are these are not possible to see as a regular user.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public AccountDeletionLog deletionScheduled(OffsetDateTime deletionScheduled) {
    
    this.deletionScheduled = deletionScheduled;
    return this;
  }

   /**
   * When the deletion is scheduled to happen, standard is 14 days after the request.
   * @return deletionScheduled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the deletion is scheduled to happen, standard is 14 days after the request.")

  public OffsetDateTime getDeletionScheduled() {
    return deletionScheduled;
  }


  public void setDeletionScheduled(OffsetDateTime deletionScheduled) {
    this.deletionScheduled = deletionScheduled;
  }


  public AccountDeletionLog dateTime(OffsetDateTime dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Date and time of the deletion request.
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the deletion request.")

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDeletionLog accountDeletionLog = (AccountDeletionLog) o;
    return Objects.equals(this.message, accountDeletionLog.message) &&
        Objects.equals(this.deletionScheduled, accountDeletionLog.deletionScheduled) &&
        Objects.equals(this.dateTime, accountDeletionLog.dateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, deletionScheduled, dateTime);
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
    sb.append("class AccountDeletionLog {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    deletionScheduled: ").append(toIndentedString(deletionScheduled)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("deletionScheduled");
    openapiFields.add("dateTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountDeletionLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountDeletionLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountDeletionLog is not found in the empty JSON string", AccountDeletionLog.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountDeletionLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountDeletionLog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountDeletionLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountDeletionLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountDeletionLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountDeletionLog.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountDeletionLog>() {
           @Override
           public void write(JsonWriter out, AccountDeletionLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountDeletionLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountDeletionLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountDeletionLog
  * @throws IOException if the JSON string is invalid with respect to AccountDeletionLog
  */
  public static AccountDeletionLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountDeletionLog.class);
  }

 /**
  * Convert an instance of AccountDeletionLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

