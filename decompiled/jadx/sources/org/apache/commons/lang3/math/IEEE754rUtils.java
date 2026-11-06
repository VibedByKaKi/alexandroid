package org.apache.commons.lang3.math;

import java.util.Objects;
import org.apache.commons.lang3.Validate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IEEE754rUtils {
    @Deprecated
    public IEEE754rUtils() {
    }

    public static double max(double... dArr) {
        Objects.requireNonNull(dArr, "array");
        Validate.isTrue(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = max(dArr[i], d);
        }
        return d;
    }

    public static double min(double... dArr) {
        Objects.requireNonNull(dArr, "array");
        Validate.isTrue(dArr.length != 0, "Array cannot be empty.", new Object[0]);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = min(dArr[i], d);
        }
        return d;
    }

    public static double max(double d, double d2) {
        return Double.isNaN(d) ? d2 : Double.isNaN(d2) ? d : Math.max(d, d2);
    }

    public static double min(double d, double d2) {
        return Double.isNaN(d) ? d2 : Double.isNaN(d2) ? d : Math.min(d, d2);
    }

    public static double max(double d, double d2, double d3) {
        return max(max(d, d2), d3);
    }

    public static double min(double d, double d2, double d3) {
        return min(min(d, d2), d3);
    }

    public static float max(float... fArr) {
        Objects.requireNonNull(fArr, "array");
        Validate.isTrue(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = max(fArr[i], f);
        }
        return f;
    }

    public static float min(float... fArr) {
        Objects.requireNonNull(fArr, "array");
        Validate.isTrue(fArr.length != 0, "Array cannot be empty.", new Object[0]);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = min(fArr[i], f);
        }
        return f;
    }

    public static float max(float f, float f2) {
        return Float.isNaN(f) ? f2 : Float.isNaN(f2) ? f : Math.max(f, f2);
    }

    public static float min(float f, float f2) {
        return Float.isNaN(f) ? f2 : Float.isNaN(f2) ? f : Math.min(f, f2);
    }

    public static float max(float f, float f2, float f3) {
        return max(max(f, f2), f3);
    }

    public static float min(float f, float f2, float f3) {
        return min(min(f, f2), f3);
    }
}
