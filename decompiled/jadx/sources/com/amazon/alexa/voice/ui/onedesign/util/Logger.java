package com.amazon.alexa.voice.ui.onedesign.util;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Logger {
    private static final int LOGCAT_LINE_LIMIT = 4000;
    private static final String TAG = "AlexaVoice";
    private static Level level = Level.NONE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Level {
        NONE,
        BASIC,
        VERBOSE,
        DEBUG
    }

    private Logger() {
    }

    public static void debug(String str, byte[] bArr, int i, int i2) {
        if (shouldLog(Level.DEBUG)) {
            StringBuilder sb = new StringBuilder();
            debug(str);
            debug("BINARY DATA BEGIN");
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                sb.append(String.format(Locale.US, "%02x", Integer.valueOf(bArr[i + i5] & 255)));
                i3++;
                if (i3 == 4) {
                    i4++;
                    if (i4 == 12) {
                        debug(sb.toString());
                        sb = new StringBuilder();
                        i3 = 0;
                        i4 = 0;
                    } else {
                        sb.append(' ');
                        i3 = 0;
                    }
                }
            }
            if (sb.length() > 0) {
                debug(sb.toString());
            }
            debug("BINARY DATA END");
        }
    }

    public static void error(String str, Throwable th) {
        log(Level.DEBUG, str, th);
    }

    public static void info(String str, Object... objArr) {
        info(String.format(str, objArr));
    }

    public static boolean isDebug() {
        return level.equals(Level.DEBUG);
    }

    public static void log(Level level2, String str, Throwable th) {
        while (str.length() > 4000) {
            logLine(level2, str.substring(0, 4000), th);
            str = str.substring(4000);
        }
        if (str.length() > 0) {
            logLine(level2, str, th);
        }
    }

    private static void logLine(Level level2, String str, Throwable th) {
        if (shouldLog(level2)) {
            if (level2 == Level.BASIC) {
                Log.i(TAG, str);
            } else {
                if (level2 == Level.VERBOSE || level2 != Level.DEBUG || th == null) {
                    return;
                }
                Log.e(TAG, str, th);
            }
        }
    }

    public static void setLevel(Level level2) {
        level = level2;
    }

    private static boolean shouldLog(Level level2) {
        return level != Level.NONE && level.compareTo(level2) >= 0;
    }

    public static void verbose(String str, Object... objArr) {
        verbose(String.format(str, objArr));
    }

    public static void info(String str) {
        log(Level.BASIC, str);
    }

    public static void verbose(String str) {
        log(Level.VERBOSE, str);
    }

    public static void log(Level level2, String str) {
        log(level2, str, null);
    }

    public static void debug(String str, Object... objArr) {
        debug(String.format(str, objArr));
    }

    public static void debug(String str) {
        log(Level.DEBUG, str);
    }
}
