package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.mapview.MapMarkerCluster;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PickMapItemsResult extends NativeBase {
    public PickMapItemsResult(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.PickMapItemsResult.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PickMapItemsResult.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native List<MapMarkerCluster.Grouping> getClusteredMarkers();

    @NonNull
    public native List<MapMarker> getMarkers();

    @NonNull
    public native List<MapMarker3D> getMarkers3d();

    @NonNull
    public native List<MapPolygon> getPolygons();

    @NonNull
    public native List<MapPolyline> getPolylines();
}
