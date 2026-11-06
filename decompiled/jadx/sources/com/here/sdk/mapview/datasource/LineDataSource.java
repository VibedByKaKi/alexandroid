package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LineDataSource extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface LineDataProcessor {
        boolean process(@NonNull LineDataAccessor lineDataAccessor);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LineDataProcessorImpl extends NativeBase implements LineDataProcessor {
        public LineDataProcessorImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.LineDataSource.LineDataProcessorImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    LineDataProcessorImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.LineDataSource.LineDataProcessor
        public native boolean process(@NonNull LineDataAccessor lineDataAccessor);
    }

    public LineDataSource(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.LineDataSource.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LineDataSource.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void add(@NonNull LineData lineData);

    public native void add(@NonNull List<LineData> list);

    public native void destroy();

    public native void forEach(@NonNull LineDataProcessor lineDataProcessor);

    public native void removeAll();

    public native void removeIf(@NonNull LineDataProcessor lineDataProcessor);
}
