package com.amazon.alexa.biloba.utils;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class LogUtils {
    private static final String LOG_PREFIX = "CareHub";

    private LogUtils() {
    }

    public static void e(String str, String str2) {
        Log.e(LOG_PREFIX, str + ": " + str2);
    }

    public static void i(String str, String str2) {
        Log.i(LOG_PREFIX, str + ": " + str2);
    }

    public static void w(String str, String str2) {
        Log.w(LOG_PREFIX, str + ": " + str2);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(LOG_PREFIX, str + ": " + str2, th);
    }

    public static void d(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }
}
