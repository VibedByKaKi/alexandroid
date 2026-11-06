package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Anchor2D {
    public double horizontal;
    public double vertical;

    public Anchor2D() {
        Anchor2D make = make();
        this.horizontal = make.horizontal;
        this.vertical = make.vertical;
    }

    private static native Anchor2D make();

    private static native Anchor2D make(double d, double d2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Anchor2D)) {
            return false;
        }
        Anchor2D anchor2D = (Anchor2D) obj;
        return Double.compare(this.horizontal, anchor2D.horizontal) == 0 && Double.compare(this.vertical, anchor2D.vertical) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.horizontal) ^ (Double.doubleToLongBits(this.horizontal) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.vertical) ^ (Double.doubleToLongBits(this.vertical) >>> 32)));
    }

    public Anchor2D(double d, double d2) {
        Anchor2D make = make(d, d2);
        this.horizontal = make.horizontal;
        this.vertical = make.vertical;
    }
}
