package com.here.sdk.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum PlaceType {
    POI(0),
    ADDRESS(1),
    AREA(2),
    STREET(3),
    INTERSECTION(4),
    UNKNOWN(5);

    public final int value;

    PlaceType(int i) {
        this.value = i;
    }
}
