package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class SurfaceOutputImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SurfaceOutputImpl$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SurfaceOutputImpl) this.f$0).lambda$requestClose$1((AtomicReference) this.f$1);
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f$0).lambda$snapshot$6((DefaultSurfaceProcessor.PendingSnapshot) this.f$1);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f$0).lambda$onInputSurface$2((SurfaceRequest) this.f$1);
                break;
            case 3:
                ((DefaultSurfaceProcessor) this.f$0).lambda$onOutputSurface$4((SurfaceOutput) this.f$1);
                break;
            case 4:
                ((SurfaceProcessorWithExecutor) this.f$0).lambda$onInputSurface$0((SurfaceRequest) this.f$1);
                break;
            default:
                ((SurfaceProcessorWithExecutor) this.f$0).lambda$onOutputSurface$1((SurfaceOutput) this.f$1);
                break;
        }
    }
}
