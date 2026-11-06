package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Point3D {
    public double x;
    public double y;
    public double z;

    public Point3D() {
        this.x = 0.0d;
        this.y = 0.0d;
        this.z = 0.0d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point3D)) {
            return false;
        }
        Point3D point3D = (Point3D) obj;
        return Double.compare(this.x, point3D.x) == 0 && Double.compare(this.y, point3D.y) == 0 && Double.compare(this.z, point3D.z) == 0;
    }

    public int hashCode() {
        return ((((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32)));
    }

    public Point3D(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }
}
