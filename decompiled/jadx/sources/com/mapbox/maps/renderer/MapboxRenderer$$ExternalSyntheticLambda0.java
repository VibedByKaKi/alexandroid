package com.mapbox.maps.renderer;

import com.mapbox.maps.RenderCallback;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapboxRenderer$$ExternalSyntheticLambda0 implements RenderFrameFinishedCallback, RenderCallback {
    public final /* synthetic */ MapboxRenderer f$0;

    public /* synthetic */ MapboxRenderer$$ExternalSyntheticLambda0(MapboxRenderer mapboxRenderer) {
        this.f$0 = mapboxRenderer;
    }

    @Override // com.mapbox.maps.RenderCallback
    public void run() {
        this.f$0.render();
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        MapboxRenderer.renderFrameFinishedCallback$lambda$0(this.f$0, renderFrameFinished);
    }
}
