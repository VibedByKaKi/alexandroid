package com.amazon.alexa.client.alexaservice.features.iocomponent;

import com.amazon.alexa.client.alexaservice.features.iocomponent.AutoValue_SessionState;
import com.amazon.alexa.client.alexaservice.features.iocomponent.C$AutoValue_SessionState;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SessionState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SessionState build();

        public abstract Builder deviceSerialNumber(String str);

        public abstract Builder deviceType(String str);

        public abstract Builder longestTimeUntrustedInMilliseconds(long j);

        public abstract Builder sessionStartTime(String str);

        public abstract Builder trustSessionStartTime(String str);
    }

    public static Builder builder() {
        return new C$AutoValue_SessionState.Builder();
    }

    public static TypeAdapter<SessionState> typeAdapter(Gson gson) {
        return new AutoValue_SessionState.GsonTypeAdapter(gson);
    }

    public abstract String deviceSerialNumber();

    public abstract String deviceType();

    public abstract long longestTimeUntrustedInMilliseconds();

    public abstract String sessionStartTime();

    @Nullable
    public abstract String trustSessionStartTime();
}
