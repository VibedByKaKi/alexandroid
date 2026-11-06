package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraImpl f$0;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda2(Camera2CameraImpl camera2CameraImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2CameraImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Camera2CameraImpl camera2CameraImpl = this.f$0;
        switch (i) {
            case 0:
                camera2CameraImpl.openInternal();
                break;
            case 1:
                camera2CameraImpl.lambda$configAndCloseIfNeeded$0();
                break;
            default:
                camera2CameraImpl.closeInternal();
                break;
        }
    }
}
