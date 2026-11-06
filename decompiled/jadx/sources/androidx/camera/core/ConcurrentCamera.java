package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ConcurrentCamera {

    @NonNull
    private List<Camera> mCameras;

    public ConcurrentCamera(@NonNull List<Camera> list) {
        this.mCameras = list;
    }

    @NonNull
    public List<Camera> getCameras() {
        return this.mCameras;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SingleCameraConfig {

        @NonNull
        private CameraSelector mCameraSelector;

        @NonNull
        private CompositionSettings mCompositionSettings;

        @NonNull
        private LifecycleOwner mLifecycleOwner;

        @NonNull
        private UseCaseGroup mUseCaseGroup;

        public SingleCameraConfig(@NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup, @NonNull CompositionSettings compositionSettings, @NonNull LifecycleOwner lifecycleOwner) {
            this.mCameraSelector = cameraSelector;
            this.mUseCaseGroup = useCaseGroup;
            this.mCompositionSettings = compositionSettings;
            this.mLifecycleOwner = lifecycleOwner;
        }

        @NonNull
        public CameraSelector getCameraSelector() {
            return this.mCameraSelector;
        }

        @NonNull
        public CompositionSettings getCompositionSettings() {
            return this.mCompositionSettings;
        }

        @NonNull
        public LifecycleOwner getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @NonNull
        public UseCaseGroup getUseCaseGroup() {
            return this.mUseCaseGroup;
        }

        public SingleCameraConfig(@NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup, @NonNull LifecycleOwner lifecycleOwner) {
            this(cameraSelector, useCaseGroup, CompositionSettings.DEFAULT, lifecycleOwner);
        }
    }
}
