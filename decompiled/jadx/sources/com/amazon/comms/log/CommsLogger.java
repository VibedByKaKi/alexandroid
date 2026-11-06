package com.amazon.comms.log;

import android.os.Build;
import android.util.Log;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CommsLogger {
    private static final String BUILD_TYPE_USER = "user";
    private static final String BUILD_TYPE_USERDEBUG = "userdebug";
    private static final int MAX_TAG_LENGTH = 23;
    private static final int SPLIT_BUFFER_SIZE = 4000;
    private static boolean userBuild = false;
    private static boolean userDebugBuild = false;
    private final String tag;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.comms.log.CommsLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$comms$log$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$amazon$comms$log$LogLevel = iArr;
            try {
                iArr[LogLevel.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Verbose.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CommsLoggerFactory {
        CommsLogger getLogger(Object obj);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CommsLoggerFactoryImpl implements CommsLoggerFactory {
        @Override // com.amazon.comms.log.CommsLogger.CommsLoggerFactory
        public CommsLogger getLogger(Object obj) {
            return new CommsLogger(CommsLogger.generateTag("", obj), 0);
        }
    }

    static {
        String str = Build.TYPE;
        if (str != null) {
            userBuild = str.equals(BUILD_TYPE_USER);
            userDebugBuild = str.equals(BUILD_TYPE_USERDEBUG);
        }
    }

    private CommsLogger(String str) {
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
            simpleName = (!cls.isAnonymousClass() || cls.getEnclosingClass() == null) ? cls.getSimpleName() : cls.getEnclosingClass().getSimpleName();
        }
        String concat = str.concat(simpleName);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static CommsLogger getLogger(Object obj) {
        return new CommsLogger(generateTag("", obj));
    }

    public static boolean isDebugBuild() {
        return !userBuild;
    }

    public static boolean isUserDebugBuild() {
        return userDebugBuild;
    }

    public void d(@Nonnull String str, Object... objArr) {
        LogLevel logLevel = LogLevel.Debug;
        if (isLoggable(logLevel)) {
            log(logLevel, String.format(str, objArr));
        }
    }

    public void ds(String str) {
        d(str);
    }

    public void e(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, String.format(str, objArr));
        }
    }

    public String getTag() {
        return this.tag;
    }

    public void i(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, String.format(str, objArr));
        }
    }

    public boolean isLoggable(LogLevel logLevel) {
        if (isUserDebugBuild()) {
            return true;
        }
        return Log.isLoggable(this.tag, logLevel.value);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[LOOP:0: B:1:0x0000->B:17:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void log(com.amazon.comms.log.LogLevel r5, java.lang.String r6) {
        /*
            r4 = this;
        L0:
            r0 = 1
            if (r6 == 0) goto L23
            int r1 = r6.length()
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 <= r2) goto L23
            r1 = 10
            r3 = 3999(0xf9f, float:5.604E-42)
            int r1 = r6.lastIndexOf(r1, r3)
            int r1 = r1 + r0
            if (r1 != 0) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            java.lang.String r1 = r6.substring(r2)
            r3 = 0
            int r2 = r2 - r0
            java.lang.String r6 = r6.substring(r3, r2)
            goto L24
        L23:
            r1 = 0
        L24:
            int[] r2 = com.amazon.comms.log.CommsLogger.AnonymousClass1.$SwitchMap$com$amazon$comms$log$LogLevel
            int r3 = r5.ordinal()
            r2 = r2[r3]
            if (r2 == r0) goto L41
            r0 = 2
            if (r2 == r0) goto L3b
            java.lang.String r0 = r4.tag
            r3 = 3
            if (r2 == r3) goto L37
            goto L46
        L37:
            android.util.Log.i(r0, r6)
            goto L46
        L3b:
            java.lang.String r0 = r4.tag
            android.util.Log.w(r0, r6)
            goto L46
        L41:
            java.lang.String r0 = r4.tag
            android.util.Log.e(r0, r6)
        L46:
            if (r1 != 0) goto L49
            return
        L49:
            r6 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.log.CommsLogger.log(com.amazon.comms.log.LogLevel, java.lang.String):void");
    }

    public String sensitive(String str) {
        return isLoggable(LogLevel.Debug) ? str : "*****";
    }

    public void v(@Nonnull String str, Object... objArr) {
        LogLevel logLevel = LogLevel.Verbose;
        if (isLoggable(logLevel)) {
            log(logLevel, String.format(str, objArr));
        }
    }

    public void w(@Nonnull String str, Object... objArr) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, String.format(str, objArr));
        }
    }

    public /* synthetic */ CommsLogger(String str, int i) {
        this(str);
    }

    public static CommsLogger getLogger(String str, Object obj) {
        return new CommsLogger(generateTag(str, obj));
    }

    public void d(String str) {
        LogLevel logLevel = LogLevel.Debug;
        if (isLoggable(logLevel)) {
            log(logLevel, str);
        }
    }

    public void v(String str) {
        LogLevel logLevel = LogLevel.Verbose;
        if (isLoggable(logLevel)) {
            log(logLevel, str);
        }
    }

    public void d(String str, Throwable th) {
        isLoggable(LogLevel.Debug);
    }

    public void e(String str) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, str);
        }
    }

    public void i(String str) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, str);
        }
    }

    public void v(String str, Throwable th) {
        isLoggable(LogLevel.Verbose);
    }

    public void w(String str) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, str);
        }
    }

    public void e(String str, Throwable th) {
        if (isLoggable(LogLevel.Error)) {
            Log.e(this.tag, str, th);
        }
    }

    public void i(String str, Throwable th) {
        if (isLoggable(LogLevel.Info)) {
            Log.i(this.tag, str, th);
        }
    }

    public void w(String str, Throwable th) {
        if (isLoggable(LogLevel.Warning)) {
            Log.w(this.tag, str, th);
        }
    }

    public String sensitiveCallId(String str) {
        return str;
    }
}
