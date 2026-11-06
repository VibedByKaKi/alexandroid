package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.Anchor2D;
import com.here.sdk.core.Color;
import com.here.sdk.core.NamedColor;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapMarkerCluster extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CounterStyle {

        @NonNull
        public Color textColor = NamedColor.WHITE;
        public double fontSize = 20.0d;

        @NonNull
        public Anchor2D textAnchor = new Anchor2D();
        public int maxCountNumber = 99;

        @NonNull
        public String aboveMaxText = "+99";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Grouping {

        @NonNull
        public List<MapMarker> markers;

        @NonNull
        public MapMarkerCluster parent;

        public Grouping(@NonNull List<MapMarker> list, @NonNull MapMarkerCluster mapMarkerCluster) {
            this.markers = list;
            this.parent = mapMarkerCluster;
        }
    }

    public MapMarkerCluster(@NonNull ImageStyle imageStyle) {
        this(make(imageStyle), (Object) null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    private static native long make(@NonNull ImageStyle imageStyle);

    private static native long make(@NonNull ImageStyle imageStyle, @NonNull CounterStyle counterStyle);

    public native void addMapMarker(@NonNull MapMarker mapMarker);

    public native void addMapMarkers(@NonNull List<MapMarker> list);

    @NonNull
    public native List<MapMarker> getMarkers();

    public native double getOpacity();

    public native void removeAllMapMarkers();

    public native void removeMapMarker(@NonNull MapMarker mapMarker);

    public native void removeMapMarkers(@NonNull List<MapMarker> list);

    public native void setOpacity(double d);

    public MapMarkerCluster(@NonNull ImageStyle imageStyle, @NonNull CounterStyle counterStyle) {
        this(make(imageStyle, counterStyle), (Object) null);
        cacheThisInstance();
    }

    public MapMarkerCluster(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.MapMarkerCluster.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                MapMarkerCluster.disposeNativeHandle(j2);
            }
        });
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageStyle {

        @NonNull
        public final Anchor2D anchor;

        @NonNull
        public final MapImage image;

        public ImageStyle(@NonNull MapImage mapImage, @NonNull Anchor2D anchor2D) {
            ImageStyle make = make(mapImage, anchor2D);
            this.image = make.image;
            this.anchor = make.anchor;
        }

        private static native ImageStyle make(@NonNull MapImage mapImage);

        private static native ImageStyle make(@NonNull MapImage mapImage, @NonNull Anchor2D anchor2D);

        public ImageStyle(@NonNull MapImage mapImage) {
            ImageStyle make = make(mapImage);
            this.image = make.image;
            this.anchor = make.anchor;
        }
    }
}
