package com.mapbox.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum NetworkRestriction {
    NONE(0),
    DISALLOW_EXPENSIVE(1),
    DISALLOW_ALL(255);

    public final int value;

    NetworkRestriction(int i) {
        this.value = i;
    }

    private int getValue() {
        return this.value;
    }
}
