package com.amazonaws.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Collection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ValidationUtils {
    public static void assertAllAreNull(String str, Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }

    public static int assertIsPositive(int i, String str) {
        if (i > 0) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " must be positive"));
        return 0;
    }

    public static <T extends Collection<?>> T assertNotEmpty(T t, String str) {
        assertNotNull(t, str);
        if (!t.isEmpty()) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be empty"));
        return null;
    }

    public static <T> T assertNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be null"));
        return null;
    }

    public static void assertParameterNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static String assertStringNotEmpty(String str, String str2) {
        assertNotNull(str, str2);
        if (!str.isEmpty()) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str2, " cannot be empty"));
        return null;
    }

    public static <T> T[] assertNotEmpty(T[] tArr, String str) {
        assertNotNull(tArr, str);
        if (tArr.length != 0) {
            return tArr;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be empty"));
        return null;
    }
}
