package com.amazon.alexa.growthcore.util;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CollectionUtil {
    private CollectionUtil() {
    }

    public static <T> boolean contains(@Nullable T[] tArr, @Nullable T t) {
        if (tArr == null) {
            return false;
        }
        if (t == null) {
            for (T t2 : tArr) {
                if (t2 == null) {
                    return true;
                }
            }
        } else {
            for (T t3 : tArr) {
                if (t3 == t || t.equals(t3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
