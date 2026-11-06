package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.GeoPolygon;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Isoline extends NativeBase {
    public Isoline(@NonNull IsolineRangeType isolineRangeType, double d, @NonNull MapMatchedCoordinates mapMatchedCoordinates, @NonNull List<GeoPolygon> list) {
        this(make(isolineRangeType, d, mapMatchedCoordinates, list), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull IsolineRangeType isolineRangeType, double d, @NonNull MapMatchedCoordinates mapMatchedCoordinates, @NonNull List<GeoPolygon> list);

    @NonNull
    public native MapMatchedCoordinates getCenter();

    @NonNull
    public native List<GeoPolygon> getPolygons();

    @NonNull
    public native IsolineRangeType getRangeType();

    public native double getRangeValue();

    public Isoline(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.routing.Isoline.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Isoline.disposeNativeHandle(j2);
            }
        });
    }
}
