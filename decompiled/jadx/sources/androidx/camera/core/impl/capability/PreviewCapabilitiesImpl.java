package androidx.camera.core.impl.capability;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.PreviewCapabilities;
import androidx.camera.core.impl.CameraInfoInternal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class PreviewCapabilitiesImpl implements PreviewCapabilities {
    private boolean mIsStabilizationSupported;

    public PreviewCapabilitiesImpl(@NonNull CameraInfoInternal cameraInfoInternal) {
        this.mIsStabilizationSupported = cameraInfoInternal.isPreviewStabilizationSupported();
    }

    @NonNull
    public static PreviewCapabilities from(@NonNull CameraInfo cameraInfo) {
        return new PreviewCapabilitiesImpl((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.core.PreviewCapabilities
    public boolean isStabilizationSupported() {
        return this.mIsStabilizationSupported;
    }
}
