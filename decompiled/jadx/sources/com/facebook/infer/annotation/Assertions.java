package com.facebook.infer.annotation;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Assertions {
    public static void assertCondition(boolean z) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2();
    }

    public static <T> T assertGet(int i, List<T> list) {
        assertCondition(i >= 0 && i < list.size(), "Index not in bound");
        return (T) assertNotNull(list.get(i), "Null value");
    }

    public static <T> T assertNotNull(@Nullable T t, String str) {
        if (t != null) {
            return t;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) str);
        return null;
    }

    public static AssertionError assertUnreachable() {
        throw new AssertionError();
    }

    public static void assumeCondition(boolean z, String str) {
    }

    public static <T> T assumeNotNull(@Nullable T t, String str) {
        return t;
    }

    public static AssertionError assertUnreachable(String str) {
        throw new AssertionError(str);
    }

    public static void assertCondition(boolean z, String str) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) str);
    }

    public static AssertionError assertUnreachable(Exception exc) {
        throw new AssertionError(exc);
    }

    public static <T> T assertNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2();
        return null;
    }

    public static void assumeCondition(boolean z) {
    }

    public static <T> T assumeNotNull(@Nullable T t) {
        return t;
    }

    public static <K, V> V assertGet(K k, Map<K, V> map) {
        assertCondition(map.containsKey(k), "Key not found");
        return (V) assertNotNull(map.get(k), "Null value");
    }

    public static <T> T nullsafeFIXME(@Nullable T t, String str) {
        return t;
    }
}
