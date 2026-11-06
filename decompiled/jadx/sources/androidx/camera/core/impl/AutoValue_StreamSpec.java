package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_StreamSpec extends StreamSpec {
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Config implementationOptions;
    private final Size resolution;
    private final boolean zslDisabled;

    private AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range<Integer> range, @Nullable Config config, boolean z) {
        this.resolution = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
        this.zslDisabled = z;
    }

    public boolean equals(Object obj) {
        Config config;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamSpec) {
            StreamSpec streamSpec = (StreamSpec) obj;
            if (this.resolution.equals(streamSpec.getResolution()) && this.dynamicRange.equals(streamSpec.getDynamicRange()) && this.expectedFrameRateRange.equals(streamSpec.getExpectedFrameRateRange()) && ((config = this.implementationOptions) != null ? config.equals(streamSpec.getImplementationOptions()) : streamSpec.getImplementationOptions() == null) && this.zslDisabled == streamSpec.getZslDisabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @NonNull
    public DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @NonNull
    public Range<Integer> getExpectedFrameRateRange() {
        return this.expectedFrameRateRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @Nullable
    public Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    @NonNull
    public Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public boolean getZslDisabled() {
        return this.zslDisabled;
    }

    public int hashCode() {
        int hashCode = (((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.expectedFrameRateRange.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return (this.zslDisabled ? 1231 : 1237) ^ ((hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003);
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public StreamSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.resolution);
        sb.append(", dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.expectedFrameRateRange);
        sb.append(", implementationOptions=");
        sb.append(this.implementationOptions);
        sb.append(", zslDisabled=");
        return a$$ExternalSyntheticOutline0.m(sb, this.zslDisabled, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends StreamSpec.Builder {
        private DynamicRange dynamicRange;
        private Range<Integer> expectedFrameRateRange;
        private Config implementationOptions;
        private Size resolution;
        private Boolean zslDisabled;

        private Builder(StreamSpec streamSpec) {
            this.resolution = streamSpec.getResolution();
            this.dynamicRange = streamSpec.getDynamicRange();
            this.expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
            this.implementationOptions = streamSpec.getImplementationOptions();
            this.zslDisabled = Boolean.valueOf(streamSpec.getZslDisabled());
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec build() {
            String str = this.resolution == null ? " resolution" : "";
            if (this.dynamicRange == null) {
                str = str.concat(" dynamicRange");
            }
            if (this.expectedFrameRateRange == null) {
                str = str.concat(" expectedFrameRateRange");
            }
            if (this.zslDisabled == null) {
                str = str.concat(" zslDisabled");
            }
            if (str.isEmpty()) {
                return new AutoValue_StreamSpec(this.resolution, this.dynamicRange, this.expectedFrameRateRange, this.implementationOptions, this.zslDisabled.booleanValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange != null) {
                this.dynamicRange = dynamicRange;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null dynamicRange");
            return null;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setExpectedFrameRateRange(Range<Integer> range) {
            if (range != null) {
                this.expectedFrameRateRange = range;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null expectedFrameRateRange");
            return null;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setImplementationOptions(Config config) {
            this.implementationOptions = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setResolution(Size size) {
            if (size != null) {
                this.resolution = size;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null resolution");
            return null;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public StreamSpec.Builder setZslDisabled(boolean z) {
            this.zslDisabled = Boolean.valueOf(z);
            return this;
        }

        public Builder() {
        }
    }
}
