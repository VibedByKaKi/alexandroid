package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.mapview.MapContext;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PolygonDataSourceBuilder extends NativeBase {
    public PolygonDataSourceBuilder(@NonNull MapContext mapContext) {
        this(create(mapContext), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create(@NonNull MapContext mapContext);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native PolygonDataSource build();

    @NonNull
    public native PolygonDataSourceBuilder withName(@NonNull String str);

    @NonNull
    public native PolygonDataSourceBuilder withPolygon(@NonNull PolygonData polygonData);

    @NonNull
    public native PolygonDataSourceBuilder withPolygons(@NonNull List<PolygonData> list);

    public PolygonDataSourceBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PolygonDataSourceBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PolygonDataSourceBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
