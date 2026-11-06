package org.threeten.bp.jdk8;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class Jdk8Methods {
    private Jdk8Methods() {
    }

    public static int compareInts(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int compareLongs(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static long floorDiv(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static int floorMod(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(BitVector$$ExternalSyntheticOutline0.m(str, " must not be null"));
        return null;
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Addition overflows a long: ", j, " + "), j2);
        return 0L;
    }

    public static long safeMultiply(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Multiplication overflows a long: ", j, " * "), j2);
        return 0L;
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Subtraction overflows a long: ", j, " - "), j2);
        return 0L;
    }

    public static int safeToInt(long j) {
        if (j <= SieveCacheKt.NodeLinkMask && j >= SieveCacheKt.NodeMetaAndPreviousMask) {
            return (int) j;
        }
        Duration$$ExternalSyntheticBUOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(j, "Calculation overflows an int: "));
        return 0;
    }

    public static long floorMod(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static int floorMod(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static int floorDiv(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }

    public static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Value must not be null");
        return null;
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        Duration$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Addition overflows an int: ", i, " + ", i2));
        return 0;
    }

    public static int safeSubtract(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        Duration$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Subtraction overflows an int: ", i, " - ", i2));
        return 0;
    }

    public static long safeMultiply(long j, int i) {
        if (i != -1) {
            if (i == 0) {
                return 0L;
            }
            if (i == 1) {
                return j;
            }
            long j2 = i;
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            XML$$ExternalSyntheticBUOutline0.m(i, j);
        } else {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            XML$$ExternalSyntheticBUOutline0.m(i, j);
        }
        return 0L;
    }

    public static int safeMultiply(int i, int i2) {
        long j = i * i2;
        if (j >= SieveCacheKt.NodeMetaAndPreviousMask && j <= SieveCacheKt.NodeLinkMask) {
            return (int) j;
        }
        Duration$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Multiplication overflows an int: ", i, " * ", i2));
        return 0;
    }
}
