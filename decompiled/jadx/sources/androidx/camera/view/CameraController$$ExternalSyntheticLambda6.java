package androidx.camera.view;

import androidx.camera.view.RotationProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraController$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CameraController$$ExternalSyntheticLambda6(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CameraController) this.f$0).lambda$setEnabledUseCases$2(this.f$1);
                break;
            default:
                ((RotationProvider.ListenerWrapper) this.f$0).lambda$onRotationChanged$0(this.f$1);
                break;
        }
    }
}
