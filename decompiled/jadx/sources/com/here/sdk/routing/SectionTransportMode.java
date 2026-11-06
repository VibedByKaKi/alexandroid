package com.here.sdk.routing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum SectionTransportMode {
    CAR(0),
    TRUCK(1),
    PEDESTRIAN(2),
    FERRY(3),
    CAR_SHUTTLE_TRAIN(4),
    SCOOTER(5),
    BICYCLE(6),
    PUBLIC_TRANSIT(7),
    TAXI(8),
    BUS(9),
    PRIVATE_BUS(10);

    public final int value;

    SectionTransportMode(int i) {
        this.value = i;
    }
}
