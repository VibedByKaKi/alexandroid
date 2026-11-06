package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class Radio {
    public static final String THREAD = "Thread";
    public static final String BLUETOOTH_LOW_ENERGY = "BluetoothLowEnergy";
    public static final String WIFI = "Wi-Fi";
    private static final String[] values = {BLUETOOTH_LOW_ENERGY, WIFI, "Thread"};

    private Radio() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
