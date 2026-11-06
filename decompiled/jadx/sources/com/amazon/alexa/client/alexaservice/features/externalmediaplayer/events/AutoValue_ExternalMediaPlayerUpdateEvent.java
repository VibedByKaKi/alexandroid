package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalMediaPlayerUpdateEvent extends ExternalMediaPlayerUpdateEvent {
    private final ExternalPlayerIdentifier externalPlayerIdentifier;
    private final MediaMetadataCompat mediaMetadata;
    private final PlaybackStateCompat playbackState;

    public AutoValue_ExternalMediaPlayerUpdateEvent(@Nullable MediaMetadataCompat mediaMetadataCompat, @Nullable PlaybackStateCompat playbackStateCompat, ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.mediaMetadata = mediaMetadataCompat;
        this.playbackState = playbackStateCompat;
        if (externalPlayerIdentifier != null) {
            this.externalPlayerIdentifier = externalPlayerIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null externalPlayerIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalMediaPlayerUpdateEvent) {
            ExternalMediaPlayerUpdateEvent externalMediaPlayerUpdateEvent = (ExternalMediaPlayerUpdateEvent) obj;
            MediaMetadataCompat mediaMetadataCompat = this.mediaMetadata;
            if (mediaMetadataCompat != null ? mediaMetadataCompat.equals(externalMediaPlayerUpdateEvent.getMediaMetadata()) : externalMediaPlayerUpdateEvent.getMediaMetadata() == null) {
                PlaybackStateCompat playbackStateCompat = this.playbackState;
                if (playbackStateCompat != null ? playbackStateCompat.equals(externalMediaPlayerUpdateEvent.getPlaybackState()) : externalMediaPlayerUpdateEvent.getPlaybackState() == null) {
                    if (this.externalPlayerIdentifier.equals(externalMediaPlayerUpdateEvent.getExternalPlayerIdentifier())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerUpdateEvent
    @NonNull
    public ExternalPlayerIdentifier getExternalPlayerIdentifier() {
        return this.externalPlayerIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerUpdateEvent
    @Nullable
    public MediaMetadataCompat getMediaMetadata() {
        return this.mediaMetadata;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerUpdateEvent
    @Nullable
    public PlaybackStateCompat getPlaybackState() {
        return this.playbackState;
    }

    public int hashCode() {
        MediaMetadataCompat mediaMetadataCompat = this.mediaMetadata;
        int hashCode = ((mediaMetadataCompat == null ? 0 : mediaMetadataCompat.hashCode()) ^ 1000003) * 1000003;
        PlaybackStateCompat playbackStateCompat = this.playbackState;
        return this.externalPlayerIdentifier.hashCode() ^ ((hashCode ^ (playbackStateCompat != null ? playbackStateCompat.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "ExternalMediaPlayerUpdateEvent{mediaMetadata=" + this.mediaMetadata + ", playbackState=" + this.playbackState + ", externalPlayerIdentifier=" + this.externalPlayerIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
