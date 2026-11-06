package com.amazon.devicesetup.common.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Type of wpa psk network (wpa2, wpa3 transition, or wpa3 only). Null for non wpa psk networks.")
/* loaded from: classes5.dex */
public class WpaPskType {
    public static final String WPA2 = "WPA2";
    public static final String WPA3_ONLY = "WPA3_ONLY";
    public static final String WPA3_TRANSITION = "WPA3_TRANSITION";
    private static final String[] values = {"WPA3_ONLY", "WPA3_TRANSITION", "WPA2"};

    private WpaPskType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
