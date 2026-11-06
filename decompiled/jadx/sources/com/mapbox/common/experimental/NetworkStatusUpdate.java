package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public enum NetworkStatusUpdate {
    NOT_REACHABLE("NotReachable"),
    REACHABLE_VIA_WI_FI("ReachableViaWiFi"),
    REACHABLE_VIA_ETHERNET("ReachableViaEthernet"),
    REACHABLE_VIA_WWAN("ReachableViaWWAN");

    private String str;

    NetworkStatusUpdate(String str) {
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
