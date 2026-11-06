package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import dagger.internal.codegen.base.Formatter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.aspectj.lang.JoinPoint;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private static int logLevel = 0;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private static Logger logger = Logger.DEFAULT;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            public void d(String str, String str2, @Nullable Throwable th) {
                Log.appendThrowableString(str2, th);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(String str, String str2, @Nullable Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(String str, String str2, @Nullable Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(String str, String str2, @Nullable Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }
        };

        void d(String str, String str2, @Nullable Throwable th);

        void e(String str, String str2, @Nullable Throwable th);

        void i(String str, String str2, @Nullable Throwable th);

        void w(String str, String str2, @Nullable Throwable th);
    }

    private Log() {
    }

    @Pure
    public static String appendThrowableString(String str, @Nullable Throwable th) {
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
    public static void d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @Nullable
    @Pure
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            try {
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th).trim().replace(DeviceDatabaseUtils.DELIMITER, Formatter.INDENT);
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @Pure
    public static void w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
