package androidx.camera.core.concurrent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface CameraCoordinator {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CameraOperatingMode {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i, int i2);
    }

    void addListener(@NonNull ConcurrentCameraModeListener concurrentCameraModeListener);

    @NonNull
    List<CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    @NonNull
    List<List<CameraSelector>> getConcurrentCameraSelectors();

    @Nullable
    String getPairedConcurrentCameraId(@NonNull String str);

    void removeListener(@NonNull ConcurrentCameraModeListener concurrentCameraModeListener);

    void setActiveConcurrentCameraInfos(@NonNull List<CameraInfo> list);

    void setCameraOperatingMode(int i);

    void shutdown();
}
