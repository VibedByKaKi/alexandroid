package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class CameraCaptureResults {
    private CameraCaptureResults() {
    }

    @Nullable
    public static CameraCaptureResult retrieveCameraCaptureResult(@NonNull ImageInfo imageInfo) {
        if (imageInfo instanceof CameraCaptureResultImageInfo) {
            return ((CameraCaptureResultImageInfo) imageInfo).getCameraCaptureResult();
        }
        return null;
    }
}
