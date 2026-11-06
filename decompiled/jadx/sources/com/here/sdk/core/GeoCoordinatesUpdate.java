package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoCoordinatesUpdate {

    @Nullable
    public final Double altitude;

    @Nullable
    public final Double latitude;

    @Nullable
    public final Double longitude;

    public GeoCoordinatesUpdate(@Nullable Double d, @Nullable Double d2) {
        GeoCoordinatesUpdate make = make(d, d2);
        this.latitude = make.latitude;
        this.longitude = make.longitude;
        this.altitude = make.altitude;
    }

    private static native GeoCoordinatesUpdate make(@NonNull GeoCoordinates geoCoordinates);

    private static native GeoCoordinatesUpdate make(@Nullable Double d, @Nullable Double d2);

    private static native GeoCoordinatesUpdate make(@Nullable Double d, @Nullable Double d2, @Nullable Double d3);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoCoordinatesUpdate)) {
            return false;
        }
        GeoCoordinatesUpdate geoCoordinatesUpdate = (GeoCoordinatesUpdate) obj;
        return Objects.equals(this.latitude, geoCoordinatesUpdate.latitude) && Objects.equals(this.longitude, geoCoordinatesUpdate.longitude) && Objects.equals(this.altitude, geoCoordinatesUpdate.altitude);
    }

    public int hashCode() {
        Double d = this.latitude;
        int hashCode = (JfifUtil.MARKER_EOI + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.longitude;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.altitude;
        return hashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    public GeoCoordinatesUpdate(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        GeoCoordinatesUpdate make = make(d, d2, d3);
        this.latitude = make.latitude;
        this.longitude = make.longitude;
        this.altitude = make.altitude;
    }

    public GeoCoordinatesUpdate(@NonNull GeoCoordinates geoCoordinates) {
        GeoCoordinatesUpdate make = make(geoCoordinates);
        this.latitude = make.latitude;
        this.longitude = make.longitude;
        this.altitude = make.altitude;
    }
}
