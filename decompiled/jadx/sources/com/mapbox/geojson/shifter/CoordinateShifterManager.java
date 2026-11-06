package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CoordinateShifterManager {
    private static final CoordinateShifter DEFAULT;
    private static volatile CoordinateShifter coordinateShifter;

    static {
        CoordinateShifter coordinateShifter2 = new CoordinateShifter() { // from class: com.mapbox.geojson.shifter.CoordinateShifterManager.1
            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public double[] shift(double d, double d2, double d3) {
                return Double.isNaN(d3) ? shift(d, d2) : new double[]{d, d2, d3};
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLat(double d, double d2) {
                return Arrays.asList(Double.valueOf(d), Double.valueOf(d2));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLatAlt(double d, double d2, double d3) {
                return Double.isNaN(d3) ? Arrays.asList(Double.valueOf(d), Double.valueOf(d2)) : Arrays.asList(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(Point point) {
                return point.coordinates();
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(List<Double> list) {
                return list;
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public double[] unshiftPointArray(double[] dArr) {
                return dArr;
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public double[] shift(double d, double d2) {
                return new double[]{d, d2};
            }
        };
        DEFAULT = coordinateShifter2;
        coordinateShifter = coordinateShifter2;
    }

    public static CoordinateShifter getCoordinateShifter() {
        return coordinateShifter;
    }

    public static boolean isUsingDefaultShifter() {
        return coordinateShifter == DEFAULT;
    }

    public static void setCoordinateShifter(CoordinateShifter coordinateShifter2) {
        if (coordinateShifter2 == null) {
            coordinateShifter2 = DEFAULT;
        }
        coordinateShifter = coordinateShifter2;
    }
}
