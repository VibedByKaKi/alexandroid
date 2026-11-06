package com.amazon.rtcmedia.util;

import android.os.Build;
import android.util.Log;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscLogger {
    private static final String BUILD_TYPE_USER = "user";
    private static final String BUILD_TYPE_USERDEBUG = "userdebug";
    private static final int MAX_TAG_LENGTH = 23;
    private static boolean inTest = false;
    private static boolean userBuild = false;
    private static boolean userDebugBuild = false;
    private final String tag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LogLevel {
        Error(6),
        Warning(5),
        Info(4),
        Debug(3),
        Verbose(2);

        int value;

        LogLevel(int i) {
            this.value = i;
        }
    }

    static {
        String str = Build.TYPE;
        if (str == null) {
            inTest = true;
        } else {
            userBuild = str.equals(BUILD_TYPE_USER);
            userDebugBuild = str.equals(BUILD_TYPE_USERDEBUG);
        }
    }

    private RtcscLogger(String str) {
        this.tag = str;
    }

    public static String generateTag(String str, Object obj) {
        String simpleName;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("prefix must be non-null.");
            return null;
        }
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("tagObj must be non-null.");
            return null;
        }
        if (obj instanceof CharSequence) {
            simpleName = obj.toString();
            if (simpleName.equals("")) {
                Single$$ExternalSyntheticBUOutline0.m$3("tagObj cannot be an empty string.");
                return null;
            }
        } else {
            Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
            simpleName = cls.isAnonymousClass() ? cls.getEnclosingClass().getSimpleName() : cls.getSimpleName();
        }
        String concat = str.concat(simpleName);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static RtcscLogger getLogger(Object obj) {
        return new RtcscLogger(generateTag("", obj));
    }

    public static boolean isUserDebugBuild() {
        return userDebugBuild;
    }

    public void d(String str) {
        if (inTest) {
            return;
        }
        isLoggable(LogLevel.Debug);
    }

    public void ds(String str) {
        d(str);
    }

    public void e(String str) {
        if (inTest || !isLoggable(LogLevel.Error)) {
            return;
        }
        Log.e(this.tag, str);
    }

    public String getTag() {
        return this.tag;
    }

    public void i(String str) {
        if (inTest || !isLoggable(LogLevel.Info)) {
            return;
        }
        Log.i(this.tag, str);
    }

    public boolean isLoggable(LogLevel logLevel) {
        if (isUserDebugBuild()) {
            return true;
        }
        return Log.isLoggable(this.tag, logLevel.value);
    }

    public void v(String str) {
        if (inTest) {
            return;
        }
        isLoggable(LogLevel.Verbose);
    }

    public void w(String str) {
        if (inTest || !isLoggable(LogLevel.Warning)) {
            return;
        }
        Log.w(this.tag, str);
    }

    public void d(String str, Throwable th) {
        if (inTest) {
            return;
        }
        isLoggable(LogLevel.Debug);
    }

    public void v(String str, Throwable th) {
        if (inTest) {
            return;
        }
        isLoggable(LogLevel.Verbose);
    }

    public void e(String str, Throwable th) {
        if (inTest || !isLoggable(LogLevel.Error)) {
            return;
        }
        Log.e(this.tag, str, th);
    }

    public void i(String str, Throwable th) {
        if (inTest || !isLoggable(LogLevel.Info)) {
            return;
        }
        Log.i(this.tag, str, th);
    }

    public void w(String str, Throwable th) {
        if (inTest || !isLoggable(LogLevel.Warning)) {
            return;
        }
        Log.w(this.tag, str, th);
    }
}
