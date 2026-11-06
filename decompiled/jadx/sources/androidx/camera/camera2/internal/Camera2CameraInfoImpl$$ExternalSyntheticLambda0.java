package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraInfoImpl$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver, ForceCloseCaptureSession.OnConfigured, CameraCharacteristicsProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Camera2CameraInfoImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$preCapture$0;
        Object lambda$invokePostCapture$1;
        Object lambda$new$0;
        Object lambda$preCapture$5;
        Object lambda$preCapture$1;
        Object lambda$preCapture$02;
        Object lambda$updateSessionConfigAsync$7;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 1:
                lambda$preCapture$0 = ((Camera2CapturePipeline.AePreCaptureTask) obj).lambda$preCapture$0(completer);
                return lambda$preCapture$0;
            case 2:
                lambda$invokePostCapture$1 = ((Camera2CapturePipeline.CameraCapturePipelineImpl) obj).lambda$invokePostCapture$1(completer);
                return lambda$invokePostCapture$1;
            case 3:
                lambda$new$0 = ((Camera2CapturePipeline.ResultListener) obj).lambda$new$0(completer);
                return lambda$new$0;
            case 4:
                lambda$preCapture$5 = ((Camera2CapturePipeline.ScreenFlashTask) obj).lambda$preCapture$5(completer);
                return lambda$preCapture$5;
            case 5:
                lambda$preCapture$1 = Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$1((AtomicReference) obj, completer);
                return lambda$preCapture$1;
            case 6:
                lambda$preCapture$02 = ((Camera2CapturePipeline.TorchTask) obj).lambda$preCapture$0(completer);
                return lambda$preCapture$02;
            default:
                lambda$updateSessionConfigAsync$7 = ((Camera2CameraControlImpl) obj).lambda$updateSessionConfigAsync$7(completer);
                return lambda$updateSessionConfigAsync$7;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get(CameraCharacteristics.Key key) {
        return ((CameraCharacteristicsCompat) this.f$0).get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
    public void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        ((SynchronizedCaptureSessionImpl) this.f$0).lambda$onConfigured$1(synchronizedCaptureSession);
    }
}
