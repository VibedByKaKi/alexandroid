package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceRequest$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f$0;
    public final /* synthetic */ SurfaceRequest.TransformationInfo f$1;

    public /* synthetic */ SurfaceRequest$$ExternalSyntheticLambda0(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = transformationInfoListener;
        this.f$1 = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onTransformationInfoUpdate(this.f$1);
                break;
            default:
                this.f$0.onTransformationInfoUpdate(this.f$1);
                break;
        }
    }
}
