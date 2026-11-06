package com.amazon.alexa.location.networking.als.networkModels;

import com.amazon.alexa.location.networking.als.models.ALSTriggerEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class TriggerGeofenceRequestBody {
    private ALSTriggerEvent geoFenceEvent;
    private String personId;
    private long timestamp;

    public TriggerGeofenceRequestBody(String str, ALSTriggerEvent aLSTriggerEvent, long j) {
        this.personId = str;
        this.geoFenceEvent = aLSTriggerEvent;
        this.timestamp = j;
    }

    public ALSTriggerEvent getGeoFenceEvent() {
        return this.geoFenceEvent;
    }

    public String getPersonId() {
        return this.personId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
