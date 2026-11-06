package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ScooterOptions {

    @NonNull
    public RouteOptions routeOptions = new RouteOptions();

    @NonNull
    public RouteTextOptions textOptions = new RouteTextOptions();

    @NonNull
    public AvoidanceOptions avoidanceOptions = new AvoidanceOptions();

    @NonNull
    public TollOptions tollOptions = new TollOptions();
    public int occupantsNumber = 1;

    @NonNull
    public List<MaxSpeedOnSegment> maxSpeedOnSegments = new ArrayList();
    public boolean allowHighway = false;

    @Nullable
    public Integer engineSizeInCubicCentimeters = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScooterOptions)) {
            return false;
        }
        ScooterOptions scooterOptions = (ScooterOptions) obj;
        return Objects.equals(this.routeOptions, scooterOptions.routeOptions) && Objects.equals(this.textOptions, scooterOptions.textOptions) && Objects.equals(this.avoidanceOptions, scooterOptions.avoidanceOptions) && Objects.equals(this.tollOptions, scooterOptions.tollOptions) && this.occupantsNumber == scooterOptions.occupantsNumber && Objects.equals(this.maxSpeedOnSegments, scooterOptions.maxSpeedOnSegments) && this.allowHighway == scooterOptions.allowHighway && Objects.equals(this.engineSizeInCubicCentimeters, scooterOptions.engineSizeInCubicCentimeters);
    }

    public int hashCode() {
        RouteOptions routeOptions = this.routeOptions;
        int hashCode = (JfifUtil.MARKER_EOI + (routeOptions != null ? routeOptions.hashCode() : 0)) * 31;
        RouteTextOptions routeTextOptions = this.textOptions;
        int hashCode2 = (hashCode + (routeTextOptions != null ? routeTextOptions.hashCode() : 0)) * 31;
        AvoidanceOptions avoidanceOptions = this.avoidanceOptions;
        int hashCode3 = (hashCode2 + (avoidanceOptions != null ? avoidanceOptions.hashCode() : 0)) * 31;
        TollOptions tollOptions = this.tollOptions;
        int hashCode4 = (((hashCode3 + (tollOptions != null ? tollOptions.hashCode() : 0)) * 31) + this.occupantsNumber) * 31;
        List<MaxSpeedOnSegment> list = this.maxSpeedOnSegments;
        int hashCode5 = (((hashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.allowHighway ? 79 : 97)) * 31;
        Integer num = this.engineSizeInCubicCentimeters;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }
}
