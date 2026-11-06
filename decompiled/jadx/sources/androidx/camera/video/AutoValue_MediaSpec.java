package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.camera.video.MediaSpec;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_MediaSpec extends MediaSpec {
    private final AudioSpec audioSpec;
    private final int outputFormat;
    private final VideoSpec videoSpec;

    private AutoValue_MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec, int i) {
        this.videoSpec = videoSpec;
        this.audioSpec = audioSpec;
        this.outputFormat = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaSpec) {
            MediaSpec mediaSpec = (MediaSpec) obj;
            if (this.videoSpec.equals(mediaSpec.getVideoSpec()) && this.audioSpec.equals(mediaSpec.getAudioSpec()) && this.outputFormat == mediaSpec.getOutputFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.MediaSpec
    @NonNull
    public AudioSpec getAudioSpec() {
        return this.audioSpec;
    }

    @Override // androidx.camera.video.MediaSpec
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.video.MediaSpec
    @NonNull
    public VideoSpec getVideoSpec() {
        return this.videoSpec;
    }

    public int hashCode() {
        return this.outputFormat ^ ((((this.videoSpec.hashCode() ^ 1000003) * 1000003) ^ this.audioSpec.hashCode()) * 1000003);
    }

    @Override // androidx.camera.video.MediaSpec
    public MediaSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.videoSpec);
        sb.append(", audioSpec=");
        sb.append(this.audioSpec);
        sb.append(", outputFormat=");
        return a$$ExternalSyntheticOutline0.m(sb, this.outputFormat, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MediaSpec.Builder {
        private AudioSpec audioSpec;
        private Integer outputFormat;
        private VideoSpec videoSpec;

        private Builder(MediaSpec mediaSpec) {
            this.videoSpec = mediaSpec.getVideoSpec();
            this.audioSpec = mediaSpec.getAudioSpec();
            this.outputFormat = Integer.valueOf(mediaSpec.getOutputFormat());
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec build() {
            String str = this.videoSpec == null ? " videoSpec" : "";
            if (this.audioSpec == null) {
                str = str.concat(" audioSpec");
            }
            if (this.outputFormat == null) {
                str = str.concat(" outputFormat");
            }
            if (str.isEmpty()) {
                return new AutoValue_MediaSpec(this.videoSpec, this.audioSpec, this.outputFormat.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public AudioSpec getAudioSpec() {
            AudioSpec audioSpec = this.audioSpec;
            if (audioSpec != null) {
                return audioSpec;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Property \"audioSpec\" has not been set");
            return null;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public VideoSpec getVideoSpec() {
            VideoSpec videoSpec = this.videoSpec;
            if (videoSpec != null) {
                return videoSpec;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Property \"videoSpec\" has not been set");
            return null;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setAudioSpec(AudioSpec audioSpec) {
            if (audioSpec != null) {
                this.audioSpec = audioSpec;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioSpec");
            return null;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setOutputFormat(int i) {
            this.outputFormat = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public MediaSpec.Builder setVideoSpec(VideoSpec videoSpec) {
            if (videoSpec != null) {
                this.videoSpec = videoSpec;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null videoSpec");
            return null;
        }

        public Builder() {
        }
    }
}
