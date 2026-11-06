package org.apache.http.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Collection;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Args {
    public static void check(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T containsNoBlanks(T t, String str) {
        if (t == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be null"));
            return null;
        }
        if (t.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be empty"));
            return null;
        }
        if (!TextUtils.containsBlanks(t)) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not contain blanks"));
        return null;
    }

    public static <T extends CharSequence> T notBlank(T t, String str) {
        if (t == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be null"));
            return null;
        }
        if (!TextUtils.isBlank(t)) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be blank"));
        return null;
    }

    public static <T extends CharSequence> T notEmpty(T t, String str) {
        if (t == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be null"));
            return null;
        }
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be empty"));
        return null;
    }

    public static long notNegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be negative"));
        return 0L;
    }

    public static <T> T notNull(T t, String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be null"));
        return null;
    }

    public static long positive(long j, String str) {
        if (j > 0) {
            return j;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be negative or zero"));
        return 0L;
    }

    public static void check(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void check(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m(str, new Object[]{obj});
    }

    public static int notNegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be negative"));
        return 0;
    }

    public static int positive(int i, String str) {
        if (i > 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be negative or zero"));
        return 0;
    }

    public static <E, T extends Collection<E>> T notEmpty(T t, String str) {
        if (t != null) {
            if (!t.isEmpty()) {
                return t;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be empty"));
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " may not be null"));
        return null;
    }
}
