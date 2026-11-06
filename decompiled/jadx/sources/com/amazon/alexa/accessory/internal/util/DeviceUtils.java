package com.amazon.alexa.accessory.internal.util;

import com.amazon.alexa.accessory.AccessoryTransport;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DeviceUtils {
    private DeviceUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static int getDeviceTransport(AccessoryTransport.Type type) {
        Preconditions.notNull(type, "type");
        if (type == AccessoryTransport.Type.GATT) {
            return 0;
        }
        if (type == AccessoryTransport.Type.RFCOMM) {
            return 1;
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) type, "Unsupported accessory transport ");
        return 0;
    }
}
