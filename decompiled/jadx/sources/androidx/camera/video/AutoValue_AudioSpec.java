package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioSpec;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_AudioSpec extends AudioSpec {
    private final Range<Integer> bitrate;
    private final int channelCount;
    private final Range<Integer> sampleRate;
    private final int source;
    private final int sourceFormat;

    private AutoValue_AudioSpec(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.bitrate = range;
        this.sourceFormat = i;
        this.source = i2;
        this.sampleRate = range2;
        this.channelCount = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSpec) {
            AudioSpec audioSpec = (AudioSpec) obj;
            if (this.bitrate.equals(audioSpec.getBitrate()) && this.sourceFormat == audioSpec.getSourceFormat() && this.source == audioSpec.getSource() && this.sampleRate.equals(audioSpec.getSampleRate()) && this.channelCount == audioSpec.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
        return this.source;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
        return this.sourceFormat;
    }

    public int hashCode() {
        return this.channelCount ^ ((((((((this.bitrate.hashCode() ^ 1000003) * 1000003) ^ this.sourceFormat) * 1000003) ^ this.source) * 1000003) ^ this.sampleRate.hashCode()) * 1000003);
    }

    @Override // androidx.camera.video.AudioSpec
    public AudioSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.bitrate);
        sb.append(", sourceFormat=");
        sb.append(this.sourceFormat);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channelCount=");
        return a$$ExternalSyntheticOutline0.m(sb, this.channelCount, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AudioSpec.Builder {
        private Range<Integer> bitrate;
        private Integer channelCount;
        private Range<Integer> sampleRate;
        private Integer source;
        private Integer sourceFormat;

        private Builder(AudioSpec audioSpec) {
            this.bitrate = audioSpec.getBitrate();
            this.sourceFormat = Integer.valueOf(audioSpec.getSourceFormat());
            this.source = Integer.valueOf(audioSpec.getSource());
            this.sampleRate = audioSpec.getSampleRate();
            this.channelCount = Integer.valueOf(audioSpec.getChannelCount());
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec build() {
            String str = this.bitrate == null ? " bitrate" : "";
            if (this.sourceFormat == null) {
                str = str.concat(" sourceFormat");
            }
            if (this.source == null) {
                str = str.concat(" source");
            }
            if (this.sampleRate == null) {
                str = str.concat(" sampleRate");
            }
            if (this.channelCount == null) {
                str = str.concat(" channelCount");
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioSpec(this.bitrate, this.sourceFormat.intValue(), this.source.intValue(), this.sampleRate, this.channelCount.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setBitrate(Range<Integer> range) {
            if (range != null) {
                this.bitrate = range;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null bitrate");
            return null;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSampleRate(Range<Integer> range) {
            if (range != null) {
                this.sampleRate = range;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null sampleRate");
            return null;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSource(int i) {
            this.source = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSourceFormat(int i) {
            this.sourceFormat = Integer.valueOf(i);
            return this;
        }

        public Builder() {
        }
    }
}
