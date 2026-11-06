package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.AngleRange;
import com.here.sdk.core.GeoBox;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapCameraLimits extends NativeBase {
    public static final double MAX_TILT = 70.0d;
    public static final double MAX_ZOOM_LEVEL = 23.0d;
    public static final double MIN_TILT = 0.0d;
    public static final double MIN_ZOOM_LEVEL = 0.0d;

    public MapCameraLimits(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapCameraLimits.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapCameraLimits.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void clearBearingRanges();

    public native void clearTiltRanges();

    @NonNull
    public native AngleRange getBearingRange();

    @Nullable
    public native GeoBox getTargetArea();

    @NonNull
    public native AngleRange getTiltRange();

    @NonNull
    public native MapMeasureRange getZoomRange();

    public native void setBearingRange(@NonNull AngleRange angleRange);

    public native void setBearingRangeAtZoom(@NonNull MapMeasure mapMeasure, @NonNull AngleRange angleRange);

    public native void setTargetArea(@Nullable GeoBox geoBox);

    public native void setTiltRange(@NonNull AngleRange angleRange);

    public native void setTiltRangeAtZoom(@NonNull MapMeasure mapMeasure, @NonNull AngleRange angleRange);

    public native void setZoomRange(@NonNull MapMeasureRange mapMeasureRange);
}
