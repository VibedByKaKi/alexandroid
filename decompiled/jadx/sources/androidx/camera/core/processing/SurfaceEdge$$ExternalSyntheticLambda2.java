package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceEdge.SettableSurface f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda2(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.$r8$classId = i;
        this.f$0 = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceEdge.SettableSurface settableSurface = this.f$0;
        switch (i) {
            case 0:
                settableSurface.close();
                break;
            case 1:
                settableSurface.decrementUseCount();
                break;
            default:
                settableSurface.lambda$close$1();
                break;
        }
    }
}
