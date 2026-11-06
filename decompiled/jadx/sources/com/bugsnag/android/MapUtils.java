package com.bugsnag.android;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MapUtils {
    public static Integer getInt(Map<String, Object> map, String str) {
        Number number = (Number) getOrNull(map, str);
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    public static Long getLong(Map<String, Object> map, String str) {
        Number number = (Number) getOrNull(map, str);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public static <T> T getOrNull(Map<String, Object> map, String str) {
        T t = (T) map.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public static <T> T getOrThrow(Map<String, Object> map, String str) {
        T t = (T) map.get(str);
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Missing required parameter ", str));
        return null;
    }
}
