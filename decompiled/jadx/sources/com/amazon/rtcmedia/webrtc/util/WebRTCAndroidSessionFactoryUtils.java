package com.amazon.rtcmedia.webrtc.util;

import android.media.MediaCodecInfo;
import com.amazon.rtcmedia.util.RtcscLogger;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.webrtc.BitrateAdjustmentType;
import org.webrtc.CodecConfigInfo;
import org.webrtc.Predicate;
import org.webrtc.VideoCodecMimeType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WebRTCAndroidSessionFactoryUtils {
    private static RtcscLogger mLog = RtcscLogger.getLogger(WebRTCAndroidSessionFactoryUtils.class);

    public static JSONObject parseWebRTCConfig(String str) {
        if (str.isEmpty()) {
            return null;
        }
        try {
            return (JSONObject) new JSONParser().parse(str);
        } catch (ParseException e) {
            mLog.e("Error parsing WebRTCConfig Json array: " + e);
            return null;
        }
    }

    public static BitrateAdjustmentType wrapBitrateAdjustmentType(String str) {
        String upperCase = str.toUpperCase();
        int hashCode = upperCase.hashCode();
        if (hashCode != -1759065715) {
            if (hashCode == -547474773) {
                upperCase.equals(DeviceConfigConstants.NO_ADJUSTMENT);
            } else if (hashCode == 2053048639 && upperCase.equals(DeviceConfigConstants.FRAMERATE_ADJUSTMENT)) {
                return BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
            }
        } else if (upperCase.equals("DYNAMIC_ADJUSTMENT")) {
            return BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        }
        return BitrateAdjustmentType.NO_ADJUSTMENT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String wrapCodecPrefix(JSONObject jSONObject) throws Exception {
        String str = (String) jSONObject.get(WebRTCAndroidConstants.WEBRTC_CODEC_PREFIX_KEY);
        if (str != null) {
            return str;
        }
        throw new Exception("Missing codecPrefix in VideoCodecConfigInfo.");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static VideoCodecMimeType wrapCodecType(String str) {
        String upperCase = str.toUpperCase();
        switch (upperCase.hashCode()) {
            case 85182:
                if (upperCase.equals("VP8")) {
                    return VideoCodecMimeType.VP8;
                }
                break;
            case 85183:
                if (upperCase.equals("VP9")) {
                    return VideoCodecMimeType.VP9;
                }
                break;
            case 2194728:
                upperCase.equals("H264");
                break;
        }
        return VideoCodecMimeType.H264;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean wrapEnableH264HighProfileIfAvailable(JSONObject jSONObject) {
        V v = jSONObject.get(WebRTCAndroidConstants.WEBRTC_ENABLE_H264_HIGH_PROFILE_KEY);
        if (v == 0) {
            return false;
        }
        return ((Boolean) v).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, Integer> wrapExtraDecoderMediaFormat(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        V v = jSONObject.get(WebRTCAndroidConstants.WEBRTC_EXTRA_DECODER_MEDIA_FORMAT_KEY);
        if (v != 0) {
            JSONArray jSONArray = (JSONArray) v;
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                for (K k : jSONObject2.keySet()) {
                    hashMap.put(k, Integer.valueOf(((Long) jSONObject2.get(k)).intValue()));
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String wrapFieldTrials(JSONObject jSONObject) {
        String str;
        return (jSONObject == null || (str = (String) jSONObject.get(WebRTCAndroidConstants.WEBRTC_FIELD_TRIALS_KEY)) == null) ? "" : str;
    }

    public static Predicate<MediaCodecInfo> wrapPredicate(JSONObject jSONObject) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<CodecConfigInfo> wrapVideoCodecConfigInfoList(JSONObject jSONObject) {
        V v;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (v = jSONObject.get(WebRTCAndroidConstants.WEBRTC_VIDEO_CODEC_CONFIG_INFO_LIST_KEY)) != 0) {
            try {
                JSONArray jSONArray = (JSONArray) v;
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    String wrapCodecPrefix = wrapCodecPrefix(jSONObject2);
                    VideoCodecMimeType wrapCodecType = wrapCodecType(jSONObject2);
                    arrayList.add(CodecConfigInfo.builder().codecPrefix(wrapCodecPrefix).codecType(wrapCodecType).enableH264HighProfileIfAvailable(wrapEnableH264HighProfileIfAvailable(jSONObject2)).bitrateAdjustmentType(wrapBitrateAdjustmentType(jSONObject2)).extraDecoderMediaFormat(wrapExtraDecoderMediaFormat(jSONObject2)).build());
                }
            } catch (Exception e) {
                mLog.e("Error parsing VideoCodecConfigInfoList: " + e);
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VideoCodecMimeType wrapCodecType(JSONObject jSONObject) throws Exception {
        String str = (String) jSONObject.get(WebRTCAndroidConstants.WEBRTC_CODEC_TYPE_KEY);
        if (str != null) {
            return wrapCodecType(str);
        }
        throw new Exception("Missing codecType in VideoCodecConfigInfo.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BitrateAdjustmentType wrapBitrateAdjustmentType(JSONObject jSONObject) {
        String str = (String) jSONObject.get(WebRTCAndroidConstants.WEBRTC_VIDEO_ENCODER_BITRATE_KEY);
        if (str == null) {
            return BitrateAdjustmentType.NO_ADJUSTMENT;
        }
        return wrapBitrateAdjustmentType(str);
    }
}
