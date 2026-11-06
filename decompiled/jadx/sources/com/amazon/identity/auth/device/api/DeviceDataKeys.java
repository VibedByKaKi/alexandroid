package com.amazon.identity.auth.device.api;

import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.lo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DeviceDataKeys {

    @FireOsSdk
    public static final String KEY_DEVICE_SERIAL_NUMBER = "Device Serial Number";

    @FireOsSdk
    public static final String KEY_DEVICE_TYPE = "DeviceType";

    @FireOsSdk
    public static final String KEY_KE_DEVICE = "ke_device";

    @FireOsSdk
    public static final String KEY_KE_EDITION = "ke_edition";

    @FireOsSdk
    public static final String KEY_RE_DEVICE = "re_device";

    @FireOsSdk
    public static String getDeviceTypeKeyForPackage(String str) {
        return lo.a(str, "DeviceType");
    }
}
