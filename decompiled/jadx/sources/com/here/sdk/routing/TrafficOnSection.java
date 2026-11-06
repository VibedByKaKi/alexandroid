package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficOnSection {

    @NonNull
    public RoutePlace arrivalPlace;

    @NonNull
    public RoutePlace departurePlace;

    @NonNull
    public List<GeoCoordinates> geometry = new ArrayList();

    @NonNull
    public List<TrafficOnSpan> trafficSpans = new ArrayList();

    @NonNull
    public List<TrafficIncidentOnRoute> trafficIncidents = new ArrayList();

    public TrafficOnSection(@NonNull RoutePlace routePlace, @NonNull RoutePlace routePlace2) {
        this.departurePlace = routePlace;
        this.arrivalPlace = routePlace2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficOnSection)) {
            return false;
        }
        TrafficOnSection trafficOnSection = (TrafficOnSection) obj;
        return Objects.equals(this.geometry, trafficOnSection.geometry) && Objects.equals(this.trafficSpans, trafficOnSection.trafficSpans) && Objects.equals(this.trafficIncidents, trafficOnSection.trafficIncidents) && Objects.equals(this.departurePlace, trafficOnSection.departurePlace) && Objects.equals(this.arrivalPlace, trafficOnSection.arrivalPlace);
    }

    public int hashCode() {
        List<GeoCoordinates> list = this.geometry;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<TrafficOnSpan> list2 = this.trafficSpans;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<TrafficIncidentOnRoute> list3 = this.trafficIncidents;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        RoutePlace routePlace = this.departurePlace;
        int hashCode4 = (hashCode3 + (routePlace != null ? routePlace.hashCode() : 0)) * 31;
        RoutePlace routePlace2 = this.arrivalPlace;
        return hashCode4 + (routePlace2 != null ? routePlace2.hashCode() : 0);
    }
}
