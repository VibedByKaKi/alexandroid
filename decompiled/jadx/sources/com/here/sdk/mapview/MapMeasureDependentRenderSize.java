package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.mapview.MapMeasure;
import com.here.sdk.mapview.RenderSize;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMeasureDependentRenderSize {

    @NonNull
    public final MapMeasure.Kind measureKind;

    @NonNull
    public final RenderSize.Unit sizeUnit;

    @NonNull
    public final Map<Double, Double> sizes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        EMPTY_SIZES(1),
        NEGATIVE_MAP_MEASURE(2),
        NEGATIVE_SIZE(3);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorCode error;

        public InstantiationException(InstantiationErrorCode instantiationErrorCode) {
            super(instantiationErrorCode.toString());
            this.error = instantiationErrorCode;
        }
    }

    public MapMeasureDependentRenderSize(@NonNull MapMeasure.Kind kind, @NonNull RenderSize.Unit unit, @NonNull Map<Double, Double> map) throws InstantiationException {
        MapMeasureDependentRenderSize make = make(kind, unit, map);
        this.measureKind = make.measureKind;
        this.sizeUnit = make.sizeUnit;
        this.sizes = make.sizes;
    }

    private static native MapMeasureDependentRenderSize make(@NonNull MapMeasure.Kind kind, @NonNull RenderSize.Unit unit, @NonNull Map<Double, Double> map) throws InstantiationException;

    private static native MapMeasureDependentRenderSize make(@NonNull RenderSize.Unit unit, double d) throws InstantiationException;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapMeasureDependentRenderSize)) {
            return false;
        }
        MapMeasureDependentRenderSize mapMeasureDependentRenderSize = (MapMeasureDependentRenderSize) obj;
        return Objects.equals(this.measureKind, mapMeasureDependentRenderSize.measureKind) && Objects.equals(this.sizeUnit, mapMeasureDependentRenderSize.sizeUnit) && Objects.equals(this.sizes, mapMeasureDependentRenderSize.sizes);
    }

    public int hashCode() {
        MapMeasure.Kind kind = this.measureKind;
        int hashCode = (JfifUtil.MARKER_EOI + (kind != null ? kind.hashCode() : 0)) * 31;
        RenderSize.Unit unit = this.sizeUnit;
        int hashCode2 = (hashCode + (unit != null ? unit.hashCode() : 0)) * 31;
        Map<Double, Double> map = this.sizes;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public MapMeasureDependentRenderSize(@NonNull RenderSize.Unit unit, double d) throws InstantiationException {
        MapMeasureDependentRenderSize make = make(unit, d);
        this.measureKind = make.measureKind;
        this.sizeUnit = make.sizeUnit;
        this.sizes = make.sizes;
    }
}
