package com.amazon.alexa.client.alexaservice.audio.audioplayer.payload;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AutoValue_PlaybackAttributes;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.C$AutoValue_PlaybackAttributes;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlaybackAttributes {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PlaybackAttributes build();

        public abstract Builder setCodec(@Nullable String str);

        public abstract Builder setDataRate(long j);

        public abstract Builder setName(@Nullable String str);

        public abstract Builder setSamplingRate(long j);
    }

    public static Builder builder() {
        return new C$AutoValue_PlaybackAttributes.Builder();
    }

    public static TypeAdapter<PlaybackAttributes> typeAdapter(Gson gson) {
        return new AutoValue_PlaybackAttributes.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract String getCodec();

    public abstract long getDataRate();

    @Nullable
    public abstract String getName();

    public abstract long getSamplingRate();
}
