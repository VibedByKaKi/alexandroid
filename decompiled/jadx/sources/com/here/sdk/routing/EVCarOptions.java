package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.CarSpecifications;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVCarOptions {

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
    public boolean ensureReachability = false;

    @NonNull
    public EVConsumptionModel consumptionModel = new EVConsumptionModel();

    @NonNull
    public BatterySpecifications batterySpecifications = new BatterySpecifications();

    @NonNull
    public CarSpecifications carSpecifications = new CarSpecifications();

    @NonNull
    public EVMobilityServiceProviderPreferences evMobilityServiceProviderPreferences = new EVMobilityServiceProviderPreferences();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVCarOptions)) {
            return false;
        }
        EVCarOptions eVCarOptions = (EVCarOptions) obj;
        return Objects.equals(this.routeOptions, eVCarOptions.routeOptions) && Objects.equals(this.textOptions, eVCarOptions.textOptions) && Objects.equals(this.avoidanceOptions, eVCarOptions.avoidanceOptions) && Objects.equals(this.tollOptions, eVCarOptions.tollOptions) && Objects.equals(this.allowOptions, eVCarOptions.allowOptions) && this.occupantsNumber == eVCarOptions.occupantsNumber && Objects.equals(this.maxSpeedOnSegments, eVCarOptions.maxSpeedOnSegments) && this.ensureReachability == eVCarOptions.ensureReachability && Objects.equals(this.consumptionModel, eVCarOptions.consumptionModel) && Objects.equals(this.batterySpecifications, eVCarOptions.batterySpecifications) && Objects.equals(this.carSpecifications, eVCarOptions.carSpecifications) && Objects.equals(this.evMobilityServiceProviderPreferences, eVCarOptions.evMobilityServiceProviderPreferences);
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
        int hashCode6 = (((hashCode5 + (list != null ? list.hashCode() : 0)) * 31) + (this.ensureReachability ? 79 : 97)) * 31;
        EVConsumptionModel eVConsumptionModel = this.consumptionModel;
        int hashCode7 = (hashCode6 + (eVConsumptionModel != null ? eVConsumptionModel.hashCode() : 0)) * 31;
        BatterySpecifications batterySpecifications = this.batterySpecifications;
        int hashCode8 = (hashCode7 + (batterySpecifications != null ? batterySpecifications.hashCode() : 0)) * 31;
        CarSpecifications carSpecifications = this.carSpecifications;
        int hashCode9 = (hashCode8 + (carSpecifications != null ? carSpecifications.hashCode() : 0)) * 31;
        EVMobilityServiceProviderPreferences eVMobilityServiceProviderPreferences = this.evMobilityServiceProviderPreferences;
        return hashCode9 + (eVMobilityServiceProviderPreferences != null ? eVMobilityServiceProviderPreferences.hashCode() : 0);
    }
}
