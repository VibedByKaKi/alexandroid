package com.amazon.alexa.shortcuts.shortcutscapabilityagent.utils;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.StringUtils;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Log {
    private static final String PKG_TAG = "AlexaShortcutsCapabilityAgent";

    private Log() {
    }

    public static void d(String str, String str2, Object... objArr) {
        d(str, StringUtils.safeFormat(Locale.US, str2, objArr));
    }

    public static void e(String str, String str2) {
        Logger.errorWithTag(PKG_TAG, "%s: %s", str, str2);
    }

    public static void i(String str, String str2) {
        Logger.infoWithTag(PKG_TAG, "%s: %s", str, str2);
    }

    public static void w(String str, String str2) {
        Logger.warnWithTag(PKG_TAG, "%s: %s", str, str2);
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
        Logger.errorWithTag(PKG_TAG, "%s: %s - %s", th, str, str2, th);
    }

    public static void i(String str, String str2, Object... objArr) {
        i(str, StringUtils.safeFormat(Locale.US, str2, objArr));
    }

    public static void w(String str, String str2, Throwable th) {
        Logger.warnWithTag(PKG_TAG, "%s: %s - %s", str, str2, th);
    }

    public static void e(String str, String str2, Object... objArr) {
        e(str, StringUtils.safeFormat(Locale.US, str2, objArr));
    }

    public static void w(String str, String str2, Object... objArr) {
        w(str, StringUtils.safeFormat(Locale.US, str2, objArr));
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        e(str, StringUtils.safeFormat(Locale.US, str2, objArr), th);
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        w(str, StringUtils.safeFormat(Locale.US, str2, objArr), th);
    }
}
