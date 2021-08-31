/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.1.2
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
import io.github.vrchatapi.model.LimitedUnityPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * LimitedWorld
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LimitedWorld {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private BigDecimal capacity;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private String releaseStatus;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private BigDecimal favorites;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public static final String SERIALIZED_NAME_LABS_PUBLICATION_DATE = "labsPublicationDate";
  @SerializedName(SERIALIZED_NAME_LABS_PUBLICATION_DATE)
  private String labsPublicationDate;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private List<LimitedUnityPackage> unityPackages = new ArrayList<LimitedUnityPackage>();

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private BigDecimal popularity;

  public static final String SERIALIZED_NAME_HEAT = "heat";
  @SerializedName(SERIALIZED_NAME_HEAT)
  private BigDecimal heat;

  public static final String SERIALIZED_NAME_OCCUPANTS = "occupants";
  @SerializedName(SERIALIZED_NAME_OCCUPANTS)
  private BigDecimal occupants;


  public LimitedWorld id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LimitedWorld name(String name) {
    
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


  public LimitedWorld authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public LimitedWorld authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public LimitedWorld capacity(BigDecimal capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getCapacity() {
    return capacity;
  }


  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }


  public LimitedWorld imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public LimitedWorld thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public LimitedWorld releaseStatus(String releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(String releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public LimitedWorld organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public LimitedWorld tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public LimitedWorld addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public LimitedWorld favorites(BigDecimal favorites) {
    
    this.favorites = favorites;
    return this;
  }

   /**
   * Get favorites
   * @return favorites
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFavorites() {
    return favorites;
  }


  public void setFavorites(BigDecimal favorites) {
    this.favorites = favorites;
  }


  public LimitedWorld createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LimitedWorld updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPublicationDate() {
    return publicationDate;
  }




  public LimitedWorld labsPublicationDate(String labsPublicationDate) {
    
    this.labsPublicationDate = labsPublicationDate;
    return this;
  }

   /**
   * Get labsPublicationDate
   * @return labsPublicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLabsPublicationDate() {
    return labsPublicationDate;
  }


  public void setLabsPublicationDate(String labsPublicationDate) {
    this.labsPublicationDate = labsPublicationDate;
  }


  public LimitedWorld unityPackages(List<LimitedUnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public LimitedWorld addUnityPackagesItem(LimitedUnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   * Get unityPackages
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<LimitedUnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(List<LimitedUnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public LimitedWorld popularity(BigDecimal popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPopularity() {
    return popularity;
  }


  public void setPopularity(BigDecimal popularity) {
    this.popularity = popularity;
  }


  public LimitedWorld heat(BigDecimal heat) {
    
    this.heat = heat;
    return this;
  }

   /**
   * Get heat
   * @return heat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getHeat() {
    return heat;
  }


  public void setHeat(BigDecimal heat) {
    this.heat = heat;
  }


  public LimitedWorld occupants(BigDecimal occupants) {
    
    this.occupants = occupants;
    return this;
  }

   /**
   * Get occupants
   * @return occupants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getOccupants() {
    return occupants;
  }


  public void setOccupants(BigDecimal occupants) {
    this.occupants = occupants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedWorld limitedWorld = (LimitedWorld) o;
    return Objects.equals(this.id, limitedWorld.id) &&
        Objects.equals(this.name, limitedWorld.name) &&
        Objects.equals(this.authorId, limitedWorld.authorId) &&
        Objects.equals(this.authorName, limitedWorld.authorName) &&
        Objects.equals(this.capacity, limitedWorld.capacity) &&
        Objects.equals(this.imageUrl, limitedWorld.imageUrl) &&
        Objects.equals(this.thumbnailImageUrl, limitedWorld.thumbnailImageUrl) &&
        Objects.equals(this.releaseStatus, limitedWorld.releaseStatus) &&
        Objects.equals(this.organization, limitedWorld.organization) &&
        Objects.equals(this.tags, limitedWorld.tags) &&
        Objects.equals(this.favorites, limitedWorld.favorites) &&
        Objects.equals(this.createdAt, limitedWorld.createdAt) &&
        Objects.equals(this.updatedAt, limitedWorld.updatedAt) &&
        Objects.equals(this.publicationDate, limitedWorld.publicationDate) &&
        Objects.equals(this.labsPublicationDate, limitedWorld.labsPublicationDate) &&
        Objects.equals(this.unityPackages, limitedWorld.unityPackages) &&
        Objects.equals(this.popularity, limitedWorld.popularity) &&
        Objects.equals(this.heat, limitedWorld.heat) &&
        Objects.equals(this.occupants, limitedWorld.occupants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, authorId, authorName, capacity, imageUrl, thumbnailImageUrl, releaseStatus, organization, tags, favorites, createdAt, updatedAt, publicationDate, labsPublicationDate, unityPackages, popularity, heat, occupants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedWorld {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    labsPublicationDate: ").append(toIndentedString(labsPublicationDate)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    heat: ").append(toIndentedString(heat)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
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

