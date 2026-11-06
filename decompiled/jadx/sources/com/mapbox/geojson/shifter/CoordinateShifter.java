package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface CoordinateShifter {
    double[] shift(double d, double d2);

    double[] shift(double d, double d2, double d3);

    List<Double> shiftLonLat(double d, double d2);

    List<Double> shiftLonLatAlt(double d, double d2, double d3);

    List<Double> unshiftPoint(Point point);

    List<Double> unshiftPoint(List<Double> list);

    double[] unshiftPointArray(double[] dArr);
}
