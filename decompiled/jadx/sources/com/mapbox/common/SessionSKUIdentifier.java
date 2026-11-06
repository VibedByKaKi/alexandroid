package com.mapbox.common;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum SessionSKUIdentifier {
    NAV2_SES_TRIP("Nav2SesTrip"),
    NAV2_SES_FDTRIP("Nav2SesFDTrip"),
    NAV3_SES_UX_AGTRIP("Nav3SesUxAGTrip"),
    NAV3_SES_UX_FDTRIP("Nav3SesUxFDTrip"),
    NAV3_SES_CORE_AGTRIP("Nav3SesCoreAGTrip"),
    NAV3_SES_CORE_FDTRIP("Nav3SesCoreFDTrip");

    private String str;

    SessionSKUIdentifier(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
