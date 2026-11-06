package com.here.sdk.traffic;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoPolyline;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficLocation {

    @NonNull
    public String description = "";
    public int lengthInMeters;

    @NonNull
    public GeoPolyline polyline;

    public TrafficLocation(@NonNull GeoPolyline geoPolyline, int i) {
        this.polyline = geoPolyline;
        this.lengthInMeters = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficLocation)) {
            return false;
        }
        TrafficLocation trafficLocation = (TrafficLocation) obj;
        return Objects.equals(this.description, trafficLocation.description) && Objects.equals(this.polyline, trafficLocation.polyline) && this.lengthInMeters == trafficLocation.lengthInMeters;
    }

    public int hashCode() {
        String str = this.description;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        GeoPolyline geoPolyline = this.polyline;
        return ((hashCode + (geoPolyline != null ? geoPolyline.hashCode() : 0)) * 31) + this.lengthInMeters;
    }
}
