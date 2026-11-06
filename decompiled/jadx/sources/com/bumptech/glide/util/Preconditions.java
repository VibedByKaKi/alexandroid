package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z, @NonNull String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    @NonNull
    public static String checkNotEmpty(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Must not be null or empty");
        return null;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    public static void checkArgument(boolean z) {
        checkArgument(z, "");
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        return (T) checkNotNull(t, "Argument must not be null");
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T checkNotEmpty(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Must not be empty.");
        return null;
    }
}
