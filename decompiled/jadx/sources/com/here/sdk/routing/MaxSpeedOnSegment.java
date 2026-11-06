package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MaxSpeedOnSegment {
    public double baseSpeedInMetersPerSecond;

    @NonNull
    public SegmentReference segment;

    public MaxSpeedOnSegment(@NonNull SegmentReference segmentReference, double d) {
        this.segment = segmentReference;
        this.baseSpeedInMetersPerSecond = d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxSpeedOnSegment)) {
            return false;
        }
        MaxSpeedOnSegment maxSpeedOnSegment = (MaxSpeedOnSegment) obj;
        return Objects.equals(this.segment, maxSpeedOnSegment.segment) && Double.compare(this.baseSpeedInMetersPerSecond, maxSpeedOnSegment.baseSpeedInMetersPerSecond) == 0;
    }

    public int hashCode() {
        SegmentReference segmentReference = this.segment;
        return ((JfifUtil.MARKER_EOI + (segmentReference != null ? segmentReference.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.baseSpeedInMetersPerSecond) ^ (Double.doubleToLongBits(this.baseSpeedInMetersPerSecond) >>> 32)));
    }
}
