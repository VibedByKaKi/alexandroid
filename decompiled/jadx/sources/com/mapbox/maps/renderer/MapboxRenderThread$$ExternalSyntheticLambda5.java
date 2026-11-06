package com.mapbox.maps.renderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxRenderThread f$0;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda5(MapboxRenderThread mapboxRenderThread, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxRenderThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MapboxRenderThread mapboxRenderThread = this.f$0;
        switch (i) {
            case 0:
                MapboxRenderThread.destroy$lambda$37$lambda$36$lambda$35(mapboxRenderThread);
                break;
            case 1:
                MapboxRenderThread.onSurfaceDestroyed$lambda$17$lambda$16$lambda$15(mapboxRenderThread);
                break;
            case 2:
                MapboxRenderThread.onMapSet$lambda$32(mapboxRenderThread);
                break;
            default:
                MapboxRenderThread.scheduleThreadServiceTypeReset$lambda$31(mapboxRenderThread);
                break;
        }
    }
}
