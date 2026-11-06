package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.mapview.MapContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LineTileDataSource extends NativeBase {
    public LineTileDataSource(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.LineTileDataSource.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LineTileDataSource.disposeNativeHandle(j2);
            }
        });
    }

    @NonNull
    public static native LineTileDataSource create(@NonNull MapContext mapContext, @NonNull String str, @NonNull LineTileSource lineTileSource);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void destroy();
}
