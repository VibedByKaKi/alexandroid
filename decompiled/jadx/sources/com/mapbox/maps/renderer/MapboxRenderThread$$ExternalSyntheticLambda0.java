package com.mapbox.maps.renderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxRenderThread f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda0(MapboxRenderThread mapboxRenderThread, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mapboxRenderThread;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MapboxRenderThread.setUserRefreshRate$lambda$24(this.f$0, this.f$1);
                break;
            default:
                MapboxRenderThread.setScreenRefreshRate$lambda$20(this.f$0, this.f$1);
                break;
        }
    }
}
