package com.here.sdk.mapview;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum MapScheme {
    NORMAL_DAY(0),
    NORMAL_NIGHT(1),
    SATELLITE(2),
    HYBRID_DAY(3),
    HYBRID_NIGHT(4),
    LITE_DAY(5),
    LITE_NIGHT(6),
    LITE_HYBRID_DAY(7),
    LITE_HYBRID_NIGHT(8),
    LOGISTICS_DAY(9),
    LOGISTICS_NIGHT(10),
    LOGISTICS_HYBRID_DAY(11),
    LOGISTICS_HYBRID_NIGHT(12),
    ROAD_NETWORK_DAY(13),
    ROAD_NETWORK_NIGHT(14);

    public final int value;

    MapScheme(int i) {
        this.value = i;
    }
}
