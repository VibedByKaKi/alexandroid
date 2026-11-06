package com.amazon.alexa.accessory.speech.events.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.speech.events.model.AutoValue_AccessoryStateChangeEventPayload;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class AccessoryStateChangeEventPayload {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AccessoryStateChangeEventPayload build();

        public abstract Builder setAccessories(List<AccessoryInfo> list);

        public abstract Builder setEventTimestamp(String str);

        public abstract Builder setPersonInfo(PersonInfo personInfo);

        public abstract Builder setToken(String str);
    }

    public static Builder builder() {
        return new AutoValue_AccessoryStateChangeEventPayload.Builder();
    }

    public abstract List<AccessoryInfo> getAccessories();

    public abstract String getEventTimestamp();

    public abstract PersonInfo getPersonInfo();

    @Nullable
    public abstract String getToken();
}
