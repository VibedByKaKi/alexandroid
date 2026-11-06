package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/Evaluators;", "", "()V", "DOUBLE", "Landroid/animation/TypeEvaluator;", "", "getDOUBLE", "()Landroid/animation/TypeEvaluator;", "POINT", "Lcom/mapbox/geojson/Point;", "getPOINT", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class Evaluators {

    @NotNull
    public static final Evaluators INSTANCE = new Evaluators();

    @NotNull
    private static final TypeEvaluator<Point> POINT = new Evaluators$$ExternalSyntheticLambda0(0);

    @NotNull
    private static final TypeEvaluator<Double> DOUBLE = new Evaluators$$ExternalSyntheticLambda0(2);

    private Evaluators() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double DOUBLE$lambda$1(float f, Double d, Double d2) {
        return Double.valueOf(((d2.doubleValue() - d.doubleValue()) * f) + d.doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point POINT$lambda$0(float f, Point point, Point point2) {
        double d = f;
        double longitude = ((point2.longitude() - point.longitude()) * d) + point.longitude();
        double latitude = ((point2.latitude() - point.latitude()) * d) + point.latitude();
        if (!point.hasAltitude() || !point2.hasAltitude()) {
            return Point.fromLngLat(longitude, latitude);
        }
        return Point.fromLngLat(longitude, latitude, ((point2.altitude() - point.altitude()) * d) + point.altitude());
    }

    @NotNull
    public final TypeEvaluator<Double> getDOUBLE() {
        return DOUBLE;
    }

    @NotNull
    public final TypeEvaluator<Point> getPOINT() {
        return POINT;
    }
}
