package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceProcessorNode$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SurfaceProcessorNode$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((SurfaceProcessorNode) obj).lambda$release$2();
                break;
            case 1:
                ((SurfaceRequest) obj).willNotProvideSurface();
                break;
            case 2:
                ((DefaultSurfaceProcessor) obj).lambda$release$5();
                break;
            case 3:
                DefaultSurfaceProcessor.lambda$snapshot$7((CallbackToFutureAdapter.Completer) obj);
                break;
            default:
                ((SurfaceOutput) obj).close();
                break;
        }
    }
}
