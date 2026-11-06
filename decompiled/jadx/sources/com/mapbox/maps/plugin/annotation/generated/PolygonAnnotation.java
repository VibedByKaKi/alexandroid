package com.mapbox.maps.plugin.annotation.generated;

import androidx.annotation.ColorInt;
import com.android.tools.r8.RecordTag;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.annotation.ConvertUtils;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ZBE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010Q\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020YH\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R(\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u000b\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u000b\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R(\u00102\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R(\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R(\u00108\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016R(\u0010;\u001a\u0004\u0018\u00010)2\b\u0010\u000b\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R*\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R(\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R(\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u0014\"\u0004\bF\u0010\u0016R(\u0010G\u001a\u0004\u0018\u00010)2\b\u0010\u000b\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R<\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0J2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006["}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/Polygon;", "id", "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/Polygon;)V", "value", "", "fillBridgeGuardRailColorInt", "getFillBridgeGuardRailColorInt", "()Ljava/lang/Integer;", "setFillBridgeGuardRailColorInt", "(Ljava/lang/Integer;)V", "fillBridgeGuardRailColorString", "getFillBridgeGuardRailColorString", "()Ljava/lang/String;", "setFillBridgeGuardRailColorString", "(Ljava/lang/String;)V", "fillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme", "setFillBridgeGuardRailColorUseTheme", "fillColorInt", "getFillColorInt", "setFillColorInt", "fillColorString", "getFillColorString", "setFillColorString", "fillColorUseTheme", "getFillColorUseTheme", "setFillColorUseTheme", "", "fillConstructBridgeGuardRail", "getFillConstructBridgeGuardRail", "()Ljava/lang/Boolean;", "setFillConstructBridgeGuardRail", "(Ljava/lang/Boolean;)V", "", "fillOpacity", "getFillOpacity", "()Ljava/lang/Double;", "setFillOpacity", "(Ljava/lang/Double;)V", "fillOutlineColorInt", "getFillOutlineColorInt", "setFillOutlineColorInt", "fillOutlineColorString", "getFillOutlineColorString", "setFillOutlineColorString", "fillOutlineColorUseTheme", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "fillPattern", "getFillPattern", "setFillPattern", "fillSortKey", "getFillSortKey", "setFillSortKey", "fillTunnelStructureColorInt", "getFillTunnelStructureColorInt", "setFillTunnelStructureColorInt", "fillTunnelStructureColorString", "getFillTunnelStructureColorString", "setFillTunnelStructureColorString", "fillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "fillZOffset", "getFillZOffset", "setFillZOffset", "", "Lcom/mapbox/geojson/Point;", "points", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PolygonAnnotation extends Annotation<Polygon> {

    @NotNull
    public static final String ID_KEY = "PolygonAnnotation";

    @NotNull
    private final AnnotationManager<Polygon, PolygonAnnotation, ?, ?, ?, ?, ?> annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonAnnotation(@NotNull String str, @NotNull AnnotationManager<Polygon, PolygonAnnotation, ?, ?, ?, ?, ?> annotationManager, @NotNull JsonObject jsonObject, @NotNull Polygon polygon) {
        super(str, jsonObject, polygon);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        polygon.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty(ID_KEY, str);
    }

    @ColorInt
    @Nullable
    public final Integer getFillBridgeGuardRailColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getFillBridgeGuardRailColorString() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getFillBridgeGuardRailColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getFillColorString() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getFillColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Boolean getFillConstructBridgeGuardRail() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        if (jsonElement != null) {
            return Boolean.valueOf(Boolean.parseBoolean(jsonElement.getAsString()));
        }
        return null;
    }

    @Nullable
    public final Double getFillOpacity() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillOutlineColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getFillOutlineColorString() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getFillOutlineColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getFillPattern() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getFillSortKey() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getFillTunnelStructureColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getFillTunnelStructureColorString() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getFillTunnelStructureColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getFillZOffset() {
        JsonElement jsonElement = getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @Nullable
    public Polygon getOffsetGeometry(@NotNull MapCameraManagerDelegate mapCameraManagerDelegate, @NotNull MoveDistancesObject moveDistancesObject) {
        double averageOfDouble;
        double averageOfDouble2;
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        LineString outer = getGeometry().outer();
        List<Point> coordinates = outer != null ? outer.coordinates() : null;
        if (coordinates != null && !coordinates.isEmpty()) {
            List<Point> list = coordinates;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Double.valueOf(((Point) it2.next()).longitude()));
            }
            averageOfDouble = CollectionsKt___CollectionsKt.averageOfDouble(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Double.valueOf(((Point) it3.next()).latitude()));
            }
            averageOfDouble2 = CollectionsKt___CollectionsKt.averageOfDouble(arrayList2);
            Point fromLngLat = Point.fromLngLat(averageOfDouble, averageOfDouble2);
            fromLngLat.getClass();
            ScreenCoordinate pixelForCoordinate = mapCameraManagerDelegate.pixelForCoordinate(fromLngLat);
            MercatorCoordinate calculateMercatorCoordinateShift = ConvertUtils.INSTANCE.calculateMercatorCoordinateShift(fromLngLat, mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(pixelForCoordinate.getX() - moveDistancesObject.getDistanceXSinceLast(), pixelForCoordinate.getY() - moveDistancesObject.getDistanceYSinceLast())), mapCameraManagerDelegate.getCameraState().getZoom());
            List<List<Point>> coordinates2 = getGeometry().coordinates();
            coordinates2.getClass();
            List<List<Point>> list2 = coordinates2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                List list3 = (List) it4.next();
                list3.getClass();
                List<Point> list4 = list3;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                for (Point point : list4) {
                    ConvertUtils convertUtils = ConvertUtils.INSTANCE;
                    point.getClass();
                    arrayList4.add(convertUtils.shiftPointWithMercatorCoordinate(point, calculateMercatorCoordinateShift, mapCameraManagerDelegate.getCameraState().getZoom()));
                }
                arrayList3.add(arrayList4);
            }
            if (!arrayList3.isEmpty()) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    List<Point> list5 = (List) it5.next();
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        for (Point point2 : list5) {
                            if (point2.latitude() <= 85.05112877980659d && point2.latitude() >= -85.05112877980659d) {
                            }
                        }
                    }
                }
            }
            return Polygon.fromLngLats(arrayList3);
        }
        return null;
    }

    @NotNull
    public final List<List<Point>> getPoints() {
        List<List<Point>> coordinates = getGeometry().coordinates();
        coordinates.getClass();
        return coordinates;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @NotNull
    public AnnotationType getType() {
        return AnnotationType.PolygonAnnotation;
    }

    public final void setFillBridgeGuardRailColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        }
    }

    public final void setFillBridgeGuardRailColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        }
    }

    public final void setFillBridgeGuardRailColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        }
    }

    public final void setFillColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        }
    }

    public final void setFillColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        }
    }

    public final void setFillColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        }
    }

    public final void setFillConstructBridgeGuardRail(@Nullable Boolean bool) {
        if (bool != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, bool);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        }
    }

    public final void setFillOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, d);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        }
    }

    public final void setFillOutlineColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        }
    }

    public final void setFillOutlineColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        }
    }

    public final void setFillOutlineColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        }
    }

    public final void setFillPattern(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        }
    }

    public final void setFillSortKey(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, d);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        }
    }

    public final void setFillTunnelStructureColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        }
    }

    public final void setFillTunnelStructureColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        }
    }

    public final void setFillTunnelStructureColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        }
    }

    public final void setFillZOffset(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, d);
        } else {
            getJsonObject().remove(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        }
    }

    public final void setPoints(@NotNull List<? extends List<Point>> list) {
        list.getClass();
        Polygon fromLngLats = Polygon.fromLngLats((List<List<Point>>) list);
        fromLngLats.getClass();
        setGeometry(fromLngLats);
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        }
    }
}
