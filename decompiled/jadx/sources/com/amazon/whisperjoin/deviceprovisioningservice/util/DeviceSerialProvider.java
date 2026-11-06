package com.amazon.whisperjoin.deviceprovisioningservice.util;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DeviceSerialProvider {
    private static final String TAG = "DeviceSerialProvider";
    private static final String UNKNOWN_ANDROID_DSN = "unknown";

    private DeviceSerialProvider() {
    }

    public static String getDeviceSerial() {
        WJLog.d(TAG, "Using unknown in place of device serial number");
        return "unknown";
    }
}
