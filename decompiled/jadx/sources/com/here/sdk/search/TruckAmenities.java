package com.here.sdk.search;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TruckAmenities {
    public boolean hasParking = false;
    public boolean hasSecureParking = false;
    public boolean hasCarWash = false;
    public boolean hasTruckWash = false;
    public boolean hasHighCanopy = false;
    public boolean hasIdleReductionSystem = false;
    public boolean hasTruckScales = false;
    public boolean hasPowerSupply = false;
    public boolean hasChemicalToiletDisposal = false;
    public boolean hasTruckStop = false;
    public boolean hasWifi = false;
    public boolean hasTruckService = false;
    public boolean hasShower = false;

    @Nullable
    public Integer showerCount = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TruckAmenities)) {
            return false;
        }
        TruckAmenities truckAmenities = (TruckAmenities) obj;
        return this.hasParking == truckAmenities.hasParking && this.hasSecureParking == truckAmenities.hasSecureParking && this.hasCarWash == truckAmenities.hasCarWash && this.hasTruckWash == truckAmenities.hasTruckWash && this.hasHighCanopy == truckAmenities.hasHighCanopy && this.hasIdleReductionSystem == truckAmenities.hasIdleReductionSystem && this.hasTruckScales == truckAmenities.hasTruckScales && this.hasPowerSupply == truckAmenities.hasPowerSupply && this.hasChemicalToiletDisposal == truckAmenities.hasChemicalToiletDisposal && this.hasTruckStop == truckAmenities.hasTruckStop && this.hasWifi == truckAmenities.hasWifi && this.hasTruckService == truckAmenities.hasTruckService && this.hasShower == truckAmenities.hasShower && Objects.equals(this.showerCount, truckAmenities.showerCount);
    }

    public int hashCode() {
        int i = (((((((((((((((((((((((((JfifUtil.MARKER_EOI + (this.hasParking ? 79 : 97)) * 31) + (this.hasSecureParking ? 79 : 97)) * 31) + (this.hasCarWash ? 79 : 97)) * 31) + (this.hasTruckWash ? 79 : 97)) * 31) + (this.hasHighCanopy ? 79 : 97)) * 31) + (this.hasIdleReductionSystem ? 79 : 97)) * 31) + (this.hasTruckScales ? 79 : 97)) * 31) + (this.hasPowerSupply ? 79 : 97)) * 31) + (this.hasChemicalToiletDisposal ? 79 : 97)) * 31) + (this.hasTruckStop ? 79 : 97)) * 31) + (this.hasWifi ? 79 : 97)) * 31) + (this.hasTruckService ? 79 : 97)) * 31) + (this.hasShower ? 79 : 97)) * 31;
        Integer num = this.showerCount;
        return i + (num != null ? num.hashCode() : 0);
    }
}
