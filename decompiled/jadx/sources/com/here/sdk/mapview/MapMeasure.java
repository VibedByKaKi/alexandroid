package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMeasure {

    @NonNull
    public final Kind kind;
    public final double value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        DISTANCE(0),
        ZOOM_LEVEL(1),
        SCALE(2);

        public final int value;

        Kind(int i) {
            this.value = i;
        }
    }

    public MapMeasure(@NonNull Kind kind, double d) {
        MapMeasure create = create(kind, d);
        this.kind = create.kind;
        this.value = create.value;
    }

    private static native MapMeasure create(@NonNull Kind kind, double d);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapMeasure)) {
            return false;
        }
        MapMeasure mapMeasure = (MapMeasure) obj;
        return Objects.equals(this.kind, mapMeasure.kind) && Double.compare(this.value, mapMeasure.value) == 0;
    }

    public int hashCode() {
        Kind kind = this.kind;
        return ((JfifUtil.MARKER_EOI + (kind != null ? kind.hashCode() : 0)) * 31) + ((int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32)));
    }
}
