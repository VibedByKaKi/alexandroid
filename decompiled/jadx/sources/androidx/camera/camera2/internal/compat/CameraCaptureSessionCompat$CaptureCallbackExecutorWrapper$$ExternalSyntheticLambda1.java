package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f$0;
    public final /* synthetic */ CameraCaptureSession f$1;
    public final /* synthetic */ CaptureRequest f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$ExternalSyntheticLambda1(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = captureCallbackExecutorWrapper;
        this.f$1 = cameraCaptureSession;
        this.f$2 = captureRequest;
        this.f$3 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCaptureCompleted$2(this.f$1, this.f$2, (TotalCaptureResult) this.f$3);
                break;
            case 1:
                this.f$0.lambda$onCaptureProgressed$1(this.f$1, this.f$2, (CaptureResult) this.f$3);
                break;
            default:
                this.f$0.lambda$onCaptureFailed$3(this.f$1, this.f$2, (CaptureFailure) this.f$3);
                break;
        }
    }
}
