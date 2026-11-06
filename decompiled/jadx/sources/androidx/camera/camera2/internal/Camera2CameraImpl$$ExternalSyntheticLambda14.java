package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraImpl$$ExternalSyntheticLambda14 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Camera2CameraImpl$$ExternalSyntheticLambda14(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$isUseCaseAttached$12;
        Object lambda$submitConfigsInternal$4;
        Object lambda$preCapture$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$isUseCaseAttached$12 = ((Camera2CameraImpl) this.f$0).lambda$isUseCaseAttached$12((String) this.f$1, completer);
                return lambda$isUseCaseAttached$12;
            case 1:
                lambda$submitConfigsInternal$4 = ((Camera2CapturePipeline.Pipeline) this.f$0).lambda$submitConfigsInternal$4((CaptureConfig.Builder) this.f$1, completer);
                return lambda$submitConfigsInternal$4;
            default:
                lambda$preCapture$3 = ((Camera2CapturePipeline.ScreenFlashTask) this.f$0).lambda$preCapture$3((AtomicReference) this.f$1, completer);
                return lambda$preCapture$3;
        }
    }
}
