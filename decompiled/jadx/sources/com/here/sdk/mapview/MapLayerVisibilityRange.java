package com.here.sdk.mapview;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapLayerVisibilityRange {
    public final double maximumZoomLevel;
    public final double minimumZoomLevel;

    public MapLayerVisibilityRange(double d, double d2) {
        this.minimumZoomLevel = d;
        this.maximumZoomLevel = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapLayerVisibilityRange)) {
            return false;
        }
        MapLayerVisibilityRange mapLayerVisibilityRange = (MapLayerVisibilityRange) obj;
        return Double.compare(this.minimumZoomLevel, mapLayerVisibilityRange.minimumZoomLevel) == 0 && Double.compare(this.maximumZoomLevel, mapLayerVisibilityRange.maximumZoomLevel) == 0;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + ((int) (Double.doubleToLongBits(this.minimumZoomLevel) ^ (Double.doubleToLongBits(this.minimumZoomLevel) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.maximumZoomLevel) ^ (Double.doubleToLongBits(this.maximumZoomLevel) >>> 32)));
    }
}
