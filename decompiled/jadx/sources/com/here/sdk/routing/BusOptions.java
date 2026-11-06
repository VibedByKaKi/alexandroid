package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.BusSpecifications;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class BusOptions {

    @NonNull
    public RouteOptions routeOptions = new RouteOptions();

    @NonNull
    public RouteTextOptions textOptions = new RouteTextOptions();

    @NonNull
    public AvoidanceOptions avoidanceOptions = new AvoidanceOptions();

    @NonNull
    public TollOptions tollOptions = new TollOptions();

    @NonNull
    public AllowOptions allowOptions = new AllowOptions();
    public int occupantsNumber = 1;

    @NonNull
    public List<MaxSpeedOnSegment> maxSpeedOnSegments = new ArrayList();

    @NonNull
    public BusSpecifications busSpecifications = new BusSpecifications();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusOptions)) {
            return false;
        }
        BusOptions busOptions = (BusOptions) obj;
        return Objects.equals(this.routeOptions, busOptions.routeOptions) && Objects.equals(this.textOptions, busOptions.textOptions) && Objects.equals(this.avoidanceOptions, busOptions.avoidanceOptions) && Objects.equals(this.tollOptions, busOptions.tollOptions) && Objects.equals(this.allowOptions, busOptions.allowOptions) && this.occupantsNumber == busOptions.occupantsNumber && Objects.equals(this.maxSpeedOnSegments, busOptions.maxSpeedOnSegments) && Objects.equals(this.busSpecifications, busOptions.busSpecifications);
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
        AllowOptions allowOptions = this.allowOptions;
        int hashCode5 = (((hashCode4 + (allowOptions != null ? allowOptions.hashCode() : 0)) * 31) + this.occupantsNumber) * 31;
        List<MaxSpeedOnSegment> list = this.maxSpeedOnSegments;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        BusSpecifications busSpecifications = this.busSpecifications;
        return hashCode6 + (busSpecifications != null ? busSpecifications.hashCode() : 0);
    }
}
