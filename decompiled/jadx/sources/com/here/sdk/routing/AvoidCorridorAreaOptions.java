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
public final class AvoidCorridorAreaOptions {

    @NonNull
    public GeoCorridor avoidCorridorArea;

    @NonNull
    public List<GeoBox> boundingBoxExceptionAreas = new ArrayList();

    @NonNull
    public List<GeoPolygon> polygonExceptionAreas = new ArrayList();

    @NonNull
    public List<GeoCorridor> corridorExceptionAreas = new ArrayList();

    public AvoidCorridorAreaOptions(@NonNull GeoCorridor geoCorridor) {
        this.avoidCorridorArea = geoCorridor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvoidCorridorAreaOptions)) {
            return false;
        }
        AvoidCorridorAreaOptions avoidCorridorAreaOptions = (AvoidCorridorAreaOptions) obj;
        return Objects.equals(this.avoidCorridorArea, avoidCorridorAreaOptions.avoidCorridorArea) && Objects.equals(this.boundingBoxExceptionAreas, avoidCorridorAreaOptions.boundingBoxExceptionAreas) && Objects.equals(this.polygonExceptionAreas, avoidCorridorAreaOptions.polygonExceptionAreas) && Objects.equals(this.corridorExceptionAreas, avoidCorridorAreaOptions.corridorExceptionAreas);
    }

    public int hashCode() {
        GeoCorridor geoCorridor = this.avoidCorridorArea;
        int hashCode = (JfifUtil.MARKER_EOI + (geoCorridor != null ? geoCorridor.hashCode() : 0)) * 31;
        List<GeoBox> list = this.boundingBoxExceptionAreas;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<GeoPolygon> list2 = this.polygonExceptionAreas;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<GeoCorridor> list3 = this.corridorExceptionAreas;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }
}
