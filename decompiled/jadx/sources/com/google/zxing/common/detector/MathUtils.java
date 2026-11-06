package com.google.zxing.common.detector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MathUtils {
    private MathUtils() {
    }

    public static float distance(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static int round(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static int sum(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static float distance(int i, int i2, int i3, int i4) {
        double d = i - i3;
        double d2 = i2 - i4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }
}
