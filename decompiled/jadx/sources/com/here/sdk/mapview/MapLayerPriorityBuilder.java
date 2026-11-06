package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapLayerPriorityBuilder extends NativeBase {
    public MapLayerPriorityBuilder() {
        this(create(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native MapLayerPriority build();

    @NonNull
    public native MapLayerPriorityBuilder renderedAfterLayer(@NonNull String str);

    @NonNull
    public native MapLayerPriorityBuilder renderedAfterLayer(@NonNull String str, @NonNull String str2);

    @NonNull
    public native MapLayerPriorityBuilder renderedBeforeLayer(@NonNull String str);

    @NonNull
    public native MapLayerPriorityBuilder renderedBeforeLayer(@NonNull String str, @NonNull String str2);

    @NonNull
    public native MapLayerPriorityBuilder renderedFirst();

    @NonNull
    public native MapLayerPriorityBuilder renderedLast();

    @NonNull
    public native MapLayerPriorityBuilder withCategory(@NonNull String str);

    public MapLayerPriorityBuilder(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapLayerPriorityBuilder.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapLayerPriorityBuilder.disposeNativeHandle(j2);
            }
        });
    }
}
