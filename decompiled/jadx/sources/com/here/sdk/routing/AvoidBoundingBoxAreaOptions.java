package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCorridor;
import com.here.sdk.core.GeoPolygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AvoidBoundingBoxAreaOptions {

    @NonNull
    public GeoBox avoidBoundingBoxArea;

    @NonNull
    public List<GeoBox> boundingBoxExceptionAreas = new ArrayList();

    @NonNull
    public List<GeoPolygon> polygonExceptionAreas = new ArrayList();

    @NonNull
    public List<GeoCorridor> corridorExceptionAreas = new ArrayList();

    public AvoidBoundingBoxAreaOptions(@NonNull GeoBox geoBox) {
        this.avoidBoundingBoxArea = geoBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvoidBoundingBoxAreaOptions)) {
            return false;
        }
        AvoidBoundingBoxAreaOptions avoidBoundingBoxAreaOptions = (AvoidBoundingBoxAreaOptions) obj;
        return Objects.equals(this.avoidBoundingBoxArea, avoidBoundingBoxAreaOptions.avoidBoundingBoxArea) && Objects.equals(this.boundingBoxExceptionAreas, avoidBoundingBoxAreaOptions.boundingBoxExceptionAreas) && Objects.equals(this.polygonExceptionAreas, avoidBoundingBoxAreaOptions.polygonExceptionAreas) && Objects.equals(this.corridorExceptionAreas, avoidBoundingBoxAreaOptions.corridorExceptionAreas);
    }

    public int hashCode() {
        GeoBox geoBox = this.avoidBoundingBoxArea;
        int hashCode = (JfifUtil.MARKER_EOI + (geoBox != null ? geoBox.hashCode() : 0)) * 31;
        List<GeoBox> list = this.boundingBoxExceptionAreas;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<GeoPolygon> list2 = this.polygonExceptionAreas;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<GeoCorridor> list3 = this.corridorExceptionAreas;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }
}
