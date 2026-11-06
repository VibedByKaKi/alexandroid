package com.mapbox.geojson.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d) {
        long j = MAX_DOUBLE_TO_ROUND;
        return (d > ((double) j) || d < ((double) (-j))) ? d : Math.round(d * ROUND_PRECISION) / ROUND_PRECISION;
    }
}
