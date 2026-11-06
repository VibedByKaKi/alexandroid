package com.amazon.alexa.location.networking.als.models;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class GeoFenceStatus {
    private String fenceId;
    private StatusCode statusCode;

    public GeoFenceStatus(String str, StatusCode statusCode) {
        this.fenceId = str;
        this.statusCode = statusCode;
    }

    public boolean equals(Object obj) {
        GeoFenceStatus geoFenceStatus;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof ALSGeofence) && ((str = this.fenceId) == (str2 = (geoFenceStatus = (GeoFenceStatus) obj).fenceId) || str.equals(str2)) && Objects.equals(this.statusCode, geoFenceStatus.statusCode);
    }

    public String getFenceId() {
        return this.fenceId;
    }

    public StatusCode getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.fenceId;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        StatusCode statusCode = this.statusCode;
        return hashCode + (statusCode != null ? statusCode.hashCode() : 0);
    }
}
