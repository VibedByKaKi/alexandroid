package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
interface ZslControl {
    void addZslConfig(@NonNull SessionConfig.Builder builder);

    @Nullable
    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z);

    void setZslDisabledByUserCaseConfig(boolean z);
}
