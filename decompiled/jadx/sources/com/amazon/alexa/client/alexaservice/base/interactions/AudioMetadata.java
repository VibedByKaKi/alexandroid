package com.amazon.alexa.client.alexaservice.base.interactions;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioMetadata {
    private static final int AUDIO_FOCUS_EXTERNAL = Integer.MAX_VALUE;
    private static final int NO_STREAM = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioContentType {
        MOVIE(3),
        MUSIC(2),
        SPEECH(1),
        UNKNOWN(0);

        private final int value;

        AudioContentType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioFocusDuration {
        PERSISTENT(1),
        TRANSIENT_EXCLUSIVE(4),
        TRANSIENT(2),
        TRANSIENT_MAY_DUCK(3),
        NO_AUDIOFOCUS(Integer.MAX_VALUE);

        private final int value;

        AudioFocusDuration(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioFocusStream {
        ALARM(4),
        DTMF(8),
        MUSIC(3),
        NOTIFICATION(5),
        RING(2),
        SYSTEM(1),
        VOICE_CALL(0),
        EXTERNAL_STREAM(-1);

        private final int value;

        AudioFocusStream(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum AudioUsage {
        ALARM(4),
        ASSISTANT(16),
        MEDIA(1),
        NOTIFICATION(5),
        RINGTONE(6),
        UNKNOWN(0),
        VOICE(2);

        private final int value;

        AudioUsage(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static AudioMetadata create(AudioFocusStream audioFocusStream, AudioFocusDuration audioFocusDuration, AudioUsage audioUsage, AudioContentType audioContentType, boolean z) {
        return new AutoValue_AudioMetadata(audioFocusStream, audioFocusDuration, audioUsage, audioContentType, z);
    }

    public abstract AudioContentType getAudioContentType();

    public abstract AudioUsage getAudioUsage();

    public abstract AudioFocusDuration getDuration();

    public abstract AudioFocusStream getStream();

    public abstract boolean isAlexaAudio();

    public boolean isPersistent() {
        return getDuration() == AudioFocusDuration.PERSISTENT;
    }

    public boolean requiresDifferentFocusThan(@Nullable AudioMetadata audioMetadata) {
        return (audioMetadata != null && getDuration() == audioMetadata.getDuration() && requiresFocus() == audioMetadata.requiresFocus() && getAudioUsage() == audioMetadata.getAudioUsage() && getAudioContentType() == audioMetadata.getAudioContentType()) ? false : true;
    }

    public boolean requiresFocus() {
        return (AudioFocusStream.EXTERNAL_STREAM.equals(getStream()) || AudioFocusDuration.NO_AUDIOFOCUS.equals(getDuration())) ? false : true;
    }

    public static AudioMetadata create(AudioFocusStream audioFocusStream, AudioFocusDuration audioFocusDuration, boolean z) {
        return create(audioFocusStream, audioFocusDuration, AudioUsage.UNKNOWN, AudioContentType.UNKNOWN, z);
    }

    public static AudioMetadata create(AudioFocusStream audioFocusStream, AudioFocusDuration audioFocusDuration, AudioUsage audioUsage, AudioContentType audioContentType) {
        return create(audioFocusStream, audioFocusDuration, audioUsage, audioContentType, true);
    }

    public static AudioMetadata create(AudioFocusStream audioFocusStream, AudioFocusDuration audioFocusDuration) {
        return create(audioFocusStream, audioFocusDuration, AudioUsage.UNKNOWN, AudioContentType.UNKNOWN);
    }
}
