package androidx.camera.camera2.internal;

import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraImpl f$0;
    public final /* synthetic */ ArrayList f$1;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda6(Camera2CameraImpl camera2CameraImpl, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2CameraImpl;
        this.f$1 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$attachUseCases$15(this.f$1);
                break;
            default:
                this.f$0.lambda$detachUseCases$16(this.f$1);
                break;
        }
    }
}
