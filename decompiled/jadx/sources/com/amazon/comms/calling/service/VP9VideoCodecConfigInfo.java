package com.amazon.comms.calling.service;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Map;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VP9VideoCodecConfigInfo extends VideoCodecConfigInfo {

    @NonNull
    private String codecPrefix;
    private final VideoCodecType codecType;
    private final boolean enableH264HighProfileIfAvailable;
    private Map<String, Integer> extraDecoderMediaFormat;

    @NonNull
    private VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class VP9VideoCodecConfigInfoBuilder {
        private String codecPrefix;
        private boolean codecType$set;
        private VideoCodecType codecType$value;
        private boolean enableH264HighProfileIfAvailable$set;
        private boolean enableH264HighProfileIfAvailable$value;
        private Map<String, Integer> extraDecoderMediaFormat;
        private VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType;
        private VideoCodecType codecType = VideoCodecType.VP9;
        private boolean enableH264HighProfileIfAvailable = false;

        public VP9VideoCodecConfigInfo build() {
            VideoCodecType videoCodecType = this.codecType$value;
            if (!this.codecType$set) {
                videoCodecType = VP9VideoCodecConfigInfo.$default$codecType();
            }
            VideoCodecType videoCodecType2 = videoCodecType;
            boolean z = this.enableH264HighProfileIfAvailable$value;
            if (!this.enableH264HighProfileIfAvailable$set) {
                z = VP9VideoCodecConfigInfo.$default$enableH264HighProfileIfAvailable();
            }
            return new VP9VideoCodecConfigInfo(this.codecPrefix, videoCodecType2, this.extraDecoderMediaFormat, z, this.videoEncoderBitrateAdjustmentType);
        }

        public VP9VideoCodecConfigInfoBuilder codecPrefix(@NonNull String str) {
            if (str != null) {
                this.codecPrefix = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("codecPrefix is marked non-null but is null");
            return null;
        }

        public VP9VideoCodecConfigInfoBuilder codecType(VideoCodecType videoCodecType) {
            this.codecType$value = videoCodecType;
            this.codecType$set = true;
            return this;
        }

        public VP9VideoCodecConfigInfoBuilder enableH264HighProfileIfAvailable(boolean z) {
            this.enableH264HighProfileIfAvailable$value = z;
            this.enableH264HighProfileIfAvailable$set = true;
            return this;
        }

        public VP9VideoCodecConfigInfoBuilder extraDecoderMediaFormat(Map<String, Integer> map) {
            this.extraDecoderMediaFormat = map;
            return this;
        }

        public String toString() {
            return "VP9VideoCodecConfigInfo.VP9VideoCodecConfigInfoBuilder(codecPrefix=" + this.codecPrefix + ", codecType$value=" + this.codecType$value + ", extraDecoderMediaFormat=" + this.extraDecoderMediaFormat + ", enableH264HighProfileIfAvailable$value=" + this.enableH264HighProfileIfAvailable$value + ", videoEncoderBitrateAdjustmentType=" + this.videoEncoderBitrateAdjustmentType + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public VP9VideoCodecConfigInfoBuilder videoEncoderBitrateAdjustmentType(@NonNull VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
            if (videoEncoderBitrateAdjustmentType != null) {
                this.videoEncoderBitrateAdjustmentType = videoEncoderBitrateAdjustmentType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("videoEncoderBitrateAdjustmentType is marked non-null but is null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VideoCodecType $default$codecType() {
        return VideoCodecType.VP9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean $default$enableH264HighProfileIfAvailable() {
        return false;
    }

    public VP9VideoCodecConfigInfo(@NonNull String str, VideoCodecType videoCodecType, Map<String, Integer> map, boolean z, @NonNull VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("codecPrefix is marked non-null but is null");
            throw null;
        }
        if (videoEncoderBitrateAdjustmentType == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("videoEncoderBitrateAdjustmentType is marked non-null but is null");
            throw null;
        }
        this.codecPrefix = str;
        this.codecType = videoCodecType;
        this.extraDecoderMediaFormat = map;
        this.enableH264HighProfileIfAvailable = z;
        this.videoEncoderBitrateAdjustmentType = videoEncoderBitrateAdjustmentType;
    }

    public static VP9VideoCodecConfigInfoBuilder builder() {
        return new VP9VideoCodecConfigInfoBuilder();
    }

    @Override // com.amazon.comms.calling.service.VideoCodecConfigInfo
    @NonNull
    public String getCodecPrefix() {
        return this.codecPrefix;
    }

    @Override // com.amazon.comms.calling.service.VideoCodecConfigInfo
    public VideoCodecType getCodecType() {
        return this.codecType;
    }

    @Override // com.amazon.comms.calling.service.VideoCodecConfigInfo
    public Map<String, Integer> getExtraDecoderMediaFormat() {
        return this.extraDecoderMediaFormat;
    }

    @Override // com.amazon.comms.calling.service.VideoCodecConfigInfo
    @NonNull
    public VideoEncoderBitrateAdjustmentType getVideoEncoderBitrateAdjustmentType() {
        return this.videoEncoderBitrateAdjustmentType;
    }

    @Override // com.amazon.comms.calling.service.VideoCodecConfigInfo
    public boolean isEnableH264HighProfileIfAvailable() {
        return this.enableH264HighProfileIfAvailable;
    }
}
