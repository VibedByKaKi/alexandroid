package androidx.camera.video.internal.audio;

import androidx.annotation.IntRange;
import androidx.camera.video.internal.audio.AudioSettings;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int channelCount;
    private final int sampleRate;

    private AutoValue_AudioSettings(int i, int i2, int i3, int i4) {
        this.audioSource = i;
        this.sampleRate = i2;
        this.channelCount = i3;
        this.audioFormat = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSettings) {
            AudioSettings audioSettings = (AudioSettings) obj;
            if (this.audioSource == audioSettings.getAudioSource() && this.sampleRate == audioSettings.getSampleRate() && this.channelCount == audioSettings.getChannelCount() && this.audioFormat == audioSettings.getAudioFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return this.audioFormat ^ ((((((this.audioSource ^ 1000003) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channelCount) * 1000003);
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.audioSource);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channelCount=");
        sb.append(this.channelCount);
        sb.append(", audioFormat=");
        return a$$ExternalSyntheticOutline0.m(sb, this.audioFormat, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AudioSettings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer channelCount;
        private Integer sampleRate;

        private Builder(AudioSettings audioSettings) {
            this.audioSource = Integer.valueOf(audioSettings.getAudioSource());
            this.sampleRate = Integer.valueOf(audioSettings.getSampleRate());
            this.channelCount = Integer.valueOf(audioSettings.getChannelCount());
            this.audioFormat = Integer.valueOf(audioSettings.getAudioFormat());
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings autoBuild() {
            String str = this.audioSource == null ? " audioSource" : "";
            if (this.sampleRate == null) {
                str = str.concat(" sampleRate");
            }
            if (this.channelCount == null) {
                str = str.concat(" channelCount");
            }
            if (this.audioFormat == null) {
                str = str.concat(" audioFormat");
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioSettings(this.audioSource.intValue(), this.sampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i) {
            this.audioFormat = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i) {
            this.audioSource = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setSampleRate(int i) {
            this.sampleRate = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }
    }
}
