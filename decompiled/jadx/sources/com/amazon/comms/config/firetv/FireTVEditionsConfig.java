package com.amazon.comms.config.firetv;

import android.content.Context;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.device.FireTVDeviceFacade;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FireTVEditionsConfig extends FireTVConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/VideoFrameEmit/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static FireTVEditionsConfig fireTVEditionsConfig = new FireTVEditionsConfig();

    public static FireTVEditionsConfig getDeviceConfigInstance() {
        return fireTVEditionsConfig;
    }

    @Override // com.amazon.comms.config.firetv.FireTVConfig, com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public AvsDeviceFacade getAvsDeviceFacade(Context context) {
        return new FireTVDeviceFacade(context, false, false, true);
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildMSH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.NO_ADJUSTMENT));
        return arrayList;
    }

    @Override // com.amazon.comms.config.firetv.FireTVConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoFps() {
        return 35;
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
