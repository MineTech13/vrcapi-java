/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.7.2
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
 * Gets or Sets NotificationType
 */
@JsonAdapter(NotificationType.Adapter.class)
public enum NotificationType {
  
  FRIENDREQUEST("friendRequest"),
  
  INVITE("invite"),
  
  INVITERESPONSE("inviteResponse"),
  
  REQUESTINVITE("requestInvite"),
  
  REQUESTINVITERESPONSE("requestInviteResponse"),
  
  VOTETOKICK("votetokick");

  private String value;

  NotificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NotificationType fromValue(String value) {
    for (NotificationType b : NotificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NotificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NotificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NotificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NotificationType.fromValue(value);
    }
  }
}

