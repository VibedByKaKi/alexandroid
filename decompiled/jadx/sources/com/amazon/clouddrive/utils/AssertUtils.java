package com.amazon.clouddrive.utils;

import java.util.Collection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AssertUtils {
    private AssertUtils() {
        throw new UnsupportedOperationException("Do not instantiate.");
    }

    public static <V> void assertNotNull(V v, String str) {
        if (v != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m(str);
    }

    public static void assertNotNullOrEmpty(String str, String str2) {
        if (str == null || str.equals("")) {
            Single$$ExternalSyntheticBUOutline0.m(str2);
        }
    }

    public static <V> void assertNotNullOrEmpty(Collection<V> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m(str);
        }
    }

    public static <V> void assertNotNullOrEmpty(V[] vArr, String str) {
        if (vArr == null || vArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m(str);
        }
    }
}
