package com.here.sdk.mapview;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class DashPattern {
    public final double firstDashLength;
    public final double firstGapLength;

    public DashPattern(double d) {
        DashPattern make = make(d);
        this.firstGapLength = make.firstGapLength;
        this.firstDashLength = make.firstDashLength;
    }

    private static native DashPattern make(double d);

    private static native DashPattern make(double d, double d2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DashPattern)) {
            return false;
        }
        DashPattern dashPattern = (DashPattern) obj;
        return Double.compare(this.firstGapLength, dashPattern.firstGapLength) == 0 && Double.compare(this.firstDashLength, dashPattern.firstDashLength) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.firstGapLength) ^ (Double.doubleToLongBits(this.firstGapLength) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.firstDashLength) ^ (Double.doubleToLongBits(this.firstDashLength) >>> 32)));
    }

    public DashPattern(double d, double d2) {
        DashPattern make = make(d, d2);
        this.firstGapLength = make.firstGapLength;
        this.firstDashLength = make.firstDashLength;
    }
}
