package com.here.sdk.core.engine;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum EngineBaseURL {
    SEARCH_ENGINE(0),
    ROUTING_ENGINE(1),
    AUTHENTICATION(2),
    DS_PROXY(3),
    TRAFFIC_DATA(4),
    TRAFFIC_VECTOR_TILE_SERVICE(5),
    RASTER_TILE_SERVICE(6);

    public final int value;

    EngineBaseURL(int i) {
        this.value = i;
    }
}
