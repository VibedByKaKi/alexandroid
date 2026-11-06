package com.here.sdk.routing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
enum SourceEngine {
    ROUTING(0),
    INDOOR(1),
    OFFLINE_ROUTING(2),
    RETURN_TO_ROUTE(3),
    PUBLIC_TRANSIT(4);

    final int value;

    SourceEngine(int i) {
        this.value = i;
    }
}
