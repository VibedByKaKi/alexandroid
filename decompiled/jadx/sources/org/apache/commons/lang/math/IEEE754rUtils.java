package org.apache.commons.lang.math;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IEEE754rUtils {
    public static double max(double[] dArr) {
        if (dArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Array must not be null");
            return 0.0d;
        }
        if (dArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Array cannot be empty.");
            return 0.0d;
        }
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = max(dArr[i], d);
        }
        return d;
    }

    public static double min(double[] dArr) {
        if (dArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Array must not be null");
            return 0.0d;
        }
        if (dArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Array cannot be empty.");
            return 0.0d;
        }
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = min(dArr[i], d);
        }
        return d;
    }

    public static float max(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    f = max(fArr[i], f);
                }
                return f;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Array cannot be empty.");
            return 0.0f;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Array must not be null");
        return 0.0f;
    }

    public static float min(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    f = min(fArr[i], f);
                }
                return f;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Array cannot be empty.");
            return 0.0f;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The Array must not be null");
        return 0.0f;
    }

    public static double max(double d, double d2, double d3) {
        return max(max(d, d2), d3);
    }

    public static double min(double d, double d2, double d3) {
        return min(min(d, d2), d3);
    }

    public static double max(double d, double d2) {
        return Double.isNaN(d) ? d2 : Double.isNaN(d2) ? d : Math.max(d, d2);
    }

    public static double min(double d, double d2) {
        return Double.isNaN(d) ? d2 : Double.isNaN(d2) ? d : Math.min(d, d2);
    }

    public static float max(float f, float f2, float f3) {
        return max(max(f, f2), f3);
    }

    public static float min(float f, float f2, float f3) {
        return min(min(f, f2), f3);
    }

    public static float max(float f, float f2) {
        return Float.isNaN(f) ? f2 : Float.isNaN(f2) ? f : Math.max(f, f2);
    }

    public static float min(float f, float f2) {
        return Float.isNaN(f) ? f2 : Float.isNaN(f2) ? f : Math.min(f, f2);
    }
}
