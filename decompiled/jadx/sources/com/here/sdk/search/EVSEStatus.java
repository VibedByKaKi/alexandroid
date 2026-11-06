package com.here.sdk.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum EVSEStatus {
    AVAILABLE(0),
    OCCUPIED(1),
    OFFLINE(2),
    OTHER(3),
    OUT_OF_SERVICE(4),
    RESERVED(5),
    UNAVAILABLE(6);

    public final int value;

    EVSEStatus(int i) {
        this.value = i;
    }
}
