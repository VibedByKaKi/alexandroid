package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeferrableSurface f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda3(DeferrableSurface deferrableSurface, int i) {
        this.$r8$classId = i;
        this.f$0 = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        DeferrableSurface deferrableSurface = this.f$0;
        switch (i) {
            case 0:
                deferrableSurface.close();
                break;
            default:
                deferrableSurface.decrementUseCount();
                break;
        }
    }
}
