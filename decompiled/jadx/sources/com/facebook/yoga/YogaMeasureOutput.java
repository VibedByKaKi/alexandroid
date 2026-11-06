package com.facebook.yoga;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class YogaMeasureOutput {
    public static float getHeight(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static float getWidth(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long make(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long make(int i, int i2) {
        return make(i, i2);
    }
}
