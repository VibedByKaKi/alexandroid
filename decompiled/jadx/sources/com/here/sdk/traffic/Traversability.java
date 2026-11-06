package com.here.sdk.traffic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum Traversability {
    OPEN(0),
    CLOSED(1),
    REVERSIBLE_NOT_ROUTABLE(2);

    public final int value;

    Traversability(int i) {
        this.value = i;
    }
}
