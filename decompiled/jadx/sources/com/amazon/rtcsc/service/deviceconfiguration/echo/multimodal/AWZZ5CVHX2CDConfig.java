package com.amazon.rtcsc.service.deviceconfiguration.echo.multimodal;

import com.amazon.rtcsc.service.deviceconfiguration.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AWZZ5CVHX2CDConfig {
    private static final String aWZZ5CVHX2CDConfig = "{\"MaxWidth\": 1280,\"MaxHeight\": 720,\"MaxFramerate\": 30,\"MaxVideoKBitrate\": 2000,\"StartVideoKBitrate\": 600,\"StartAudioKBitrate\": 48," + VideoCodecConfigInfoUtil.createWebRTCConfigJsonString("WebRTC-Rfc5389StunRetransmissions/Enabled/VideoFrameEmit/Enabled/WebRTC-LegacyTlsProtocols/Enabled/", new ArrayList()) + ",\"PreferCamera1\": true,\"FrostingSupported\": true}";

    public static String getDeviceConfigInstance() {
        return aWZZ5CVHX2CDConfig;
    }
}
