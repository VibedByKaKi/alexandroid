package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda1(Camera2CapturePipeline.ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        this.$r8$classId = 1;
        this.f$0 = screenFlashTask;
        this.f$2 = atomicReference;
        this.f$1 = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Camera2CameraImpl) this.f$0).lambda$isUseCaseAttached$11((CallbackToFutureAdapter.Completer) this.f$1, (String) this.f$2);
                break;
            case 1:
                ((Camera2CapturePipeline.ScreenFlashTask) this.f$0).lambda$preCapture$2((AtomicReference) this.f$2, (CallbackToFutureAdapter.Completer) this.f$1);
                break;
            default:
                ((Camera2CameraControlImpl) this.f$0).lambda$addSessionCameraCaptureCallback$8((Executor) this.f$1, (CameraCaptureCallback) this.f$2);
                break;
        }
    }

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
