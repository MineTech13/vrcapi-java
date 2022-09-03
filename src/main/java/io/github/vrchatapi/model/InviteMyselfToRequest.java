/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.7.3
 * Contact: me@ariesclark.com
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
 * InviteMyselfToRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteMyselfToRequest {
  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;


  public InviteMyselfToRequest shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Short Name of the Instance; can be retrieved from the Get Instance Short Name endpoint.
   * @return shortName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Short Name of the Instance; can be retrieved from the Get Instance Short Name endpoint.")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteMyselfToRequest inviteMyselfToRequest = (InviteMyselfToRequest) o;
    return Objects.equals(this.shortName, inviteMyselfToRequest.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteMyselfToRequest {\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

