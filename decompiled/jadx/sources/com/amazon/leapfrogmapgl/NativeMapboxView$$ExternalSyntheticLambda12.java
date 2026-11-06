package com.amazon.leapfrogmapgl;

import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeMapboxView$$ExternalSyntheticLambda12 implements MapIdleCallback, StyleLoadedCallback {
    public final /* synthetic */ NativeMapboxView f$0;

    public /* synthetic */ NativeMapboxView$$ExternalSyntheticLambda12(NativeMapboxView nativeMapboxView) {
        this.f$0 = nativeMapboxView;
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        NativeMapboxView.ensureMapView$lambda$7(this.f$0, mapIdle);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        NativeMapboxView.ensureMapView$lambda$8(this.f$0, styleLoaded);
    }
}
