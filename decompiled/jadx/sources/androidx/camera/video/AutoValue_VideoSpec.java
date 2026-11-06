package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.VideoSpec;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_VideoSpec extends VideoSpec {
    private final int aspectRatio;
    private final Range<Integer> bitrate;
    private final Range<Integer> frameRate;
    private final QualitySelector qualitySelector;

    private AutoValue_VideoSpec(QualitySelector qualitySelector, Range<Integer> range, Range<Integer> range2, int i) {
        this.qualitySelector = qualitySelector;
        this.frameRate = range;
        this.bitrate = range2;
        this.aspectRatio = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoSpec) {
            VideoSpec videoSpec = (VideoSpec) obj;
            if (this.qualitySelector.equals(videoSpec.getQualitySelector()) && this.frameRate.equals(videoSpec.getFrameRate()) && this.bitrate.equals(videoSpec.getBitrate()) && this.aspectRatio == videoSpec.getAspectRatio()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.VideoSpec
    public int getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // androidx.camera.video.VideoSpec
    @NonNull
    public Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.VideoSpec
    @NonNull
    public Range<Integer> getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.camera.video.VideoSpec
    @NonNull
    public QualitySelector getQualitySelector() {
        return this.qualitySelector;
    }

    public int hashCode() {
        return this.aspectRatio ^ ((((((this.qualitySelector.hashCode() ^ 1000003) * 1000003) ^ this.frameRate.hashCode()) * 1000003) ^ this.bitrate.hashCode()) * 1000003);
    }

    @Override // androidx.camera.video.VideoSpec
    public VideoSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.qualitySelector);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", aspectRatio=");
        return a$$ExternalSyntheticOutline0.m(sb, this.aspectRatio, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends VideoSpec.Builder {
        private Integer aspectRatio;
        private Range<Integer> bitrate;
        private Range<Integer> frameRate;
        private QualitySelector qualitySelector;

        private Builder(VideoSpec videoSpec) {
            this.qualitySelector = videoSpec.getQualitySelector();
            this.frameRate = videoSpec.getFrameRate();
            this.bitrate = videoSpec.getBitrate();
            this.aspectRatio = Integer.valueOf(videoSpec.getAspectRatio());
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec build() {
            String str = this.qualitySelector == null ? " qualitySelector" : "";
            if (this.frameRate == null) {
                str = str.concat(" frameRate");
            }
            if (this.bitrate == null) {
                str = str.concat(" bitrate");
            }
            if (this.aspectRatio == null) {
                str = str.concat(" aspectRatio");
            }
            if (str.isEmpty()) {
                return new AutoValue_VideoSpec(this.qualitySelector, this.frameRate, this.bitrate, this.aspectRatio.intValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setAspectRatio(int i) {
            this.aspectRatio = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setBitrate(Range<Integer> range) {
            if (range != null) {
                this.bitrate = range;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null bitrate");
            return null;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setFrameRate(Range<Integer> range) {
            if (range != null) {
                this.frameRate = range;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null frameRate");
            return null;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public VideoSpec.Builder setQualitySelector(QualitySelector qualitySelector) {
            if (qualitySelector != null) {
                this.qualitySelector = qualitySelector;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null qualitySelector");
            return null;
        }

        public Builder() {
        }
    }
}
