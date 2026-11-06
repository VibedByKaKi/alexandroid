package com.amazon.alexa.accessory.speech.events.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.speech.events.model.AutoValue_PersonInfo;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class PersonInfo {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PersonInfo build();

        public abstract Builder setActivePersonId(String str);
    }

    public static Builder builder() {
        return new AutoValue_PersonInfo.Builder();
    }

    @Nullable
    public abstract String getActivePersonId();
}
