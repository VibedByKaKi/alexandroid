package com.here.sdk.gestures;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
enum TouchPhase {
    BEGIN(0),
    MOVE(1),
    STATIONARY(2),
    END(3),
    CANCEL(4);

    final int value;

    TouchPhase(int i) {
        this.value = i;
    }
}
