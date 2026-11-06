package com.amazon.alexa.location.utils;

import com.amazon.alexa.location.models.ALSGeofence;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Converter {
    private Converter() {
    }

    public static List<Geofence> convertToGeofences(List<ALSGeofence> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<ALSGeofence> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toGeofence());
            }
        }
        return arrayList;
    }

    public static List<String> extractGeofenceIds(List<ALSGeofence> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<ALSGeofence> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getId());
            }
        }
        return arrayList;
    }
}
