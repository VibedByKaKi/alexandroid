package com.here.sdk.transport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class VehicleProfile {

    @NonNull
    public VehicleType vehicleType;

    @Nullable
    PlateNumberType plateNumberType = null;

    @Nullable
    FuelType fuelType = null;

    @NonNull
    VehicleEquipment equipment = new VehicleEquipment();

    @Nullable
    public TruckType truckType = null;
    public int trailerCount = 0;
    boolean isTaxi = false;
    int occupantsCount = 1;

    @Nullable
    EmissionStandard emissionStandard = null;

    @NonNull
    public List<HazardousMaterial> hazardousMaterials = new ArrayList();

    @Nullable
    public TunnelCategory tunnelCategory = null;

    @Nullable
    public Integer axleCount = null;

    @Nullable
    public Integer grossWeightInKilograms = null;

    @Nullable
    public Integer heightInCentimeters = null;

    @Nullable
    public Integer lengthInCentimeters = null;

    @Nullable
    public Integer widthInCentimeters = null;

    @Nullable
    public Integer weightPerAxleInKilograms = null;

    public VehicleProfile(@NonNull VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VehicleProfile)) {
            return false;
        }
        VehicleProfile vehicleProfile = (VehicleProfile) obj;
        return Objects.equals(this.vehicleType, vehicleProfile.vehicleType) && Objects.equals(this.plateNumberType, vehicleProfile.plateNumberType) && Objects.equals(this.fuelType, vehicleProfile.fuelType) && Objects.equals(this.equipment, vehicleProfile.equipment) && Objects.equals(this.truckType, vehicleProfile.truckType) && this.trailerCount == vehicleProfile.trailerCount && this.isTaxi == vehicleProfile.isTaxi && this.occupantsCount == vehicleProfile.occupantsCount && Objects.equals(this.emissionStandard, vehicleProfile.emissionStandard) && Objects.equals(this.hazardousMaterials, vehicleProfile.hazardousMaterials) && Objects.equals(this.tunnelCategory, vehicleProfile.tunnelCategory) && Objects.equals(this.axleCount, vehicleProfile.axleCount) && Objects.equals(this.grossWeightInKilograms, vehicleProfile.grossWeightInKilograms) && Objects.equals(this.heightInCentimeters, vehicleProfile.heightInCentimeters) && Objects.equals(this.lengthInCentimeters, vehicleProfile.lengthInCentimeters) && Objects.equals(this.widthInCentimeters, vehicleProfile.widthInCentimeters) && Objects.equals(this.weightPerAxleInKilograms, vehicleProfile.weightPerAxleInKilograms);
    }

    public int hashCode() {
        VehicleType vehicleType = this.vehicleType;
        int hashCode = (JfifUtil.MARKER_EOI + (vehicleType != null ? vehicleType.hashCode() : 0)) * 31;
        PlateNumberType plateNumberType = this.plateNumberType;
        int hashCode2 = (hashCode + (plateNumberType != null ? plateNumberType.hashCode() : 0)) * 31;
        FuelType fuelType = this.fuelType;
        int hashCode3 = (hashCode2 + (fuelType != null ? fuelType.hashCode() : 0)) * 31;
        VehicleEquipment vehicleEquipment = this.equipment;
        int hashCode4 = (hashCode3 + (vehicleEquipment != null ? vehicleEquipment.hashCode() : 0)) * 31;
        TruckType truckType = this.truckType;
        int hashCode5 = (((((((hashCode4 + (truckType != null ? truckType.hashCode() : 0)) * 31) + this.trailerCount) * 31) + (this.isTaxi ? 79 : 97)) * 31) + this.occupantsCount) * 31;
        EmissionStandard emissionStandard = this.emissionStandard;
        int hashCode6 = (hashCode5 + (emissionStandard != null ? emissionStandard.hashCode() : 0)) * 31;
        List<HazardousMaterial> list = this.hazardousMaterials;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        TunnelCategory tunnelCategory = this.tunnelCategory;
        int hashCode8 = (hashCode7 + (tunnelCategory != null ? tunnelCategory.hashCode() : 0)) * 31;
        Integer num = this.axleCount;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.grossWeightInKilograms;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.heightInCentimeters;
        int hashCode11 = (hashCode10 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.lengthInCentimeters;
        int hashCode12 = (hashCode11 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.widthInCentimeters;
        int hashCode13 = (hashCode12 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.weightPerAxleInKilograms;
        return hashCode13 + (num6 != null ? num6.hashCode() : 0);
    }
}
