package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.audio.core.PlayItem;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AudioPlayerPlaybackEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ConnectivityFailureResumeEvent extends AudioPlayerPlaybackEvent {
        private static ConnectivityFailureResumeEvent create(boolean z) {
            return new AutoValue_AudioPlayerPlaybackEvent_ConnectivityFailureResumeEvent(z);
        }

        public static ConnectivityFailureResumeEvent createResumed() {
            return create(false);
        }

        public static ConnectivityFailureResumeEvent createTimedOut() {
            return create(true);
        }

        public abstract boolean didTimeoutElapse();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DrmCryptoPlayFailedEvent extends AudioPlayerPlaybackEvent {
        public static DrmCryptoPlayFailedEvent create(PlayItem playItem, String str) {
            return new AutoValue_AudioPlayerPlaybackEvent_DrmCryptoPlayFailedEvent(playItem, str);
        }

        public abstract String getErrorCode();

        public abstract PlayItem getPlayItem();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DrmPlayFailedEvent extends AudioPlayerPlaybackEvent {
        public static DrmPlayFailedEvent create(PlayItem playItem, String str) {
            return new AutoValue_AudioPlayerPlaybackEvent_DrmPlayFailedEvent(playItem, str);
        }

        public abstract String getErrorCode();

        public abstract PlayItem getPlayItem();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayAttemptedEvent extends AudioPlayerPlaybackEvent {
        public static PlayAttemptedEvent create(PlayItem playItem) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayAttemptedEvent(playItem);
        }

        public abstract PlayItem getPlayItem();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayDrmAttemptedEvent extends AudioPlayerPlaybackEvent {
        public static PlayDrmAttemptedEvent create(PlayItem playItem) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayDrmAttemptedEvent(playItem);
        }

        public abstract PlayItem getPlayItem();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayDrmLicenseKeyLoadedEvent extends AudioPlayerPlaybackEvent {
        public static PlayDrmLicenseKeyLoadedEvent create(boolean z) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayDrmLicenseKeyLoadedEvent(z);
        }

        public abstract boolean isRestoredFromCache();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayDrmLoadErrorEvent extends AudioPlayerPlaybackEvent {
        public static PlayDrmLoadErrorEvent create(Exception exc) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayDrmLoadErrorEvent(exc);
        }

        public abstract Exception getException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayDrmManifestLoadErrorEvent extends AudioPlayerPlaybackEvent {
        public static PlayDrmManifestLoadErrorEvent create(Exception exc) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayDrmManifestLoadErrorEvent(exc);
        }

        public abstract Exception getException();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayDrmManifestLoadedEvent extends AudioPlayerPlaybackEvent {
        public static PlayDrmManifestLoadedEvent create(long j) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayDrmManifestLoadedEvent(j);
        }

        public abstract long getDurationInMs();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class PlayFailedEvent extends AudioPlayerPlaybackEvent {
        public static PlayFailedEvent create(PlayItem playItem, boolean z) {
            return new AutoValue_AudioPlayerPlaybackEvent_PlayFailedEvent(playItem, z);
        }

        public abstract PlayItem getPlayItem();

        public abstract boolean isConnectivityFailure();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class SlowPlaybackEvent extends AudioPlayerPlaybackEvent {
        public static SlowPlaybackEvent create(PlayItem playItem) {
            return new AutoValue_AudioPlayerPlaybackEvent_SlowPlaybackEvent(playItem);
        }

        public abstract PlayItem getPlayItem();
    }
}
