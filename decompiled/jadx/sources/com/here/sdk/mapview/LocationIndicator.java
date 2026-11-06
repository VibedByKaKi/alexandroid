package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Color;
import com.here.sdk.core.Location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocationIndicator extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IndicatorStyle {
        PEDESTRIAN(0),
        NAVIGATION(1);

        public final int value;

        IndicatorStyle(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MarkerType {
        PEDESTRIAN(0),
        PEDESTRIAN_INACTIVE(1),
        NAVIGATION(2),
        NAVIGATION_INACTIVE(3);

        public final int value;

        MarkerType(int i) {
            this.value = i;
        }
    }

    public LocationIndicator() {
        this(make(), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make();

    private static native long make(@NonNull MapViewBase mapViewBase);

    public native void disable();

    public native void enable(@NonNull MapViewBase mapViewBase);

    @NonNull
    public native Color getHaloColor(@NonNull IndicatorStyle indicatorStyle);

    @NonNull
    public native IndicatorStyle getLocationIndicatorStyle();

    public native double getOpacity();

    public native boolean isAccuracyVisualized();

    public native boolean isActive();

    public native boolean isDirectionIndicatorVisible();

    public native void setAccuracyVisualized(boolean z);

    public native void setActive(boolean z);

    public native void setDirectionIndicatorVisible(boolean z);

    public native void setHaloColor(@NonNull IndicatorStyle indicatorStyle, @NonNull Color color);

    public native void setLocationIndicatorStyle(@NonNull IndicatorStyle indicatorStyle);

    public native void setMarker3dModel(@NonNull MapMarker3DModel mapMarker3DModel, double d, @NonNull MarkerType markerType);

    public native void setOpacity(double d);

    public native void updateLocation(@NonNull Location location);

    public native void updateLocation(@NonNull Location location, @NonNull MapCameraUpdate mapCameraUpdate);

    public LocationIndicator(@NonNull MapViewBase mapViewBase) {
        this(make(mapViewBase), null);
        cacheThisInstance();
    }

    public LocationIndicator(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.LocationIndicator.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LocationIndicator.disposeNativeHandle(j2);
            }
        });
    }
}
