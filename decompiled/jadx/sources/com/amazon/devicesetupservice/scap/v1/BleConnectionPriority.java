package com.amazon.devicesetupservice.scap.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("BLE Connection Priority.")
/* loaded from: classes5.dex */
public class BleConnectionPriority {
    public static final String HIGH = "HIGH";
    public static final String BALANCED = "BALANCED";
    public static final String LOW = "LOW";
    private static final String[] values = {HIGH, BALANCED, LOW};

    private BleConnectionPriority() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
