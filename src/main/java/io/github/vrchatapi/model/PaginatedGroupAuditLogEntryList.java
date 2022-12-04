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
import io.github.vrchatapi.model.GroupAuditLogEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaginatedGroupAuditLogEntryList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaginatedGroupAuditLogEntryList {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<GroupAuditLogEntry> results = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_HAS_NEXT = "hasNext";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT)
  private Boolean hasNext;


  public PaginatedGroupAuditLogEntryList results(List<GroupAuditLogEntry> results) {
    
    this.results = results;
    return this;
  }

  public PaginatedGroupAuditLogEntryList addResultsItem(GroupAuditLogEntry resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<GroupAuditLogEntry>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupAuditLogEntry> getResults() {
    return results;
  }


  public void setResults(List<GroupAuditLogEntry> results) {
    this.results = results;
  }


  public PaginatedGroupAuditLogEntryList totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of results that the query would return if there were no pagination.
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results that the query would return if there were no pagination.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public PaginatedGroupAuditLogEntryList hasNext(Boolean hasNext) {
    
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Whether there are more results after this page.
   * @return hasNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether there are more results after this page.")

  public Boolean getHasNext() {
    return hasNext;
  }


  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedGroupAuditLogEntryList paginatedGroupAuditLogEntryList = (PaginatedGroupAuditLogEntryList) o;
    return Objects.equals(this.results, paginatedGroupAuditLogEntryList.results) &&
        Objects.equals(this.totalCount, paginatedGroupAuditLogEntryList.totalCount) &&
        Objects.equals(this.hasNext, paginatedGroupAuditLogEntryList.hasNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalCount, hasNext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedGroupAuditLogEntryList {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
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

