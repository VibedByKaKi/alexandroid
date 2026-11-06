package com.amazon.alexa.client.alexaservice.audio.audioplayer.payload;

import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AutoValue_PlaybackReports;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlaybackReports {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PlaybackReports build();

        public abstract Builder setEndOffset(long j);

        public abstract Builder setPlaybackAttributes(PlaybackAttributes playbackAttributes);

        public abstract Builder setStartOffset(long j);
    }

    public static Builder builder() {
        return new AutoValue_PlaybackReports.Builder();
    }

    public abstract long getEndOffset();

    public abstract PlaybackAttributes getPlaybackAttributes();

    public abstract long getStartOffset();
}
