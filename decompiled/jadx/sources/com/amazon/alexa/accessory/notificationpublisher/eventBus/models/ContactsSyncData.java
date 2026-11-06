package com.amazon.alexa.accessory.notificationpublisher.eventBus.models;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.eventBus.models.AutoValue_ContactsSyncData;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class ContactsSyncData {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ContactsSyncData build();

        public abstract Builder setContactId(@NonNull String str);

        public abstract Builder setName(@NonNull Name name);

        public abstract Builder setSyncType(@NonNull SyncType syncType);
    }

    public static Builder builder() {
        return new AutoValue_ContactsSyncData.Builder();
    }

    public abstract String getContactId();

    public abstract Name getName();

    public abstract SyncType getSyncType();
}
