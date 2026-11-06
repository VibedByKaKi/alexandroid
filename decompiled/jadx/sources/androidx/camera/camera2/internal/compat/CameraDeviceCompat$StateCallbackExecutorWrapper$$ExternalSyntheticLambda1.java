package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ AutoCloseable f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$ExternalSyntheticLambda1(Object obj, AutoCloseable autoCloseable, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = autoCloseable;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CameraDeviceCompat.StateCallbackExecutorWrapper) this.f$0).lambda$onError$2((CameraDevice) this.f$1, this.f$2);
                break;
            default:
                ((CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper) this.f$0).lambda$onCaptureSequenceAborted$5((CameraCaptureSession) this.f$1, this.f$2);
                break;
        }
    }
}
