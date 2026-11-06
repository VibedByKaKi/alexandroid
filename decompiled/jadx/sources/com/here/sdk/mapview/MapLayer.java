package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapLayer extends NativeBase {
    public MapLayer(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapLayer.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapLayer.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void destroy();

    public native void setEnabled(boolean z);

    public native void setPriority(@NonNull MapLayerPriority mapLayerPriority);

    public native void setStyle(@NonNull Style style);
}
