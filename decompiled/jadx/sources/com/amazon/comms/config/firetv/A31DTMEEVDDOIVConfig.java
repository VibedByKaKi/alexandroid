package com.amazon.comms.config.firetv;

import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A31DTMEEVDDOIVConfig extends FireTVConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static A31DTMEEVDDOIVConfig a31DTMEEVDDOIVConfig = new A31DTMEEVDDOIVConfig();

    public static A31DTMEEVDDOIVConfig getDeviceConfigInstance() {
        return a31DTMEEVDDOIVConfig;
    }

    @Override // com.amazon.comms.config.firetv.FireTVConfig, com.amazon.comms.config.DeviceConfig
    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_NONE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildMTKH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.NO_ADJUSTMENT));
        return arrayList;
    }

    @Override // com.amazon.comms.config.firetv.FireTVConfig, com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.firetv.FireTVConfig, com.amazon.comms.config.DeviceConfig
    public boolean isForceReceiveOnlyVideo() {
        return false;
    }
}
