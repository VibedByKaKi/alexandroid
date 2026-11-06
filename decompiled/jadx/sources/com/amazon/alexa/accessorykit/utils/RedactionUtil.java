package com.amazon.alexa.accessorykit.utils;

import com.amazon.alexa.accessorykit.interprocess.mobilytics.AccessoryMobilyticsDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class RedactionUtil {
    public static final String REDACTED = "[REDACTED]";

    private RedactionUtil() {
    }

    public static AccessoryMobilyticsDevice redact(AccessoryMobilyticsDevice accessoryMobilyticsDevice) {
        if (accessoryMobilyticsDevice == null) {
            return null;
        }
        return new AccessoryMobilyticsDevice(accessoryMobilyticsDevice.deviceType(), "[REDACTED]");
    }
}
