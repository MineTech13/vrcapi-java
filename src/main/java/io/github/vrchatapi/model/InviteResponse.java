/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.6
 * Contact: me@ruby.js.org
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

/**
 * InviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteResponse {
  public static final String SERIALIZED_NAME_RESPONSE_SLOT = "responseSlot";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SLOT)
  private Integer responseSlot;


  public InviteResponse responseSlot(Integer responseSlot) {
    
    this.responseSlot = responseSlot;
    return this;
  }

   /**
   * Get responseSlot
   * minimum: 0
   * maximum: 11
   * @return responseSlot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getResponseSlot() {
    return responseSlot;
  }


  public void setResponseSlot(Integer responseSlot) {
    this.responseSlot = responseSlot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteResponse inviteResponse = (InviteResponse) o;
    return Objects.equals(this.responseSlot, inviteResponse.responseSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseSlot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteResponse {\n");
    sb.append("    responseSlot: ").append(toIndentedString(responseSlot)).append("\n");
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

