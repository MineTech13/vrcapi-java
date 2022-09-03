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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * FileVersionUploadStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileVersionUploadStatus {
  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_NEXT_PART_NUMBER = "nextPartNumber";
  @SerializedName(SERIALIZED_NAME_NEXT_PART_NUMBER)
  private BigDecimal nextPartNumber;

  public static final String SERIALIZED_NAME_MAX_PARTS = "maxParts";
  @SerializedName(SERIALIZED_NAME_MAX_PARTS)
  private BigDecimal maxParts;

  public static final String SERIALIZED_NAME_PARTS = "parts";
  @SerializedName(SERIALIZED_NAME_PARTS)
  private List<Object> parts = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_ETAGS = "etags";
  @SerializedName(SERIALIZED_NAME_ETAGS)
  private List<Object> etags = new ArrayList<Object>();


  public FileVersionUploadStatus uploadId(String uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Get uploadId
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_xxxxxxxxxxxxxxxxxxxxxxxx.xxxxxxx_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..xxxxxxxxxxxxxxxxxxxxxxx", required = true, value = "")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  public FileVersionUploadStatus fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Avatar-MyAvatar-Un.file_00000000-0000-0000-0000-000000000000.1.unitypackage", required = true, value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FileVersionUploadStatus nextPartNumber(BigDecimal nextPartNumber) {
    
    this.nextPartNumber = nextPartNumber;
    return this;
  }

   /**
   * Get nextPartNumber
   * minimum: 0
   * @return nextPartNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public BigDecimal getNextPartNumber() {
    return nextPartNumber;
  }


  public void setNextPartNumber(BigDecimal nextPartNumber) {
    this.nextPartNumber = nextPartNumber;
  }


  public FileVersionUploadStatus maxParts(BigDecimal maxParts) {
    
    this.maxParts = maxParts;
    return this;
  }

   /**
   * Get maxParts
   * minimum: 1
   * @return maxParts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "")

  public BigDecimal getMaxParts() {
    return maxParts;
  }


  public void setMaxParts(BigDecimal maxParts) {
    this.maxParts = maxParts;
  }


  public FileVersionUploadStatus parts(List<Object> parts) {
    
    this.parts = parts;
    return this;
  }

  public FileVersionUploadStatus addPartsItem(Object partsItem) {
    this.parts.add(partsItem);
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getParts() {
    return parts;
  }


  public void setParts(List<Object> parts) {
    this.parts = parts;
  }


  public FileVersionUploadStatus etags(List<Object> etags) {
    
    this.etags = etags;
    return this;
  }

  public FileVersionUploadStatus addEtagsItem(Object etagsItem) {
    this.etags.add(etagsItem);
    return this;
  }

   /**
   * Unknown
   * @return etags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public List<Object> getEtags() {
    return etags;
  }


  public void setEtags(List<Object> etags) {
    this.etags = etags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersionUploadStatus fileVersionUploadStatus = (FileVersionUploadStatus) o;
    return Objects.equals(this.uploadId, fileVersionUploadStatus.uploadId) &&
        Objects.equals(this.fileName, fileVersionUploadStatus.fileName) &&
        Objects.equals(this.nextPartNumber, fileVersionUploadStatus.nextPartNumber) &&
        Objects.equals(this.maxParts, fileVersionUploadStatus.maxParts) &&
        Objects.equals(this.parts, fileVersionUploadStatus.parts) &&
        Objects.equals(this.etags, fileVersionUploadStatus.etags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, fileName, nextPartNumber, maxParts, parts, etags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersionUploadStatus {\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    nextPartNumber: ").append(toIndentedString(nextPartNumber)).append("\n");
    sb.append("    maxParts: ").append(toIndentedString(maxParts)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    etags: ").append(toIndentedString(etags)).append("\n");
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

