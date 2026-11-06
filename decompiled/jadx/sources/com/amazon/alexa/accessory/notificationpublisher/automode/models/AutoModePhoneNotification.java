package com.amazon.alexa.accessory.notificationpublisher.automode.models;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.automode.models.AutoValue_AutoModePhoneNotification;
import com.google.auto.value.AutoValue;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class AutoModePhoneNotification {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AutoModePhoneNotification build();

        public abstract Builder setApplicationName(String str);

        public abstract Builder setContactName(String str);

        public abstract Builder setTimestamp(Date date);
    }

    public static Builder builder() {
        return new AutoValue_AutoModePhoneNotification.Builder();
    }

    public abstract String getApplicationName();

    @Nullable
    public abstract String getContactName();

    public abstract Date getTimestamp();
}
