package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RouteOptions {
    public int alternatives;

    @Nullable
    public Date arrivalTime;

    @Nullable
    public Date departureTime;
    public boolean enableRouteHandle;
    public boolean enableTolls;

    @Deprecated
    public int occupantsNumber;

    @NonNull
    public OptimizationMode optimizationMode;
    public boolean optimizeWaypointsOrder;

    @Nullable
    public Double speedCapInMetersPerSecond;

    @NonNull
    public TrafficOptimizationMode trafficOptimizationMode;

    public RouteOptions() {
        this.optimizationMode = OptimizationMode.FASTEST;
        this.alternatives = 0;
        this.departureTime = null;
        this.arrivalTime = null;
        this.speedCapInMetersPerSecond = null;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RouteOptions)) {
            return false;
        }
        RouteOptions routeOptions = (RouteOptions) obj;
        return Objects.equals(this.optimizationMode, routeOptions.optimizationMode) && this.alternatives == routeOptions.alternatives && Objects.equals(this.departureTime, routeOptions.departureTime) && Objects.equals(this.arrivalTime, routeOptions.arrivalTime) && Objects.equals(this.speedCapInMetersPerSecond, routeOptions.speedCapInMetersPerSecond) && this.enableRouteHandle == routeOptions.enableRouteHandle && Objects.equals(this.trafficOptimizationMode, routeOptions.trafficOptimizationMode) && this.enableTolls == routeOptions.enableTolls && this.occupantsNumber == routeOptions.occupantsNumber && this.optimizeWaypointsOrder == routeOptions.optimizeWaypointsOrder;
    }

    public int hashCode() {
        OptimizationMode optimizationMode = this.optimizationMode;
        int hashCode = (((JfifUtil.MARKER_EOI + (optimizationMode != null ? optimizationMode.hashCode() : 0)) * 31) + this.alternatives) * 31;
        Date date = this.departureTime;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.arrivalTime;
        int hashCode3 = (hashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31;
        Double d = this.speedCapInMetersPerSecond;
        int hashCode4 = (((hashCode3 + (d != null ? d.hashCode() : 0)) * 31) + (this.enableRouteHandle ? 79 : 97)) * 31;
        TrafficOptimizationMode trafficOptimizationMode = this.trafficOptimizationMode;
        return ((((((hashCode4 + (trafficOptimizationMode != null ? trafficOptimizationMode.hashCode() : 0)) * 31) + (this.enableTolls ? 79 : 97)) * 31) + this.occupantsNumber) * 31) + (this.optimizeWaypointsOrder ? 79 : 97);
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode) {
        this.optimizationMode = optimizationMode;
        this.alternatives = 0;
        this.departureTime = null;
        this.arrivalTime = null;
        this.speedCapInMetersPerSecond = null;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = null;
        this.arrivalTime = null;
        this.speedCapInMetersPerSecond = null;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = null;
        this.speedCapInMetersPerSecond = null;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = null;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = false;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d, boolean z) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = z;
        this.trafficOptimizationMode = TrafficOptimizationMode.TIME_DEPENDENT;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d, boolean z, @NonNull TrafficOptimizationMode trafficOptimizationMode) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = z;
        this.trafficOptimizationMode = trafficOptimizationMode;
        this.enableTolls = false;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d, boolean z, @NonNull TrafficOptimizationMode trafficOptimizationMode, boolean z2) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = z;
        this.trafficOptimizationMode = trafficOptimizationMode;
        this.enableTolls = z2;
        this.occupantsNumber = 1;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d, boolean z, @NonNull TrafficOptimizationMode trafficOptimizationMode, boolean z2, @Deprecated int i2) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = z;
        this.trafficOptimizationMode = trafficOptimizationMode;
        this.enableTolls = z2;
        this.occupantsNumber = i2;
        this.optimizeWaypointsOrder = false;
    }

    public RouteOptions(@NonNull OptimizationMode optimizationMode, int i, @Nullable Date date, @Nullable Date date2, @Nullable Double d, boolean z, @NonNull TrafficOptimizationMode trafficOptimizationMode, boolean z2, @Deprecated int i2, boolean z3) {
        this.optimizationMode = optimizationMode;
        this.alternatives = i;
        this.departureTime = date;
        this.arrivalTime = date2;
        this.speedCapInMetersPerSecond = d;
        this.enableRouteHandle = z;
        this.trafficOptimizationMode = trafficOptimizationMode;
        this.enableTolls = z2;
        this.occupantsNumber = i2;
        this.optimizeWaypointsOrder = z3;
    }
}
