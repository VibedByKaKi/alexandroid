package com.facebook.yoga;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class YogaConstants {
    public static final float UNDEFINED = Float.NaN;

    public static float getUndefined() {
        return Float.NaN;
    }

    public static boolean isUndefined(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    public static boolean isUndefined(YogaValue yogaValue) {
        return yogaValue.unit == YogaUnit.UNDEFINED;
    }
}
