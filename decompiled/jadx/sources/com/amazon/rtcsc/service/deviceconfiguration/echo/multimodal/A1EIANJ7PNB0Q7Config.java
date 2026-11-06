package com.amazon.rtcsc.service.deviceconfiguration.echo.multimodal;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.VideoCodecConfigInfoUtil;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class A1EIANJ7PNB0Q7Config {
    private static final String a1EIANJ7PNB0Q7Config = "{\"MaxWidth\": 1280,\"MaxHeight\": 720,\"MaxFramerate\": 30,\"MaxVideoKBitrate\": 2000,\"StartVideoKBitrate\": 900,\"StartAudioKBitrate\": 48," + VideoCodecConfigInfoUtil.createWebRTCConfigJsonString("WebRTC-Rfc5389StunRetransmissions/Enabled/VideoFrameEmit/Enabled/WebRTC-LegacyTlsProtocols/Enabled/", Arrays.asList(VideoCodecConfigInfoUtil.buildAmlogicH264VideoCodecConfigInfoJsonString(DeviceConfigConstants.FRAMERATE_ADJUSTMENT))) + ",\"PreferCamera1\": false,\"FrostingSupported\": true}";

    public static String getDeviceConfigInstance() {
        return a1EIANJ7PNB0Q7Config;
    }
}
