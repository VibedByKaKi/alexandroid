package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.animation.AnimationListener;
import com.here.sdk.core.GeoBox;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.GeoOrientation;
import com.here.sdk.core.GeoOrientationUpdate;
import com.here.sdk.core.Point2D;
import com.here.sdk.core.Rectangle2D;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapCamera extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface DryCameraUpdateCallback {
        void onDryApplyUpdateResult(@Nullable State state);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DryCameraUpdateCallbackImpl extends NativeBase implements DryCameraUpdateCallback {
        public DryCameraUpdateCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCamera.DryCameraUpdateCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    DryCameraUpdateCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapCamera.DryCameraUpdateCallback
        public native void onDryApplyUpdateResult(@Nullable State state);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State {
        public double distanceToTargetInMeters;

        @NonNull
        public GeoOrientation orientationAtTarget;

        @NonNull
        public GeoCoordinates targetCoordinates;
        public double zoomLevel;

        public State(@NonNull GeoCoordinates geoCoordinates, @NonNull GeoOrientation geoOrientation, double d, double d2) {
            this.targetCoordinates = geoCoordinates;
            this.orientationAtTarget = geoOrientation;
            this.distanceToTargetInMeters = d;
            this.zoomLevel = d2;
        }
    }

    public MapCamera(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCamera.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapCamera.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void addListener(@NonNull MapCameraListener mapCameraListener);

    public native void applyUpdate(@NonNull MapCameraUpdate mapCameraUpdate);

    public native void cancelAnimation(@NonNull MapCameraAnimation mapCameraAnimation);

    public native void cancelAnimations();

    public native void dryApplyUpdate(@NonNull MapCameraUpdate mapCameraUpdate, @NonNull DryCameraUpdateCallback dryCameraUpdateCallback);

    @Nullable
    public native GeoBox getBoundingBox();

    @NonNull
    public native MapCameraLimits getLimits();

    @NonNull
    public native Point2D getPrincipalPoint();

    @NonNull
    public native State getState();

    public native void lookAt(@NonNull GeoBox geoBox, @NonNull GeoOrientationUpdate geoOrientationUpdate);

    public native void lookAt(@NonNull GeoBox geoBox, @NonNull GeoOrientationUpdate geoOrientationUpdate, @NonNull Rectangle2D rectangle2D);

    public native void lookAt(@NonNull GeoCoordinates geoCoordinates);

    public native void lookAt(@NonNull GeoCoordinates geoCoordinates, @NonNull GeoOrientationUpdate geoOrientationUpdate, @NonNull MapMeasure mapMeasure);

    public native void lookAt(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMeasure mapMeasure);

    public native void orbitBy(@NonNull GeoOrientationUpdate geoOrientationUpdate, @NonNull Point2D point2D);

    public native void removeListener(@NonNull MapCameraListener mapCameraListener);

    public native void removeListeners();

    public native void setDistanceToTarget(double d);

    public native void setOrientationAtTarget(@NonNull GeoOrientationUpdate geoOrientationUpdate);

    public native void setPrincipalPoint(@NonNull Point2D point2D);

    public native void startAnimation(@NonNull MapCameraAnimation mapCameraAnimation);

    public native void startAnimation(@NonNull MapCameraAnimation mapCameraAnimation, @NonNull AnimationListener animationListener);

    public native void zoomBy(double d, @NonNull Point2D point2D);

    public native void zoomTo(double d);
}
