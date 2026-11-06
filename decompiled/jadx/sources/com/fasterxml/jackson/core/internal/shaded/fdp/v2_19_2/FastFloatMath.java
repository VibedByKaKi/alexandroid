package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import org.openjdk.tools.javac.code.Flags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class FastFloatMath {
    private static final int FLOAT_EXPONENT_BIAS = 127;
    private static final int FLOAT_MAX_EXPONENT_POWER_OF_TEN = 38;
    private static final int FLOAT_MAX_EXPONENT_POWER_OF_TWO = 127;
    private static final int FLOAT_MIN_EXPONENT_POWER_OF_TEN = -45;
    private static final int FLOAT_MIN_EXPONENT_POWER_OF_TWO = -126;
    private static final float[] FLOAT_POWER_OF_TEN = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    private static final int FLOAT_SIGNIFICAND_WIDTH = 24;

    private FastFloatMath() {
    }

    public static float fastScalb(float f, int i) {
        return Float.intBitsToFloat((i + 127) << 23) * f;
    }

    public static float tryDecFloatToFloatTruncated(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (!z2) {
            if (FLOAT_MIN_EXPONENT_POWER_OF_TEN > i || i > 38) {
                return Float.NaN;
            }
            return tryDecToFloatWithFastAlgorithm(z, j, i);
        }
        if (FLOAT_MIN_EXPONENT_POWER_OF_TEN <= i2 && i2 <= 38) {
            float tryDecToFloatWithFastAlgorithm = tryDecToFloatWithFastAlgorithm(z, j, i2);
            float tryDecToFloatWithFastAlgorithm2 = tryDecToFloatWithFastAlgorithm(z, j + 1, i2);
            if (!Float.isNaN(tryDecToFloatWithFastAlgorithm) && tryDecToFloatWithFastAlgorithm2 == tryDecToFloatWithFastAlgorithm) {
                return tryDecToFloatWithFastAlgorithm;
            }
        }
        return Float.NaN;
    }

    public static float tryDecToFloatWithFastAlgorithm(boolean z, long j, int i) {
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f = j;
            float f2 = i < 0 ? f / FLOAT_POWER_OF_TEN[-i] : f * FLOAT_POWER_OF_TEN[i];
            return z ? -f2 : f2;
        }
        long j2 = FastDoubleMath.MANTISSA_64[i + 325];
        long j3 = ((i * 217706) >> 16) + 191;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long unsignedMultiplyHigh = FastIntegerMath.unsignedMultiplyHigh(j << numberOfLeadingZeros, j2);
        long j4 = unsignedMultiplyHigh >>> 63;
        long j5 = unsignedMultiplyHigh >>> ((int) (38 + j4));
        int i2 = numberOfLeadingZeros + ((int) (j4 ^ 1));
        long j6 = unsignedMultiplyHigh & 274877906943L;
        if (j6 != 274877906943L) {
            if (j6 != 0 || (3 & j5) != 1) {
                long j7 = (j5 + 1) >>> 1;
                if (j7 >= 16777216) {
                    i2--;
                    j7 = 8388608;
                }
                long j8 = j7 & (-8388609);
                long j9 = j3 - i2;
                if (j9 >= 1 && j9 <= 254) {
                    return Float.intBitsToFloat((int) (j8 | (j9 << 23) | (z ? Flags.BRIDGE : 0L)));
                }
            }
        }
        return Float.NaN;
    }

    public static float tryHexFloatToFloatTruncated(boolean z, long j, int i, boolean z2, int i2) {
        if (z2) {
            i = i2;
        }
        if (FLOAT_MIN_EXPONENT_POWER_OF_TWO > i || i > 127) {
            return Float.NaN;
        }
        float fastScalb = fastScalb(j + (j < 0 ? 1.8446744E19f : 0.0f), i);
        return z ? -fastScalb : fastScalb;
    }
}
