package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.mapview.MapMeasure;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMeasureRange {

    @NonNull
    public final MapMeasure.Kind kind;
    public final double maximumValue;
    public final double minimumValue;

    public MapMeasureRange(@NonNull MapMeasure.Kind kind, double d, double d2) {
        MapMeasureRange create = create(kind, d, d2);
        this.kind = create.kind;
        this.minimumValue = create.minimumValue;
        this.maximumValue = create.maximumValue;
    }

    private static native MapMeasureRange create(@NonNull MapMeasure.Kind kind, double d, double d2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapMeasureRange)) {
            return false;
        }
        MapMeasureRange mapMeasureRange = (MapMeasureRange) obj;
        return Objects.equals(this.kind, mapMeasureRange.kind) && Double.compare(this.minimumValue, mapMeasureRange.minimumValue) == 0 && Double.compare(this.maximumValue, mapMeasureRange.maximumValue) == 0;
    }

    public int hashCode() {
        MapMeasure.Kind kind = this.kind;
        return ((((JfifUtil.MARKER_EOI + (kind != null ? kind.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.minimumValue) ^ (Double.doubleToLongBits(this.minimumValue) >>> 32)))) * 31) + ((int) (Double.doubleToLongBits(this.maximumValue) ^ (Double.doubleToLongBits(this.maximumValue) >>> 32)));
    }
}
