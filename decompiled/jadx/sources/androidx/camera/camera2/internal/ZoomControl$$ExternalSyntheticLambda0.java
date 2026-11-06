package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ZoomControl$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ZoomControl f$0;
    public final /* synthetic */ ZoomState f$1;

    public /* synthetic */ ZoomControl$$ExternalSyntheticLambda0(ZoomControl zoomControl, ZoomState zoomState, int i) {
        this.$r8$classId = i;
        this.f$0 = zoomControl;
        this.f$1 = zoomState;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$setZoomRatio$1;
        Object lambda$setLinearZoom$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$setZoomRatio$1 = this.f$0.lambda$setZoomRatio$1(this.f$1, completer);
                return lambda$setZoomRatio$1;
            default:
                lambda$setLinearZoom$3 = this.f$0.lambda$setLinearZoom$3(this.f$1, completer);
                return lambda$setLinearZoom$3;
        }
    }
}
