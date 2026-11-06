package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CameraFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Provider {
        @NonNull
        CameraFactory newInstance(@NonNull Context context, @NonNull CameraThreadConfig cameraThreadConfig, @Nullable CameraSelector cameraSelector, long j) throws InitializationException;
    }

    @NonNull
    Set<String> getAvailableCameraIds();

    @NonNull
    CameraInternal getCamera(@NonNull String str) throws CameraUnavailableException;

    @NonNull
    CameraCoordinator getCameraCoordinator();

    @Nullable
    Object getCameraManager();
}
