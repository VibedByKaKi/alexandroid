package com.amazon.alexa.location.networkModels;

import com.amazon.alexa.location.models.ALSGeofence;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class GetGeofenceByDeviceResponseBody {
    private List<ALSGeofence> geoFences;

    public GetGeofenceByDeviceResponseBody(List<ALSGeofence> list) {
        new ArrayList();
        this.geoFences = list;
    }

    public List<ALSGeofence> getGeofences() {
        return this.geoFences;
    }
}
