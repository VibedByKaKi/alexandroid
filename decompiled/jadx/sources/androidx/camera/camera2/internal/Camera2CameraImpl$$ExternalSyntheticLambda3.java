package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda3 implements CallbackToFutureAdapter.Resolver, MeteringRepeatingSession.SurfaceResetCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraImpl f$0;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda3(Camera2CameraImpl camera2CameraImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2CameraImpl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$openCameraConfigAndClose$1;
        Object lambda$release$5;
        Object lambda$getOrCreateUserReleaseFuture$6;
        Object lambda$isMeteringRepeatingAttached$14;
        int i = this.$r8$classId;
        Camera2CameraImpl camera2CameraImpl = this.f$0;
        switch (i) {
            case 0:
                lambda$openCameraConfigAndClose$1 = camera2CameraImpl.lambda$openCameraConfigAndClose$1(completer);
                return lambda$openCameraConfigAndClose$1;
            case 1:
                lambda$release$5 = camera2CameraImpl.lambda$release$5(completer);
                return lambda$release$5;
            case 2:
            default:
                lambda$isMeteringRepeatingAttached$14 = camera2CameraImpl.lambda$isMeteringRepeatingAttached$14(completer);
                return lambda$isMeteringRepeatingAttached$14;
            case 3:
                lambda$getOrCreateUserReleaseFuture$6 = camera2CameraImpl.lambda$getOrCreateUserReleaseFuture$6(completer);
                return lambda$getOrCreateUserReleaseFuture$6;
        }
    }

    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
    public void onSurfaceReset() {
        this.f$0.lambda$addOrRemoveMeteringRepeatingUseCase$17();
    }
}
