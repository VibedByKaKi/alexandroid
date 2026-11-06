package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.AutoValue_PlayerError;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.C$AutoValue_PlayerError;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlayerError {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PlayerError build();

        public abstract Builder setCode(long j);

        public abstract Builder setDescription(String str);

        public abstract Builder setErrorName(PlayerErrorName playerErrorName);

        public abstract Builder setFatal(boolean z);

        public abstract Builder setShouldCleanupSession(boolean z);
    }

    public static Builder builder() {
        return new C$AutoValue_PlayerError.Builder();
    }

    public static PlayerError create(@NonNull PlayerError playerError, @NonNull String str) {
        StringBuilder sb = new StringBuilder();
        if (playerError.getDescription() != null && !playerError.getDescription().isEmpty()) {
            sb.append(playerError.getDescription());
            if (!playerError.getDescription().endsWith(".") && !str.isEmpty()) {
                sb.append(". ");
            }
        }
        if (!str.isEmpty()) {
            sb.append(str);
        }
        return new AutoValue_PlayerError(playerError.getErrorName(), playerError.getCode(), playerError.getFatal(), playerError.getShouldCleanupSession(), sb.toString());
    }

    public static TypeAdapter<PlayerError> typeAdapter(Gson gson) {
        return new AutoValue_PlayerError.GsonTypeAdapter(gson);
    }

    public abstract long getCode();

    @Nullable
    public abstract String getDescription();

    public abstract PlayerErrorName getErrorName();

    public abstract boolean getFatal();

    public abstract boolean getShouldCleanupSession();

    public static PlayerError create(PlayerErrorName playerErrorName, String str, long j, boolean z, boolean z2) {
        return new AutoValue_PlayerError(playerErrorName, j, z, z2, str);
    }

    public static PlayerError create(PlayerErrorName playerErrorName, String str, long j, boolean z) {
        return new AutoValue_PlayerError(playerErrorName, j, z, false, str);
    }
}
