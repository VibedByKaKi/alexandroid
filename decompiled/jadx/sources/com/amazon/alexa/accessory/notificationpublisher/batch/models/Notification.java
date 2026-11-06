package com.amazon.alexa.accessory.notificationpublisher.batch.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.AutoValue_Notification;
import com.amazon.alexa.accessory.notificationpublisher.batch.models.C$AutoValue_Notification;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class Notification {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Notification build();

        public abstract Builder setAppName(@Nullable String str);

        public abstract Builder setContact(@Nullable String str);

        public abstract Builder setContentPrefix(@Nullable String str);

        public abstract Builder setContentWithoutPrefix(@Nullable String str);

        public abstract Builder setDetailedContent(@Nullable String str);

        public abstract Builder setGroupName(@Nullable String str);

        public abstract Builder setGroupType(@Nullable String str);

        public abstract Builder setIsDetailedContentWithoutPrefix(@Nullable Boolean bool);

        public abstract Builder setPackageIdentifier(@Nullable String str);

        public abstract Builder setSubType(@Nullable String str);

        public abstract Builder setType(@Nullable String str);

        public abstract Builder setUuid(@Nullable String str);
    }

    public static Builder builder() {
        return new C$AutoValue_Notification.Builder();
    }

    public static TypeAdapter<Notification> typeAdapter(Gson gson) {
        return new AutoValue_Notification.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract String appName();

    @Nullable
    public abstract String contact();

    @Nullable
    public abstract String contentPrefix();

    @Nullable
    public abstract String contentWithoutPrefix();

    @Nullable
    public abstract String detailedContent();

    @NonNull
    public String getAppName() {
        return appName() != null ? appName() : "";
    }

    @NonNull
    public String getContact() {
        return contact() != null ? contact() : "";
    }

    @NonNull
    public String getContentPrefix() {
        return contentPrefix() != null ? contentPrefix() : "";
    }

    @NonNull
    public String getContentWithoutPrefix() {
        return contentWithoutPrefix() != null ? contentWithoutPrefix() : "";
    }

    @NonNull
    public String getDetailedContent() {
        return detailedContent() != null ? detailedContent() : "";
    }

    @NonNull
    public String getGroupName() {
        return groupName() != null ? groupName() : "";
    }

    @NonNull
    public String getGroupType() {
        return groupType() != null ? groupType() : "";
    }

    public boolean getIsDetailedContentWithoutPrefix() {
        if (isDetailedContentWithoutPrefix() != null) {
            return isDetailedContentWithoutPrefix().booleanValue();
        }
        return false;
    }

    @NonNull
    public String getPackageIdentifier() {
        return packageIdentifier() != null ? packageIdentifier() : "";
    }

    @NonNull
    public String getSubType() {
        return subType() != null ? subType() : "";
    }

    @NonNull
    public String getType() {
        return type() != null ? type() : "";
    }

    @NonNull
    public String getUuid() {
        return uuid() != null ? uuid() : "";
    }

    @Nullable
    public abstract String groupName();

    @Nullable
    public abstract String groupType();

    @Nullable
    public abstract Boolean isDetailedContentWithoutPrefix();

    @Nullable
    public abstract String packageIdentifier();

    @Nullable
    public abstract String subType();

    @Nullable
    public abstract String type();

    @Nullable
    public abstract String uuid();
}
