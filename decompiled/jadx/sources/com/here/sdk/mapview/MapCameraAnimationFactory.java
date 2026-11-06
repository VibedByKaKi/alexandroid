package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.animation.Easing;
import com.here.sdk.core.GeoCoordinatesUpdate;
import com.here.sdk.core.GeoOrientationUpdate;
import com.here.sdk.mapview.MapCameraAnimation;
import com.here.time.Duration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapCameraAnimationFactory extends NativeBase {
    public MapCameraAnimationFactory(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCameraAnimationFactory.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapCameraAnimationFactory.disposeNativeHandle(j2);
            }
        });
    }

    @NonNull
    public static native MapCameraAnimation createAnimation(@NonNull MapCameraKeyframeTrack mapCameraKeyframeTrack);

    @NonNull
    public static native MapCameraAnimation createAnimation(@NonNull MapCameraUpdate mapCameraUpdate, @NonNull Duration duration, @NonNull Easing easing);

    @NonNull
    public static native MapCameraAnimation createAnimation(@NonNull List<MapCameraKeyframeTrack> list) throws MapCameraAnimation.InstantiationException;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public static native MapCameraAnimation flyTo(@NonNull GeoCoordinatesUpdate geoCoordinatesUpdate, double d, @NonNull Duration duration);

    @NonNull
    public static native MapCameraAnimation flyTo(@NonNull GeoCoordinatesUpdate geoCoordinatesUpdate, @NonNull GeoOrientationUpdate geoOrientationUpdate, double d, @NonNull Duration duration);

    @NonNull
    public static native MapCameraAnimation flyTo(@NonNull GeoCoordinatesUpdate geoCoordinatesUpdate, @NonNull GeoOrientationUpdate geoOrientationUpdate, @NonNull MapMeasure mapMeasure, double d, @NonNull Duration duration);

    @NonNull
    public static native MapCameraAnimation flyTo(@NonNull GeoCoordinatesUpdate geoCoordinatesUpdate, @NonNull MapMeasure mapMeasure, double d, @NonNull Duration duration);
}
