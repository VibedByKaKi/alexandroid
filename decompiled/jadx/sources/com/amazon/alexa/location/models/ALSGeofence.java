package com.amazon.alexa.location.models;

import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ALSGeofence {
    private ALSCircularRegion circularRegion;
    private String id;
    private List<ALSTriggerEvent> monitorEvents;

    public ALSGeofence(String str, double d, double d2, double d3) {
        this.id = str;
        this.circularRegion = new ALSCircularRegion(d, d2, d3);
        ArrayList arrayList = new ArrayList();
        this.monitorEvents = arrayList;
        arrayList.add(ALSTriggerEvent.ENTER);
        this.monitorEvents.add(ALSTriggerEvent.EXIT);
    }

    public boolean equals(Object obj) {
        ALSCircularRegion aLSCircularRegion;
        ALSCircularRegion aLSCircularRegion2;
        List<ALSTriggerEvent> list;
        List<ALSTriggerEvent> list2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ALSGeofence)) {
            return false;
        }
        ALSGeofence aLSGeofence = (ALSGeofence) obj;
        String str = this.id;
        String str2 = aLSGeofence.id;
        return (str == str2 || str.equals(str2)) && ((aLSCircularRegion = this.circularRegion) == (aLSCircularRegion2 = aLSGeofence.circularRegion) || aLSCircularRegion.equals(aLSCircularRegion2)) && ((list = this.monitorEvents) == (list2 = aLSGeofence.monitorEvents) || list.equals(list2));
    }

    public ALSCircularRegion getCircularRegion() {
        return this.circularRegion;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        ALSCircularRegion aLSCircularRegion = this.circularRegion;
        int hashCode2 = (hashCode + (aLSCircularRegion != null ? aLSCircularRegion.hashCode() : 0)) * 31;
        List<ALSTriggerEvent> list = this.monitorEvents;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public Geofence toGeofence() {
        return new Geofence.Builder().setRequestId(getId()).setCircularRegion(getCircularRegion().getLatitudeInDegrees(), getCircularRegion().getLongitudeInDegrees(), (float) getCircularRegion().getRadiusInMeters()).setTransitionTypes(3).setExpirationDuration(-1L).build();
    }
}
