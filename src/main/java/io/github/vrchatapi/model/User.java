/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.3
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
import io.github.vrchatapi.model.DeveloperType;
import io.github.vrchatapi.model.UserState;
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_ALLOW_AVATAR_COPYING = "allowAvatarCopying";
  @SerializedName(SERIALIZED_NAME_ALLOW_AVATAR_COPYING)
  private Boolean allowAvatarCopying = true;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_BIO_LINKS = "bioLinks";
  @SerializedName(SERIALIZED_NAME_BIO_LINKS)
  private List<String> bioLinks = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL = "currentAvatarImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL)
  private String currentAvatarImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL = "currentAvatarThumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL)
  private String currentAvatarThumbnailImageUrl;

  public static final String SERIALIZED_NAME_DATE_JOINED = "date_joined";
  @SerializedName(SERIALIZED_NAME_DATE_JOINED)
  private LocalDate dateJoined;

  public static final String SERIALIZED_NAME_DEVELOPER_TYPE = "developerType";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_TYPE)
  private DeveloperType developerType = DeveloperType.NONE;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FRIEND_KEY = "friendKey";
  @SerializedName(SERIALIZED_NAME_FRIEND_KEY)
  private String friendKey;

  public static final String SERIALIZED_NAME_FRIEND_REQUEST_STATUS = "friendRequestStatus";
  @SerializedName(SERIALIZED_NAME_FRIEND_REQUEST_STATUS)
  private String friendRequestStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_IS_FRIEND = "isFriend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private Boolean isFriend;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "last_activity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private String lastActivity;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private String lastLogin;

  public static final String SERIALIZED_NAME_LAST_PLATFORM = "last_platform";
  @SerializedName(SERIALIZED_NAME_LAST_PLATFORM)
  private String lastPlatform;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PROFILE_PIC_OVERRIDE = "profilePicOverride";
  @SerializedName(SERIALIZED_NAME_PROFILE_PIC_OVERRIDE)
  private String profilePicOverride;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UserState state = UserState.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatus status = UserStatus.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRAVELING_TO_INSTANCE = "travelingToInstance";
  @SerializedName(SERIALIZED_NAME_TRAVELING_TO_INSTANCE)
  private String travelingToInstance;

  public static final String SERIALIZED_NAME_TRAVELING_TO_LOCATION = "travelingToLocation";
  @SerializedName(SERIALIZED_NAME_TRAVELING_TO_LOCATION)
  private String travelingToLocation;

  public static final String SERIALIZED_NAME_TRAVELING_TO_WORLD = "travelingToWorld";
  @SerializedName(SERIALIZED_NAME_TRAVELING_TO_WORLD)
  private String travelingToWorld;

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;

  public User() {
  }

  public User allowAvatarCopying(Boolean allowAvatarCopying) {
    
    this.allowAvatarCopying = allowAvatarCopying;
    return this;
  }

   /**
   * Get allowAvatarCopying
   * @return allowAvatarCopying
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAllowAvatarCopying() {
    return allowAvatarCopying;
  }


  public void setAllowAvatarCopying(Boolean allowAvatarCopying) {
    this.allowAvatarCopying = allowAvatarCopying;
  }


  public User bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public User bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public User addBioLinksItem(String bioLinksItem) {
    this.bioLinks.add(bioLinksItem);
    return this;
  }

   /**
   * Get bioLinks
   * @return bioLinks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getBioLinks() {
    return bioLinks;
  }


  public void setBioLinks(List<String> bioLinks) {
    this.bioLinks = bioLinks;
  }


  public User currentAvatarImageUrl(String currentAvatarImageUrl) {
    
    this.currentAvatarImageUrl = currentAvatarImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/file/file_ae46d521-7281-4b38-b365-804b32a1d6a7/1/file", required = true, value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarImageUrl() {
    return currentAvatarImageUrl;
  }


  public void setCurrentAvatarImageUrl(String currentAvatarImageUrl) {
    this.currentAvatarImageUrl = currentAvatarImageUrl;
  }


  public User currentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarThumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/image/file_aae83ed9-d42d-4d72-9f4b-9f1e41ed17e1/1/256", required = true, value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarThumbnailImageUrl() {
    return currentAvatarThumbnailImageUrl;
  }


  public void setCurrentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
  }


  public User dateJoined(LocalDate dateJoined) {
    
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getDateJoined() {
    return dateJoined;
  }


  public void setDateJoined(LocalDate dateJoined) {
    this.dateJoined = dateJoined;
  }


  public User developerType(DeveloperType developerType) {
    
    this.developerType = developerType;
    return this;
  }

   /**
   * Get developerType
   * @return developerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DeveloperType getDeveloperType() {
    return developerType;
  }


  public void setDeveloperType(DeveloperType developerType) {
    this.developerType = developerType;
  }


  public User displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A users visual display name. This is what shows up in-game, and can different from their &#x60;username&#x60;. Changing display name is restricted to a cooldown period.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A users visual display name. This is what shows up in-game, and can different from their `username`. Changing display name is restricted to a cooldown period.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public User friendKey(String friendKey) {
    
    this.friendKey = friendKey;
    return this;
  }

   /**
   * Get friendKey
   * @return friendKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFriendKey() {
    return friendKey;
  }


  public void setFriendKey(String friendKey) {
    this.friendKey = friendKey;
  }


  public User friendRequestStatus(String friendRequestStatus) {
    
    this.friendRequestStatus = friendRequestStatus;
    return this;
  }

   /**
   * Get friendRequestStatus
   * @return friendRequestStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendRequestStatus() {
    return friendRequestStatus;
  }


  public void setFriendRequestStatus(String friendRequestStatus) {
    this.friendRequestStatus = friendRequestStatus;
  }


  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User instanceId(String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance.
   * @return instanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345~hidden(usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469)~region(eu)~nonce(27e8414a-59a0-4f3d-af1f-f27557eb49a2)", value = "InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.")

  public String getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public User isFriend(Boolean isFriend) {
    
    this.isFriend = isFriend;
    return this;
  }

   /**
   * Either their &#x60;friendKey&#x60;, or empty string if you are not friends. Unknown usage.
   * @return isFriend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either their `friendKey`, or empty string if you are not friends. Unknown usage.")

  public Boolean getIsFriend() {
    return isFriend;
  }


  public void setIsFriend(Boolean isFriend) {
    this.isFriend = isFriend;
  }


  public User lastActivity(String lastActivity) {
    
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Either a date-time or empty string.
   * @return lastActivity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either a date-time or empty string.")

  public String getLastActivity() {
    return lastActivity;
  }


  public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
  }


  public User lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Either a date-time or empty string.
   * @return lastLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either a date-time or empty string.")

  public String getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public User lastPlatform(String lastPlatform) {
    
    this.lastPlatform = lastPlatform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return lastPlatform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standalonewindows", required = true, value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getLastPlatform() {
    return lastPlatform;
  }


  public void setLastPlatform(String lastPlatform) {
    this.lastPlatform = lastPlatform;
  }


  public User location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public User note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public User profilePicOverride(String profilePicOverride) {
    
    this.profilePicOverride = profilePicOverride;
    return this;
  }

   /**
   * Get profilePicOverride
   * @return profilePicOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProfilePicOverride() {
    return profilePicOverride;
  }


  public void setProfilePicOverride(String profilePicOverride) {
    this.profilePicOverride = profilePicOverride;
  }


  public User state(UserState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserState getState() {
    return state;
  }


  public void setState(UserState state) {
    this.state = state;
  }


  public User status(UserStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserStatus getStatus() {
    return status;
  }


  public void setStatus(UserStatus status) {
    this.status = status;
  }


  public User statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public User tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public User addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public User travelingToInstance(String travelingToInstance) {
    
    this.travelingToInstance = travelingToInstance;
    return this;
  }

   /**
   * Get travelingToInstance
   * @return travelingToInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelingToInstance() {
    return travelingToInstance;
  }


  public void setTravelingToInstance(String travelingToInstance) {
    this.travelingToInstance = travelingToInstance;
  }


  public User travelingToLocation(String travelingToLocation) {
    
    this.travelingToLocation = travelingToLocation;
    return this;
  }

   /**
   * Get travelingToLocation
   * @return travelingToLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelingToLocation() {
    return travelingToLocation;
  }


  public void setTravelingToLocation(String travelingToLocation) {
    this.travelingToLocation = travelingToLocation;
  }


  public User travelingToWorld(String travelingToWorld) {
    
    this.travelingToWorld = travelingToWorld;
    return this;
  }

   /**
   * Get travelingToWorld
   * @return travelingToWorld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelingToWorld() {
    return travelingToWorld;
  }


  public void setTravelingToWorld(String travelingToWorld) {
    this.travelingToWorld = travelingToWorld;
  }


  public User userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * Get userIcon
   * @return userIcon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }


  public User username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * -| A users unique name, used during login. This is different from &#x60;displayName&#x60; which is what shows up in-game. A users &#x60;username&#x60; can never be changed.&#39; **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).
   * @return username
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "-| A users unique name, used during login. This is different from `displayName` which is what shows up in-game. A users `username` can never be changed.' **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429).")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public User worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return worldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.allowAvatarCopying, user.allowAvatarCopying) &&
        Objects.equals(this.bio, user.bio) &&
        Objects.equals(this.bioLinks, user.bioLinks) &&
        Objects.equals(this.currentAvatarImageUrl, user.currentAvatarImageUrl) &&
        Objects.equals(this.currentAvatarThumbnailImageUrl, user.currentAvatarThumbnailImageUrl) &&
        Objects.equals(this.dateJoined, user.dateJoined) &&
        Objects.equals(this.developerType, user.developerType) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.friendKey, user.friendKey) &&
        Objects.equals(this.friendRequestStatus, user.friendRequestStatus) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.instanceId, user.instanceId) &&
        Objects.equals(this.isFriend, user.isFriend) &&
        Objects.equals(this.lastActivity, user.lastActivity) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.lastPlatform, user.lastPlatform) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.note, user.note) &&
        Objects.equals(this.profilePicOverride, user.profilePicOverride) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.statusDescription, user.statusDescription) &&
        Objects.equals(this.tags, user.tags) &&
        Objects.equals(this.travelingToInstance, user.travelingToInstance) &&
        Objects.equals(this.travelingToLocation, user.travelingToLocation) &&
        Objects.equals(this.travelingToWorld, user.travelingToWorld) &&
        Objects.equals(this.userIcon, user.userIcon) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.worldId, user.worldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAvatarCopying, bio, bioLinks, currentAvatarImageUrl, currentAvatarThumbnailImageUrl, dateJoined, developerType, displayName, friendKey, friendRequestStatus, id, instanceId, isFriend, lastActivity, lastLogin, lastPlatform, location, note, profilePicOverride, state, status, statusDescription, tags, travelingToInstance, travelingToLocation, travelingToWorld, userIcon, username, worldId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    allowAvatarCopying: ").append(toIndentedString(allowAvatarCopying)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    currentAvatarImageUrl: ").append(toIndentedString(currentAvatarImageUrl)).append("\n");
    sb.append("    currentAvatarThumbnailImageUrl: ").append(toIndentedString(currentAvatarThumbnailImageUrl)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    developerType: ").append(toIndentedString(developerType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    friendKey: ").append(toIndentedString(friendKey)).append("\n");
    sb.append("    friendRequestStatus: ").append(toIndentedString(friendRequestStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastPlatform: ").append(toIndentedString(lastPlatform)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    travelingToInstance: ").append(toIndentedString(travelingToInstance)).append("\n");
    sb.append("    travelingToLocation: ").append(toIndentedString(travelingToLocation)).append("\n");
    sb.append("    travelingToWorld: ").append(toIndentedString(travelingToWorld)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
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
    openapiFields.add("allowAvatarCopying");
    openapiFields.add("bio");
    openapiFields.add("bioLinks");
    openapiFields.add("currentAvatarImageUrl");
    openapiFields.add("currentAvatarThumbnailImageUrl");
    openapiFields.add("date_joined");
    openapiFields.add("developerType");
    openapiFields.add("displayName");
    openapiFields.add("friendKey");
    openapiFields.add("friendRequestStatus");
    openapiFields.add("id");
    openapiFields.add("instanceId");
    openapiFields.add("isFriend");
    openapiFields.add("last_activity");
    openapiFields.add("last_login");
    openapiFields.add("last_platform");
    openapiFields.add("location");
    openapiFields.add("note");
    openapiFields.add("profilePicOverride");
    openapiFields.add("state");
    openapiFields.add("status");
    openapiFields.add("statusDescription");
    openapiFields.add("tags");
    openapiFields.add("travelingToInstance");
    openapiFields.add("travelingToLocation");
    openapiFields.add("travelingToWorld");
    openapiFields.add("userIcon");
    openapiFields.add("username");
    openapiFields.add("worldId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allowAvatarCopying");
    openapiRequiredFields.add("bio");
    openapiRequiredFields.add("bioLinks");
    openapiRequiredFields.add("currentAvatarImageUrl");
    openapiRequiredFields.add("currentAvatarThumbnailImageUrl");
    openapiRequiredFields.add("date_joined");
    openapiRequiredFields.add("developerType");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("friendKey");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isFriend");
    openapiRequiredFields.add("last_activity");
    openapiRequiredFields.add("last_login");
    openapiRequiredFields.add("last_platform");
    openapiRequiredFields.add("profilePicOverride");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("statusDescription");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("userIcon");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to User
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("bio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bio").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("bioLinks") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("bioLinks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bioLinks` to be an array in the JSON string but got `%s`", jsonObj.get("bioLinks").toString()));
      }
      if (!jsonObj.get("currentAvatarImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentAvatarImageUrl").toString()));
      }
      if (!jsonObj.get("currentAvatarThumbnailImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarThumbnailImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentAvatarThumbnailImageUrl").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("friendKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendKey").toString()));
      }
      if ((jsonObj.get("friendRequestStatus") != null && !jsonObj.get("friendRequestStatus").isJsonNull()) && !jsonObj.get("friendRequestStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendRequestStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendRequestStatus").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("instanceId") != null && !jsonObj.get("instanceId").isJsonNull()) && !jsonObj.get("instanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceId").toString()));
      }
      if (!jsonObj.get("last_activity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_activity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_activity").toString()));
      }
      if (!jsonObj.get("last_login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_login").toString()));
      }
      if (!jsonObj.get("last_platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_platform").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("profilePicOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profilePicOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profilePicOverride").toString()));
      }
      if (!jsonObj.get("statusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDescription").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("travelingToInstance") != null && !jsonObj.get("travelingToInstance").isJsonNull()) && !jsonObj.get("travelingToInstance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelingToInstance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelingToInstance").toString()));
      }
      if ((jsonObj.get("travelingToLocation") != null && !jsonObj.get("travelingToLocation").isJsonNull()) && !jsonObj.get("travelingToLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelingToLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelingToLocation").toString()));
      }
      if ((jsonObj.get("travelingToWorld") != null && !jsonObj.get("travelingToWorld").isJsonNull()) && !jsonObj.get("travelingToWorld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelingToWorld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelingToWorld").toString()));
      }
      if (!jsonObj.get("userIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIcon").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("worldId") != null && !jsonObj.get("worldId").isJsonNull()) && !jsonObj.get("worldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worldId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

