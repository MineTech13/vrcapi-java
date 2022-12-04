/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.9.1
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
import io.github.vrchatapi.model.GroupJoinState;
import io.github.vrchatapi.model.GroupPrivacy;
import io.github.vrchatapi.model.GroupRoleTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupRequest {
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
  private String iconId = "null";

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private String bannerId = "null";

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private GroupPrivacy privacy = GroupPrivacy.DEFAULT;

  public static final String SERIALIZED_NAME_ROLE_TEMPLATE = "roleTemplate";
  @SerializedName(SERIALIZED_NAME_ROLE_TEMPLATE)
  private GroupRoleTemplate roleTemplate = GroupRoleTemplate.DEFAULT;


  public CreateGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGroupRequest shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public CreateGroupRequest description(String description) {
    
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


  public CreateGroupRequest joinState(GroupJoinState joinState) {
    
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


  public CreateGroupRequest iconId(String iconId) {
    
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


  public CreateGroupRequest bannerId(String bannerId) {
    
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


  public CreateGroupRequest privacy(GroupPrivacy privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupPrivacy getPrivacy() {
    return privacy;
  }


  public void setPrivacy(GroupPrivacy privacy) {
    this.privacy = privacy;
  }


  public CreateGroupRequest roleTemplate(GroupRoleTemplate roleTemplate) {
    
    this.roleTemplate = roleTemplate;
    return this;
  }

   /**
   * Get roleTemplate
   * @return roleTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupRoleTemplate getRoleTemplate() {
    return roleTemplate;
  }


  public void setRoleTemplate(GroupRoleTemplate roleTemplate) {
    this.roleTemplate = roleTemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.name, createGroupRequest.name) &&
        Objects.equals(this.shortCode, createGroupRequest.shortCode) &&
        Objects.equals(this.description, createGroupRequest.description) &&
        Objects.equals(this.joinState, createGroupRequest.joinState) &&
        Objects.equals(this.iconId, createGroupRequest.iconId) &&
        Objects.equals(this.bannerId, createGroupRequest.bannerId) &&
        Objects.equals(this.privacy, createGroupRequest.privacy) &&
        Objects.equals(this.roleTemplate, createGroupRequest.roleTemplate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortCode, description, joinState, iconId, bannerId, privacy, roleTemplate);
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
    sb.append("class CreateGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    joinState: ").append(toIndentedString(joinState)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    roleTemplate: ").append(toIndentedString(roleTemplate)).append("\n");
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

