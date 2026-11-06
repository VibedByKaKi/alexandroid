package com.mapbox.maps;

import com.mapbox.maps.renderer.RendererSetupErrorListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapController$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapController f$0;
    public final /* synthetic */ RendererSetupErrorListener f$1;

    public /* synthetic */ MapController$$ExternalSyntheticLambda3(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener, int i) {
        this.$r8$classId = i;
        this.f$0 = mapController;
        this.f$1 = rendererSetupErrorListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MapController.addRendererSetupErrorListener$lambda$12(this.f$0, this.f$1);
                break;
            default:
                MapController.removeRendererSetupErrorListener$lambda$13(this.f$0, this.f$1);
                break;
        }
    }
}
