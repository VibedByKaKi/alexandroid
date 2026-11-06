package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface VideoOutput {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default VideoCapabilities getMediaCapabilities(@NonNull CameraInfo cameraInfo) {
        return VideoCapabilities.EMPTY;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<MediaSpec> getMediaSpec() {
        return ConstantObservable.withValue(null);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<StreamInfo> getStreamInfo() {
        return StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<Boolean> isSourceStreamRequired() {
        return ConstantObservable.withValue(Boolean.FALSE);
    }

    void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase) {
        onSurfaceRequested(surfaceRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default void onSourceStateChanged(@NonNull SourceState sourceState) {
    }
}
