package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.CountryCode;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoPolygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AvoidanceOptions {

    @NonNull
    public List<RoadFeatures> roadFeatures = new ArrayList();

    @NonNull
    public List<CountryCode> countries = new ArrayList();

    @NonNull
    @Deprecated
    public List<GeoBox> avoidBoundingBoxAreas = new ArrayList();

    @NonNull
    public List<AvoidBoundingBoxAreaOptions> avoidBoundingBoxAreasOptions = new ArrayList();

    @NonNull
    @Deprecated
    public List<GeoPolygon> avoidPolygonAreas = new ArrayList();

    @NonNull
    public List<AvoidPolygonAreaOptions> avoidPolygonAreasOptions = new ArrayList();

    @NonNull
    public List<AvoidCorridorAreaOptions> avoidCorridorAreasOptions = new ArrayList();

    @NonNull
    public List<ZoneCategory> zoneCategories = new ArrayList();

    @NonNull
    public List<SegmentReference> segments = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvoidanceOptions)) {
            return false;
        }
        AvoidanceOptions avoidanceOptions = (AvoidanceOptions) obj;
        return Objects.equals(this.roadFeatures, avoidanceOptions.roadFeatures) && Objects.equals(this.countries, avoidanceOptions.countries) && Objects.equals(this.avoidBoundingBoxAreas, avoidanceOptions.avoidBoundingBoxAreas) && Objects.equals(this.avoidBoundingBoxAreasOptions, avoidanceOptions.avoidBoundingBoxAreasOptions) && Objects.equals(this.avoidPolygonAreas, avoidanceOptions.avoidPolygonAreas) && Objects.equals(this.avoidPolygonAreasOptions, avoidanceOptions.avoidPolygonAreasOptions) && Objects.equals(this.avoidCorridorAreasOptions, avoidanceOptions.avoidCorridorAreasOptions) && Objects.equals(this.zoneCategories, avoidanceOptions.zoneCategories) && Objects.equals(this.segments, avoidanceOptions.segments);
    }

    public int hashCode() {
        List<RoadFeatures> list = this.roadFeatures;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<CountryCode> list2 = this.countries;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<GeoBox> list3 = this.avoidBoundingBoxAreas;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<AvoidBoundingBoxAreaOptions> list4 = this.avoidBoundingBoxAreasOptions;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<GeoPolygon> list5 = this.avoidPolygonAreas;
        int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<AvoidPolygonAreaOptions> list6 = this.avoidPolygonAreasOptions;
        int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<AvoidCorridorAreaOptions> list7 = this.avoidCorridorAreasOptions;
        int hashCode7 = (hashCode6 + (list7 != null ? list7.hashCode() : 0)) * 31;
        List<ZoneCategory> list8 = this.zoneCategories;
        int hashCode8 = (hashCode7 + (list8 != null ? list8.hashCode() : 0)) * 31;
        List<SegmentReference> list9 = this.segments;
        return hashCode8 + (list9 != null ? list9.hashCode() : 0);
    }
}
