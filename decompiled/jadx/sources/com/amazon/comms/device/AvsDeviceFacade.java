package com.amazon.comms.device;

import android.media.AudioAttributes;
import android.media.AudioManager;
import com.amazon.comms.metrics.userperceivedfatals.CommsUPFMetricsManagerInterface;
import com.amazon.comms.util.Size;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AvsDeviceFacade {
    public static final String AMAZON_PHOENIX_SDKMODULE_MAPCLIENT = "com.fireos.sdk.mapclientlib";
    public static final int AMAZON_PHOENIX_SDKMODULE_MAPCLIENT_VERSION = 8;
    public static final int FORCE_OUTPUT_AUDIO_DEVICE_NOT_SUPPORTED = -1;
    public static final int GET_INTERNAL_SPEAKER_VOLUME_LEVEL_NOT_SUPPORTED = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CameraAvailabilityListener {
        void onCameraAvailable(String str);

        void onCameraUnavailable(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PrivacyModeListener {
        void onChange(boolean z);
    }

    void destroy();

    boolean enableLocalVideoAtCallInitiation();

    void forceResetMicToDefault();

    AudioAttributes getAudioAttributesForRingtone();

    CommsUPFMetricsManagerInterface getCommsUPFMetricsManagerInstance();

    int getDefaultOutputDeviceForCallAudio();

    Size getDisplaySize();

    int getHdmiFlag();

    int getInternalSpeakerFlag();

    int getInternalSpeakerVolume(AudioManager audioManager, int i);

    int getScreenRotation();

    String getWakeWord();

    boolean isAudioTransferSupported();

    boolean isAuxPluggedIn();

    boolean isBluetoothA2dpOn();

    boolean isCameraPermitted();

    boolean isCameraPresent();

    boolean isCameraShutterCovered();

    boolean isDoNotDisturbOn();

    boolean isDropInDisallowed();

    boolean isExternalCameraPresent();

    boolean isExternalCameraSupported();

    boolean isFireTvDevice();

    boolean isFreeTimeModeOn();

    boolean isMmSdkApplication();

    boolean isMobileWeblabSupported();

    boolean isNightModeOn();

    boolean isOOBEComplete();

    boolean isPrivacyModeOn();

    boolean isPrivilegedTaskInProgress();

    void registerCameraAvailabilityListener(CameraAvailabilityListener cameraAvailabilityListener);

    void registerPrivacyModeListener(PrivacyModeListener privacyModeListener);

    void setCommsUPFMetricsManagerInstance(CommsUPFMetricsManagerInterface commsUPFMetricsManagerInterface);

    void setForceNoSpeakerVolume(AudioManager audioManager);

    void setForceSpeakerVolume(AudioManager audioManager);

    void unregisterCameraAvailabilityListener(CameraAvailabilityListener cameraAvailabilityListener);

    void unregisterPrivacyModeListener(PrivacyModeListener privacyModeListener);
}
