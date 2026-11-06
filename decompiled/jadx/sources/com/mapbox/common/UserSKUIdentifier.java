package com.mapbox.common;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum UserSKUIdentifier {
    MAPS_MAUS("MapsMAUS"),
    VISION_MAUS("VisionMAUS"),
    VISION_FLEET_MAUS("VisionFleetMAUS"),
    NAV2_SES_MAU("Nav2SesMAU"),
    NAV3_UX_MAU("Nav3UxMAU"),
    NAV3_CORE_MAU("Nav3CoreMAU"),
    GEOFENCING_MAU("GeofencingMAU"),
    UNITY_MAUS("UnityMAUS");

    private String str;

    UserSKUIdentifier(String str) {
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
