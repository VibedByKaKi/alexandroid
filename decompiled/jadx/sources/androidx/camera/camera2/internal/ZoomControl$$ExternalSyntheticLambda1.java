package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ZoomControl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ZoomControl f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;
    public final /* synthetic */ ZoomState f$2;

    public /* synthetic */ ZoomControl$$ExternalSyntheticLambda1(ZoomControl zoomControl, CallbackToFutureAdapter.Completer completer, ZoomState zoomState, int i) {
        this.$r8$classId = i;
        this.f$0 = zoomControl;
        this.f$1 = completer;
        this.f$2 = zoomState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setZoomRatio$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$setLinearZoom$2(this.f$1, this.f$2);
                break;
        }
    }
}
