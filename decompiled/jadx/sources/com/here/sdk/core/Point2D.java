package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Point2D {
    public double x;
    public double y;

    public Point2D() {
        this.x = 0.0d;
        this.y = 0.0d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point2D)) {
            return false;
        }
        Point2D point2D = (Point2D) obj;
        return Double.compare(this.x, point2D.x) == 0 && Double.compare(this.y, point2D.y) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32)));
    }

    public Point2D(double d, double d2) {
        this.x = d;
        this.y = d2;
    }
}
