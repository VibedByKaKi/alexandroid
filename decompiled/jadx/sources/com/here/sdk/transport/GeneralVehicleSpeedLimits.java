package com.here.sdk.transport;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeneralVehicleSpeedLimits {

    @Nullable
    public Double maxSpeedHighwaysInMetersPerSecond = null;

    @Nullable
    public Double maxSpeedRuralInMetersPerSecond = null;

    @Nullable
    public Double maxSpeedUrbanInMetersPerSecond = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeneralVehicleSpeedLimits)) {
            return false;
        }
        GeneralVehicleSpeedLimits generalVehicleSpeedLimits = (GeneralVehicleSpeedLimits) obj;
        return Objects.equals(this.maxSpeedHighwaysInMetersPerSecond, generalVehicleSpeedLimits.maxSpeedHighwaysInMetersPerSecond) && Objects.equals(this.maxSpeedRuralInMetersPerSecond, generalVehicleSpeedLimits.maxSpeedRuralInMetersPerSecond) && Objects.equals(this.maxSpeedUrbanInMetersPerSecond, generalVehicleSpeedLimits.maxSpeedUrbanInMetersPerSecond);
    }

    public int hashCode() {
        Double d = this.maxSpeedHighwaysInMetersPerSecond;
        int hashCode = (JfifUtil.MARKER_EOI + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.maxSpeedRuralInMetersPerSecond;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.maxSpeedUrbanInMetersPerSecond;
        return hashCode2 + (d3 != null ? d3.hashCode() : 0);
    }
}
