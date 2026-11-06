package com.amazon.rtcsc.capabilityagent.common.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RtcscLogger {
    public static final int ASSERT = 7;
    private static final String BUILD_TYPE_USER = "user";
    private static final String BUILD_TYPE_USERDEBUG = "userdebug";
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "[RTCSC-CA]";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static boolean userBuild = false;
    private static boolean userDebugBuild = false;

    static {
        String str = Build.TYPE;
        if (str != null) {
            userBuild = str.equals(BUILD_TYPE_USER);
            userDebugBuild = str.equals(BUILD_TYPE_USERDEBUG);
        }
    }

    private RtcscLogger() {
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        if (isLoggable(3)) {
            String.format(str2, objArr);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void e(String str, String str2, Object... objArr) {
        if (isLoggable(6)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.e(TAG, m1m.toString());
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        if (isLoggable(4)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.i(TAG, m1m.toString());
        }
    }

    private static boolean isDebugBuild() {
        return !userBuild;
    }

    public static boolean isLoggable(int i) {
        if (isUserDebugBuild()) {
            return true;
        }
        return Log.isLoggable(TAG, i);
    }

    private static boolean isUserDebugBuild() {
        return userDebugBuild;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void v(String str, String str2, Object... objArr) {
        if (isLoggable(2)) {
            String.format(str2, objArr);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void w(String str, String str2, Object... objArr) {
        if (isLoggable(5)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.w(TAG, m1m.toString());
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(3)) {
            String.format(str2, objArr);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void v(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(2)) {
            String.format(str2, objArr);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void e(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(6)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.e(TAG, m1m.toString(), th);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(4)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.i(TAG, m1m.toString(), th);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void w(String str, Throwable th) {
        if (isLoggable(5)) {
            Log.w(TAG, str, th);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void w(String str, Throwable th, String str2, Object... objArr) {
        if (isLoggable(5)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ": ");
            m1m.append(String.format(str2, objArr));
            Log.w(TAG, m1m.toString(), th);
        }
    }
}
