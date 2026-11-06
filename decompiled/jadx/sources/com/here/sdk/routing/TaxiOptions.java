package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.CarSpecifications;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TaxiOptions {
    public boolean allowDriveThroughTaxiRoads;

    @NonNull
    public AvoidanceOptions avoidanceOptions;

    @NonNull
    public CarSpecifications carSpecifications;

    @NonNull
    public List<MaxSpeedOnSegment> maxSpeedOnSegments;

    @NonNull
    public RouteOptions routeOptions;

    @NonNull
    public RouteTextOptions textOptions;

    @NonNull
    public TollOptions tollOptions;

    public TaxiOptions() {
        this.routeOptions = new RouteOptions();
        this.textOptions = new RouteTextOptions();
        this.avoidanceOptions = new AvoidanceOptions();
        this.tollOptions = new TollOptions();
        this.maxSpeedOnSegments = new ArrayList();
        this.allowDriveThroughTaxiRoads = true;
        this.carSpecifications = new CarSpecifications();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxiOptions)) {
            return false;
        }
        TaxiOptions taxiOptions = (TaxiOptions) obj;
        return Objects.equals(this.routeOptions, taxiOptions.routeOptions) && Objects.equals(this.textOptions, taxiOptions.textOptions) && Objects.equals(this.avoidanceOptions, taxiOptions.avoidanceOptions) && Objects.equals(this.tollOptions, taxiOptions.tollOptions) && Objects.equals(this.maxSpeedOnSegments, taxiOptions.maxSpeedOnSegments) && this.allowDriveThroughTaxiRoads == taxiOptions.allowDriveThroughTaxiRoads && Objects.equals(this.carSpecifications, taxiOptions.carSpecifications);
    }

    public int hashCode() {
        RouteOptions routeOptions = this.routeOptions;
        int hashCode = (JfifUtil.MARKER_EOI + (routeOptions != null ? routeOptions.hashCode() : 0)) * 31;
        RouteTextOptions routeTextOptions = this.textOptions;
        int hashCode2 = (hashCode + (routeTextOptions != null ? routeTextOptions.hashCode() : 0)) * 31;
        AvoidanceOptions avoidanceOptions = this.avoidanceOptions;
        int hashCode3 = (hashCode2 + (avoidanceOptions != null ? avoidanceOptions.hashCode() : 0)) * 31;
        TollOptions tollOptions = this.tollOptions;
        int hashCode4 = (hashCode3 + (tollOptions != null ? tollOptions.hashCode() : 0)) * 31;
        List<MaxSpeedOnSegment> list = this.maxSpeedOnSegments;
        int hashCode5 = (((hashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.allowDriveThroughTaxiRoads ? 79 : 97)) * 31;
        CarSpecifications carSpecifications = this.carSpecifications;
        return hashCode5 + (carSpecifications != null ? carSpecifications.hashCode() : 0);
    }

    public TaxiOptions(@NonNull RouteOptions routeOptions, @NonNull RouteTextOptions routeTextOptions, @NonNull AvoidanceOptions avoidanceOptions) {
        this.routeOptions = routeOptions;
        this.textOptions = routeTextOptions;
        this.avoidanceOptions = avoidanceOptions;
        this.tollOptions = new TollOptions();
        this.maxSpeedOnSegments = new ArrayList();
        this.allowDriveThroughTaxiRoads = true;
        this.carSpecifications = new CarSpecifications();
    }
}
