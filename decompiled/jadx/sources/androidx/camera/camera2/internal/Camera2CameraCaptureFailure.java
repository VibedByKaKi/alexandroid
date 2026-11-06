package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureFailure;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraCaptureFailure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class Camera2CameraCaptureFailure extends CameraCaptureFailure {
    private final CaptureFailure mCaptureFailure;

    public Camera2CameraCaptureFailure(@NonNull CameraCaptureFailure.Reason reason, @NonNull CaptureFailure captureFailure) {
        super(reason);
        this.mCaptureFailure = captureFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    @NonNull
    public Object getCaptureFailure() {
        return this.mCaptureFailure;
    }
}
