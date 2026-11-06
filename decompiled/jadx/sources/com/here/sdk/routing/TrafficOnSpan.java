package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficOnSpan {
    public int trafficSectionPolylineOffset = 0;
    public double lengthInMeters = 0.0d;

    @NonNull
    public Duration duration = Duration.ofSeconds(0);

    @NonNull
    public Duration trafficDelay = Duration.ofSeconds(0);
    public double baseSpeedInMetersPerSecond = 0.0d;
    public double trafficSpeedInMetersPerSecond = 0.0d;
    public double jamFactor = 0.0d;

    @NonNull
    public List<Integer> incidentIndices = new ArrayList();

    @Nullable
    public Double consumptionInKilowattHours = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficOnSpan)) {
            return false;
        }
        TrafficOnSpan trafficOnSpan = (TrafficOnSpan) obj;
        return this.trafficSectionPolylineOffset == trafficOnSpan.trafficSectionPolylineOffset && Double.compare(this.lengthInMeters, trafficOnSpan.lengthInMeters) == 0 && Objects.equals(this.duration, trafficOnSpan.duration) && Objects.equals(this.trafficDelay, trafficOnSpan.trafficDelay) && Double.compare(this.baseSpeedInMetersPerSecond, trafficOnSpan.baseSpeedInMetersPerSecond) == 0 && Double.compare(this.trafficSpeedInMetersPerSecond, trafficOnSpan.trafficSpeedInMetersPerSecond) == 0 && Double.compare(this.jamFactor, trafficOnSpan.jamFactor) == 0 && Objects.equals(this.incidentIndices, trafficOnSpan.incidentIndices) && Objects.equals(this.consumptionInKilowattHours, trafficOnSpan.consumptionInKilowattHours);
    }

    public int hashCode() {
        int doubleToLongBits = (((JfifUtil.MARKER_EOI + this.trafficSectionPolylineOffset) * 31) + ((int) (Double.doubleToLongBits(this.lengthInMeters) ^ (Double.doubleToLongBits(this.lengthInMeters) >>> 32)))) * 31;
        Duration duration = this.duration;
        int hashCode = (doubleToLongBits + (duration != null ? duration.hashCode() : 0)) * 31;
        Duration duration2 = this.trafficDelay;
        int hashCode2 = (((((((hashCode + (duration2 != null ? duration2.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.baseSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.baseSpeedInMetersPerSecond) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.trafficSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.trafficSpeedInMetersPerSecond) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.jamFactor) ^ (Double.doubleToLongBits(this.jamFactor) >>> 32)))) * 31;
        List<Integer> list = this.incidentIndices;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Double d = this.consumptionInKilowattHours;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }
}
