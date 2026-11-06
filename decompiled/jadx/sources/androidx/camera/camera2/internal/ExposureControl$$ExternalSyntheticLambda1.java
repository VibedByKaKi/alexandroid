package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExposureControl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ExposureControl$$ExternalSyntheticLambda1(int i, ExposureControl exposureControl, CallbackToFutureAdapter.Completer completer) {
        this.$r8$classId = 0;
        this.f$0 = exposureControl;
        this.f$1 = completer;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ExposureControl) this.f$0).lambda$setExposureCompensationIndex$1((CallbackToFutureAdapter.Completer) this.f$1, this.f$2);
                break;
            case 1:
                ((CameraCaptureCallback) this.f$0).onCaptureFailed(this.f$2, (CameraCaptureFailure) this.f$1);
                break;
            default:
                ((CameraCaptureCallback) this.f$0).onCaptureCompleted(this.f$2, (CameraCaptureResult) this.f$1);
                break;
        }
    }

    public /* synthetic */ ExposureControl$$ExternalSyntheticLambda1(CameraCaptureCallback cameraCaptureCallback, int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = cameraCaptureCallback;
        this.f$2 = i;
        this.f$1 = obj;
    }
}
