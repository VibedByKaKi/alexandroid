package com.here.sdk.routing;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes8.dex */
public final class TrafficSpeed {

    @Nullable
    public Double baseSpeedInMetersPerSecond;

    @Nullable
    public Double jamFactor;

    @Nullable
    public Double trafficSpeedInMetersPerSecond;

    public TrafficSpeed(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        this.baseSpeedInMetersPerSecond = d;
        this.trafficSpeedInMetersPerSecond = d2;
        this.jamFactor = d3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficSpeed)) {
            return false;
        }
        TrafficSpeed trafficSpeed = (TrafficSpeed) obj;
        return Objects.equals(this.baseSpeedInMetersPerSecond, trafficSpeed.baseSpeedInMetersPerSecond) && Objects.equals(this.trafficSpeedInMetersPerSecond, trafficSpeed.trafficSpeedInMetersPerSecond) && Objects.equals(this.jamFactor, trafficSpeed.jamFactor);
    }

    public int hashCode() {
        Double d = this.baseSpeedInMetersPerSecond;
        int hashCode = (JfifUtil.MARKER_EOI + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.trafficSpeedInMetersPerSecond;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.jamFactor;
        return hashCode2 + (d3 != null ? d3.hashCode() : 0);
    }
}
