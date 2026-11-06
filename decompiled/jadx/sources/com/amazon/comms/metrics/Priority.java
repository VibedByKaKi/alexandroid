package com.amazon.comms.metrics;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Priority {
    NORMAL,
    HIGH,
    RESERVED_FOR_LOCATION_SERVICE,
    RESERVED_FOR_NON_ANONYMOUS_METRICS,
    CRITICAL;

    public static Priority fromInt(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "invalid priority "));
        return null;
    }
}
