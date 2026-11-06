package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ZslControlImpl$$ExternalSyntheticLambda1 implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ZslControlImpl$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        boolean lambda$executePreCapture$2;
        boolean lambda$preCapture$9;
        boolean lambda$preCapture$2;
        switch (this.$r8$classId) {
            case 1:
                lambda$executePreCapture$2 = Camera2CapturePipeline.Pipeline.lambda$executePreCapture$2(totalCaptureResult);
                return lambda$executePreCapture$2;
            case 2:
                lambda$preCapture$9 = Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$9(totalCaptureResult);
                return lambda$preCapture$9;
            default:
                lambda$preCapture$2 = Camera2CapturePipeline.TorchTask.lambda$preCapture$2(totalCaptureResult);
                return lambda$preCapture$2;
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
