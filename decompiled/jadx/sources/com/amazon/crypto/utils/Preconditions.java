package com.amazon.crypto.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Preconditions {
    private Preconditions() {
        UtilityInstanceAttempt.in(this);
    }

    public static void isTrue(@NonNull boolean... zArr) {
        for (boolean z : zArr) {
            if (!z) {
                Single$$ExternalSyntheticBUOutline0.m$3("Condition(s) not met.");
                return;
            }
        }
    }

    public static void notBlank(@Nullable String... strArr) {
        if (strArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null or blank argument(s) provided.");
            return;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                Single$$ExternalSyntheticBUOutline0.m$3("Null or blank argument(s) provided.");
                return;
            }
        }
    }

    public static void notNull(@Nullable Object... objArr) {
        if (objArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null arguments provided. Precondition failed.");
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Null arguments provided. Precondition failed.");
                return;
            }
        }
    }
}
