package com.amazon.rtcsc.service.deviceconfiguration.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class VideoCodecConfigInfoUtil {
    public static void addLowLatencyExtraDecoderMediaFormat(boolean z, Map<String, Integer> map) {
        map.put(DeviceConfigConstants.MEDIA_FORMAT_VDEC_LOWLATENCY, Integer.valueOf(z ? 1 : 0));
    }

    public static void addUseSpecificDecoderExtraDecoderMediaFormat(boolean z, Map<String, Integer> map) {
        map.put(DeviceConfigConstants.MEDIA_USE_SPECIFIC_DECODER, Integer.valueOf(z ? 1 : 0));
    }

    public static String buildAmlogicH264VideoCodecConfigInfoJsonString(String str) {
        return a$$ExternalSyntheticOutline0.m("{\"CodecType\": \"H264\",\"CodecPrefix\": \"OMX.amlogic.\",\"EnableH264HighProfileIfAvailable\": false,\"VideoEncoderBitrateAdjustmentType\": \"", str, "\"}");
    }

    public static String buildFTVMTKH264ALLMVideoCodecConfigInfoJsonString(String str) {
        StringBuilder sb = new StringBuilder("{\"CodecType\": \"H264\",\"CodecPrefix\": \"OMX.MTK.\",\"EnableH264HighProfileIfAvailable\": false,\"VideoEncoderBitrateAdjustmentType\": \"");
        new HashMap();
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }

    public static String buildFTVMTKH264VideoCodecConfigInfoJsonString(String str) {
        StringBuilder sb = new StringBuilder("{\"CodecType\": \"H264\",\"CodecPrefix\": \"OMX.MTK.\",\"EnableH264HighProfileIfAvailable\": false,\"VideoEncoderBitrateAdjustmentType\": \"");
        HashMap hashMap = new HashMap();
        addLowLatencyExtraDecoderMediaFormat(true, hashMap);
        addUseSpecificDecoderExtraDecoderMediaFormat(true, hashMap);
        sb.append(str);
        sb.append("\",\"ExtraDecoderMediaFormat\": ");
        sb.append(createExtraDecoderMediaFormatJsonString(hashMap));
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public static String buildKirinH264VideoCodecConfigInfoJsonString(String str) {
        return a$$ExternalSyntheticOutline0.m("{\"CodecType\": \"H264\",\"CodecPrefix\": \"OMX.hisi.\",\"EnableH264HighProfileIfAvailable\": false,\"VideoEncoderBitrateAdjustmentType\": \"", str, "\"}");
    }

    public static String buildMTKH264VideoCodecConfigInfoJsonString(String str) {
        StringBuilder sb = new StringBuilder("{\"CodecType\": \"H264\",\"CodecPrefix\": \"OMX.MTK.\",\"EnableH264HighProfileIfAvailable\": false,\"VideoEncoderBitrateAdjustmentType\": \"");
        HashMap hashMap = new HashMap();
        addLowLatencyExtraDecoderMediaFormat(true, hashMap);
        sb.append(str);
        sb.append("\",\"ExtraDecoderMediaFormat\": ");
        sb.append(createExtraDecoderMediaFormatJsonString(hashMap));
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public static String createExtraDecoderMediaFormatJsonString(Map<String, Integer> map) {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            m.append("{");
            m.append((Object) entry.getKey());
            m.append(": ");
            m.append(entry.getValue());
            m.append("},");
        }
        m.setLength(m.length() - 1);
        m.append(MarkdownConstants.RIGHT_BRACKET);
        return m.toString();
    }

    public static String createWebRTCConfigJsonString(String str, List<String> list) {
        if (str == null && list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\"WebRTCConfig\": {");
        if (str != null) {
            sb.append("\"WebRTCFieldTrials\": \"");
            sb.append(str);
            sb.append(DeviceConfigConstants.DOUBLE_QUOTE);
            if (!list.isEmpty()) {
                sb.append(",");
            }
        }
        if (!list.isEmpty()) {
            sb.append("\"VideoCodecConfigInfoList\": [");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }
}
