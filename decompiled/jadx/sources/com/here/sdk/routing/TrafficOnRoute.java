package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficOnRoute {
    public int lastTraveledSectionIndex = 0;
    public int traveledDistanceOnLastSectionInMeters = 0;

    @NonNull
    public List<TrafficOnSection> trafficSections = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficOnRoute)) {
            return false;
        }
        TrafficOnRoute trafficOnRoute = (TrafficOnRoute) obj;
        return this.lastTraveledSectionIndex == trafficOnRoute.lastTraveledSectionIndex && this.traveledDistanceOnLastSectionInMeters == trafficOnRoute.traveledDistanceOnLastSectionInMeters && Objects.equals(this.trafficSections, trafficOnRoute.trafficSections);
    }

    public int hashCode() {
        int i = (((JfifUtil.MARKER_EOI + this.lastTraveledSectionIndex) * 31) + this.traveledDistanceOnLastSectionInMeters) * 31;
        List<TrafficOnSection> list = this.trafficSections;
        return i + (list != null ? list.hashCode() : 0);
    }
}
