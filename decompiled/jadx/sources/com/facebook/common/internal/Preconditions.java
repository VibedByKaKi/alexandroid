package com.facebook.common.internal;

import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.facebook.infer.annotation.Nullsafe;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i, int i2, @Nullable String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndex(int i, int i2, @Nullable String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? badPositionIndex(i, i3, "start index") : (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void checkArgument(@Nullable Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    public static int checkElementIndex(int i, int i2, @Nullable String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        XML$$ExternalSyntheticBUOutline0.m(badElementIndex(i, i2, str));
        return 0;
    }

    public static <T> T checkNotNull(@Nullable T t, @Nullable Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i, int i2, @Nullable String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        XML$$ExternalSyntheticBUOutline0.m(badPositionIndex(i, i2, str));
        return 0;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            XML$$ExternalSyntheticBUOutline0.m(badPositionIndexes(i, i2, i3));
        }
    }

    public static void checkState(boolean z, @Nullable String str, Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(format(str, objArr));
    }

    public static String format(@Nullable String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    public static void checkState(boolean z, @Nullable Object obj) {
        if (z) {
            return;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    public static void checkArgument(boolean z, @Nullable Object obj) {
        if (z) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
    }

    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    public static void checkArgument(boolean z, @Nullable String str, Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(format(str, objArr));
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static <T> T checkNotNull(@Nullable T t, @Nullable String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(format(str, objArr));
        return null;
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }
}
