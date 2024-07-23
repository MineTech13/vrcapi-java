/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: dev003
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
import io.github.vrchatapi.model.TransactionSteamWalletInfo;
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
public class TransactionSteamInfo {
  public static final String SERIALIZED_NAME_WALLET_INFO = "walletInfo";
  @SerializedName(SERIALIZED_NAME_WALLET_INFO)
  private TransactionSteamWalletInfo walletInfo;

  public static final String SERIALIZED_NAME_STEAM_ID = "steamId";
  @SerializedName(SERIALIZED_NAME_STEAM_ID)
  private String steamId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_STEAM_URL = "steamUrl";
  @SerializedName(SERIALIZED_NAME_STEAM_URL)
  private String steamUrl;

  public static final String SERIALIZED_NAME_TRANS_ID = "transId";
  @SerializedName(SERIALIZED_NAME_TRANS_ID)
  private String transId;

  public TransactionSteamInfo() {
  }

  public TransactionSteamInfo walletInfo(TransactionSteamWalletInfo walletInfo) {
    
    this.walletInfo = walletInfo;
    return this;
  }

   /**
   * Get walletInfo
   * @return walletInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransactionSteamWalletInfo getWalletInfo() {
    return walletInfo;
  }


  public void setWalletInfo(TransactionSteamWalletInfo walletInfo) {
    this.walletInfo = walletInfo;
  }


  public TransactionSteamInfo steamId(String steamId) {
    
    this.steamId = steamId;
    return this;
  }

   /**
   * Steam User ID
   * @return steamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Steam User ID")

  public String getSteamId() {
    return steamId;
  }


  public void setSteamId(String steamId) {
    this.steamId = steamId;
  }


  public TransactionSteamInfo orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Steam Order ID
   * @return orderId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Steam Order ID")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public TransactionSteamInfo steamUrl(String steamUrl) {
    
    this.steamUrl = steamUrl;
    return this;
  }

   /**
   * Empty
   * @return steamUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Empty")

  public String getSteamUrl() {
    return steamUrl;
  }


  public void setSteamUrl(String steamUrl) {
    this.steamUrl = steamUrl;
  }


  public TransactionSteamInfo transId(String transId) {
    
    this.transId = transId;
    return this;
  }

   /**
   * Steam Transaction ID, NOT the same as VRChat TransactionID
   * @return transId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Steam Transaction ID, NOT the same as VRChat TransactionID")

  public String getTransId() {
    return transId;
  }


  public void setTransId(String transId) {
    this.transId = transId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSteamInfo transactionSteamInfo = (TransactionSteamInfo) o;
    return Objects.equals(this.walletInfo, transactionSteamInfo.walletInfo) &&
        Objects.equals(this.steamId, transactionSteamInfo.steamId) &&
        Objects.equals(this.orderId, transactionSteamInfo.orderId) &&
        Objects.equals(this.steamUrl, transactionSteamInfo.steamUrl) &&
        Objects.equals(this.transId, transactionSteamInfo.transId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletInfo, steamId, orderId, steamUrl, transId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSteamInfo {\n");
    sb.append("    walletInfo: ").append(toIndentedString(walletInfo)).append("\n");
    sb.append("    steamId: ").append(toIndentedString(steamId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    steamUrl: ").append(toIndentedString(steamUrl)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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
    openapiFields.add("walletInfo");
    openapiFields.add("steamId");
    openapiFields.add("orderId");
    openapiFields.add("steamUrl");
    openapiFields.add("transId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("walletInfo");
    openapiRequiredFields.add("steamId");
    openapiRequiredFields.add("orderId");
    openapiRequiredFields.add("steamUrl");
    openapiRequiredFields.add("transId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionSteamInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionSteamInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionSteamInfo is not found in the empty JSON string", TransactionSteamInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionSteamInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionSteamInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionSteamInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `walletInfo`
      TransactionSteamWalletInfo.validateJsonObject(jsonObj.getAsJsonObject("walletInfo"));
      if (!jsonObj.get("steamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `steamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("steamId").toString()));
      }
      if (!jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if (!jsonObj.get("steamUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `steamUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("steamUrl").toString()));
      }
      if (!jsonObj.get("transId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionSteamInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionSteamInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionSteamInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionSteamInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionSteamInfo>() {
           @Override
           public void write(JsonWriter out, TransactionSteamInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionSteamInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionSteamInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionSteamInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionSteamInfo
  */
  public static TransactionSteamInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionSteamInfo.class);
  }

 /**
  * Convert an instance of TransactionSteamInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

