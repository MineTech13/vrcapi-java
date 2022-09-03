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
 * **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead.
 * @deprecated
 */
@Deprecated
@ApiModel(description = "**Deprecation:** `Object` has unknown usage/fields, and is always empty. Use normal `Url` field instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvatarUnityPackageUrlObject {
  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL = "unityPackageUrl";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL)
  private String unityPackageUrl;


  public AvatarUnityPackageUrlObject unityPackageUrl(String unityPackageUrl) {
    
    this.unityPackageUrl = unityPackageUrl;
    return this;
  }

   /**
   * Get unityPackageUrl
   * @return unityPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnityPackageUrl() {
    return unityPackageUrl;
  }


  public void setUnityPackageUrl(String unityPackageUrl) {
    this.unityPackageUrl = unityPackageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarUnityPackageUrlObject avatarUnityPackageUrlObject = (AvatarUnityPackageUrlObject) o;
    return Objects.equals(this.unityPackageUrl, avatarUnityPackageUrlObject.unityPackageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unityPackageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarUnityPackageUrlObject {\n");
    sb.append("    unityPackageUrl: ").append(toIndentedString(unityPackageUrl)).append("\n");
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

