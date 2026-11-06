package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PointDataBuilder extends NativeBase {
    public PointDataBuilder() {
        this(create(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native PointData build();

    @NonNull
    public native PointDataBuilder withAttributes(@NonNull DataAttributes dataAttributes);

    @NonNull
    public native PointDataBuilder withCoordinates(@NonNull GeoCoordinates geoCoordinates);

    public PointDataBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PointDataBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PointDataBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
