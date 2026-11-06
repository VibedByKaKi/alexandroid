package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class CameraCaptureCallback {
    public void onCaptureCancelled(int i) {
    }

    public void onCaptureStarted(int i) {
    }

    public void onCaptureCompleted(int i, @NonNull CameraCaptureResult cameraCaptureResult) {
    }

    public void onCaptureFailed(int i, @NonNull CameraCaptureFailure cameraCaptureFailure) {
    }

    public void onCaptureProcessProgressed(int i, int i2) {
    }
}
