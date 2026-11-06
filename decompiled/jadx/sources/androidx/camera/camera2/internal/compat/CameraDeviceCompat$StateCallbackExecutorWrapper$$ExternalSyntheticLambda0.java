package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f$0;
    public final /* synthetic */ CameraDevice f$1;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda0(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.$r8$classId = i;
        this.f$0 = stateCallbackExecutorWrapper;
        this.f$1 = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onClosed$3(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onDisconnected$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onOpened$0(this.f$1);
                break;
        }
    }
}
