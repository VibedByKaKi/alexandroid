package com.amazon.alexa.protocols.environment;

import androidx.annotation.NonNull;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes18.dex */
public interface DeviceInformation {
    String getAndroidId();

    String getBrand();

    @NonNull
    Map<String, Object> getDynamicDeviceProfileData(boolean z);

    String getFireOSVersion();

    String getId();

    String getLanguage();

    String getManufacturer();

    int getMemoryClass();

    String getModel();

    String getPlatformType();

    String getSerial();

    @NonNull
    Map<String, Object> getStaticDeviceProfileData();

    String getVersionName();

    String getVersionRelease();

    int getVersionSdkInt();

    boolean isFireOS();

    boolean isPhoneFormFactor();

    void refreshDeviceInfoData();
}
