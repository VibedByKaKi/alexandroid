package com.amazon.alexa.client.alexaservice.audio.events;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.AudioItemIdentifier;
import com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AudioItemMetadataAcquiredEvent extends AudioItemMetadataAcquiredEvent {
    private final String album;
    private final Uri artImageUri;
    private final String artist;
    private final AudioItemIdentifier audioItemIdentifier;
    private final Uri backgroundImageUri;
    private final Long mediaLengthInSeconds;
    private final String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AudioItemMetadataAcquiredEvent.Builder {
        private String album;
        private Uri artImageUri;
        private String artist;
        private AudioItemIdentifier audioItemIdentifier;
        private Uri backgroundImageUri;
        private Long mediaLengthInSeconds;
        private String title;

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent build() {
            String str = this.audioItemIdentifier == null ? " audioItemIdentifier" : "";
            if (str.isEmpty()) {
                return new AutoValue_AudioItemMetadataAcquiredEvent(this.audioItemIdentifier, this.title, this.artist, this.album, this.backgroundImageUri, this.artImageUri, this.mediaLengthInSeconds, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setAlbum(String str) {
            this.album = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setArtImageUri(Uri uri) {
            this.artImageUri = uri;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setArtist(String str) {
            this.artist = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setAudioItemIdentifier(AudioItemIdentifier audioItemIdentifier) {
            if (audioItemIdentifier != null) {
                this.audioItemIdentifier = audioItemIdentifier;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioItemIdentifier");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setBackgroundImageUri(Uri uri) {
            this.backgroundImageUri = uri;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setMediaLengthInSeconds(Long l) {
            this.mediaLengthInSeconds = l;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent.Builder
        public AudioItemMetadataAcquiredEvent.Builder setTitle(String str) {
            this.title = str;
            return this;
        }
    }

    private AutoValue_AudioItemMetadataAcquiredEvent(AudioItemIdentifier audioItemIdentifier, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Uri uri, @Nullable Uri uri2, @Nullable Long l) {
        this.audioItemIdentifier = audioItemIdentifier;
        this.title = str;
        this.artist = str2;
        this.album = str3;
        this.backgroundImageUri = uri;
        this.artImageUri = uri2;
        this.mediaLengthInSeconds = l;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        Uri uri;
        Uri uri2;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioItemMetadataAcquiredEvent) {
            AudioItemMetadataAcquiredEvent audioItemMetadataAcquiredEvent = (AudioItemMetadataAcquiredEvent) obj;
            if (this.audioItemIdentifier.equals(audioItemMetadataAcquiredEvent.getAudioItemIdentifier()) && ((str = this.title) != null ? str.equals(audioItemMetadataAcquiredEvent.getTitle()) : audioItemMetadataAcquiredEvent.getTitle() == null) && ((str2 = this.artist) != null ? str2.equals(audioItemMetadataAcquiredEvent.getArtist()) : audioItemMetadataAcquiredEvent.getArtist() == null) && ((str3 = this.album) != null ? str3.equals(audioItemMetadataAcquiredEvent.getAlbum()) : audioItemMetadataAcquiredEvent.getAlbum() == null) && ((uri = this.backgroundImageUri) != null ? uri.equals(audioItemMetadataAcquiredEvent.getBackgroundImageUri()) : audioItemMetadataAcquiredEvent.getBackgroundImageUri() == null) && ((uri2 = this.artImageUri) != null ? uri2.equals(audioItemMetadataAcquiredEvent.getArtImageUri()) : audioItemMetadataAcquiredEvent.getArtImageUri() == null) && ((l = this.mediaLengthInSeconds) != null ? l.equals(audioItemMetadataAcquiredEvent.getMediaLengthInSeconds()) : audioItemMetadataAcquiredEvent.getMediaLengthInSeconds() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public String getAlbum() {
        return this.album;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public Uri getArtImageUri() {
        return this.artImageUri;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public String getArtist() {
        return this.artist;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    public AudioItemIdentifier getAudioItemIdentifier() {
        return this.audioItemIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public Uri getBackgroundImageUri() {
        return this.backgroundImageUri;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public Long getMediaLengthInSeconds() {
        return this.mediaLengthInSeconds;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.audioItemIdentifier.hashCode() ^ 1000003) * 1000003;
        String str = this.title;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.artist;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.album;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Uri uri = this.backgroundImageUri;
        int hashCode5 = (hashCode4 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.artImageUri;
        int hashCode6 = (hashCode5 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        Long l = this.mediaLengthInSeconds;
        return hashCode6 ^ (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "AudioItemMetadataAcquiredEvent{audioItemIdentifier=" + this.audioItemIdentifier + ", title=" + this.title + ", artist=" + this.artist + ", album=" + this.album + ", backgroundImageUri=" + this.backgroundImageUri + ", artImageUri=" + this.artImageUri + ", mediaLengthInSeconds=" + this.mediaLengthInSeconds + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_AudioItemMetadataAcquiredEvent(AudioItemIdentifier audioItemIdentifier, String str, String str2, String str3, Uri uri, Uri uri2, Long l, int i) {
        this(audioItemIdentifier, str, str2, str3, uri, uri2, l);
    }
}
