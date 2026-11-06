package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.GeoCoordinates;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RoutePlace {

    @Nullable
    public Double chargeInKilowattHours;

    @Nullable
    public ChargingStation chargingStation;

    @Nullable
    public GeoCoordinates displayCoordinates;

    @Nullable
    public String id;

    @Nullable
    IndoorLocationDataInternal indoorLocation;

    @NonNull
    public GeoCoordinates mapMatchedCoordinates;

    @Nullable
    public String name;

    @Nullable
    public GeoCoordinates originalCoordinates;

    @Nullable
    public String platform;

    @Nullable
    public SideOfDestination sideOfDestination;

    @NonNull
    public RoutePlaceType type;

    @Nullable
    public Integer waypointIndex;

    public RoutePlace(@NonNull RoutePlaceType routePlaceType, @NonNull GeoCoordinates geoCoordinates) {
        this.type = routePlaceType;
        this.mapMatchedCoordinates = geoCoordinates;
        this.waypointIndex = null;
        this.originalCoordinates = null;
        this.displayCoordinates = null;
        this.chargeInKilowattHours = null;
        this.chargingStation = null;
        this.name = null;
        this.id = null;
        this.platform = null;
        this.sideOfDestination = null;
        this.indoorLocation = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoutePlace)) {
            return false;
        }
        RoutePlace routePlace = (RoutePlace) obj;
        return Objects.equals(this.type, routePlace.type) && Objects.equals(this.waypointIndex, routePlace.waypointIndex) && Objects.equals(this.originalCoordinates, routePlace.originalCoordinates) && Objects.equals(this.mapMatchedCoordinates, routePlace.mapMatchedCoordinates) && Objects.equals(this.displayCoordinates, routePlace.displayCoordinates) && Objects.equals(this.chargeInKilowattHours, routePlace.chargeInKilowattHours) && Objects.equals(this.chargingStation, routePlace.chargingStation) && Objects.equals(this.name, routePlace.name) && Objects.equals(this.id, routePlace.id) && Objects.equals(this.platform, routePlace.platform) && Objects.equals(this.sideOfDestination, routePlace.sideOfDestination) && Objects.equals(this.indoorLocation, routePlace.indoorLocation);
    }

    public int hashCode() {
        RoutePlaceType routePlaceType = this.type;
        int hashCode = (JfifUtil.MARKER_EOI + (routePlaceType != null ? routePlaceType.hashCode() : 0)) * 31;
        Integer num = this.waypointIndex;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates = this.originalCoordinates;
        int hashCode3 = (hashCode2 + (geoCoordinates != null ? geoCoordinates.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates2 = this.mapMatchedCoordinates;
        int hashCode4 = (hashCode3 + (geoCoordinates2 != null ? geoCoordinates2.hashCode() : 0)) * 31;
        GeoCoordinates geoCoordinates3 = this.displayCoordinates;
        int hashCode5 = (hashCode4 + (geoCoordinates3 != null ? geoCoordinates3.hashCode() : 0)) * 31;
        Double d = this.chargeInKilowattHours;
        int hashCode6 = (hashCode5 + (d != null ? d.hashCode() : 0)) * 31;
        ChargingStation chargingStation = this.chargingStation;
        int hashCode7 = (hashCode6 + (chargingStation != null ? chargingStation.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.platform;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SideOfDestination sideOfDestination = this.sideOfDestination;
        int hashCode11 = (hashCode10 + (sideOfDestination != null ? sideOfDestination.hashCode() : 0)) * 31;
        IndoorLocationDataInternal indoorLocationDataInternal = this.indoorLocation;
        return hashCode11 + (indoorLocationDataInternal != null ? indoorLocationDataInternal.hashCode() : 0);
    }

    public native boolean isOffRoad();

    public RoutePlace(@NonNull RoutePlaceType routePlaceType, @Nullable Integer num, @Nullable GeoCoordinates geoCoordinates, @NonNull GeoCoordinates geoCoordinates2, @Nullable Double d, @Nullable ChargingStation chargingStation, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SideOfDestination sideOfDestination, @Nullable IndoorLocationDataInternal indoorLocationDataInternal) {
        this.type = routePlaceType;
        this.waypointIndex = num;
        this.originalCoordinates = geoCoordinates;
        this.mapMatchedCoordinates = geoCoordinates2;
        this.chargeInKilowattHours = d;
        this.chargingStation = chargingStation;
        this.name = str;
        this.id = str2;
        this.platform = str3;
        this.sideOfDestination = sideOfDestination;
        this.indoorLocation = indoorLocationDataInternal;
        this.displayCoordinates = null;
    }
}
