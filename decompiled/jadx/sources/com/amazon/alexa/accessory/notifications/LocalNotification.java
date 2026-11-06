package com.amazon.alexa.accessory.notifications;

import com.amazon.alexa.accessory.notifications.AutoValue_LocalNotification;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class LocalNotification {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract LocalNotification build();

        public abstract Builder setDeepLink(String str);

        public abstract Builder setText(String str);

        public abstract Builder setTitle(String str);
    }

    public static Builder newBuilder() {
        return new AutoValue_LocalNotification.Builder();
    }

    public abstract String getDeepLink();

    public abstract String getText();

    public abstract String getTitle();
}
