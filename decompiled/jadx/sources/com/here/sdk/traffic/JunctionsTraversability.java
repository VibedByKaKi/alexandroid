package com.here.sdk.traffic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum JunctionsTraversability {
    ALL_OPEN(0),
    ALL_CLOSED(1),
    INTERMEDIATE_CLOSED_EDGE_OPEN(2),
    START_OPEN_OTHERS_CLOSED(3),
    END_OPEN_OTHERS_CLOSED(4);

    public final int value;

    JunctionsTraversability(int i) {
        this.value = i;
    }
}
