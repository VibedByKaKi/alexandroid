package org.webrtc;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class H264Utils {
    public static VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(false));
    public static VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC = new VideoCodecInfo("H264", getDefaultH264Params(true));
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";

    public static Map<String, String> getDefaultH264Params(boolean z) {
        HashMap m = Automotive$$ExternalSyntheticOutline0.m("level-asymmetry-allowed", "1", "packetization-mode", "1");
        m.put("profile-level-id", z ? "640c1f" : "42e01f");
        return m;
    }

    public static boolean isSameH264Profile(Map<String, String> map, Map<String, String> map2) {
        return nativeIsSameH264Profile(map, map2);
    }

    private static native boolean nativeIsSameH264Profile(Map<String, String> map, Map<String, String> map2);
}
