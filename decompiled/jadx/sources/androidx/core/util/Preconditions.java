package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.facebook.hermes.intl.Intl$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes13.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float checkArgumentFinite(float f, String str) {
        if (Float.isNaN(f)) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " must not be NaN"));
            return 0.0f;
        }
        if (!Float.isInfinite(f)) {
            return f;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " must not be infinite"));
        return 0.0f;
    }

    public static int checkArgumentInRange(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return i;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return 0;
    }

    public static int checkFlagsArgument(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        Intl$$ExternalSyntheticBUOutline0.m("Requested flags 0x", Integer.toHexString(i), ", but only 0x", Integer.toHexString(i2), " are allowed");
        return 0;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t, String str, Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }

    public static void checkState(boolean z) {
        checkState(z, null);
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    public static void checkArgument(boolean z, Object obj) {
        if (z) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t, Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
        return null;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static long checkArgumentInRange(long j, long j2, long j3, String str) {
        if (j < j2) {
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is out of range of [");
            sb.append(j2);
            sb.append(", ");
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(j3, "] (too low)", sb));
            return 0L;
        }
        if (j <= j3) {
            return j;
        }
        Locale locale2 = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" is out of range of [");
        sb2.append(j2);
        sb2.append(", ");
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(j3, "] (too high)", sb2));
        return 0L;
    }

    public static float checkArgumentInRange(float f, float f2, float f3, String str) {
        if (f < f2) {
            Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
            return 0.0f;
        }
        if (f <= f3) {
            return f;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        return 0.0f;
    }

    public static double checkArgumentInRange(double d, double d2, double d3, String str) {
        if (d < d2) {
            Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
            return 0.0d;
        }
        if (d <= d3) {
            return d;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        return 0.0d;
    }
}
