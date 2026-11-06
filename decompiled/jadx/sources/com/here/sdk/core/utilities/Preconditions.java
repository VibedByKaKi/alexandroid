package com.here.sdk.core.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Preconditions {
    private Preconditions() {
    }

    @NonNull
    public static <T> T checkArgumentNotNull(@Nullable T t, @Nullable String str) {
        if (t != null) {
            return t;
        }
        if (str == null) {
            str = "NonNull argument is null.";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }
}
