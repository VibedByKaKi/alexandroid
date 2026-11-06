package com.amazon.alexa.utils.device;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.devices.constants.VoiceApp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaHandsFreeDeviceInformation {
    private final Context context;

    public AlexaHandsFreeDeviceInformation(Context context) {
        this.context = context;
    }

    public boolean isCurrentDeviceHandsFree() {
        return AMPDInformationProvider.getInstance(this.context).isHandsFreeCapable();
    }

    public boolean isCurrentDeviceMTK() {
        if (AMPDInformationProvider.getInstance(this.context).isHandsFreeCapable()) {
            return DeviceTypeInformationProvider.getInstance(this.context).getSupportedDeviceInformation(this.context).getVoiceApp().equals(VoiceApp.METRO);
        }
        return false;
    }

    public boolean isCurrentDeviceTrueTurnkeyAudio() {
        if (!isCurrentDeviceHandsFree()) {
            return false;
        }
        VoiceApp voiceApp = DeviceTypeInformationProvider.getInstance(this.context).getSupportedDeviceInformation(this.context).getVoiceApp();
        int minTrueTurnkeyAudioVersion = voiceApp.getMinTrueTurnkeyAudioVersion();
        PackageInfo packageInfoIfEnabled = AMPDInformationProvider.getInstance(this.context).getPackageInfoIfEnabled(voiceApp.getPackageName());
        return packageInfoIfEnabled != null && packageInfoIfEnabled.versionCode >= minTrueTurnkeyAudioVersion;
    }

    public static boolean isCurrentDeviceHandsFree(Context context) {
        return AMPDInformationProvider.getInstance(context).isHandsFreeCapable();
    }
}
