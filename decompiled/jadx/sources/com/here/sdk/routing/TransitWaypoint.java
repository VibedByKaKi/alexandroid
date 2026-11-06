package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitWaypoint {

    @NonNull
    public GeoCoordinates coordinates;

    @Nullable
    public String placeName = null;

    public TransitWaypoint(@NonNull GeoCoordinates geoCoordinates) {
        this.coordinates = geoCoordinates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransitWaypoint)) {
            return false;
        }
        TransitWaypoint transitWaypoint = (TransitWaypoint) obj;
        return Objects.equals(this.coordinates, transitWaypoint.coordinates) && Objects.equals(this.placeName, transitWaypoint.placeName);
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.coordinates;
        int hashCode = (JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        String str = this.placeName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
