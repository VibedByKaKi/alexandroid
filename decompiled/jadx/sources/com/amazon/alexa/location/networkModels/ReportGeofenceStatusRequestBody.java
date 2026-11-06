package com.amazon.alexa.location.networkModels;

import com.amazon.alexa.location.models.GeoFenceStatus;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ReportGeofenceStatusRequestBody {
    private final List<GeoFenceStatus> geoFenceStatus;
    private final String personId;

    public ReportGeofenceStatusRequestBody(String str, List<GeoFenceStatus> list) {
        this.personId = str;
        this.geoFenceStatus = list;
    }

    public List<GeoFenceStatus> getGeoFenceStatus() {
        return this.geoFenceStatus;
    }

    public String getPersonId() {
        return this.personId;
    }
}
