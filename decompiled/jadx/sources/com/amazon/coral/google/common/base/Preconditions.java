package com.amazon.coral.google.common.base;

import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import javax.annotation.CheckForNull;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(26, i2, "negative size: "));
        return null;
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(26, i2, "negative size: "));
        return null;
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? badPositionIndex(i, i3, "start index") : (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void checkArgument(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        XML$$ExternalSyntheticBUOutline0.m(badElementIndex(i, i2, str));
        return 0;
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c, char c2) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Character.valueOf(c), Character.valueOf(c2)));
        return null;
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i, int i2, String str) {
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

    public static void checkState(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static void checkArgument(boolean z, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m7666m(obj);
    }

    public static void checkState(boolean z, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Fragment$$ExternalSyntheticBUOutline0.m7725m(obj);
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, objArr));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, @CheckForNull String str, @CheckForNull Object... objArr) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, objArr));
    }

    public static void checkArgument(boolean z, String str, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Character.valueOf(c)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object... objArr) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, objArr));
        return null;
    }

    public static void checkState(boolean z, String str, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Integer.valueOf(i)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Long.valueOf(j)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj));
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj));
        return null;
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    public static void checkArgument(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Character.valueOf(c), Long.valueOf(j)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c, int i) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Character.valueOf(c), Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, char c, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Character.valueOf(c), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c, long j) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Character.valueOf(c), Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, char c, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Character.valueOf(c), obj));
    }

    public static void checkArgument(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Character.valueOf(c), obj));
        return null;
    }

    public static void checkState(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i, char c) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Integer.valueOf(i), Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void checkArgument(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i, int i2) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, int i, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Integer.valueOf(i), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i, long j) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Integer.valueOf(i), Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Integer.valueOf(i), obj));
    }

    public static void checkArgument(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Long.valueOf(j), Character.valueOf(c)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Integer.valueOf(i), obj));
        return null;
    }

    public static void checkState(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j, char c) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Long.valueOf(j), Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j, int i) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Long.valueOf(j), Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void checkArgument(boolean z, String str, long j, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, Long.valueOf(j), obj));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j, long j2) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Long.valueOf(j), Long.valueOf(j2)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, Long.valueOf(j), obj));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, Character.valueOf(c)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, Long.valueOf(j), obj));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, char c) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, Integer.valueOf(i)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, char c) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, int i) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, Long.valueOf(j)));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, int i) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, long j) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, obj2));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, long j) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, obj2));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkArgument(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, obj2, obj3));
        return null;
    }

    public static void checkState(boolean z, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        return null;
    }
}
