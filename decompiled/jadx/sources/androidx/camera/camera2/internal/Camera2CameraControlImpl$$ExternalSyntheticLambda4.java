package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraControlImpl$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Camera2CameraControlImpl$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Camera2CameraControlImpl.lambda$addInteropConfig$0();
                break;
            case 1:
                Camera2CapturePipeline.ScreenFlashTask.lambda$postCapture$12();
                break;
            default:
                Camera2CameraControlImpl.lambda$clearInteropConfig$1();
                break;
        }
    }
}
