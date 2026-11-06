package com.amazon.minerva.client.common.internal.util;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DevicePlatformIdentifierUtil {
    private static final String BUILD_MANUFACTURER_VALUE_AMAZON = "Amazon";
    private static DevicePlatformIdentifierUtil sDevicePlatformIdentifierUtil;
    private final boolean mIsDevicePlatformFireOS = "Amazon".equalsIgnoreCase(Build.MANUFACTURER);

    private DevicePlatformIdentifierUtil() {
    }

    public static DevicePlatformIdentifierUtil getInstance() {
        if (sDevicePlatformIdentifierUtil == null) {
            sDevicePlatformIdentifierUtil = new DevicePlatformIdentifierUtil();
        }
        return sDevicePlatformIdentifierUtil;
    }

    public boolean isDevicePlatformFireOS() {
        return this.mIsDevicePlatformFireOS;
    }
}
