/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.15.1
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * API/Photon region.
 */
@JsonAdapter(Region.Adapter.class)
public enum Region {
  
  US("us"),
  
  USE("use"),
  
  USW("usw"),
  
  EU("eu"),
  
  JP("jp"),
  
  UNKNOWN("unknown");

  private String value;

  Region(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Region fromValue(String value) {
    for (Region b : Region.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Region> {
    @Override
    public void write(final JsonWriter jsonWriter, final Region enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Region read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Region.fromValue(value);
    }
  }
}

