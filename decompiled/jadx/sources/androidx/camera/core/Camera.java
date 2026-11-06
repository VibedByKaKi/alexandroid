package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface Camera {
    @NonNull
    CameraControl getCameraControl();

    @NonNull
    CameraInfo getCameraInfo();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    CameraConfig getExtendedConfig();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(@NonNull UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupportedByFramework(@NonNull UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default boolean isUseCasesCombinationSupported(boolean z, @NonNull UseCase... useCaseArr) {
        return true;
    }
}
