package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.errors.InstantiationErrorException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoPolygon {

    @NonNull
    public final List<List<GeoCoordinates>> innerBoundaries;

    @NonNull
    public final List<GeoCoordinates> vertices;

    public GeoPolygon(@NonNull List<GeoCoordinates> list) throws InstantiationErrorException {
        GeoPolygon make = make(list);
        this.vertices = make.vertices;
        this.innerBoundaries = make.innerBoundaries;
    }

    private static native GeoPolygon make(@NonNull GeoBox geoBox);

    private static native GeoPolygon make(@NonNull GeoCircle geoCircle);

    private static native GeoPolygon make(@NonNull List<GeoCoordinates> list) throws InstantiationErrorException;

    private static native GeoPolygon make(@NonNull List<GeoCoordinates> list, @NonNull List<List<GeoCoordinates>> list2) throws InstantiationErrorException;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoPolygon)) {
            return false;
        }
        GeoPolygon geoPolygon = (GeoPolygon) obj;
        return Objects.equals(this.vertices, geoPolygon.vertices) && Objects.equals(this.innerBoundaries, geoPolygon.innerBoundaries);
    }

    public int hashCode() {
        List<GeoCoordinates> list = this.vertices;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<List<GeoCoordinates>> list2 = this.innerBoundaries;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public GeoPolygon(@NonNull List<GeoCoordinates> list, @NonNull List<List<GeoCoordinates>> list2) throws InstantiationErrorException {
        GeoPolygon make = make(list, list2);
        this.vertices = make.vertices;
        this.innerBoundaries = make.innerBoundaries;
    }

    public GeoPolygon(@NonNull GeoCircle geoCircle) {
        GeoPolygon make = make(geoCircle);
        this.vertices = make.vertices;
        this.innerBoundaries = make.innerBoundaries;
    }

    public GeoPolygon(@NonNull GeoBox geoBox) {
        GeoPolygon make = make(geoBox);
        this.vertices = make.vertices;
        this.innerBoundaries = make.innerBoundaries;
    }
}
