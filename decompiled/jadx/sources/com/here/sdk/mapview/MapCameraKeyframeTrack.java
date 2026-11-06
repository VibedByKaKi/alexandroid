package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.animation.Anchor2DKeyframe;
import com.here.sdk.animation.Easing;
import com.here.sdk.animation.GeoCoordinatesKeyframe;
import com.here.sdk.animation.GeoOrientationKeyframe;
import com.here.sdk.animation.KeyframeInterpolationMode;
import com.here.sdk.animation.Point2DKeyframe;
import com.here.sdk.animation.ScalarKeyframe;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapCameraKeyframeTrack extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InstantiationErrorCode {
        EMPTY_KEYFRAME_LIST(1),
        INVALID_KEYFRAME_DURATION(2);

        public final int value;

        InstantiationErrorCode(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstantiationException extends Exception {
        public final InstantiationErrorCode error;

        public InstantiationException(InstantiationErrorCode instantiationErrorCode) {
            super(instantiationErrorCode.toString());
            this.error = instantiationErrorCode;
        }
    }

    public MapCameraKeyframeTrack(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCameraKeyframeTrack.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapCameraKeyframeTrack.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native MapCameraKeyframeTrack fieldOfView(@NonNull List<ScalarKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapCameraKeyframeTrack lookAtDistance(@NonNull List<ScalarKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapCameraKeyframeTrack lookAtOrientation(@NonNull List<GeoOrientationKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapCameraKeyframeTrack lookAtTarget(@NonNull List<GeoCoordinatesKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapCameraKeyframeTrack normalizedPrincipalPoint(@NonNull List<Anchor2DKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @NonNull
    public static native MapCameraKeyframeTrack principalPoint(@NonNull List<Point2DKeyframe> list, @NonNull Easing easing, @NonNull KeyframeInterpolationMode keyframeInterpolationMode) throws InstantiationException;

    @Nullable
    public native List<Anchor2DKeyframe> getAnchor2DKeyframes();

    @Nullable
    public native List<GeoCoordinatesKeyframe> getGeoCoordinatesKeyframes();

    @Nullable
    public native List<GeoOrientationKeyframe> getGeoOrientationKeyframes();

    @NonNull
    public native KeyframeInterpolationMode getInterpolationMode();

    @Nullable
    public native List<Point2DKeyframe> getPoint2DKeyframes();

    @Nullable
    public native List<ScalarKeyframe> getScalarKeyframes();
}
