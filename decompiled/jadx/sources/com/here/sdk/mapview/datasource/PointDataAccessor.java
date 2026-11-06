package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PointDataAccessor extends NativeBase {
    public PointDataAccessor(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PointDataAccessor.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PointDataAccessor.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native DataAttributesAccessor getAttributes();

    @NonNull
    public native GeoCoordinates getCoordinates();

    public native void setAttributes(@NonNull DataAttributes dataAttributes);

    public native void setCoordinates(@NonNull GeoCoordinates geoCoordinates);
}
