package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.here.sdk.core.GeoCoordinates;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RouteRailwayCrossing {

    @NonNull
    public GeoCoordinates coordinates;

    @NonNull
    public RouteOffset routeOffset;

    @NonNull
    public RouteRailwayCrossingType type;

    public RouteRailwayCrossing(@NonNull RouteRailwayCrossingType routeRailwayCrossingType, @NonNull GeoCoordinates geoCoordinates, @NonNull RouteOffset routeOffset) {
        this.type = routeRailwayCrossingType;
        this.coordinates = geoCoordinates;
        this.routeOffset = routeOffset;
    }
}
