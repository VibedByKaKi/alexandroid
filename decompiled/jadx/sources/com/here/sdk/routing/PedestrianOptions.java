package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PedestrianOptions {

    @NonNull
    public RouteOptions routeOptions = new RouteOptions();

    @NonNull
    public RouteTextOptions textOptions = new RouteTextOptions();

    @NonNull
    public AvoidanceOptions avoidanceOptions = new AvoidanceOptions();
    public double walkSpeedInMetersPerSecond = 1.0d;

    @NonNull
    public static native PedestrianOptions fromDefaultParameterConfiguration();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PedestrianOptions)) {
            return false;
        }
        PedestrianOptions pedestrianOptions = (PedestrianOptions) obj;
        return Objects.equals(this.routeOptions, pedestrianOptions.routeOptions) && Objects.equals(this.textOptions, pedestrianOptions.textOptions) && Objects.equals(this.avoidanceOptions, pedestrianOptions.avoidanceOptions) && Double.compare(this.walkSpeedInMetersPerSecond, pedestrianOptions.walkSpeedInMetersPerSecond) == 0;
    }

    public int hashCode() {
        RouteOptions routeOptions = this.routeOptions;
        int hashCode = (JfifUtil.MARKER_EOI + (routeOptions != null ? routeOptions.hashCode() : 0)) * 31;
        RouteTextOptions routeTextOptions = this.textOptions;
        int hashCode2 = (hashCode + (routeTextOptions != null ? routeTextOptions.hashCode() : 0)) * 31;
        AvoidanceOptions avoidanceOptions = this.avoidanceOptions;
        return ((hashCode2 + (avoidanceOptions != null ? avoidanceOptions.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.walkSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.walkSpeedInMetersPerSecond) >>> 32)));
    }
}
