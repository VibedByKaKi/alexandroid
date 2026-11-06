package com.amazon.commsnetworking.util;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TextUtils {
    private static String[] emptyStringArray = new String[0];

    private TextUtils() {
    }

    public static boolean isEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String[] split(String str, String str2) {
        return str.length() == 0 ? emptyStringArray : str.split(str2, -1);
    }
}
