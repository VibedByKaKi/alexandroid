package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.GeoPolygon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PolygonDataBuilder extends NativeBase {
    public PolygonDataBuilder() {
        this(create(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native PolygonData build();

    @NonNull
    public native PolygonDataBuilder withAttributes(@NonNull DataAttributes dataAttributes);

    @NonNull
    public native PolygonDataBuilder withGeometry(@NonNull GeoPolygon geoPolygon);

    public PolygonDataBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PolygonDataBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PolygonDataBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
