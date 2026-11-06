package com.here.sdk.core;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GeoOrientation {
    public final double bearing;
    public final double tilt;

    public GeoOrientation(double d, double d2) {
        GeoOrientation make = make(d, d2);
        this.bearing = make.bearing;
        this.tilt = make.tilt;
    }

    private static native GeoOrientation make(double d, double d2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoOrientation)) {
            return false;
        }
        GeoOrientation geoOrientation = (GeoOrientation) obj;
        return Double.compare(this.bearing, geoOrientation.bearing) == 0 && Double.compare(this.tilt, geoOrientation.tilt) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.bearing) ^ (Double.doubleToLongBits(this.bearing) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.tilt) ^ (Double.doubleToLongBits(this.tilt) >>> 32)));
    }
}
