package com.amazon.devicesetupservice;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes5.dex */
public class DeviceAssociationMethod {
    public static final String INNER_BARCODE = "INNER_BARCODE";
    public static final String OUTER_BARCODE = "OUTER_BARCODE";
    public static final String CASTING = "CASTING";
    public static final String LIGHT_TOUCH_SETUP = "LIGHT_TOUCH_SETUP";
    private static final String[] values = {INNER_BARCODE, OUTER_BARCODE, CASTING, LIGHT_TOUCH_SETUP};

    private DeviceAssociationMethod() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
