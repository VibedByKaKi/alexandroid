package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.mapview.datasource.DataAttributes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapObjectDescriptor extends NativeBase {
    public MapObjectDescriptor(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapObjectDescriptor.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapObjectDescriptor.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Nullable
    public native GeoCoordinates getClosestPoint();

    @NonNull
    public native DataAttributes getDataAttributes();

    @NonNull
    public native String getLayerName();
}
