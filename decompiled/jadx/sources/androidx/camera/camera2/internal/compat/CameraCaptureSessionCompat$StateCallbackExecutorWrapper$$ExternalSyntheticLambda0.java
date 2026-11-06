package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f$0;
    public final /* synthetic */ CameraCaptureSession f$1;

    public /* synthetic */ CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda0(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.$r8$classId = i;
        this.f$0 = stateCallbackExecutorWrapper;
        this.f$1 = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onActive$3(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onClosed$5(this.f$1);
                break;
            case 2:
                this.f$0.lambda$onCaptureQueueEmpty$4(this.f$1);
                break;
            case 3:
                this.f$0.lambda$onConfigured$0(this.f$1);
                break;
            case 4:
                this.f$0.lambda$onReady$2(this.f$1);
                break;
            default:
                this.f$0.lambda$onConfigureFailed$1(this.f$1);
                break;
        }
    }
}
