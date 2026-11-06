package com.amazon.comms.config.echo.multimodal;

import android.content.Context;
import com.amazon.comms.calling.service.AudioConfig;
import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.config.base.MultiModalConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.SimJobScheduler;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AWZZ5CVHX2CDConfig extends MultiModalConfig {
    private static final int RENDER_TRACK_BUFFER_SIZE_BYTES = 1536;
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static AWZZ5CVHX2CDConfig aWZZ5CVHX2CDConfig = new AWZZ5CVHX2CDConfig();

    public static AWZZ5CVHX2CDConfig getDeviceConfigInstance() {
        return aWZZ5CVHX2CDConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean captureToTexture() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getAudioRenderBufferSizeBytes() {
        return 1536;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_LIBASP;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public AudioConfig.FastRenderPath getFastAudioRenderPath() {
        return DeviceConfigConstants.FAST_RENDER_PATH_OPENSLES;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public SimJobScheduler getJobScheduler(Context context) {
        try {
            return (SimJobScheduler) Class.forName(DeviceConfigConstants.DEVICE_JOBSCHEDULER_IMPL_MULTIMODALTACHYONX86).newInstance();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoFps() {
        return 30;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoFramerateBeforeIceConnection() {
        return 15;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoHeight() {
        return 720;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoHeightBeforeIceConnection() {
        return 360;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoMaxBitrate() {
        return 2000;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 600;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoWidth() {
        return 1280;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoWidthBeforeIceConnection() {
        return 640;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getWebRTCStatsPollingFrequency() {
        return 5000;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean hasVDNA() {
        return true;
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

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean shouldConstraintVideoBeforeIceConnection() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean shouldDelayCameraStartupTillLocalSdpGenerated() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean simulateFirstFrameReceived() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsHints() {
        return true;
    }
}
