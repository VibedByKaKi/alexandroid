package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Camera2CameraControl$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraControl f$0;

    public /* synthetic */ Camera2CameraControl$$ExternalSyntheticLambda1(Camera2CameraControl camera2CameraControl, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2CameraControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$addCaptureRequestOptions$3;
        Object lambda$setCaptureRequestOptions$1;
        Object lambda$clearCaptureRequestOptions$5;
        int i = this.$r8$classId;
        Camera2CameraControl camera2CameraControl = this.f$0;
        switch (i) {
            case 0:
                lambda$addCaptureRequestOptions$3 = camera2CameraControl.lambda$addCaptureRequestOptions$3(completer);
                return lambda$addCaptureRequestOptions$3;
            case 1:
                lambda$setCaptureRequestOptions$1 = camera2CameraControl.lambda$setCaptureRequestOptions$1(completer);
                return lambda$setCaptureRequestOptions$1;
            default:
                lambda$clearCaptureRequestOptions$5 = camera2CameraControl.lambda$clearCaptureRequestOptions$5(completer);
                return lambda$clearCaptureRequestOptions$5;
        }
    }
}
