package com.here.sdk.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TransportMode {
    CAR(0),
    TRUCK(1),
    PEDESTRIAN(2),
    SCOOTER(3),
    BICYCLE(4),
    PUBLIC_TRANSIT(5),
    TAXI(6),
    BUS(7),
    PRIVATE_BUS(8);

    public final int value;

    TransportMode(int i) {
        this.value = i;
    }
}
