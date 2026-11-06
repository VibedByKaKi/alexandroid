package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.animation.AnimationListener;
import com.here.sdk.animation.MapPolylineAnimation;
import com.here.sdk.core.Color;
import com.here.sdk.core.GeoPolyline;
import com.here.sdk.core.Metadata;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapPolyline extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Representation extends MapItemRepresentation {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum InstantiationErrorCode {
            ILLEGAL_ARGUMENTS(1);

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

        public Representation(long j, Object obj) {
            super(j, obj);
        }
    }

    public MapPolyline(@NonNull GeoPolyline geoPolyline, @NonNull Representation representation) {
        this(make(geoPolyline, representation), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull GeoPolyline geoPolyline, @NonNull Representation representation);

    public native void cancelAnimation(@NonNull MapPolylineAnimation mapPolylineAnimation);

    public native int getDrawOrder();

    @NonNull
    public native DrawOrderType getDrawOrderType();

    @NonNull
    public native GeoPolyline getGeometry();

    @NonNull
    public native List<MapContentCategory> getMapContentCategoriesToBlock();

    @Nullable
    public native Metadata getMetadata();

    public native double getProgress();

    @NonNull
    public native Color getProgressColor();

    @NonNull
    public native Color getProgressOutlineColor();

    @NonNull
    public native List<MapMeasureRange> getVisibilityRanges();

    public native void setDrawOrder(int i);

    public native void setDrawOrderType(@NonNull DrawOrderType drawOrderType);

    public native void setGeometry(@NonNull GeoPolyline geoPolyline);

    public native void setMapContentCategoriesToBlock(@NonNull List<MapContentCategory> list);

    public native void setMetadata(@Nullable Metadata metadata);

    public native void setProgress(double d);

    public native void setProgressColor(@NonNull Color color);

    public native void setProgressOutlineColor(@NonNull Color color);

    public native void setRepresentation(@NonNull Representation representation);

    public native void setVisibilityRanges(@NonNull List<MapMeasureRange> list);

    public native void startAnimation(@NonNull MapPolylineAnimation mapPolylineAnimation, @NonNull AnimationListener animationListener);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DashImageRepresentation extends Representation {
        public DashImageRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapImage mapImage) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, mapMeasureDependentRenderSize2, mapImage), null);
            cacheThisInstance();
        }

        private native void cacheThisInstance();

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapImage mapImage) throws Representation.InstantiationException;

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull MapImage mapImage) throws Representation.InstantiationException;

        @NonNull
        public native MapImage getDashImage();

        @NonNull
        public native MapMeasureDependentRenderSize getDashLength();

        @NonNull
        public native MapMeasureDependentRenderSize getDashWidth();

        @NonNull
        public native MapMeasureDependentRenderSize getGapLength();

        public DashImageRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull MapImage mapImage) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, mapMeasureDependentRenderSize2, mapMeasureDependentRenderSize3, mapImage), null);
            cacheThisInstance();
        }

        public DashImageRepresentation(long j, Object obj) {
            super(j, obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DashRepresentation extends Representation {
        public DashRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull Color color) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, mapMeasureDependentRenderSize2, mapMeasureDependentRenderSize3, color), null);
            cacheThisInstance();
        }

        private native void cacheThisInstance();

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull Color color) throws Representation.InstantiationException;

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull Color color, @NonNull Color color2) throws Representation.InstantiationException;

        @NonNull
        public native Color getDashColor();

        @NonNull
        public native MapMeasureDependentRenderSize getDashLength();

        @Nullable
        public native Color getGapColor();

        @NonNull
        public native MapMeasureDependentRenderSize getGapLength();

        @NonNull
        public native MapMeasureDependentRenderSize getLineWidth();

        public DashRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize3, @NonNull Color color, @NonNull Color color2) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, mapMeasureDependentRenderSize2, mapMeasureDependentRenderSize3, color, color2), null);
            cacheThisInstance();
        }

        public DashRepresentation(long j, Object obj) {
            super(j, obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SolidRepresentation extends Representation {
        public SolidRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull Color color, @NonNull LineCap lineCap) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, color, lineCap), null);
            cacheThisInstance();
        }

        private native void cacheThisInstance();

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull Color color, @NonNull LineCap lineCap) throws Representation.InstantiationException;

        private static native long make(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull Color color, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull Color color2, @NonNull LineCap lineCap) throws Representation.InstantiationException;

        @NonNull
        public native LineCap getCapShape();

        @NonNull
        public native Color getLineColor();

        @NonNull
        public native MapMeasureDependentRenderSize getLineWidth();

        @NonNull
        public native Color getOutlineColor();

        @NonNull
        public native MapMeasureDependentRenderSize getOutlineWidth();

        public SolidRepresentation(@NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize, @NonNull Color color, @NonNull MapMeasureDependentRenderSize mapMeasureDependentRenderSize2, @NonNull Color color2, @NonNull LineCap lineCap) throws Representation.InstantiationException {
            this(make(mapMeasureDependentRenderSize, color, mapMeasureDependentRenderSize2, color2, lineCap), null);
            cacheThisInstance();
        }

        public SolidRepresentation(long j, Object obj) {
            super(j, obj);
        }
    }

    public MapPolyline(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapPolyline.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapPolyline.disposeNativeHandle(j2);
            }
        });
    }
}
