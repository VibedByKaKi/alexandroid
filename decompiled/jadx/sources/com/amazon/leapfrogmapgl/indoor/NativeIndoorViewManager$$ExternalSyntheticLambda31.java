package com.amazon.leapfrogmapgl.indoor;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda31 implements CameraChangedCallback, MapIdleCallback {
    public final /* synthetic */ NativeIndoorViewManager f$0;
    public final /* synthetic */ IndoorMapViewHandle f$1;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda31(IndoorMapViewHandle indoorMapViewHandle, NativeIndoorViewManager nativeIndoorViewManager) {
        this.f$1 = indoorMapViewHandle;
        this.f$0 = nativeIndoorViewManager;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        NativeIndoorViewManager.createViewInstance$lambda$41(this.f$0, this.f$1, cameraChanged);
    }

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda31(NativeIndoorViewManager nativeIndoorViewManager, IndoorMapViewHandle indoorMapViewHandle) {
        this.f$0 = nativeIndoorViewManager;
        this.f$1 = indoorMapViewHandle;
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        NativeIndoorViewManager.createViewInstance$lambda$42(this.f$1, this.f$0, mapIdle);
    }
}
