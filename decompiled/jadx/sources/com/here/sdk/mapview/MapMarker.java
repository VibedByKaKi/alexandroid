package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.animation.AnimationListener;
import com.here.sdk.animation.MapMarkerAnimation;
import com.here.sdk.core.Anchor2D;
import com.here.sdk.core.Color;
import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.core.Metadata;
import com.here.time.Duration;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMarker extends NativeBase {
    public MapMarker(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage) {
        this(make(geoCoordinates, mapImage), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, @NonNull Anchor2D anchor2D);

    private static native long make(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, @NonNull String str);

    public native void cancelAnimation(@NonNull MapMarkerAnimation mapMarkerAnimation);

    @NonNull
    public native Anchor2D getAnchor();

    @NonNull
    public native GeoCoordinates getCoordinates();

    public native int getDrawOrder();

    @NonNull
    public native Duration getFadeDuration();

    @NonNull
    public native MapImage getImage();

    @Nullable
    public native Metadata getMetadata();

    public native double getOpacity();

    @NonNull
    public native String getText();

    @NonNull
    public native TextStyle getTextStyle();

    @NonNull
    public native List<MapMeasureRange> getVisibilityRanges();

    public native boolean isOverlapAllowed();

    public native void setAnchor(@NonNull Anchor2D anchor2D);

    public native void setCoordinates(@NonNull GeoCoordinates geoCoordinates);

    public native void setDrawOrder(int i);

    public native void setFadeDuration(@NonNull Duration duration);

    public native void setImage(@NonNull MapImage mapImage);

    public native void setMetadata(@Nullable Metadata metadata);

    public native void setOpacity(double d);

    public native void setOverlapAllowed(boolean z);

    public native void setText(@NonNull String str);

    public native void setTextStyle(@NonNull TextStyle textStyle);

    public native void setVisibilityRanges(@NonNull List<MapMeasureRange> list);

    public native void startAnimation(@NonNull MapMarkerAnimation mapMarkerAnimation, @Nullable AnimationListener animationListener);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TextStyle extends NativeBase {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum InstantiationErrorCode {
            NON_POSITIVE_TEXT_SIZE(1),
            NEGATIVE_TEXT_OUTLINE_SIZE(2),
            EMPTY_TEXT_PLACEMENT_LIST(3),
            DUPLICATE_TEXT_PLACEMENT_VALUES(4);

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

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Placement {
            CENTER(0),
            TOP(1),
            TOP_RIGHT(2),
            RIGHT(3),
            BOTTOM_RIGHT(4),
            BOTTOM(5),
            BOTTOM_LEFT(6),
            LEFT(7),
            TOP_LEFT(8);

            public final int value;

            Placement(int i) {
                this.value = i;
            }
        }

        public TextStyle() {
            this(make(), null);
            cacheThisInstance();
        }

        private native void cacheThisInstance();

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        private static native long make();

        private static native long make(double d, @NonNull Color color, double d2, @NonNull Color color2, @NonNull List<Placement> list) throws InstantiationException;

        @NonNull
        public native List<Placement> getPlacements();

        @NonNull
        public native Color getTextColor();

        @NonNull
        public native Color getTextOutlineColor();

        public native double getTextOutlineSize();

        public native double getTextSize();

        public TextStyle(double d, @NonNull Color color, double d2, @NonNull Color color2, @NonNull List<Placement> list) throws InstantiationException {
            this(make(d, color, d2, color2, list), null);
            cacheThisInstance();
        }

        public TextStyle(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapMarker.TextStyle.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    TextStyle.disposeNativeHandle(j2);
                }
            });
        }
    }

    public MapMarker(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, @NonNull String str) {
        this(make(geoCoordinates, mapImage, str), (Object) null);
        cacheThisInstance();
    }

    public MapMarker(@NonNull GeoCoordinates geoCoordinates, @NonNull MapImage mapImage, @NonNull Anchor2D anchor2D) {
        this(make(geoCoordinates, mapImage, anchor2D), (Object) null);
        cacheThisInstance();
    }

    public MapMarker(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapMarker.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapMarker.disposeNativeHandle(j2);
            }
        });
    }
}
