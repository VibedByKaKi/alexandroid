package androidx.core.math;

import androidx.collection.SieveCacheKt;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static long addExact(long j, long j2) {
        long j3 = j + j2;
        if ((j >= 0) == (j2 >= 0)) {
            if ((j >= 0) != (j3 >= 0)) {
                Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
                return 0L;
            }
        }
        return j3;
    }

    public static double clamp(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static long decrementExact(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0L;
    }

    public static long incrementExact(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0L;
    }

    public static long multiplyExact(long j, long j2) {
        long j3 = j * j2;
        if (j == 0 || j2 == 0 || (j3 / j == j2 && j3 / j2 == j)) {
            return j3;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0L;
    }

    public static long negateExact(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0L;
    }

    public static long subtractExact(long j, long j2) {
        long j3 = j - j2;
        if ((j < 0) != (j2 < 0)) {
            if ((j < 0) != (j3 < 0)) {
                Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
                return 0L;
            }
        }
        return j3;
    }

    public static int toIntExact(long j) {
        if (j <= SieveCacheKt.NodeLinkMask && j >= SieveCacheKt.NodeMetaAndPreviousMask) {
            return (int) j;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0;
    }

    public static float clamp(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long clamp(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    public static int negateExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0;
    }

    public static int decrementExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0;
    }

    public static int incrementExact(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0;
    }

    public static int multiplyExact(int i, int i2) {
        int i3 = i * i2;
        if (i == 0 || i2 == 0 || (i3 / i == i2 && i3 / i2 == i)) {
            return i3;
        }
        Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
        return 0;
    }

    public static int addExact(int i, int i2) {
        int i3 = i + i2;
        if ((i >= 0) == (i2 >= 0)) {
            if ((i >= 0) != (i3 >= 0)) {
                Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
                return 0;
            }
        }
        return i3;
    }

    public static int subtractExact(int i, int i2) {
        int i3 = i - i2;
        if ((i < 0) != (i2 < 0)) {
            if ((i < 0) != (i3 < 0)) {
                Duration$$ExternalSyntheticBUOutline0.m("integer overflow");
                return 0;
            }
        }
        return i3;
    }
}
