package com.amazon.comms.calling.service;

import java.util.Map;
import lombok.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoCodecConfigInfo {

    @NonNull
    private String codecPrefix;
    private VideoCodecType codecType;
    private final boolean enableH264HighProfileIfAvailable = false;
    private Map<String, Integer> extraDecoderMediaFormat;
    private VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType;

    @NonNull
    public String getCodecPrefix() {
        return this.codecPrefix;
    }

    public VideoCodecType getCodecType() {
        return this.codecType;
    }

    public Map<String, Integer> getExtraDecoderMediaFormat() {
        return this.extraDecoderMediaFormat;
    }

    public VideoEncoderBitrateAdjustmentType getVideoEncoderBitrateAdjustmentType() {
        return this.videoEncoderBitrateAdjustmentType;
    }

    public boolean isEnableH264HighProfileIfAvailable() {
        return false;
    }
}
