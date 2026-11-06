package org.joda.time.field;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i, int i2, int i3) {
        if (i2 >= i3) {
            Single$$ExternalSyntheticBUOutline0.m$3("MIN > MAX");
            return 0;
        }
        int i4 = (i3 - i2) + 1;
        int i5 = i - i2;
        if (i5 >= 0) {
            return (i5 % i4) + i2;
        }
        int i6 = (-i5) % i4;
        return i6 == 0 ? i2 : (i4 - i6) + i2;
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("The calculation caused an overflow: ", j, " + "), j2);
        return 0L;
    }

    public static long safeDivide(long j, long j2, RoundingMode roundingMode) {
        if (j != Long.MIN_VALUE || j2 != -1) {
            return new BigDecimal(j).divide(new BigDecimal(j2), roundingMode).longValue();
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Multiplication overflows a long: ", j, " / "), j2);
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

    public static int safeMultiplyToInt(long j, long j2) {
        return safeToInt(safeMultiply(j, j2));
    }

    public static int safeNegate(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Integer.MIN_VALUE cannot be negated");
        return 0;
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("The calculation caused an overflow: ", j, " - "), j2);
        return 0L;
    }

    public static int safeToInt(long j) {
        if (SieveCacheKt.NodeMetaAndPreviousMask <= j && j <= SieveCacheKt.NodeLinkMask) {
            return (int) j;
        }
        Duration$$ExternalSyntheticBUOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(j, "Value cannot fit in an int: "));
        return 0;
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static int getWrappedValue(int i, int i2, int i3, int i4) {
        return getWrappedValue(i + i2, i3, i4);
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void verifyValueBounds(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        Duration$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("The calculation caused an overflow: ", i, " + ", i2));
        return 0;
    }

    public static long safeDivide(long j, long j2) {
        if (j == Long.MIN_VALUE && j2 == -1) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Multiplication overflows a long: ", j, " / "), j2);
            return 0L;
        }
        return j / j2;
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
