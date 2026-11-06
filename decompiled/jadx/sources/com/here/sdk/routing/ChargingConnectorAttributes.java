package com.here.sdk.routing;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ChargingConnectorAttributes {

    @Nullable
    public ChargingConnectorType connectorType;

    @Nullable
    public Double currentInAmperes;
    public double powerInKilowatts;

    @Nullable
    public ChargingSupplyType supplyType;

    @Nullable
    public Double voltageInVolts;

    public ChargingConnectorAttributes(double d, @Nullable Double d2, @Nullable Double d3, @Nullable ChargingSupplyType chargingSupplyType, @Nullable ChargingConnectorType chargingConnectorType) {
        this.powerInKilowatts = d;
        this.currentInAmperes = d2;
        this.voltageInVolts = d3;
        this.supplyType = chargingSupplyType;
        this.connectorType = chargingConnectorType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargingConnectorAttributes)) {
            return false;
        }
        ChargingConnectorAttributes chargingConnectorAttributes = (ChargingConnectorAttributes) obj;
        return Double.compare(this.powerInKilowatts, chargingConnectorAttributes.powerInKilowatts) == 0 && Objects.equals(this.currentInAmperes, chargingConnectorAttributes.currentInAmperes) && Objects.equals(this.voltageInVolts, chargingConnectorAttributes.voltageInVolts) && Objects.equals(this.supplyType, chargingConnectorAttributes.supplyType) && Objects.equals(this.connectorType, chargingConnectorAttributes.connectorType);
    }

    public int hashCode() {
        int doubleToLongBits = (JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.powerInKilowatts) ^ (Double.doubleToLongBits(this.powerInKilowatts) >>> 32)))) * 31;
        Double d = this.currentInAmperes;
        int hashCode = (doubleToLongBits + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.voltageInVolts;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        ChargingSupplyType chargingSupplyType = this.supplyType;
        int hashCode3 = (hashCode2 + (chargingSupplyType != null ? chargingSupplyType.hashCode() : 0)) * 31;
        ChargingConnectorType chargingConnectorType = this.connectorType;
        return hashCode3 + (chargingConnectorType != null ? chargingConnectorType.hashCode() : 0);
    }
}
