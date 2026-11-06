package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.HazardousMaterial;
import com.here.sdk.transport.TruckRoadType;
import com.here.sdk.transport.TruckSpecifications;
import com.here.sdk.transport.TunnelCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVTruckOptions {

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
    public TruckSpecifications truckSpecifications = new TruckSpecifications();

    @Nullable
    public TunnelCategory linkTunnelCategory = null;

    @NonNull
    public List<HazardousMaterial> hazardousMaterials = new ArrayList();

    @NonNull
    public List<TruckRoadType> avoidedTruckRoadTypes = new ArrayList();

    @NonNull
    public EVConsumptionModel consumptionModel = new EVConsumptionModel();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVTruckOptions)) {
            return false;
        }
        EVTruckOptions eVTruckOptions = (EVTruckOptions) obj;
        return Objects.equals(this.routeOptions, eVTruckOptions.routeOptions) && Objects.equals(this.textOptions, eVTruckOptions.textOptions) && Objects.equals(this.avoidanceOptions, eVTruckOptions.avoidanceOptions) && Objects.equals(this.tollOptions, eVTruckOptions.tollOptions) && Objects.equals(this.allowOptions, eVTruckOptions.allowOptions) && this.occupantsNumber == eVTruckOptions.occupantsNumber && Objects.equals(this.maxSpeedOnSegments, eVTruckOptions.maxSpeedOnSegments) && Objects.equals(this.truckSpecifications, eVTruckOptions.truckSpecifications) && Objects.equals(this.linkTunnelCategory, eVTruckOptions.linkTunnelCategory) && Objects.equals(this.hazardousMaterials, eVTruckOptions.hazardousMaterials) && Objects.equals(this.avoidedTruckRoadTypes, eVTruckOptions.avoidedTruckRoadTypes) && Objects.equals(this.consumptionModel, eVTruckOptions.consumptionModel);
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
        TruckSpecifications truckSpecifications = this.truckSpecifications;
        int hashCode7 = (hashCode6 + (truckSpecifications != null ? truckSpecifications.hashCode() : 0)) * 31;
        TunnelCategory tunnelCategory = this.linkTunnelCategory;
        int hashCode8 = (hashCode7 + (tunnelCategory != null ? tunnelCategory.hashCode() : 0)) * 31;
        List<HazardousMaterial> list2 = this.hazardousMaterials;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<TruckRoadType> list3 = this.avoidedTruckRoadTypes;
        int hashCode10 = (hashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31;
        EVConsumptionModel eVConsumptionModel = this.consumptionModel;
        return hashCode10 + (eVConsumptionModel != null ? eVConsumptionModel.hashCode() : 0);
    }
}
