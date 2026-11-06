package com.here.sdk.traffic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TrafficIncidentType {
    ACCIDENT(0),
    CONGESTION(1),
    CONSTRUCTION(2),
    DISABLED_VEHICLE(3),
    MASS_TRANSIT(4),
    PLANNED_EVENT(5),
    ROAD_HAZARD(6),
    WEATHER(7),
    ROAD_CLOSURE(8),
    LANE_RESTRICTION(9),
    OTHER(10),
    UNKNOWN(11);

    public final int value;

    TrafficIncidentType(int i) {
        this.value = i;
    }
}
