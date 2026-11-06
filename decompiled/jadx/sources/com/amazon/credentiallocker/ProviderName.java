package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Used in WPA2-Enterprise configurations that have a remote certificate provider.")
/* loaded from: classes19.dex */
public class ProviderName {
    public static final String ALEXA_ENTERPRISE = "ALEXA_ENTERPRISE";
    private static final String[] values = {ALEXA_ENTERPRISE};

    private ProviderName() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
