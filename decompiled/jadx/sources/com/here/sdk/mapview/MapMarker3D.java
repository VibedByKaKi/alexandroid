package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.Metadata;
import com.here.sdk.mapview.RenderSize;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMarker3D extends NativeBase {
    public MapMarker3D(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel) {
        this(make(geoCoordinates, mapMarker3DModel), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, double d, @NonNull RenderSize.Unit unit);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel, double d);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel, double d, @NonNull RenderSize.Unit unit);

    public native double getBearing();

    @NonNull
    public native GeoCoordinates getCoordinates();

    @Nullable
    public native Metadata getMetadata();

    public native double getOpacity();

    public native double getPitch();

    public native double getRoll();

    public native double getScale();

    @NonNull
    public native List<MapMeasureRange> getVisibilityRanges();

    public native boolean isDepthCheckEnabled();

    public native boolean isRenderInternalsEnabled();

    public native void setBearing(double d);

    public native void setCoordinates(@NonNull GeoCoordinates geoCoordinates);

    public native void setDepthCheckEnabled(boolean z);

    public native void setMetadata(@Nullable Metadata metadata);

    public native void setOpacity(double d);

    public native void setPitch(double d);

    public native void setRenderInternalsEnabled(boolean z);

    public native void setRoll(double d);

    public native void setScale(double d);

    public native void setVisibilityRanges(@NonNull List<MapMeasureRange> list);

    public MapMarker3D(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, double d, @NonNull RenderSize.Unit unit) {
        this(make(geoCoordinates, mapImage, d, unit), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3D(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel, double d) {
        this(make(geoCoordinates, mapMarker3DModel, d), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3D(@NonNull GeoCoordinates geoCoordinates, @NonNull MapMarker3DModel mapMarker3DModel, double d, @NonNull RenderSize.Unit unit) {
        this(make(geoCoordinates, mapMarker3DModel, d, unit), (Object) null);
        cacheThisInstance();
    }

    public MapMarker3D(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapMarker3D.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapMarker3D.disposeNativeHandle(j2);
            }
        });
    }
}
