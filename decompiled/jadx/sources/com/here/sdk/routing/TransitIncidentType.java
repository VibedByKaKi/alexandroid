package com.here.sdk.routing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TransitIncidentType {
    TECHNICAL_PROBLEM(0),
    STRIKE(1),
    DEMONSTRATION(2),
    ACCIDENT(3),
    HOLIDAY(4),
    WEATHER(5),
    MAINTENANCE(6),
    CONSTRUCTION(7),
    POLICE_ACTIVITY(8),
    MEDICAL_EMERGENCY(9);

    public final int value;

    TransitIncidentType(int i) {
        this.value = i;
    }
}
