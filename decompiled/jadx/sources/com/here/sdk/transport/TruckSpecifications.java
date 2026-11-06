package com.here.sdk.transport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TruckSpecifications {

    @Nullable
    public Integer grossWeightInKilograms = null;

    @Nullable
    public Integer weightPerAxleInKilograms = null;

    @Nullable
    public WeightPerAxleGroup weightPerAxleGroup = null;

    @Nullable
    public Integer heightInCentimeters = null;

    @Nullable
    public Integer widthInCentimeters = null;

    @Nullable
    public Integer lengthInCentimeters = null;

    @Nullable
    public Integer axleCount = null;

    @Nullable
    public Integer trailerCount = null;

    @NonNull
    public TruckType truckType = TruckType.STRAIGHT;
    public boolean isTruckLight = false;

    @Nullable
    public Integer payloadCapacityInKilograms = null;

    @Nullable
    public Integer trailerAxleCount = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TruckSpecifications)) {
            return false;
        }
        TruckSpecifications truckSpecifications = (TruckSpecifications) obj;
        return Objects.equals(this.grossWeightInKilograms, truckSpecifications.grossWeightInKilograms) && Objects.equals(this.weightPerAxleInKilograms, truckSpecifications.weightPerAxleInKilograms) && Objects.equals(this.weightPerAxleGroup, truckSpecifications.weightPerAxleGroup) && Objects.equals(this.heightInCentimeters, truckSpecifications.heightInCentimeters) && Objects.equals(this.widthInCentimeters, truckSpecifications.widthInCentimeters) && Objects.equals(this.lengthInCentimeters, truckSpecifications.lengthInCentimeters) && Objects.equals(this.axleCount, truckSpecifications.axleCount) && Objects.equals(this.trailerCount, truckSpecifications.trailerCount) && Objects.equals(this.truckType, truckSpecifications.truckType) && this.isTruckLight == truckSpecifications.isTruckLight && Objects.equals(this.payloadCapacityInKilograms, truckSpecifications.payloadCapacityInKilograms) && Objects.equals(this.trailerAxleCount, truckSpecifications.trailerAxleCount);
    }

    public int hashCode() {
        Integer num = this.grossWeightInKilograms;
        int hashCode = (JfifUtil.MARKER_EOI + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.weightPerAxleInKilograms;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        WeightPerAxleGroup weightPerAxleGroup = this.weightPerAxleGroup;
        int hashCode3 = (hashCode2 + (weightPerAxleGroup != null ? weightPerAxleGroup.hashCode() : 0)) * 31;
        Integer num3 = this.heightInCentimeters;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.widthInCentimeters;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.lengthInCentimeters;
        int hashCode6 = (hashCode5 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.axleCount;
        int hashCode7 = (hashCode6 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Integer num7 = this.trailerCount;
        int hashCode8 = (hashCode7 + (num7 != null ? num7.hashCode() : 0)) * 31;
        TruckType truckType = this.truckType;
        int hashCode9 = (((hashCode8 + (truckType != null ? truckType.hashCode() : 0)) * 31) + (this.isTruckLight ? 79 : 97)) * 31;
        Integer num8 = this.payloadCapacityInKilograms;
        int hashCode10 = (hashCode9 + (num8 != null ? num8.hashCode() : 0)) * 31;
        Integer num9 = this.trailerAxleCount;
        return hashCode10 + (num9 != null ? num9.hashCode() : 0);
    }
}
