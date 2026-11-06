package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CaptureSession$$ExternalSyntheticLambda0 implements CameraBurstCaptureCallback.CaptureSequenceCallback, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ CaptureSession f$0;

    public /* synthetic */ CaptureSession$$ExternalSyntheticLambda0(CaptureSession captureSession) {
        this.f$0 = captureSession;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$release$1;
        lambda$release$1 = this.f$0.lambda$release$1(completer);
        return lambda$release$1;
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
    public void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        this.f$0.lambda$issueBurstCaptureRequest$3(cameraCaptureSession, i, z);
    }
}
