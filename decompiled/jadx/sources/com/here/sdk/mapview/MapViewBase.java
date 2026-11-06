package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.Anchor2D;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.Point2D;
import com.here.sdk.core.Rectangle2D;
import com.here.sdk.core.Size2D;
import com.here.sdk.gestures.Gestures;
import com.here.sdk.mapview.MapScene;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface MapViewBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface MapPickCallback {
        void onPickMap(@Nullable MapPickResult mapPickResult);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MapPickCallbackImpl extends NativeBase implements MapPickCallback {
        public MapPickCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewBase.MapPickCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    MapPickCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewBase.MapPickCallback
        public native void onPickMap(@Nullable MapPickResult mapPickResult);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    @Deprecated
    public interface PickMapContentCallback {
        @Deprecated
        void onPickMapContent(@Nullable PickMapContentResult pickMapContentResult);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PickMapContentCallbackImpl extends NativeBase implements PickMapContentCallback {
        public PickMapContentCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewBase.PickMapContentCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    PickMapContentCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewBase.PickMapContentCallback
        @Deprecated
        public native void onPickMapContent(@Nullable PickMapContentResult pickMapContentResult);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    @Deprecated
    public interface PickMapItemsCallback {
        @Deprecated
        void onPickMapItems(@Nullable PickMapItemsResult pickMapItemsResult);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PickMapItemsCallbackImpl extends NativeBase implements PickMapItemsCallback {
        public PickMapItemsCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewBase.PickMapItemsCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    PickMapItemsCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewBase.PickMapItemsCallback
        @Deprecated
        public native void onPickMapItems(@Nullable PickMapItemsResult pickMapItemsResult);
    }

    void addLifecycleListener(@NonNull MapViewLifecycleListener mapViewLifecycleListener);

    @Nullable
    Point2D geoToViewCoordinates(@NonNull GeoCoordinates geoCoordinates);

    @NonNull
    MapCamera getCamera();

    int getFrameRate();

    @NonNull
    Gestures getGestures();

    @NonNull
    HereMap getHereMap();

    @NonNull
    MapContext getMapContext();

    @NonNull
    MapScene getMapScene();

    double getPixelScale();

    @NonNull
    Size2D getViewportSize();

    @NonNull
    Size2D getWatermarkSize();

    boolean isValid();

    void pick(@Nullable MapScene.MapPickFilter mapPickFilter, @NonNull Rectangle2D rectangle2D, @NonNull MapPickCallback mapPickCallback);

    @Deprecated
    void pickMapContent(@NonNull Rectangle2D rectangle2D, @NonNull PickMapContentCallback pickMapContentCallback);

    @Deprecated
    void pickMapItems(@NonNull Point2D point2D, double d, @NonNull PickMapItemsCallback pickMapItemsCallback);

    void removeLifecycleListener(@NonNull MapViewLifecycleListener mapViewLifecycleListener);

    void setFrameRate(int i);

    void setWatermarkLocation(@NonNull Anchor2D anchor2D, @NonNull Point2D point2D);

    @Nullable
    GeoCoordinates viewToGeoCoordinates(@NonNull Point2D point2D);
}
