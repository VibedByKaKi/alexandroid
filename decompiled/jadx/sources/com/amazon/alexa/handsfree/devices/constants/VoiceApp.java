package com.amazon.alexa.handsfree.devices.constants;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.MotoIOComponentsStateProvider;
import com.amazon.alexa.mobile.assistant.capabilities.iocomponents.QualcommIOComponentsStateProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum VoiceApp {
    QUEBEC(QualcommIOComponentsStateProvider.QUALCOMM_PACKAGE_NAME, 401010, QualcommIOComponentsStateProvider.MIN_VERSION_QUALCOMM_APP, 402004),
    MIKE(MotoIOComponentsStateProvider.MOTOALEXA_PACKAGE_NAME, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
    METRO("com.magiear.handsfree.assistant", 31, 1, Integer.MAX_VALUE),
    FOXTROT("com.amazon.tablet.voiceassistant", 1, 1, Integer.MAX_VALUE);

    public static final int K7_SUPPORTED_APP_VERSION = 26;
    public static final int LG_CAYMAN_SUPPORTED_APP_VERSION = 21;
    public static final int REALME_SALA_SUPPORTED_APP_VERSION = 24;
    private final int m1PSVMinVersion;
    private final int mAHFSdkMinVersion;
    private final String mPackageName;
    private final int mTrueTurnkeyAudioMinVersion;

    VoiceApp(@NonNull String str, @NonNull int i, @NonNull int i2, @NonNull int i3) {
        this.mPackageName = str;
        this.m1PSVMinVersion = i;
        this.mTrueTurnkeyAudioMinVersion = i2;
        this.mAHFSdkMinVersion = i3;
    }

    @NonNull
    public int getAHFSdkSupportedMinVersion() {
        return this.mAHFSdkMinVersion;
    }

    @NonNull
    public int getMinTrueTurnkeyAudioVersion() {
        return this.mTrueTurnkeyAudioMinVersion;
    }

    @NonNull
    public int getMinVersion1PSV() {
        return this.m1PSVMinVersion;
    }

    @NonNull
    public String getPackageName() {
        return this.mPackageName;
    }
}
