package com.amazon.alexa.voice.utils;

import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void assertMainThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("It's not running on UI thread.");
    }

    public static void notBlank(String str, String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            if (TextUtils.isEmpty(str2)) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }

    public static <S, T> void notEmpty(String str, Map<S, T> map) {
        if (map != null && map.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void notNull(String str, Object... objArr) {
        if (objArr == null) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }

    public static <T> void notNullOrEmpty(String str, List<T> list) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(BitVector$$ExternalSyntheticOutline0.m(str, " is null"));
        } else if (list.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " is empty"));
        }
    }
}
