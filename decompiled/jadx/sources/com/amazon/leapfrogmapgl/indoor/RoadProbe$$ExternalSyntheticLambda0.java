package com.amazon.leapfrogmapgl.indoor;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class RoadProbe$$ExternalSyntheticLambda0 implements QuerySourceFeaturesCallback, SourceDataLoadedCallback, MapIdleCallback, CameraChangedCallback {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RoadProbe$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.mapbox.maps.QuerySourceFeaturesCallback
    public void run(Expected expected) {
        RoadProbe.attempt$lambda$3((RoadProbe) this.f$0, expected);
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        TreeOcclusionController.start$lambda$0((TreeOcclusionController) this.f$0, cameraChanged);
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        RoadProbe.start$lambda$1((RoadProbe) this.f$0, mapIdle);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        RoadProbe.start$lambda$0((RoadProbe) this.f$0, sourceDataLoaded);
    }
}
