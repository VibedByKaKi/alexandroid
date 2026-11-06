package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Color;
import com.here.sdk.core.GeoPolyline;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapArrow extends NativeBase {
    public MapArrow(@NonNull GeoPolyline geoPolyline, double d, @NonNull Color color) {
        this(make(geoPolyline, d, color), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull GeoPolyline geoPolyline, double d, @NonNull Color color);

    private static native long make(@NonNull GeoPolyline geoPolyline, double d, @NonNull Color color, double d2, @NonNull Color color2);

    @NonNull
    public native Map<MapMeasure, Double> getMeasureDependentTailWidth();

    public native void setMeasureDependentTailWidth(@NonNull Map<MapMeasure, Double> map);

    public MapArrow(@NonNull GeoPolyline geoPolyline, double d, @NonNull Color color, double d2, @NonNull Color color2) {
        this(make(geoPolyline, d, color, d2, color2), null);
        cacheThisInstance();
    }

    public MapArrow(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapArrow.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapArrow.disposeNativeHandle(j2);
            }
        });
    }
}
