package com.amazon.devicesetupservice.smarthome;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class ProtocolType {
    public static final String MATTER = "MATTER";
    public static final String ZIGBEE = "ZIGBEE";
    public static final String BLE = "BLE";
    public static final String BLE_MESH = "BLE_MESH";
    public static final String WIFI = "WIFI";
    public static final String THREAD = "THREAD";
    private static final String[] values = {ZIGBEE, BLE, BLE_MESH, WIFI, "MATTER", THREAD};

    private ProtocolType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
