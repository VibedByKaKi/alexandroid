package com.here.sdk.routing;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ChargingStop {
    public double currentInAmperes;

    @Nullable
    public Duration maxDuration;

    @Nullable
    public Duration minDuration;
    public double powerInKilowatts;

    @Nullable
    public ChargingSupplyType supplyType;
    public double voltageInVolts;

    public ChargingStop() {
        this.powerInKilowatts = 0.0d;
        this.currentInAmperes = 0.0d;
        this.voltageInVolts = 0.0d;
        this.supplyType = null;
        this.minDuration = null;
        this.maxDuration = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargingStop)) {
            return false;
        }
        ChargingStop chargingStop = (ChargingStop) obj;
        return Double.compare(this.powerInKilowatts, chargingStop.powerInKilowatts) == 0 && Double.compare(this.currentInAmperes, chargingStop.currentInAmperes) == 0 && Double.compare(this.voltageInVolts, chargingStop.voltageInVolts) == 0 && Objects.equals(this.supplyType, chargingStop.supplyType) && Objects.equals(this.minDuration, chargingStop.minDuration) && Objects.equals(this.maxDuration, chargingStop.maxDuration);
    }

    public int hashCode() {
        int doubleToLongBits = (((((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.powerInKilowatts) ^ (Double.doubleToLongBits(this.powerInKilowatts) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.currentInAmperes) ^ (Double.doubleToLongBits(this.currentInAmperes) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.voltageInVolts) ^ (Double.doubleToLongBits(this.voltageInVolts) >>> 32)))) * 31;
        ChargingSupplyType chargingSupplyType = this.supplyType;
        int hashCode = (doubleToLongBits + (chargingSupplyType != null ? chargingSupplyType.hashCode() : 0)) * 31;
        Duration duration = this.minDuration;
        int hashCode2 = (hashCode + (duration != null ? duration.hashCode() : 0)) * 31;
        Duration duration2 = this.maxDuration;
        return hashCode2 + (duration2 != null ? duration2.hashCode() : 0);
    }

    public ChargingStop(double d, double d2, double d3, @Nullable ChargingSupplyType chargingSupplyType, @Nullable Duration duration, @Nullable Duration duration2) {
        this.powerInKilowatts = d;
        this.currentInAmperes = d2;
        this.voltageInVolts = d3;
        this.supplyType = chargingSupplyType;
        this.minDuration = duration;
        this.maxDuration = duration2;
    }
}
