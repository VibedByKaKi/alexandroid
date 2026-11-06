package com.amazon.comms.config.echo.multimodal;

import android.content.Context;
import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.base.MultiModalConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.LedControllerType;
import com.amazon.comms.config.util.SimJobScheduler;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A2MDL5WTJIU8SZConfig extends MultiModalConfig {
    private static final String WEBRTC_FIELD_TRIALS = "VideoFrameEmit/Enabled/WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static A2MDL5WTJIU8SZConfig a2MDL5WTJIU8SZConfig = new A2MDL5WTJIU8SZConfig();

    public static A2MDL5WTJIU8SZConfig getDeviceConfigInstance() {
        return a2MDL5WTJIU8SZConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_LIBASP;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public SimJobScheduler getJobScheduler(Context context) {
        try {
            return (SimJobScheduler) Class.forName(DeviceConfigConstants.DEVICE_JOBSCHEDULER_IMPL_MULTIMODALTACHYONARM).newInstance();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public LedControllerType getLedControllerType() {
        return DeviceConfigConstants.LED_CONTROLLER_TYPE_LIGHT_SERVICE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildQCOMH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.NO_ADJUSTMENT));
        return arrayList;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoFps() {
        return 30;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoHeight() {
        return 720;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoMaxBitrate() {
        return 2500;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 900;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoWidth() {
        return 1280;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean ignoreCameraEvictionError() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean isBackgroundFloatingPIPCapable() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isCameraSelectorCapability() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isRealTimeTextCapable() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean loadWeblabCommsFeaturesThroughSubProcess() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean preferCamera1API() {
        return false;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean shouldDelayCameraStartupTillLocalSdpGenerated() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean simulateFirstFrameReceived() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsHints() {
        return true;
    }
}
