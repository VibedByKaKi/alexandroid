package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import dagger.internal.codegen.base.Formatter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    private Log() {
    }

    @Pure
    private static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "\n  ");
        m1m.append(throwableString.replace("\n", "\n  "));
        m1m.append('\n');
        return m1m.toString();
    }

    @Pure
    public static void d(String str, String str2, @Nullable Throwable th) {
        d(str, appendThrowableString(str2, th));
    }

    @Pure
    public static void e(String str, String str2) {
        if (logLevel <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    @Pure
    public static int getLogLevel() {
        return logLevel;
    }

    @Nullable
    @Pure
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        return isCausedByUnknownHostException(th) ? "UnknownHostException (no network)" : !logStackTraces ? th.getMessage() : android.util.Log.getStackTraceString(th).trim().replace(DeviceDatabaseUtils.DELIMITER, Formatter.INDENT);
    }

    @Pure
    public static void i(String str, String str2) {
        if (logLevel <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    @Pure
    private static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void setLogStackTraces(boolean z) {
        logStackTraces = z;
    }

    @Pure
    public static void w(String str, String str2) {
        if (logLevel <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    @Pure
    public boolean getLogStackTraces() {
        return logStackTraces;
    }

    @Pure
    public static void d(String str, String str2) {
    }

    @Pure
    public static void e(String str, String str2, @Nullable Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    @Pure
    public static void i(String str, String str2, @Nullable Throwable th) {
        i(str, appendThrowableString(str2, th));
    }

    @Pure
    public static void w(String str, String str2, @Nullable Throwable th) {
        w(str, appendThrowableString(str2, th));
    }
}
