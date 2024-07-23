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
import java.math.BigDecimal;

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
 * CreateFileVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFileVersionRequest {
  public static final String SERIALIZED_NAME_SIGNATURE_MD5 = "signatureMd5";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_MD5)
  private String signatureMd5;

  public static final String SERIALIZED_NAME_SIGNATURE_SIZE_IN_BYTES = "signatureSizeInBytes";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_SIZE_IN_BYTES)
  private BigDecimal signatureSizeInBytes;

  public static final String SERIALIZED_NAME_FILE_MD5 = "fileMd5";
  @SerializedName(SERIALIZED_NAME_FILE_MD5)
  private String fileMd5;

  public static final String SERIALIZED_NAME_FILE_SIZE_IN_BYTES = "fileSizeInBytes";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE_IN_BYTES)
  private BigDecimal fileSizeInBytes;

  public CreateFileVersionRequest() {
  }

  public CreateFileVersionRequest signatureMd5(String signatureMd5) {
    
    this.signatureMd5 = signatureMd5;
    return this;
  }

   /**
   * Get signatureMd5
   * @return signatureMd5
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSignatureMd5() {
    return signatureMd5;
  }


  public void setSignatureMd5(String signatureMd5) {
    this.signatureMd5 = signatureMd5;
  }


  public CreateFileVersionRequest signatureSizeInBytes(BigDecimal signatureSizeInBytes) {
    
    this.signatureSizeInBytes = signatureSizeInBytes;
    return this;
  }

   /**
   * Get signatureSizeInBytes
   * @return signatureSizeInBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSignatureSizeInBytes() {
    return signatureSizeInBytes;
  }


  public void setSignatureSizeInBytes(BigDecimal signatureSizeInBytes) {
    this.signatureSizeInBytes = signatureSizeInBytes;
  }


  public CreateFileVersionRequest fileMd5(String fileMd5) {
    
    this.fileMd5 = fileMd5;
    return this;
  }

   /**
   * Get fileMd5
   * @return fileMd5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileMd5() {
    return fileMd5;
  }


  public void setFileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
  }


  public CreateFileVersionRequest fileSizeInBytes(BigDecimal fileSizeInBytes) {
    
    this.fileSizeInBytes = fileSizeInBytes;
    return this;
  }

   /**
   * Get fileSizeInBytes
   * @return fileSizeInBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFileSizeInBytes() {
    return fileSizeInBytes;
  }


  public void setFileSizeInBytes(BigDecimal fileSizeInBytes) {
    this.fileSizeInBytes = fileSizeInBytes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileVersionRequest createFileVersionRequest = (CreateFileVersionRequest) o;
    return Objects.equals(this.signatureMd5, createFileVersionRequest.signatureMd5) &&
        Objects.equals(this.signatureSizeInBytes, createFileVersionRequest.signatureSizeInBytes) &&
        Objects.equals(this.fileMd5, createFileVersionRequest.fileMd5) &&
        Objects.equals(this.fileSizeInBytes, createFileVersionRequest.fileSizeInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureMd5, signatureSizeInBytes, fileMd5, fileSizeInBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileVersionRequest {\n");
    sb.append("    signatureMd5: ").append(toIndentedString(signatureMd5)).append("\n");
    sb.append("    signatureSizeInBytes: ").append(toIndentedString(signatureSizeInBytes)).append("\n");
    sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
    sb.append("    fileSizeInBytes: ").append(toIndentedString(fileSizeInBytes)).append("\n");
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
    openapiFields.add("signatureMd5");
    openapiFields.add("signatureSizeInBytes");
    openapiFields.add("fileMd5");
    openapiFields.add("fileSizeInBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signatureMd5");
    openapiRequiredFields.add("signatureSizeInBytes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFileVersionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateFileVersionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFileVersionRequest is not found in the empty JSON string", CreateFileVersionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFileVersionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFileVersionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFileVersionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("signatureMd5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatureMd5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatureMd5").toString()));
      }
      if ((jsonObj.get("fileMd5") != null && !jsonObj.get("fileMd5").isJsonNull()) && !jsonObj.get("fileMd5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileMd5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileMd5").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFileVersionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFileVersionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFileVersionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFileVersionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFileVersionRequest>() {
           @Override
           public void write(JsonWriter out, CreateFileVersionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFileVersionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFileVersionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFileVersionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFileVersionRequest
  */
  public static CreateFileVersionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFileVersionRequest.class);
  }

 /**
  * Convert an instance of CreateFileVersionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

