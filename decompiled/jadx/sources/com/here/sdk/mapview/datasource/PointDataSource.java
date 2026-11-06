package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PointDataSource extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface PointDataProcessor {
        boolean process(@NonNull PointDataAccessor pointDataAccessor);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PointDataProcessorImpl extends NativeBase implements PointDataProcessor {
        public PointDataProcessorImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PointDataSource.PointDataProcessorImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    PointDataProcessorImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.PointDataSource.PointDataProcessor
        public native boolean process(@NonNull PointDataAccessor pointDataAccessor);
    }

    public PointDataSource(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PointDataSource.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PointDataSource.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void add(@NonNull PointData pointData);

    public native void add(@NonNull List<PointData> list);

    public native void destroy();

    public native void forEach(@NonNull PointDataProcessor pointDataProcessor);

    public native void removeAll();

    public native void removeIf(@NonNull PointDataProcessor pointDataProcessor);
}
