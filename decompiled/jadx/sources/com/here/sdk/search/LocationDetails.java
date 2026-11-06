package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCoordinates;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocationDetails {

    @NonNull
    public GeoCoordinates coordinates;
    public boolean coordinatesInterpolated = false;

    @NonNull
    public List<GeoCoordinates> accessPoints = new ArrayList();

    @Nullable
    public GeoBox boundingBox = null;

    public LocationDetails(@NonNull GeoCoordinates geoCoordinates) {
        this.coordinates = geoCoordinates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationDetails)) {
            return false;
        }
        LocationDetails locationDetails = (LocationDetails) obj;
        return Objects.equals(this.coordinates, locationDetails.coordinates) && this.coordinatesInterpolated == locationDetails.coordinatesInterpolated && Objects.equals(this.accessPoints, locationDetails.accessPoints) && Objects.equals(this.boundingBox, locationDetails.boundingBox);
    }

    public int hashCode() {
        GeoCoordinates geoCoordinates = this.coordinates;
        int hashCode = (((JfifUtil.MARKER_EOI + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31) + (this.coordinatesInterpolated ? 79 : 97)) * 31;
        List<GeoCoordinates> list = this.accessPoints;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        GeoBox geoBox = this.boundingBox;
        return hashCode2 + (geoBox != null ? geoBox.hashCode() : 0);
    }
}
