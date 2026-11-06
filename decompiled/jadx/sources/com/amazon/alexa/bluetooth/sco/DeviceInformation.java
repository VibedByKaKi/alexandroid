package com.amazon.alexa.bluetooth.sco;

import android.os.Build;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class DeviceInformation {

    @VisibleForTesting
    static final int ANDROID_Q = 29;

    @VisibleForTesting
    static final String MANUFACTURER_SAMSUNG = "samsung";
    public static final String TAG = "DeviceInformation";

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public int getVersionSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public boolean isSamsungAndAndroidQ() {
        return getManufacturer().equalsIgnoreCase(MANUFACTURER_SAMSUNG) && getVersionSdkInt() >= 29;
    }
}
