package com.amazon.alexa.location.phase3.sensor.osgeofence;

import androidx.annotation.NonNull;
import com.amazon.alexa.location.GeofenceTriggerData;
import com.amazon.alexa.location.phase3.evaluator.GeofenceTriggerEvent;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class OsGeofenceTriggerEvent extends GeofenceTriggerEvent {
    public OsGeofenceTriggerEvent(long j, int i, @NonNull String str) {
        super("OsGeofenceTriggerEvent", j, i, str);
    }

    @NonNull
    public static List<OsGeofenceTriggerEvent> fromGeofencingEvent(@NonNull GeofencingEvent geofencingEvent, long j) {
        int geofenceTransition = geofencingEvent.getGeofenceTransition();
        int i = 1;
        if (geofenceTransition == 1) {
            i = 0;
        } else if (geofenceTransition != 2) {
            i = 2;
        }
        if (geofencingEvent.getTriggeringLocation() != null) {
            j = geofencingEvent.getTriggeringLocation().getTime();
        }
        ArrayList arrayList = new ArrayList(geofencingEvent.getTriggeringGeofences().size());
        Iterator<Geofence> it2 = geofencingEvent.getTriggeringGeofences().iterator();
        while (it2.hasNext()) {
            arrayList.add(new OsGeofenceTriggerEvent(j, i, it2.next().getRequestId()));
        }
        return arrayList;
    }

    @NonNull
    public static List<OsGeofenceTriggerEvent> fromTriggerData(@NonNull GeofenceTriggerData geofenceTriggerData, long j) {
        int geofenceTransition = geofenceTriggerData.getGeofenceTransition();
        int i = 1;
        if (geofenceTransition == 1) {
            i = 0;
        } else if (geofenceTransition != 2) {
            i = 2;
        }
        if (geofenceTriggerData.hasLocationTime()) {
            j = geofenceTriggerData.getLocationTime();
        }
        String[] fenceIds = geofenceTriggerData.getFenceIds();
        ArrayList arrayList = new ArrayList(fenceIds.length);
        for (String str : fenceIds) {
            arrayList.add(new OsGeofenceTriggerEvent(j, i, str));
        }
        return arrayList;
    }
}
