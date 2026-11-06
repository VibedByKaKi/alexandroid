package com.amazon.devicesetupservice.smarthome;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Matter rotating ID algorithm.")
/* loaded from: classes5.dex */
public class RotatingIdAlgorithm {
    public static final String MATTER_V0 = "MATTER_V0";
    public static final String MATTER_V1 = "MATTER_V1";
    private static final String[] values = {MATTER_V0, MATTER_V1};

    private RotatingIdAlgorithm() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
