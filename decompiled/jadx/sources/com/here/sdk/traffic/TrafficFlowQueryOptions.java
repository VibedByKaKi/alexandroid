package com.here.sdk.traffic;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficFlowQueryOptions {

    @Nullable
    public Double minJamFactor = null;

    @Nullable
    public Double maxJamFactor = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficFlowQueryOptions)) {
            return false;
        }
        TrafficFlowQueryOptions trafficFlowQueryOptions = (TrafficFlowQueryOptions) obj;
        return Objects.equals(this.minJamFactor, trafficFlowQueryOptions.minJamFactor) && Objects.equals(this.maxJamFactor, trafficFlowQueryOptions.maxJamFactor);
    }

    public int hashCode() {
        Double d = this.minJamFactor;
        int hashCode = (JfifUtil.MARKER_EOI + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.maxJamFactor;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }
}
