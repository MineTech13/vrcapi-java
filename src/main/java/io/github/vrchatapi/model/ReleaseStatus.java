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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ReleaseStatus
 */
@JsonAdapter(ReleaseStatus.Adapter.class)
public enum ReleaseStatus {
  
  PUBLIC("public"),
  
  PRIVATE("private"),
  
  HIDDEN("hidden");

  private String value;

  ReleaseStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReleaseStatus fromValue(String value) {
    for (ReleaseStatus b : ReleaseStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReleaseStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReleaseStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReleaseStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReleaseStatus.fromValue(value);
    }
  }
}

