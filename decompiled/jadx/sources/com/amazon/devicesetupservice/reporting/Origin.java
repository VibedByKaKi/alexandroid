package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class Origin {
    public static final String PROVISIONER = "provisioner";
    public static final String PROVISIONABLE = "provisionable";
    public static final String DSS = "dss";
    private static final String[] values = {PROVISIONER, PROVISIONABLE, DSS};

    private Origin() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
