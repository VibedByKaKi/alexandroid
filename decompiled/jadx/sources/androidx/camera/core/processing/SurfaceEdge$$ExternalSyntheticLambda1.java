package androidx.camera.core.processing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceEdge f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda1(SurfaceEdge surfaceEdge, int i) {
        this.$r8$classId = i;
        this.f$0 = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SurfaceEdge surfaceEdge = this.f$0;
        switch (i) {
            case 0:
                surfaceEdge.lambda$createSurfaceRequest$1();
                break;
            default:
                surfaceEdge.lambda$createSurfaceRequest$0();
                break;
        }
    }
}
