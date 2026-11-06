package org.webrtc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Map;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CodecConfigInfo {

    @NonNull
    BitrateAdjustmentType bitrateAdjustmentType;

    @NonNull
    String codecPrefix;

    @NonNull
    VideoCodecMimeType codecType;
    boolean enableH264HighProfileIfAvailable;
    Map<String, Integer> extraDecoderMediaFormat;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CodecConfigInfoBuilder {
        private BitrateAdjustmentType bitrateAdjustmentType;
        private String codecPrefix;
        private VideoCodecMimeType codecType;
        private boolean enableH264HighProfileIfAvailable;
        private Map<String, Integer> extraDecoderMediaFormat;

        public CodecConfigInfoBuilder bitrateAdjustmentType(@NonNull BitrateAdjustmentType bitrateAdjustmentType) {
            if (bitrateAdjustmentType != null) {
                this.bitrateAdjustmentType = bitrateAdjustmentType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("bitrateAdjustmentType is marked non-null but is null");
            return null;
        }

        public CodecConfigInfo build() {
            return new CodecConfigInfo(this.codecPrefix, this.codecType, this.extraDecoderMediaFormat, this.enableH264HighProfileIfAvailable, this.bitrateAdjustmentType);
        }

        public CodecConfigInfoBuilder codecPrefix(@NonNull String str) {
            if (str != null) {
                this.codecPrefix = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("codecPrefix is marked non-null but is null");
            return null;
        }

        public CodecConfigInfoBuilder codecType(@NonNull VideoCodecMimeType videoCodecMimeType) {
            if (videoCodecMimeType != null) {
                this.codecType = videoCodecMimeType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("codecType is marked non-null but is null");
            return null;
        }

        public CodecConfigInfoBuilder enableH264HighProfileIfAvailable(boolean z) {
            this.enableH264HighProfileIfAvailable = z;
            return this;
        }

        public CodecConfigInfoBuilder extraDecoderMediaFormat(Map<String, Integer> map) {
            this.extraDecoderMediaFormat = map;
            return this;
        }

        public String toString() {
            return "CodecConfigInfo.CodecConfigInfoBuilder(codecPrefix=" + this.codecPrefix + ", codecType=" + this.codecType + ", extraDecoderMediaFormat=" + this.extraDecoderMediaFormat + ", enableH264HighProfileIfAvailable=" + this.enableH264HighProfileIfAvailable + ", bitrateAdjustmentType=" + this.bitrateAdjustmentType + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public CodecConfigInfo(@NonNull String str, @NonNull VideoCodecMimeType videoCodecMimeType, Map<String, Integer> map, boolean z, @NonNull BitrateAdjustmentType bitrateAdjustmentType) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("codecPrefix is marked non-null but is null");
            throw null;
        }
        if (videoCodecMimeType == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("codecType is marked non-null but is null");
            throw null;
        }
        if (bitrateAdjustmentType == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bitrateAdjustmentType is marked non-null but is null");
            throw null;
        }
        this.codecPrefix = str;
        this.codecType = videoCodecMimeType;
        this.extraDecoderMediaFormat = map;
        this.enableH264HighProfileIfAvailable = z;
        this.bitrateAdjustmentType = bitrateAdjustmentType;
    }

    public static CodecConfigInfoBuilder builder() {
        return new CodecConfigInfoBuilder();
    }

    @NonNull
    public BitrateAdjustmentType getBitrateAdjustmentType() {
        return this.bitrateAdjustmentType;
    }

    @NonNull
    public String getCodecPrefix() {
        return this.codecPrefix;
    }

    @NonNull
    public VideoCodecMimeType getCodecType() {
        return this.codecType;
    }

    public Map<String, Integer> getExtraDecoderMediaFormat() {
        return this.extraDecoderMediaFormat;
    }

    public boolean isEnableH264HighProfileIfAvailable() {
        return this.enableH264HighProfileIfAvailable;
    }
}
