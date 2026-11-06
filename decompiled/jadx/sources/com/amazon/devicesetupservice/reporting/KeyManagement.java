package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class KeyManagement {
    public static final String NONE = "NONE";
    public static final String OPEN = "OPEN";
    public static final String WEP = "WEP";
    public static final String WPAPSK = "WPAPSK";
    private static final String[] values = {"WPAPSK", "WEP", "OPEN", "NONE"};

    private KeyManagement() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
