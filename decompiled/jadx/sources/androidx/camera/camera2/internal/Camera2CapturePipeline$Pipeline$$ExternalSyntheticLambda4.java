package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda4 implements AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        ListenableFuture lambda$executePreCapture$3;
        ListenableFuture lambda$preCapture$1;
        ListenableFuture lambda$preCapture$3;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$executePreCapture$3 = ((Camera2CapturePipeline.Pipeline) obj2).lambda$executePreCapture$3((Boolean) obj);
                return lambda$executePreCapture$3;
            case 1:
                lambda$preCapture$1 = ((Camera2CapturePipeline.TorchTask) obj2).lambda$preCapture$1((Void) obj);
                return lambda$preCapture$1;
            default:
                lambda$preCapture$3 = ((Camera2CapturePipeline.TorchTask) obj2).lambda$preCapture$3((Void) obj);
                return lambda$preCapture$3;
        }
    }
}
