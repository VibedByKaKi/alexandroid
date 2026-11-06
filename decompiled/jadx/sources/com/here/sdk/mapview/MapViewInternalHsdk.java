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
import com.here.sdk.gestures.InternalGestureDetector;
import com.here.sdk.mapview.MapScene;
import com.here.sdk.mapview.MapViewBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class MapViewInternalHsdk extends NativeBase implements MapViewBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface RedrawCallback {
        void onRedrawCompleted();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RedrawCallbackImpl extends NativeBase implements RedrawCallback {
        public RedrawCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewInternalHsdk.RedrawCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    RedrawCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewInternalHsdk.RedrawCallback
        public native void onRedrawCompleted();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface SetValidSceneConfigurationCallback {
        void onSceneConfigurationSet(boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SetValidSceneConfigurationCallbackImpl extends NativeBase implements SetValidSceneConfigurationCallback {
        public SetValidSceneConfigurationCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewInternalHsdk.SetValidSceneConfigurationCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    SetValidSceneConfigurationCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewInternalHsdk.SetValidSceneConfigurationCallback
        public native void onSceneConfigurationSet(boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface TakeScreenshotCallback {
        void onScreenshotTaken(@Nullable byte[] bArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TakeScreenshotCallbackImpl extends NativeBase implements TakeScreenshotCallback {
        public TakeScreenshotCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewInternalHsdk.TakeScreenshotCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    TakeScreenshotCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.MapViewInternalHsdk.TakeScreenshotCallback
        public native void onScreenshotTaken(@Nullable byte[] bArr);
    }

    public MapViewInternalHsdk(@Nullable MapViewOptions mapViewOptions, double d, double d2, @Nullable Double d3) {
        this(create(mapViewOptions, d, d2, d3), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create(@Nullable MapViewOptions mapViewOptions, double d, double d2, @Nullable Double d3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public static native long getLiveInstanceCount();

    public static native void invalidateViews();

    @Override // com.here.sdk.mapview.MapViewBase
    public native void addLifecycleListener(@NonNull MapViewLifecycleListener mapViewLifecycleListener);

    public native void attachHarpToWindowRenderTarget(long j);

    public native void destroy();

    public native void detachHarpFromRenderTarget();

    @Override // com.here.sdk.mapview.MapViewBase
    @Nullable
    public native Point2D geoToViewCoordinates(@NonNull GeoCoordinates geoCoordinates);

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native MapCamera getCamera();

    @Override // com.here.sdk.mapview.MapViewBase
    public native int getFrameRate();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native Gestures getGestures();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native HereMap getHereMap();

    @NonNull
    public native InternalGestureDetector getInternalGestureDetector();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native MapContext getMapContext();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native MapScene getMapScene();

    @Override // com.here.sdk.mapview.MapViewBase
    public native double getPixelScale();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native Size2D getViewportSize();

    @Override // com.here.sdk.mapview.MapViewBase
    @NonNull
    public native Size2D getWatermarkSize();

    public native boolean isContinuousRendering();

    public native boolean isDestroyed();

    @Override // com.here.sdk.mapview.MapViewBase
    public native boolean isValid();

    public native void notifyOnSceneConfigurationSet(@NonNull SetValidSceneConfigurationCallback setValidSceneConfigurationCallback);

    public native void pause();

    @Override // com.here.sdk.mapview.MapViewBase
    public native void pick(@Nullable MapScene.MapPickFilter mapPickFilter, @NonNull Rectangle2D rectangle2D, @NonNull MapViewBase.MapPickCallback mapPickCallback);

    @Override // com.here.sdk.mapview.MapViewBase
    @Deprecated
    public native void pickMapContent(@NonNull Rectangle2D rectangle2D, @NonNull MapViewBase.PickMapContentCallback pickMapContentCallback);

    @Override // com.here.sdk.mapview.MapViewBase
    @Deprecated
    public native void pickMapItems(@NonNull Point2D point2D, double d, @NonNull MapViewBase.PickMapItemsCallback pickMapItemsCallback);

    public native void redraw(@Nullable RedrawCallback redrawCallback);

    public native void reloadWatermark(@NonNull String str);

    @Override // com.here.sdk.mapview.MapViewBase
    public native void removeLifecycleListener(@NonNull MapViewLifecycleListener mapViewLifecycleListener);

    public native void resume();

    public native void setContinuousRendering(boolean z);

    public native void setDisplayMetrics(double d, double d2, @Nullable Double d3);

    @Override // com.here.sdk.mapview.MapViewBase
    public native void setFrameRate(int i);

    public native void setRenderTargetUpdatedListener(@Nullable RenderTargetUpdatedListener renderTargetUpdatedListener);

    @Override // com.here.sdk.mapview.MapViewBase
    public native void setWatermarkLocation(@NonNull Anchor2D anchor2D, @NonNull Point2D point2D);

    public native void takeScreenshot(@NonNull TakeScreenshotCallback takeScreenshotCallback);

    public native void updateWatermark(@NonNull Size2D size2D);

    @Override // com.here.sdk.mapview.MapViewBase
    @Nullable
    public native GeoCoordinates viewToGeoCoordinates(@NonNull Point2D point2D);

    public MapViewInternalHsdk(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapViewInternalHsdk.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapViewInternalHsdk.disposeNativeHandle(j2);
            }
        });
    }
}
