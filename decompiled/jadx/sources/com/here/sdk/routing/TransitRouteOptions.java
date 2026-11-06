package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitRouteOptions {

    @Nullable
    public Date departureTime = null;

    @Nullable
    public Date arrivalTime = null;
    public int alternatives = 0;

    @Nullable
    public Integer changes = null;

    @NonNull
    public TransitModeFilter modeFilter = TransitModeFilter.INCLUDE;

    @NonNull
    public List<TransitMode> modes = new ArrayList();
    public double pedestrianSpeedInMetersPerSecond = 1.0d;
    public int pedestrianMaxDistanceInMeters = 2000;

    @NonNull
    public RouteTextOptions textOptions = new RouteTextOptions();

    @NonNull
    public static native TransitRouteOptions fromDefaultParameterConfiguration();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransitRouteOptions)) {
            return false;
        }
        TransitRouteOptions transitRouteOptions = (TransitRouteOptions) obj;
        return Objects.equals(this.departureTime, transitRouteOptions.departureTime) && Objects.equals(this.arrivalTime, transitRouteOptions.arrivalTime) && this.alternatives == transitRouteOptions.alternatives && Objects.equals(this.changes, transitRouteOptions.changes) && Objects.equals(this.modeFilter, transitRouteOptions.modeFilter) && Objects.equals(this.modes, transitRouteOptions.modes) && Double.compare(this.pedestrianSpeedInMetersPerSecond, transitRouteOptions.pedestrianSpeedInMetersPerSecond) == 0 && this.pedestrianMaxDistanceInMeters == transitRouteOptions.pedestrianMaxDistanceInMeters && Objects.equals(this.textOptions, transitRouteOptions.textOptions);
    }

    public int hashCode() {
        Date date = this.departureTime;
        int hashCode = (JfifUtil.MARKER_EOI + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.arrivalTime;
        int hashCode2 = (((hashCode + (date2 != null ? date2.hashCode() : 0)) * 31) + this.alternatives) * 31;
        Integer num = this.changes;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        TransitModeFilter transitModeFilter = this.modeFilter;
        int hashCode4 = (hashCode3 + (transitModeFilter != null ? transitModeFilter.hashCode() : 0)) * 31;
        List<TransitMode> list = this.modes;
        int hashCode5 = (((((hashCode4 + (list != null ? list.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.pedestrianSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.pedestrianSpeedInMetersPerSecond) >>> 32)))) * 31) + this.pedestrianMaxDistanceInMeters) * 31;
        RouteTextOptions routeTextOptions = this.textOptions;
        return hashCode5 + (routeTextOptions != null ? routeTextOptions.hashCode() : 0);
    }
}
