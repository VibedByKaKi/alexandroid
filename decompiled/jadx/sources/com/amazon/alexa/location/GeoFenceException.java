package com.amazon.alexa.location;

import com.amazon.alexa.location.models.ALSGeofence;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class GeoFenceException extends LocationException {
    private List<ALSGeofence> listOfGeofences;

    public GeoFenceException(LocationErrorCode locationErrorCode, String str, List<ALSGeofence> list, Throwable th) {
        super(locationErrorCode, str, th);
        this.listOfGeofences = list;
    }

    public List<ALSGeofence> getListOfGeofences() {
        return this.listOfGeofences;
    }

    public GeoFenceException(LocationErrorCode locationErrorCode, String str, List<ALSGeofence> list) {
        this(locationErrorCode, str, list, null);
    }
}
