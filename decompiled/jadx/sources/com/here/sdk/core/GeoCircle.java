package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoCircle {

    @NonNull
    public final GeoCoordinates center;
    public final double radiusInMeters;

    public GeoCircle(@NonNull GeoCoordinates geoCoordinates, double d) {
        GeoCircle make = make(geoCoordinates, d);
        this.center = make.center;
        this.radiusInMeters = make.radiusInMeters;
    }

    private static native GeoCircle make(@NonNull GeoCoordinates geoCoordinates, double d);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoCircle)) {
            return false;
        }
        GeoCircle geoCircle = (GeoCircle) obj;
        return Objects.equals(this.center, geoCircle.center) && Double.compare(this.radiusInMeters, geoCircle.radiusInMeters) == 0;
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.center;
        return ((JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.radiusInMeters) ^ (Double.doubleToLongBits(this.radiusInMeters) >>> 32)));
    }
}
