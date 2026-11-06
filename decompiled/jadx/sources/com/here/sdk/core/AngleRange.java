package com.here.sdk.core;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AngleRange {
    public final double extent;
    public final double start;

    public AngleRange(double d, double d2) {
        AngleRange fromDegreesClockwise = fromDegreesClockwise(d, d2);
        this.start = fromDegreesClockwise.start;
        this.extent = fromDegreesClockwise.extent;
    }

    private static native AngleRange fromDegreesClockwise(double d, double d2);

    @NonNull
    public static native AngleRange fromDirectionDegreesClockwise(double d, double d2);

    @NonNull
    public static native AngleRange fromMinMaxDegreesClockwise(double d, double d2);

    private static native AngleRange fullCircle();

    public native double closestInRange(double d);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AngleRange)) {
            return false;
        }
        AngleRange angleRange = (AngleRange) obj;
        return Double.compare(this.start, angleRange.start) == 0 && Double.compare(this.extent, angleRange.extent) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.start) ^ (Double.doubleToLongBits(this.start) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.extent) ^ (Double.doubleToLongBits(this.extent) >>> 32)));
    }

    public native boolean inRange(double d);

    public native double max();

    public AngleRange() {
        AngleRange fullCircle = fullCircle();
        this.start = fullCircle.start;
        this.extent = fullCircle.extent;
    }
}
