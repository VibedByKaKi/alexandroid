package com.mapbox.maps.plugin.annotation.generated;

import androidx.annotation.ColorInt;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.android.tools.r8.RecordTag;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.annotation.ConvertUtils;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001]BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010T\u001a\u0004\u0018\u00010\u00022\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020\\H\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R*\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR(\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR(\u0010,\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R(\u0010/\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R(\u00102\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R(\u00106\u001a\u0004\u0018\u0001052\b\u0010\u000b\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010;\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R(\u0010>\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R(\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR(\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R(\u0010G\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\u000f\"\u0004\bI\u0010\u0011R(\u0010J\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u000f\"\u0004\bL\u0010\u0011R0\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020N0M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006^"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolylineAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/LineString;", "id", "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/LineString;)V", "value", "", "lineBlur", "getLineBlur", "()Ljava/lang/Double;", "setLineBlur", "(Ljava/lang/Double;)V", "", "lineBorderColorInt", "getLineBorderColorInt", "()Ljava/lang/Integer;", "setLineBorderColorInt", "(Ljava/lang/Integer;)V", "lineBorderColorString", "getLineBorderColorString", "()Ljava/lang/String;", "setLineBorderColorString", "(Ljava/lang/String;)V", "lineBorderColorUseTheme", "getLineBorderColorUseTheme", "setLineBorderColorUseTheme", "lineBorderWidth", "getLineBorderWidth", "setLineBorderWidth", "lineColorInt", "getLineColorInt", "setLineColorInt", "lineColorString", "getLineColorString", "setLineColorString", "lineColorUseTheme", "getLineColorUseTheme", "setLineColorUseTheme", "lineElevationGroundScale", "getLineElevationGroundScale", "setLineElevationGroundScale", "lineEmissiveStrength", "getLineEmissiveStrength", "setLineEmissiveStrength", "lineGapWidth", "getLineGapWidth", "setLineGapWidth", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoin", "getLineJoin", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "setLineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)V", "lineOffset", "getLineOffset", "setLineOffset", "lineOpacity", "getLineOpacity", "setLineOpacity", "linePattern", "getLinePattern", "setLinePattern", "lineSortKey", "getLineSortKey", "setLineSortKey", "lineWidth", "getLineWidth", "setLineWidth", "lineZOffset", "getLineZOffset", "setLineZOffset", "", "Lcom/mapbox/geojson/Point;", "points", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PolylineAnnotation extends Annotation<LineString> {

    @NotNull
    public static final String ID_KEY = "PolylineAnnotation";

    @NotNull
    private final AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?> annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotation(@NotNull String str, @NotNull AnnotationManager<LineString, PolylineAnnotation, ?, ?, ?, ?, ?> annotationManager, @NotNull JsonObject jsonObject, @NotNull LineString lineString) {
        super(str, jsonObject, lineString);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        lineString.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty(ID_KEY, str);
    }

    @Nullable
    public final Double getLineBlur() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getLineBorderColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getLineBorderColorString() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getLineBorderColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getLineBorderWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getLineColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getLineColorString() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getLineColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getLineElevationGroundScale() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getLineEmissiveStrength() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getLineGapWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final LineJoin getLineJoin() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        if (jsonElement == null) {
            return null;
        }
        LineJoin.Companion companion = LineJoin.INSTANCE;
        String asString = jsonElement.getAsString();
        asString.getClass();
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, asString, locale, '-', '_'));
    }

    @Nullable
    public final Double getLineOffset() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getLineOpacity() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final String getLinePattern() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getLineSortKey() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getLineWidth() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getLineZOffset() {
        JsonElement jsonElement = getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @Nullable
    public LineString getOffsetGeometry(@NotNull MapCameraManagerDelegate mapCameraManagerDelegate, @NotNull MoveDistancesObject moveDistancesObject) {
        double averageOfDouble;
        double averageOfDouble2;
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        List<Point> coordinates = getGeometry().coordinates();
        coordinates.getClass();
        if (coordinates.isEmpty()) {
            return null;
        }
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
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Point point : list) {
            ConvertUtils convertUtils = ConvertUtils.INSTANCE;
            point.getClass();
            arrayList3.add(convertUtils.shiftPointWithMercatorCoordinate(point, calculateMercatorCoordinateShift, mapCameraManagerDelegate.getCameraState().getZoom()));
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Point point2 = (Point) it4.next();
                if (point2.latitude() > 85.05112877980659d || point2.latitude() < -85.05112877980659d) {
                    return null;
                }
            }
        }
        return LineString.fromLngLats(arrayList3);
    }

    @NotNull
    public final List<Point> getPoints() {
        List<Point> coordinates = getGeometry().coordinates();
        coordinates.getClass();
        return coordinates;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @NotNull
    public AnnotationType getType() {
        return AnnotationType.PolylineAnnotation;
    }

    public final void setLineBlur(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        }
    }

    public final void setLineBorderColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
    }

    public final void setLineBorderColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
    }

    public final void setLineBorderColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        }
    }

    public final void setLineBorderWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        }
    }

    public final void setLineColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
    }

    public final void setLineColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
    }

    public final void setLineColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        }
    }

    public final void setLineElevationGroundScale(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
        }
    }

    public final void setLineEmissiveStrength(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
        }
    }

    public final void setLineGapWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        }
    }

    public final void setLineJoin(@Nullable LineJoin lineJoin) {
        if (lineJoin != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN, lineJoin.getValue());
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        }
    }

    public final void setLineOffset(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        }
    }

    public final void setLineOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        }
    }

    public final void setLinePattern(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN, str);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        }
    }

    public final void setLineSortKey(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        }
    }

    public final void setLineWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        }
    }

    public final void setLineZOffset(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET, d);
        } else {
            getJsonObject().remove(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        }
    }

    public final void setPoints(@NotNull List<Point> list) {
        list.getClass();
        LineString fromLngLats = LineString.fromLngLats(list);
        fromLngLats.getClass();
        setGeometry(fromLngLats);
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_ELEVATION_GROUND_SCALE);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_JOIN) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_JOIN);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_SORT_KEY);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_Z_OFFSET);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BLUR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_EMISSIVE_STRENGTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_GAP_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OFFSET);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_OPACITY);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_PATTERN);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_WIDTH);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_BORDER_COLOR_USE_THEME);
        }
        if (getJsonObject().get(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(PolylineAnnotationOptions.PROPERTY_LINE_COLOR_USE_THEME);
        }
    }
}
