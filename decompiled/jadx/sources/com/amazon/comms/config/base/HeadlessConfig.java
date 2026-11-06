package com.amazon.comms.config.base;

import android.content.Context;
import com.amazon.comms.config.DeviceConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.SimJobScheduler;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.device.DeviceFacadeType;
import com.amazon.comms.device.HeadlessDeviceFacade;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HeadlessConfig extends DeviceConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static HeadlessConfig headlessConfig = new HeadlessConfig();

    public static HeadlessConfig getDeviceConfigInstance() {
        return headlessConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean captureToTexture() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public AvsDeviceFacade getAvsDeviceFacade(Context context) {
        return new HeadlessDeviceFacade(context);
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DeviceFacadeType getAvsDeviceFacadeType() {
        return DeviceFacadeType.HEADLESS_DEVICE_FACADE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public SimJobScheduler getJobScheduler(Context context) {
        try {
            return (SimJobScheduler) Class.forName(DeviceConfigConstants.DEVICE_JOBSCHEDULER_IMPL_HEADLESSTACHYON).getConstructor(Context.class).newInstance(context);
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUILauncherName() {
        return DeviceConfigConstants.HEADLESS_UI_LAUNCHER;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUIMainActivity() {
        return "";
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUINotificationManagerName() {
        return DeviceConfigConstants.HEADLESS_UI_NOTIFICATION_MANAGER;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isDataChannelSupportedWithEnhancedProcessing() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean loadWeblabCommsFeaturesThroughSubProcess() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsCallReconnection() {
        return true;
    }
}
