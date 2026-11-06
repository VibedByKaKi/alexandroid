package com.amazon.clouddrive.internal;

import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RequestAssertUtils {
    private RequestAssertUtils() {
        throw new UnsupportedOperationException("Do not instantiate.");
    }

    public static <V> void assertNotNull(V v, String str) {
        if (v != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void assertNotNullOrEmpty(String str, String str2) {
        if (str == null || str.equals("")) {
            Single$$ExternalSyntheticBUOutline0.m$3(str2);
        }
    }

    public static void assertPositive(int i, String str) {
        if (i >= 1) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void assertNotNullOrEmpty(List list, String str) {
        if (list == null || list.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }
}
