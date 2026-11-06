package com.amazon.alexa.location;

import com.amazon.alexa.location.models.ALSTriggerEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class TriggeringGeofenceInfo {
    private String fenceId;
    private int geofenceTransition;
    private long time;

    public TriggeringGeofenceInfo(String str, int i, long j) {
        this.fenceId = str;
        this.geofenceTransition = i;
        this.time = j;
    }

    public ALSTriggerEvent getALSTrigerEvent() {
        int i = this.geofenceTransition;
        return i != 1 ? i != 2 ? ALSTriggerEvent.EXIT : ALSTriggerEvent.EXIT : ALSTriggerEvent.ENTER;
    }

    public String getFenceId() {
        return this.fenceId;
    }

    public long getTime() {
        return this.time;
    }
}
