package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CapturePipeline$TorchTask$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Camera2CapturePipeline$TorchTask$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        Boolean lambda$preCapture$4;
        Boolean lambda$preCapture$1;
        Void lambda$invokePreCapture$0;
        Boolean lambda$preCapture$0;
        Boolean lambda$preCapture$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$preCapture$4 = Camera2CapturePipeline.TorchTask.lambda$preCapture$4((TotalCaptureResult) obj);
                return lambda$preCapture$4;
            case 1:
                lambda$preCapture$1 = Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
                return lambda$preCapture$1;
            case 2:
                lambda$invokePreCapture$0 = Camera2CapturePipeline.CameraCapturePipelineImpl.lambda$invokePreCapture$0((TotalCaptureResult) obj);
                return lambda$invokePreCapture$0;
            case 3:
                lambda$preCapture$0 = Camera2CapturePipeline.Pipeline.AnonymousClass1.lambda$preCapture$0((List) obj);
                return lambda$preCapture$0;
            default:
                lambda$preCapture$11 = Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$11((TotalCaptureResult) obj);
                return lambda$preCapture$11;
        }
    }
}
