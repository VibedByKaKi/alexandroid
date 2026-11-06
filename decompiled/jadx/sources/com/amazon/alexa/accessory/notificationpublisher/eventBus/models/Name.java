package com.amazon.alexa.accessory.notificationpublisher.eventBus.models;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class Name {
    public static Name create(String str, String str2) {
        return new AutoValue_Name(str, str2);
    }

    @Nullable
    public abstract String getFirstName();

    @Nullable
    public abstract String getLastName();
}
