package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Size2D {
    public double height;
    public double width;

    public Size2D() {
        this.width = 0.0d;
        this.height = 0.0d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Size2D)) {
            return false;
        }
        Size2D size2D = (Size2D) obj;
        return Double.compare(this.width, size2D.width) == 0 && Double.compare(this.height, size2D.height) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32)));
    }

    public Size2D(double d, double d2) {
        this.width = d;
        this.height = d2;
    }
}
