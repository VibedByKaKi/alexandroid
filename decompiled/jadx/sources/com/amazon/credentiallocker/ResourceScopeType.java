package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes19.dex */
public class ResourceScopeType {
    public static final String LOCATION = "Location";
    public static final String STAGE = "Stage";
    private static final String[] values = {"Location", STAGE};

    private ResourceScopeType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
