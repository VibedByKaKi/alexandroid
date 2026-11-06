package androidx.camera.core.processing;

import androidx.camera.core.ImageProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class InternalImageProcessor$$ExternalSyntheticLambda1 implements SurfaceRequest.TransformationInfoListener, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ InternalImageProcessor$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$safeProcess$1;
        lambda$safeProcess$1 = ((InternalImageProcessor) this.f$0).lambda$safeProcess$1((ImageProcessor.Request) this.f$1, completer);
        return lambda$safeProcess$1;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((DefaultSurfaceProcessor) this.f$0).lambda$onInputSurface$0((SurfaceRequest) this.f$1, transformationInfo);
    }
}
