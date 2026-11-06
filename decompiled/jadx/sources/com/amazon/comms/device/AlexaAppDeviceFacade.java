package com.amazon.comms.device;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.metrics.userperceivedfatals.CommsUPFMetricsManagerInterface;
import com.amazon.comms.metrics.userperceivedfatals.DefaultCommsUPFMetricsManager;
import com.amazon.comms.util.DeviceProperties;
import com.amazon.comms.util.Size;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AlexaAppDeviceFacade implements AvsDeviceFacade {
    private static final String AMAZON = "Amazon";
    private static final CommsLogger sLog = CommsLogger.getLogger(AlexaAppDeviceFacade.class);
    private CommsUPFMetricsManagerInterface commsUPFMetricsManager = new DefaultCommsUPFMetricsManager();
    private final Context mContext;

    public AlexaAppDeviceFacade(Context context) {
        this.mContext = context;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void destroy() {
        this.commsUPFMetricsManager = null;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean enableLocalVideoAtCallInitiation() {
        return true;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void forceResetMicToDefault() {
        sLog.w("forceResetMicToDefault not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public AudioAttributes getAudioAttributesForRingtone() {
        return new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public CommsUPFMetricsManagerInterface getCommsUPFMetricsManagerInstance() {
        return this.commsUPFMetricsManager;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public int getDefaultOutputDeviceForCallAudio() {
        return -1;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public Size getDisplaySize() {
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        sLog.i("Screen size:" + i + "x" + i2);
        return new Size(i, i2);
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public int getHdmiFlag() {
        return -1;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public int getInternalSpeakerFlag() {
        return -1;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public int getInternalSpeakerVolume(AudioManager audioManager, int i) {
        sLog.w("getInternalSpeakerVolume not supported");
        return -1;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public int getScreenRotation() {
        return DeviceProperties.getScreenRotation(this.mContext);
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public String getWakeWord() {
        sLog.i("getWakeWord not implemented");
        return null;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isAudioTransferSupported() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isAuxPluggedIn() {
        sLog.i("isAuxPluggedIn not implemented");
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isBluetoothA2dpOn() {
        return ((AudioManager) this.mContext.getSystemService("audio")).isBluetoothA2dpOn();
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isCameraPermitted() {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isCameraPresent() {
        return this.mContext.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isCameraShutterCovered() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isDoNotDisturbOn() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isDropInDisallowed() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isExternalCameraPresent() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isExternalCameraSupported() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isFireTvDevice() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isFreeTimeModeOn() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isMmSdkApplication() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isMobileWeblabSupported() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isNightModeOn() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isOOBEComplete() {
        return true;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isPrivacyModeOn() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public boolean isPrivilegedTaskInProgress() {
        return false;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void registerCameraAvailabilityListener(AvsDeviceFacade.CameraAvailabilityListener cameraAvailabilityListener) {
        sLog.w("registerCameraAvailabilityListener not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void registerPrivacyModeListener(AvsDeviceFacade.PrivacyModeListener privacyModeListener) {
        sLog.w("registerPrivacyModeListener not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void setCommsUPFMetricsManagerInstance(CommsUPFMetricsManagerInterface commsUPFMetricsManagerInterface) {
        this.commsUPFMetricsManager = commsUPFMetricsManagerInterface;
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void setForceNoSpeakerVolume(AudioManager audioManager) {
        sLog.w("setForceNoSpeakerVolume not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void setForceSpeakerVolume(AudioManager audioManager) {
        sLog.w("setForceSpeakerVolume not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void unregisterCameraAvailabilityListener(AvsDeviceFacade.CameraAvailabilityListener cameraAvailabilityListener) {
        sLog.w("unregisterCameraAvailabilityListener not supported");
    }

    @Override // com.amazon.comms.device.AvsDeviceFacade
    public void unregisterPrivacyModeListener(AvsDeviceFacade.PrivacyModeListener privacyModeListener) {
        sLog.w("unregisterPrivacyModeListener not supported");
    }
}
