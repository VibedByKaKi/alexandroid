package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class TrustMethod {
    public static final String AUTHENTICATED = "AUTHENTICATED";
    public static final String NONE = "NONE";
    public static final String UNAUTHENTICATED = "UNAUTHENTICATED";
    private static final String[] values = {"AUTHENTICATED", "UNAUTHENTICATED", "NONE"};

    private TrustMethod() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
