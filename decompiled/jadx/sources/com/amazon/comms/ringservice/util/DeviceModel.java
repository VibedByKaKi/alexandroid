package com.amazon.comms.ringservice.util;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceModel {
    public static final boolean AMAZON_AEOKN;
    public static final boolean AMAZON_DEVICE;

    static {
        boolean equalsIgnoreCase = "Amazon".equalsIgnoreCase(Build.BRAND);
        AMAZON_DEVICE = equalsIgnoreCase;
        AMAZON_AEOKN = equalsIgnoreCase && "AEOKN".equalsIgnoreCase(Build.MODEL);
    }
}
