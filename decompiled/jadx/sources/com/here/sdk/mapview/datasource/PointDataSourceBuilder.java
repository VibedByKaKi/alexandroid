package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.mapview.MapContext;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PointDataSourceBuilder extends NativeBase {
    public PointDataSourceBuilder(@NonNull MapContext mapContext) {
        this(create(mapContext), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create(@NonNull MapContext mapContext);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native PointDataSource build();

    @NonNull
    public native PointDataSourceBuilder withName(@NonNull String str);

    @NonNull
    public native PointDataSourceBuilder withPoint(@NonNull PointData pointData);

    @NonNull
    public native PointDataSourceBuilder withPoints(@NonNull List<PointData> list);

    public PointDataSourceBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PointDataSourceBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PointDataSourceBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
