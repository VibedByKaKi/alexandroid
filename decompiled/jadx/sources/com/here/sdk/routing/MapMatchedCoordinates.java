package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMatchedCoordinates {

    @NonNull
    public GeoCoordinates matchedCoordinates;

    @NonNull
    public GeoCoordinates originalCoordinates;

    public MapMatchedCoordinates(@NonNull GeoCoordinates geoCoordinates, @NonNull GeoCoordinates geoCoordinates2) {
        this.originalCoordinates = geoCoordinates;
        this.matchedCoordinates = geoCoordinates2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapMatchedCoordinates)) {
            return false;
        }
        MapMatchedCoordinates mapMatchedCoordinates = (MapMatchedCoordinates) obj;
        return Objects.equals(this.originalCoordinates, mapMatchedCoordinates.originalCoordinates) && Objects.equals(this.matchedCoordinates, mapMatchedCoordinates.matchedCoordinates);
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.originalCoordinates;
        int hashCode = (JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates2 = this.matchedCoordinates;
        return hashCode + (geoCoordinates2 != null ? geoCoordinates2.hashCode() : 0);
    }
}
