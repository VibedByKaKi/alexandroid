package com.amazon.apl.android.utils;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class JNIUtils {
    private static final String TAG = "JNIUtils";
    private static final Charset cs = Charset.forName("CESU-8");

    public static boolean isHandleValid(long j) {
        return j != 0;
    }

    public static String safeStringValues(String str) {
        return str;
    }
}
