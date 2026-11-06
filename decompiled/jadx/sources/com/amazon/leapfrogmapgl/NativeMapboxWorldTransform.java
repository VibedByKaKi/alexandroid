package com.amazon.leapfrogmapgl;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMapboxWorldTransform;", "", "<init>", "()V", "model", "", "latitude", "", "longitude", "centerX", "centerY", "bearingDegrees", "zoom", "TILE_SIZE", "EARTH_CIRCUMFERENCE_METERS", "MAX_MERCATOR_LATITUDE", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NativeMapboxWorldTransform {
    private static final double EARTH_CIRCUMFERENCE_METERS = 4.007501668557849E7d;

    @NotNull
    public static final NativeMapboxWorldTransform INSTANCE = new NativeMapboxWorldTransform();
    private static final double MAX_MERCATOR_LATITUDE = 85.0511287798066d;
    private static final double TILE_SIZE = 512.0d;

    private NativeMapboxWorldTransform() {
    }

    @NotNull
    public final double[] model(double latitude, double longitude, double centerX, double centerY, double bearingDegrees, double zoom) {
        double radians = Math.toRadians(RangesKt.coerceIn(latitude, -85.0511287798066d, MAX_MERCATOR_LATITUDE));
        double pow = Math.pow(2.0d, zoom) * TILE_SIZE;
        double cos = (1.0d / (Math.cos(radians) * EARTH_CIRCUMFERENCE_METERS)) * pow;
        double d = ((longitude + 180.0d) / 360.0d) * pow;
        double log = ((1.0d - (Math.log(Math.tan((radians / 2.0d) + 0.7853981633974483d)) / 3.141592653589793d)) / 2.0d) * pow;
        double radians2 = Math.toRadians(bearingDegrees);
        double cos2 = Math.cos(radians2);
        double sin = Math.sin(radians2);
        double d2 = ((centerY * sin) + (centerX * cos2)) * cos;
        double d3 = ((centerX * sin) - (centerY * cos2)) * cos;
        double d4 = sin * cos;
        return new double[]{cos2 * cos, d4, 0.0d, 0.0d, d4, (-cos2) * cos, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, d - d2, log - d3, 0.0d, 1.0d};
    }
}
