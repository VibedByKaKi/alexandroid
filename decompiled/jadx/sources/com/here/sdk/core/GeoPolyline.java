package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.errors.InstantiationErrorException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoPolyline {

    @NonNull
    public final List<GeoCoordinates> vertices;

    public GeoPolyline(@NonNull List<GeoCoordinates> list) throws InstantiationErrorException {
        this.vertices = make(list).vertices;
    }

    private static native GeoPolyline make(@NonNull GeoBox geoBox);

    private static native GeoPolyline make(@NonNull List<GeoCoordinates> list) throws InstantiationErrorException;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GeoPolyline) {
            return Objects.equals(this.vertices, ((GeoPolyline) obj).vertices);
        }
        return false;
    }

    public native long getNearestIndexTo(@NonNull GeoCoordinates geoCoordinates);

    @NonNull
    public native GeoCoordinates getNearestTo(@NonNull GeoCoordinates geoCoordinates);

    public int hashCode() {
        List<GeoCoordinates> list = this.vertices;
        return JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0);
    }

    public GeoPolyline(@NonNull GeoBox geoBox) {
        this.vertices = make(geoBox).vertices;
    }
}
