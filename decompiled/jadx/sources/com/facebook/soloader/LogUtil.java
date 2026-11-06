package com.facebook.soloader;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class LogUtil {
    private LogUtil() {
    }

    public static void d(String str, String str2, Throwable th) {
        isLoggable(str, 3);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    private static boolean isLoggable(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static void v(String str, String str2, Throwable th) {
        isLoggable(str, 2);
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void w(String str, String str2) {
        Log.w(str, str2);
    }

    public static void d(String str, String str2) {
        isLoggable(str, 3);
    }

    public static void v(String str, String str2) {
        isLoggable(str, 2);
    }

    public static void i(String str, String str2) {
        if (isLoggable(str, 4)) {
            Log.i(str, str2);
        }
    }
}
