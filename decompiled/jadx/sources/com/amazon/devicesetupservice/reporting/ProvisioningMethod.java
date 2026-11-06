package com.amazon.devicesetupservice.reporting;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class ProvisioningMethod {
    public static final String MANUAL = "MANUAL";
    public static final String MATTER = "MATTER";
    public static final String FFS = "FFS";
    public static final String WIFI_FFS = "WIFI_FFS";
    public static final String SH_PHILIPS = "SH_PHILIPS";
    private static final String[] values = {FFS, "MANUAL", WIFI_FFS, SH_PHILIPS, "MATTER"};

    private ProvisioningMethod() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
