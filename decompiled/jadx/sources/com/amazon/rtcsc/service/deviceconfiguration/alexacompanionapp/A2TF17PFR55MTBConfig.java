package com.amazon.rtcsc.service.deviceconfiguration.alexacompanionapp;

import com.amazon.rtcsc.service.deviceconfiguration.DeviceInfo;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class A2TF17PFR55MTBConfig {
    private static final String a2TF17PFR55MTBConfig = "{\"MaxWidth\": 1280,\"MaxHeight\": 720,\"MaxFramerate\": 30,\"MaxVideoKBitrate\": 2500,\"StartVideoKBitrate\": 900,\"StartAudioKBitrate\": 32," + VideoCodecConfigInfoUtil.createWebRTCConfigJsonString(getWebRTCFieldTrials(), getWebRTCVideoCodecConfigInfoList()) + ",\"PreferCamera1\": false,\"FrostingSupported\": true}";

    public static String getDeviceConfigInstance() {
        return a2TF17PFR55MTBConfig;
    }

    public static String getWebRTCFieldTrials() {
        return DeviceInfo.isAmazonDevice() ? "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-AVSync-AudioDelayEstimateMs/Enabled-300/WebRTC-LegacyTlsProtocols/Enabled/" : "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    }

    public static List<String> getWebRTCVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        if (DeviceInfo.isAmazonDevice()) {
            arrayList.add(VideoCodecConfigInfoUtil.buildMTKH264VideoCodecConfigInfoJsonString(DeviceConfigConstants.FRAMERATE_ADJUSTMENT));
            return arrayList;
        }
        if (DeviceInfo.getSDKVersion() >= 26) {
            arrayList.add(VideoCodecConfigInfoUtil.buildKirinH264VideoCodecConfigInfoJsonString(DeviceConfigConstants.FRAMERATE_ADJUSTMENT));
        }
        return arrayList;
    }
}
