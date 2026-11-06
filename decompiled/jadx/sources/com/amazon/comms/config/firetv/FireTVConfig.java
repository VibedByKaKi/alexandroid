package com.amazon.comms.config.firetv;

import android.content.Context;
import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.config.base.MultiModalConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.LedControllerType;
import com.amazon.comms.config.util.SimJobScheduler;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.device.DeviceFacadeType;
import com.amazon.comms.device.FireTVDeviceFacade;
import com.amazon.comms.policy.CallingServiceRuntimePolicy;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FireTVConfig extends MultiModalConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-MTKH264/Enabled/WebRTC-MTKH264-LowLatency/Enabled/WebRTC-AMLOGICH264/Enabled/WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static FireTVConfig fireTVConfig = new FireTVConfig();

    public static FireTVConfig getDeviceConfigInstance() {
        return fireTVConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean acceptPresenceBroadcast() {
        return false;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public AvsDeviceFacade getAvsDeviceFacade(Context context) {
        return new FireTVDeviceFacade(context);
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public DeviceFacadeType getAvsDeviceFacadeType() {
        return DeviceFacadeType.FIRETV_DEVICE_FACADE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_LIBASP;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public SimJobScheduler getJobScheduler(Context context) {
        try {
            return (SimJobScheduler) Class.forName(DeviceConfigConstants.DEVICE_JOBSCHEDULER_IMPL_FIRETV).newInstance();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public LedControllerType getLedControllerType() {
        return DeviceConfigConstants.LED_CONTROLLER_TYPE_NONE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public synchronized CallingServiceRuntimePolicy getRuntimePolicy(Context context) {
        try {
            try {
                if (this.runtimePolicy == null) {
                    this.runtimePolicy = (CallingServiceRuntimePolicy) Class.forName(DeviceConfigConstants.SLIMFAST_RUNTIME_POLICY).getDeclaredConstructor(Context.class).newInstance(context);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.runtimePolicy;
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
    public boolean isForceReceiveOnlyVideo() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean loadWeblabCommsFeaturesThroughSubProcess() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean shouldPersistSimDeviceContext() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean simulateFirstFrameReceived() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean supportsCallReconnection() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsHints() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsOneWayVideoCalling() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean waitForAcceptBeforeSettingSDP() {
        return true;
    }
}
