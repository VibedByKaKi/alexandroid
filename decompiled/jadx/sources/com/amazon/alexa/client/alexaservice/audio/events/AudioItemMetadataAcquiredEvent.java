package com.amazon.alexa.client.alexaservice.audio.events;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import com.amazon.alexa.client.alexaservice.audio.events.AutoValue_AudioItemMetadataAcquiredEvent;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioItemMetadataAcquiredEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioItemMetadataAcquiredEvent build();

        public abstract Builder setAlbum(String str);

        public abstract Builder setArtImageUri(Uri uri);

        public abstract Builder setArtist(String str);

        public abstract Builder setAudioItemIdentifier(AudioItemIdentifier audioItemIdentifier);

        public abstract Builder setBackgroundImageUri(Uri uri);

        public abstract Builder setMediaLengthInSeconds(Long l);

        public abstract Builder setTitle(String str);
    }

    public static Builder builder() {
        return new AutoValue_AudioItemMetadataAcquiredEvent.Builder();
    }

    @Nullable
    public abstract String getAlbum();

    @Nullable
    public abstract Uri getArtImageUri();

    @Nullable
    public abstract String getArtist();

    public abstract AudioItemIdentifier getAudioItemIdentifier();

    @Nullable
    public abstract Uri getBackgroundImageUri();

    @Nullable
    public abstract Long getMediaLengthInSeconds();

    @Nullable
    public abstract String getTitle();
}
