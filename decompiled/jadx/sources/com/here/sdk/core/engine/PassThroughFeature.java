package com.here.sdk.core.engine;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum PassThroughFeature {
    TRAFFIC_DATA(0),
    TRAFFIC_TILES_FLOW(1),
    TRAFFIC_TILES_INCIDENTS(2),
    ONLINE_ROUTING(3);

    public final int value;

    PassThroughFeature(int i) {
        this.value = i;
    }
}
