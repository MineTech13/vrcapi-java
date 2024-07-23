/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: dev004
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.APIConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.APIConfigAnnouncement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.APIConfigDownloadURLList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.APIConfigEvents.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.APIHealth.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.AccountDeletionLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.AddFavoriteRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.AddGroupGalleryImageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Avatar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.AvatarUnityPackageUrlObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Badge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.BanGroupMemberRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateAvatarRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateFileRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateFileVersionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupAnnouncementRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupGalleryRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupInviteRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateGroupRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateInstanceRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CreateWorldRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CurrentUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.CurrentUserPresence.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.DynamicContentRow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Favorite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FavoriteGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FileData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FileUploadURL.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FileVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FileVersionUploadStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FinishFileDataUploadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.FriendStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Group.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupAnnouncement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupAuditLogEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupGallery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupGalleryImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupInstance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupLimitedMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupMemberLimitedUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupMyMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupPermission.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.GroupRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InfoPush.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InfoPushData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InfoPushDataArticle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InfoPushDataArticleContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InfoPushDataClickable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Instance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InstancePlatforms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InstanceShortNameResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InviteMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InviteRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.InviteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.License.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LicenseGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LimitedGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LimitedUnityPackage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LimitedUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LimitedUserGroups.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.LimitedWorld.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.ModelFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.ModerateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Notification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.NotificationDetailInvite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.NotificationDetailInviteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.NotificationDetailRequestInvite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.NotificationDetailRequestInviteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.NotificationDetailVoteToKick.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.PaginatedGroupAuditLogEntryList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.PastDisplayName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Permission.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.PlayerModeration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.RepresentedGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.RequestInviteRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.RespondGroupJoinRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.SentNotification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Subscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Success.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Transaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.TransactionAgreement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.TransactionSteamInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.TransactionSteamWalletInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.TwoFactorAuthCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.TwoFactorEmailCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UnityPackage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateAvatarRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateFavoriteGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateGroupGalleryRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateGroupMemberRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateGroupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateGroupRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateInviteMessageRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UpdateWorldRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UserExists.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.UserSubscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Verify2FAEmailCodeResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.Verify2FAResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.VerifyAuthTokenResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.World.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.WorldMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.github.vrchatapi.model.WorldPublishStatus.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
