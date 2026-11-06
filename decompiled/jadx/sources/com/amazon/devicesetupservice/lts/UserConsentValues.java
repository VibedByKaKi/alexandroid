package com.amazon.devicesetupservice.lts;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("An enum to contain defined user consent values for LTS")
/* loaded from: classes5.dex */
public class UserConsentValues {
    public static final String CONTINUE_SETUP = "CONTINUE_SETUP";
    public static final String CONTINUE_SETUP_MATTER_UGS = "CONTINUE_SETUP_MATTER_UGS";
    public static final String NOT_MY_DEVICE = "NOT_MY_DEVICE";
    public static final String NOT_MY_DEVICE_MATTER_UGS = "NOT_MY_DEVICE_MATTER_UGS";
    private static final String[] values = {CONTINUE_SETUP, CONTINUE_SETUP_MATTER_UGS, NOT_MY_DEVICE, NOT_MY_DEVICE_MATTER_UGS};

    private UserConsentValues() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
