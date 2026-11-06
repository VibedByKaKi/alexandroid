package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalMediaPlayerUpdateEvent extends Event.NotGated {
    public static ExternalMediaPlayerUpdateEvent create(@NonNull ExternalPlayerIdentifier externalPlayerIdentifier, @Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat) {
        return new AutoValue_ExternalMediaPlayerUpdateEvent(mediaMetadataCompat, playbackStateCompat, externalPlayerIdentifier);
    }

    @NonNull
    public abstract ExternalPlayerIdentifier getExternalPlayerIdentifier();

    @Nullable
    public abstract MediaMetadataCompat getMediaMetadata();

    @Nullable
    public abstract PlaybackStateCompat getPlaybackState();
}
