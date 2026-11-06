package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PolygonDataSource extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface PolygonDataProcessor {
        boolean process(@NonNull PolygonDataAccessor polygonDataAccessor);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PolygonDataProcessorImpl extends NativeBase implements PolygonDataProcessor {
        public PolygonDataProcessorImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PolygonDataSource.PolygonDataProcessorImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    PolygonDataProcessorImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.PolygonDataSource.PolygonDataProcessor
        public native boolean process(@NonNull PolygonDataAccessor polygonDataAccessor);
    }

    public PolygonDataSource(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PolygonDataSource.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PolygonDataSource.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void add(@NonNull PolygonData polygonData);

    public native void add(@NonNull List<PolygonData> list);

    public native void destroy();

    public native void forEach(@NonNull PolygonDataProcessor polygonDataProcessor);

    public native void removeAll();

    public native void removeIf(@NonNull PolygonDataProcessor polygonDataProcessor);
}
