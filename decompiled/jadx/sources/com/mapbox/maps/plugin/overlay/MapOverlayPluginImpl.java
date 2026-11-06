package com.mapbox.maps.plugin.overlay;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.overlay.MapOverlayPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010\"\u001a\u00020\u00182\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00180$H\u0002J\u0012\u0010\"\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\fH\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0016\u0010,\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0.H\u0016J(\u0010/\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0016\u00102\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0.H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u00064"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl;", "Lcom/mapbox/maps/plugin/overlay/MapOverlayPlugin;", "()V", "height", "", "getHeight$plugin_overlay_release", "()I", "setHeight$plugin_overlay_release", "(I)V", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapOverlayCoordinatesProvider", "Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;", "mapOverlays", "", "Landroid/view/View;", ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT, ViewProps.MARGIN_TOP, "width", "getWidth$plugin_overlay_release", "setWidth$plugin_overlay_release", "cleanup", "", "getEdgeInsets", "Lcom/mapbox/maps/EdgeInsets;", "getMapOverLayRect", "Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl$MapOverLayRect;", "view", "onDelegateProvider", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "onSizeChanged", "reframe", "result", "Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions;", "onReframeFinished", "Lcom/mapbox/maps/plugin/overlay/OnReframeFinished;", "registerMapOverlayCoordinatesProvider", "provider", "registerOverlay", "overlay", "registerOverlays", "overlays", "", "setDisplayingAreaMargins", "unregisterMapOverlayCoordinatesProvider", "unregisterOverlay", "unregisterOverlays", "MapOverLayRect", "plugin-overlay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class MapOverlayPluginImpl implements MapOverlayPlugin {
    private int height;
    private MapCameraManagerDelegate mapCameraManagerDelegate;

    @Nullable
    private MapOverlayCoordinatesProvider mapOverlayCoordinatesProvider;

    @NotNull
    private final List<View> mapOverlays = new ArrayList();
    private int marginBottom;
    private int marginLeft;
    private int marginRight;
    private int marginTop;
    private int width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl$MapOverLayRect;", "", "left", "", "top", "right", "bottom", "(IIII)V", "getBottom", "()I", "setBottom", "(I)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "compareTo", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "isOverLap", "", "reactAnother", "updateBottom", "newBottom", "updateLeft", "newLeft", "updateRight", "newRight", "updateTop", "newTop", "plugin-overlay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class MapOverLayRect implements Comparable<MapOverLayRect> {
        private int bottom;
        private int left;
        private int right;
        private int top;

        public MapOverLayRect(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull MapOverLayRect other) {
            other.getClass();
            return ((this.bottom - this.top) * (this.right - this.left)) - ((other.bottom - other.top) * (other.right - other.left));
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public final boolean isOverLap(@NotNull MapOverLayRect reactAnother) {
            reactAnother.getClass();
            return this.right > reactAnother.left && this.bottom > reactAnother.top && this.left < reactAnother.right && this.top < reactAnother.bottom;
        }

        public final void setBottom(int i) {
            this.bottom = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setRight(int i) {
            this.right = i;
        }

        public final void setTop(int i) {
            this.top = i;
        }

        @NotNull
        public final MapOverLayRect updateBottom(int newBottom) {
            return new MapOverLayRect(this.left, this.top, this.right, newBottom);
        }

        @NotNull
        public final MapOverLayRect updateLeft(int newLeft) {
            return new MapOverLayRect(newLeft, this.top, this.right, this.bottom);
        }

        @NotNull
        public final MapOverLayRect updateRight(int newRight) {
            return new MapOverLayRect(this.left, this.top, newRight, this.bottom);
        }

        @NotNull
        public final MapOverLayRect updateTop(int newTop) {
            return new MapOverLayRect(this.left, newTop, this.right, this.bottom);
        }
    }

    private final MapOverLayRect getMapOverLayRect(View view) {
        return new MapOverLayRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private final void reframe(Function1<? super CameraOptions, Unit> result) {
        Unit unit;
        MapCameraManagerDelegate mapCameraManagerDelegate;
        MapOverlayCoordinatesProvider mapOverlayCoordinatesProvider = this.mapOverlayCoordinatesProvider;
        if (mapOverlayCoordinatesProvider != null) {
            double d = -90.0d;
            double d2 = 90.0d;
            double d3 = 180.0d;
            double d4 = -180.0d;
            for (Point point : mapOverlayCoordinatesProvider.getShownCoordinates()) {
                d = Math.max(d, point.latitude());
                d2 = Math.min(d2, point.latitude());
                d3 = Math.min(d3, point.longitude());
                d4 = Math.max(d4, point.longitude());
            }
            MapCameraManagerDelegate mapCameraManagerDelegate2 = this.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
                mapCameraManagerDelegate = null;
            } else {
                mapCameraManagerDelegate = mapCameraManagerDelegate2;
            }
            List<Point> listOf = CollectionsKt.listOf((Object[]) new Point[]{Point.fromLngLat(d3, d2), Point.fromLngLat(d4, d)});
            CameraOptions.Builder builder = new CameraOptions.Builder();
            Unit unit2 = Unit.INSTANCE;
            CameraOptions build = builder.build();
            build.getClass();
            mapCameraManagerDelegate.cameraForCoordinates(listOf, build, getEdgeInsets(), null, null, result);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            result.invoke(null);
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        unregisterMapOverlayCoordinatesProvider();
        this.mapOverlays.clear();
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    @NotNull
    public EdgeInsets getEdgeInsets() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new MapOverLayRect(0, 0, this.width, this.height));
        List<View> list = this.mapOverlays;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(getMapOverLayRect((View) it2.next()));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MapOverLayRect mapOverLayRect = (MapOverLayRect) it3.next();
            for (int size = linkedList.size(); size > 0; size--) {
                Object pollFirst = linkedList.pollFirst();
                pollFirst.getClass();
                MapOverLayRect mapOverLayRect2 = (MapOverLayRect) pollFirst;
                if (mapOverLayRect.isOverLap(mapOverLayRect2)) {
                    if (mapOverLayRect.getTop() - mapOverLayRect2.getTop() < mapOverLayRect2.getBottom() - mapOverLayRect.getBottom()) {
                        linkedList.offerLast(mapOverLayRect2.updateTop(mapOverLayRect.getBottom()));
                    } else if (mapOverLayRect.getTop() - mapOverLayRect2.getTop() > mapOverLayRect2.getBottom() - mapOverLayRect.getBottom()) {
                        linkedList.offerLast(mapOverLayRect2.updateBottom(mapOverLayRect.getTop()));
                    } else {
                        linkedList.offerLast(mapOverLayRect2.updateTop(mapOverLayRect.getBottom()));
                        linkedList.offerLast(mapOverLayRect2.updateBottom(mapOverLayRect.getTop()));
                    }
                    if (mapOverLayRect.getLeft() - mapOverLayRect2.getLeft() < mapOverLayRect2.getRight() - mapOverLayRect.getRight()) {
                        linkedList.offerLast(mapOverLayRect2.updateLeft(mapOverLayRect.getRight()));
                    } else if (mapOverLayRect.getLeft() - mapOverLayRect2.getLeft() > mapOverLayRect2.getRight() - mapOverLayRect.getRight()) {
                        linkedList.offerLast(mapOverLayRect2.updateRight(mapOverLayRect.getLeft()));
                    } else {
                        linkedList.offerLast(mapOverLayRect2.updateLeft(mapOverLayRect.getRight()));
                        linkedList.offerLast(mapOverLayRect2.updateRight(mapOverLayRect.getLeft()));
                    }
                } else {
                    linkedList.offerLast(mapOverLayRect2);
                }
            }
        }
        return ((MapOverLayRect) CollectionsKt.maxOrNull((Iterable) linkedList)) == null ? new EdgeInsets(this.marginTop, this.marginLeft, this.marginBottom, this.marginRight) : new EdgeInsets(r0.getTop() + this.marginTop, r0.getLeft() + this.marginLeft, (this.height - r0.getBottom()) + this.marginBottom, (this.width - r0.getRight()) + this.marginRight);
    }

    /* renamed from: getHeight$plugin_overlay_release, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: getWidth$plugin_overlay_release, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapOverlayPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(@NotNull MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerMapOverlayCoordinatesProvider(@NotNull MapOverlayCoordinatesProvider provider) {
        provider.getClass();
        this.mapOverlayCoordinatesProvider = provider;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerOverlay(@NotNull View overlay) {
        overlay.getClass();
        this.mapOverlays.add(overlay);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerOverlays(@NotNull List<? extends View> overlays) {
        overlays.getClass();
        this.mapOverlays.addAll(overlays);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void setDisplayingAreaMargins(int marginTop, int marginLeft, int marginBottom, int marginRight) {
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
    }

    public final void setHeight$plugin_overlay_release(int i) {
        this.height = i;
    }

    public final void setWidth$plugin_overlay_release(int i) {
        this.width = i;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterMapOverlayCoordinatesProvider() {
        this.mapOverlayCoordinatesProvider = null;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterOverlay(@NotNull View overlay) {
        overlay.getClass();
        this.mapOverlays.remove(overlay);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterOverlays(@NotNull List<? extends View> overlays) {
        overlays.getClass();
        Iterator<T> it2 = overlays.iterator();
        while (it2.hasNext()) {
            this.mapOverlays.remove((View) it2.next());
        }
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void reframe(@Nullable final OnReframeFinished onReframeFinished) {
        reframe(new Function1<CameraOptions, Unit>() { // from class: com.mapbox.maps.plugin.overlay.MapOverlayPluginImpl$reframe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable CameraOptions cameraOptions) {
                MapCameraManagerDelegate mapCameraManagerDelegate;
                OnReframeFinished onReframeFinished2 = OnReframeFinished.this;
                if (onReframeFinished2 != null) {
                    onReframeFinished2.onReframeFinished(cameraOptions);
                    return;
                }
                if (cameraOptions != null) {
                    mapCameraManagerDelegate = this.mapCameraManagerDelegate;
                    if (mapCameraManagerDelegate == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapCameraManagerDelegate");
                        mapCameraManagerDelegate = null;
                    }
                    mapCameraManagerDelegate.setCamera(cameraOptions);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
                invoke2(cameraOptions);
                return Unit.INSTANCE;
            }
        });
    }
}
