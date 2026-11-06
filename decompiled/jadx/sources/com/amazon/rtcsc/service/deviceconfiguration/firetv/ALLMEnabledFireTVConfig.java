package com.amazon.rtcsc.service.deviceconfiguration.firetv;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.VideoCodecConfigInfoUtil;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ALLMEnabledFireTVConfig {
    private static final String allmEnabledFireTVConfig = "{\"MaxWidth\": 1280,\"MaxHeight\": 720,\"MaxFramerate\": 30,\"MaxVideoKBitrate\": 2000,\"StartVideoKBitrate\": 900,\"StartAudioKBitrate\": 48," + VideoCodecConfigInfoUtil.createWebRTCConfigJsonString("", Arrays.asList(VideoCodecConfigInfoUtil.buildFTVMTKH264ALLMVideoCodecConfigInfoJsonString(DeviceConfigConstants.NO_ADJUSTMENT))) + ",\"FrostingSupported\": false}";

    public static String getDeviceConfigInstance() {
        return allmEnabledFireTVConfig;
    }
}
