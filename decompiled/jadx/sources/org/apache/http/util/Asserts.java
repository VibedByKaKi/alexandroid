package org.apache.http.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Asserts {
    public static void check(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void notBlank(CharSequence charSequence, String str) {
        if (TextUtils.isBlank(charSequence)) {
            Single$$ExternalSyntheticBUOutline0.m$2(BitVector$$ExternalSyntheticOutline0.m(str, " is blank"));
        }
    }

    public static void notEmpty(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            Single$$ExternalSyntheticBUOutline0.m$2(BitVector$$ExternalSyntheticOutline0.m(str, " is empty"));
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(BitVector$$ExternalSyntheticOutline0.m(str, " is null"));
    }

    public static void check(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static void check(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        Room$$ExternalSyntheticBUOutline0.m(str, new Object[]{obj});
    }
}
