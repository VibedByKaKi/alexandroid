package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes19.dex */
public class IdentityProvider {
    public static final String AMAZON = "Amazon";
    public static final String RING = "Ring";
    private static final String[] values = {"Amazon", RING};

    private IdentityProvider() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
