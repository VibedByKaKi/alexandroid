package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class CustomerOptInPreference {
    public static final String OPTED_IN = "OPTED_IN";
    public static final String OPTED_OUT = "OPTED_OUT";
    public static final String NO_DATA_ASSUME_OPTED_OUT = "NO_DATA_ASSUME_OPTED_OUT";
    private static final String[] values = {"OPTED_OUT", "OPTED_IN", NO_DATA_ASSUME_OPTED_OUT};

    private CustomerOptInPreference() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
