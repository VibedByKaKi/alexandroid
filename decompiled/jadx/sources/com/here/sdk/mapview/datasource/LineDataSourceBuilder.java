package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.mapview.MapContext;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LineDataSourceBuilder extends NativeBase {
    public LineDataSourceBuilder(@NonNull MapContext mapContext) {
        this(create(mapContext), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create(@NonNull MapContext mapContext);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native LineDataSource build();

    @NonNull
    public native LineDataSourceBuilder withName(@NonNull String str);

    @NonNull
    public native LineDataSourceBuilder withPolyline(@NonNull LineData lineData);

    @NonNull
    public native LineDataSourceBuilder withPolylines(@NonNull List<LineData> list);

    public LineDataSourceBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.LineDataSourceBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LineDataSourceBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
