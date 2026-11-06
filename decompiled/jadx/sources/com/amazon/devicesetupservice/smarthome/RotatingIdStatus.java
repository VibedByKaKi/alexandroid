package com.amazon.devicesetupservice.smarthome;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Matter rotating ID status.")
/* loaded from: classes5.dex */
public class RotatingIdStatus {
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String RETRIEVED = "RETRIEVED";
    public static final String RETRIEVAL_FAILED = "RETRIEVAL_FAILED";
    public static final String NOT_RETRIEVED = "NOT_RETRIEVED";
    private static final String[] values = {"UNAVAILABLE", RETRIEVED, RETRIEVAL_FAILED, NOT_RETRIEVED};

    private RotatingIdStatus() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
