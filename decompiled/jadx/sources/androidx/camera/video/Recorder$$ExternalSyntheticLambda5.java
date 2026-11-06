package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda5 implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$configure$0;
        Object lambda$configure$1;
        int i = this.$r8$classId;
        VideoEncoderSession videoEncoderSession = (VideoEncoderSession) this.f$0;
        switch (i) {
            case 1:
                lambda$configure$0 = videoEncoderSession.lambda$configure$0(completer);
                return lambda$configure$0;
            default:
                lambda$configure$1 = videoEncoderSession.lambda$configure$1(completer);
                return lambda$configure$1;
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((Recorder) this.f$0).lambda$configureInternal$7(transformationInfo);
    }
}
