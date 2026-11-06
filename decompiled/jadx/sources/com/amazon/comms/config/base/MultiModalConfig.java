package com.amazon.comms.config.base;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import com.amazon.comms.calling.service.VideoConstraints;
import com.amazon.comms.config.DeviceConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.device.DeviceFacadeProvider;
import com.amazon.comms.device.DeviceFacadeType;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class MultiModalConfig extends DeviceConfig {
    private static final Map<Integer, VideoConstraints> supportedVideoConstraints;

    static {
        TreeMap treeMap = new TreeMap();
        CredentialConfig$$ExternalSyntheticOutline0.m(320, 180, 15, treeMap, (Integer) 3600);
        CredentialConfig$$ExternalSyntheticOutline0.m(640, 360, 24, treeMap, (Integer) 21600);
        CredentialConfig$$ExternalSyntheticOutline0.m(640, 360, 30, treeMap, (Integer) 27600);
        CredentialConfig$$ExternalSyntheticOutline0.m(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 540, 24, treeMap, (Integer) 48600);
        CredentialConfig$$ExternalSyntheticOutline0.m(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 540, 30, treeMap, (Integer) 61200);
        CredentialConfig$$ExternalSyntheticOutline0.m(1280, 720, 24, treeMap, Integer.valueOf(DateTimeConstants.SECONDS_PER_DAY));
        CredentialConfig$$ExternalSyntheticOutline0.m(1280, 720, 30, treeMap, (Integer) 108000);
        supportedVideoConstraints = Collections.unmodifiableMap(treeMap);
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public AvsDeviceFacade getAvsDeviceFacade(Context context) {
        return DeviceFacadeProvider.getInstance().getDeviceFacade(context, getAvsDeviceFacadeType());
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public DeviceFacadeType getAvsDeviceFacadeType() {
        return DeviceFacadeType.KNIGHT_DEVICE_FACADE;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getLocalSurfaceViewShape() {
        return "rectangle";
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getRemoteSurfaceViewShape() {
        return "rectangle";
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public Map<Integer, VideoConstraints> getSupportedResolutions() {
        return supportedVideoConstraints;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUILauncherName() {
        return DeviceConfigConstants.CALLING_UI_LAUNCHER;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUIMainActivity() {
        return DeviceConfigConstants.UI_MAIN_ACTIVITY_CALLING_ACTIVITY;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getUINotificationManagerName() {
        return DeviceConfigConstants.CALLING_UI_NOTIFICATION_MANAGER;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isBackgroundFloatingPIPCapable() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean shouldDelayCameraStartupTillLocalSdpGenerated() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsCallReconnection() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean waitForAcceptBeforeSettingSDP() {
        return false;
    }
}
