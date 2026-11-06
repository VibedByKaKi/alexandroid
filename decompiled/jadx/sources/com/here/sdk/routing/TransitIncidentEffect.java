package com.here.sdk.routing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TransitIncidentEffect {
    CANCELLED_SERVICE(0),
    REDUCED_SERVICE(1),
    ADDITIONAL_SERVICE(2),
    MODIFIED_SERVICE(3),
    DELAYS(4),
    DETOUR(5),
    STOP_MOVED(6);

    public final int value;

    TransitIncidentEffect(int i) {
        this.value = i;
    }
}
