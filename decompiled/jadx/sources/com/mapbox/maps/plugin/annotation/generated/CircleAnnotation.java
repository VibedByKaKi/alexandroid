package com.mapbox.maps.plugin.annotation.generated;

import androidx.annotation.ColorInt;
import com.android.tools.r8.RecordTag;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationManager;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FBE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010=\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020EH\u0016R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R(\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R(\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R*\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR(\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR(\u00102\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R(\u00105\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R$\u00108\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006G"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/CircleAnnotation;", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "Lcom/mapbox/geojson/Point;", "id", "", "annotationManager", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationManager;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/Point;)V", "value", "", "circleBlur", "getCircleBlur", "()Ljava/lang/Double;", "setCircleBlur", "(Ljava/lang/Double;)V", "", "circleColorInt", "getCircleColorInt", "()Ljava/lang/Integer;", "setCircleColorInt", "(Ljava/lang/Integer;)V", "circleColorString", "getCircleColorString", "()Ljava/lang/String;", "setCircleColorString", "(Ljava/lang/String;)V", "circleColorUseTheme", "getCircleColorUseTheme", "setCircleColorUseTheme", "circleOpacity", "getCircleOpacity", "setCircleOpacity", "circleRadius", "getCircleRadius", "setCircleRadius", "circleSortKey", "getCircleSortKey", "setCircleSortKey", "circleStrokeColorInt", "getCircleStrokeColorInt", "setCircleStrokeColorInt", "circleStrokeColorString", "getCircleStrokeColorString", "setCircleStrokeColorString", "circleStrokeColorUseTheme", "getCircleStrokeColorUseTheme", "setCircleStrokeColorUseTheme", "circleStrokeOpacity", "getCircleStrokeOpacity", "setCircleStrokeOpacity", "circleStrokeWidth", "getCircleStrokeWidth", "setCircleStrokeWidth", "point", "getPoint", "()Lcom/mapbox/geojson/Point;", "setPoint", "(Lcom/mapbox/geojson/Point;)V", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setUsedDataDrivenProperties", "", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CircleAnnotation extends Annotation<Point> {

    @NotNull
    public static final String ID_KEY = "CircleAnnotation";

    @NotNull
    private final AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?> annotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleAnnotation(@NotNull String str, @NotNull AnnotationManager<Point, CircleAnnotation, ?, ?, ?, ?, ?> annotationManager, @NotNull JsonObject jsonObject, @NotNull Point point) {
        super(str, jsonObject, point);
        str.getClass();
        annotationManager.getClass();
        jsonObject.getClass();
        point.getClass();
        this.annotationManager = annotationManager;
        jsonObject.addProperty(ID_KEY, str);
    }

    @Nullable
    public final Double getCircleBlur() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getCircleColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getCircleColorString() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getCircleColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getCircleOpacity() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getCircleRadius() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getCircleSortKey() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getCircleStrokeColorInt() {
        Integer m;
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        if (jsonElement == null || (m = RecordTag.m(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    @Nullable
    public final String getCircleStrokeColorString() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final String getCircleStrokeColorUseTheme() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    @Nullable
    public final Double getCircleStrokeOpacity() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Nullable
    public final Double getCircleStrokeWidth() {
        JsonElement jsonElement = getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        if (jsonElement != null) {
            return RecordTag.m(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @Nullable
    public Point getOffsetGeometry(@NotNull MapCameraManagerDelegate mapCameraManagerDelegate, @NotNull MoveDistancesObject moveDistancesObject) {
        mapCameraManagerDelegate.getClass();
        moveDistancesObject.getClass();
        Point coordinateForPixel = mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(moveDistancesObject.getCurrentX(), moveDistancesObject.getCurrentY()));
        if (coordinateForPixel.latitude() > 85.05112877980659d || coordinateForPixel.latitude() < -85.05112877980659d) {
            return null;
        }
        return coordinateForPixel;
    }

    @NotNull
    public final Point getPoint() {
        return getGeometry();
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    @NotNull
    public AnnotationType getType() {
        return AnnotationType.CircleAnnotation;
    }

    public final void setCircleBlur(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        }
    }

    public final void setCircleColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
    }

    public final void setCircleColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
    }

    public final void setCircleColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        }
    }

    public final void setCircleOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        }
    }

    public final void setCircleRadius(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        }
    }

    public final void setCircleSortKey(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        }
    }

    public final void setCircleStrokeColorInt(@ColorInt @Nullable Integer num) {
        if (num == null) {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        } else {
            RecordTag.m(num, ColorUtils.INSTANCE, getJsonObject(), CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
    }

    public final void setCircleStrokeColorString(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
    }

    public final void setCircleStrokeColorUseTheme(@Nullable String str) {
        if (str != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME, str);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        }
    }

    public final void setCircleStrokeOpacity(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        }
    }

    public final void setCircleStrokeWidth(@Nullable Double d) {
        if (d != null) {
            getJsonObject().addProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH, d);
        } else {
            getJsonObject().remove(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        }
    }

    public final void setPoint(@NotNull Point point) {
        point.getClass();
        setGeometry(point);
    }

    @Override // com.mapbox.maps.plugin.annotation.Annotation
    public void setUsedDataDrivenProperties() {
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_SORT_KEY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_BLUR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_OPACITY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_RADIUS);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_OPACITY);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_WIDTH);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_COLOR_USE_THEME);
        }
        if (getJsonObject().get(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME) != null) {
            this.annotationManager.enableDataDrivenProperty(CircleAnnotationOptions.PROPERTY_CIRCLE_STROKE_COLOR_USE_THEME);
        }
    }
}
