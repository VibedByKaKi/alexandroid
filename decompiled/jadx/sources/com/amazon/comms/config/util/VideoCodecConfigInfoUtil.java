package com.amazon.comms.config.util;

import com.amazon.comms.calling.service.H264VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoCodecConfigInfoUtil {
    public static VideoCodecConfigInfo buildAmlogicH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType, Map<String, Integer> map) {
        return createAmlogicH264VideoCodecConfigInfoBuilder().extraDecoderMediaFormat(map).videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    public static VideoCodecConfigInfo buildC2MTKH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createC2MTKH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    public static VideoCodecConfigInfo buildKirinH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createKirinH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    public static VideoCodecConfigInfo buildMSH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createMSH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    public static VideoCodecConfigInfo buildMTKH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createMTKH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    public static VideoCodecConfigInfo buildQCOMH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createQCOMH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createAmlogicH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().codecPrefix(DeviceConfigConstants.AMLOGIC_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createC2MTKH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().extraDecoderMediaFormat(createExtraDecoderMediaFormat()).codecPrefix(DeviceConfigConstants.C2_MTK_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    public static Map<String, Integer> createExtraDecoderMediaFormat() {
        HashMap hashMap = new HashMap();
        hashMap.put(DeviceConfigConstants.MEDIA_FORMAT_VDEC_LOWLATENCY, 1);
        return Collections.unmodifiableMap(hashMap);
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createKirinH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().codecPrefix(DeviceConfigConstants.KIRIN_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createMSH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().extraDecoderMediaFormat(createExtraDecoderMediaFormat()).codecPrefix(DeviceConfigConstants.MS_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createMTKH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().extraDecoderMediaFormat(createExtraDecoderMediaFormat()).codecPrefix(DeviceConfigConstants.MTK_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    private static H264VideoCodecConfigInfo.H264VideoCodecConfigInfoBuilder createQCOMH264VideoCodecConfigInfoBuilder() {
        return H264VideoCodecConfigInfo.builder().codecPrefix(DeviceConfigConstants.QCOM_PREFIX).enableH264HighProfileIfAvailable(false);
    }

    public static VideoCodecConfigInfo buildAmlogicH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType) {
        return createAmlogicH264VideoCodecConfigInfoBuilder().videoEncoderBitrateAdjustmentType(videoEncoderBitrateAdjustmentType).build();
    }
}
