package com.here.sdk.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum LocationTechnology {
    CELLULAR(0),
    GNSS(1),
    HD_GNSS(2),
    WIFI(3),
    DEAD_RECKONING(4);

    public final int value;

    LocationTechnology(int i) {
        this.value = i;
    }
}
