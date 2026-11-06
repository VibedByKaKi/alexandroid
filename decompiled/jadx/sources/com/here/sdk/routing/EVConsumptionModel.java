package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVConsumptionModel {
    public double ascentConsumptionInWattHoursPerMeter = 0.0d;
    public double descentRecoveryInWattHoursPerMeter = 0.0d;

    @NonNull
    public Map<Integer, Double> freeFlowSpeedTable = new HashMap();

    @NonNull
    public Map<Integer, Double> trafficSpeedTable = new HashMap();
    public double auxiliaryConsumptionInWattHoursPerSecond = 0.0d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVConsumptionModel)) {
            return false;
        }
        EVConsumptionModel eVConsumptionModel = (EVConsumptionModel) obj;
        return Double.compare(this.ascentConsumptionInWattHoursPerMeter, eVConsumptionModel.ascentConsumptionInWattHoursPerMeter) == 0 && Double.compare(this.descentRecoveryInWattHoursPerMeter, eVConsumptionModel.descentRecoveryInWattHoursPerMeter) == 0 && Objects.equals(this.freeFlowSpeedTable, eVConsumptionModel.freeFlowSpeedTable) && Objects.equals(this.trafficSpeedTable, eVConsumptionModel.trafficSpeedTable) && Double.compare(this.auxiliaryConsumptionInWattHoursPerSecond, eVConsumptionModel.auxiliaryConsumptionInWattHoursPerSecond) == 0;
    }

    public int hashCode() {
        int doubleToLongBits = (((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.ascentConsumptionInWattHoursPerMeter) ^ (Double.doubleToLongBits(this.ascentConsumptionInWattHoursPerMeter) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.descentRecoveryInWattHoursPerMeter) ^ (Double.doubleToLongBits(this.descentRecoveryInWattHoursPerMeter) >>> 32)))) * 31;
        Map<Integer, Double> map = this.freeFlowSpeedTable;
        int hashCode = (doubleToLongBits + (map != null ? map.hashCode() : 0)) * 31;
        Map<Integer, Double> map2 = this.trafficSpeedTable;
        return ((hashCode + (map2 != null ? map2.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.auxiliaryConsumptionInWattHoursPerSecond) ^ (Double.doubleToLongBits(this.auxiliaryConsumptionInWattHoursPerSecond) >>> 32)));
    }
}
