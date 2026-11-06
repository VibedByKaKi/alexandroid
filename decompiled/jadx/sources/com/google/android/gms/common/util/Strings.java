package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @Nullable
    @KeepForSdk
    public static String emptyToNull(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
