package com.here.sdk.routing;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ChargingActionDetails {
    public double consumablePowerInKilowatts = 0.0d;
    public double arrivalChargeInKilowattHours = 0.0d;
    public double targetChargeInKilowattHours = 0.0d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargingActionDetails)) {
            return false;
        }
        ChargingActionDetails chargingActionDetails = (ChargingActionDetails) obj;
        return Double.compare(this.consumablePowerInKilowatts, chargingActionDetails.consumablePowerInKilowatts) == 0 && Double.compare(this.arrivalChargeInKilowattHours, chargingActionDetails.arrivalChargeInKilowattHours) == 0 && Double.compare(this.targetChargeInKilowattHours, chargingActionDetails.targetChargeInKilowattHours) == 0;
    }

    public int hashCode() {
        return ((((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.consumablePowerInKilowatts) ^ (Double.doubleToLongBits(this.consumablePowerInKilowatts) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.arrivalChargeInKilowattHours) ^ (Double.doubleToLongBits(this.arrivalChargeInKilowattHours) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.targetChargeInKilowattHours) ^ (Double.doubleToLongBits(this.targetChargeInKilowattHours) >>> 32)));
    }
}
