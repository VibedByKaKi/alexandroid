package com.amazon.alexa.accessory.internal.util;

import android.util.Log;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Logger {
    private static final String TAG = "AlexaAccessory";
    private static volatile AccessoriesLogger accessoriesLogger;
    private static Processor currentProcessor;
    private static Level level = Level.valueOf("DEBUG");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Level {
        ERROR,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Processor {
        void process(String str);

        void process(String str, Throwable th);
    }

    static {
        Log.w(TAG, "Logger.level initialy set to " + level);
        accessoriesLogger = new DefaultAccessoriesLogger();
    }

    private Logger() {
        throw new IllegalStateException("No instances!");
    }

    public static void binary(String str, int i) {
        if (shouldLog(Level.VERBOSE)) {
            StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
            m.append(Integer.toBinaryString(i));
            internalProcess(m.toString());
            AccessoriesLogger accessoriesLogger2 = accessoriesLogger;
            StringBuilder m2 = BitVector$$ExternalSyntheticOutline0.m(str);
            m2.append(Integer.toBinaryString(i));
            accessoriesLogger2.v(TAG, m2.toString());
        }
    }

    public static void d(String str, byte[] bArr, int i, int i2) {
        if (shouldLog(Level.DEBUG)) {
            d(StringUtils.safeFormat(Locale.US, "%s (%d bytes)", str, Integer.valueOf(i2)));
        }
    }

    public static void debugWithTag(String str, String str2, Object... objArr) {
        if (shouldLog(Level.DEBUG)) {
            debugWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr));
        }
    }

    public static void e(String str, Throwable th) {
        if (shouldLog(Level.ERROR)) {
            internalProcess(str, th);
            accessoriesLogger.e(TAG, str, th);
        }
    }

    public static void errorWithTag(String str, String str2, Object... objArr) {
        if (shouldLog(Level.ERROR)) {
            errorWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr));
        }
    }

    public static Level getLevel() {
        return level;
    }

    public static Processor getProcessor() {
        return currentProcessor;
    }

    public static void i(String str) {
        if (shouldLog(Level.INFO)) {
            internalProcess(str);
            accessoriesLogger.i(TAG, str);
        }
    }

    public static void infoWithTag(String str, String str2, Object... objArr) {
        if (shouldLog(Level.INFO)) {
            infoWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr));
        }
    }

    private static void internalProcess(String str) {
        Processor processor = currentProcessor;
        if (processor != null) {
            processor.process(str);
        }
    }

    public static void setAccessoriesLogger(AccessoriesLogger accessoriesLogger2) {
        Preconditions.notNull(accessoriesLogger2, "logger");
        accessoriesLogger = accessoriesLogger2;
    }

    public static void setLevel(Level level2) {
        Preconditions.notNull(level2, ModelTransformer.KEY_BATTERY_LEVEL);
        level = level2;
    }

    public static void setProcessor(Processor processor) {
        currentProcessor = processor;
    }

    public static boolean shouldLog(Level level2) {
        return level.ordinal() >= level2.ordinal();
    }

    public static void v(String str, byte[] bArr, int i, int i2) {
        if (shouldLog(Level.VERBOSE)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" (");
            sb.append(i2);
            sb.append(" bytes): ");
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 > 0) {
                    sb.append(' ');
                }
                sb.append(StringUtils.safeFormat(Locale.US, "%02x", Integer.valueOf(bArr[i + i3] & 255)));
            }
            internalProcess(sb.toString());
            accessoriesLogger.v(TAG, sb.toString());
        }
    }

    public static void w(String str) {
        if (shouldLog(Level.INFO)) {
            internalProcess(str);
            accessoriesLogger.w(TAG, str);
        }
    }

    public static void warnWithTag(String str, String str2, Object... objArr) {
        if (shouldLog(Level.INFO)) {
            warnWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr));
        }
    }

    private static void internalProcess(String str, Throwable th) {
        Processor processor = currentProcessor;
        if (processor != null) {
            processor.process(str, th);
        }
    }

    public static void debugWithTag(String str, String str2) {
        if (shouldLog(Level.DEBUG)) {
            internalProcess(str2);
            accessoriesLogger.d(str, str2);
        }
    }

    public static void errorWithTag(String str, String str2) {
        if (shouldLog(Level.ERROR)) {
            internalProcess(str2);
            accessoriesLogger.e(str, str2);
        }
    }

    public static void infoWithTag(String str, String str2) {
        if (shouldLog(Level.INFO)) {
            internalProcess(str2);
            accessoriesLogger.i(str, str2);
        }
    }

    public static void warnWithTag(String str, String str2) {
        if (shouldLog(Level.INFO)) {
            internalProcess(str2);
            accessoriesLogger.w(str, str2);
        }
    }

    public static void e(String str, Throwable th, Object... objArr) {
        if (shouldLog(Level.ERROR)) {
            e(StringUtils.safeFormat(Locale.US, str, objArr), th);
        }
    }

    public static void i(String str, Object... objArr) {
        if (shouldLog(Level.INFO)) {
            i(StringUtils.safeFormat(Locale.US, str, objArr));
        }
    }

    public static void w(String str, Object... objArr) {
        if (shouldLog(Level.INFO)) {
            w(StringUtils.safeFormat(Locale.US, str, objArr));
        }
    }

    public static void debugWithTag(String str, String str2, Throwable th) {
        if (shouldLog(Level.DEBUG)) {
            internalProcess(str2, th);
            accessoriesLogger.d(str, str2, th);
        }
    }

    public static void errorWithTag(String str, String str2, Throwable th) {
        if (shouldLog(Level.ERROR)) {
            internalProcess(str2, th);
            accessoriesLogger.e(str, str2, th);
        }
    }

    public static void i(String str, Throwable th, Object... objArr) {
        if (shouldLog(Level.INFO)) {
            i(StringUtils.safeFormat(Locale.US, str, objArr), th);
        }
    }

    public static void e(String str, Object... objArr) {
        if (shouldLog(Level.ERROR)) {
            e(StringUtils.safeFormat(Locale.US, str, objArr));
        }
    }

    public static void debugWithTag(String str, String str2, Throwable th, Object... objArr) {
        if (shouldLog(Level.DEBUG)) {
            debugWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr), th);
        }
    }

    public static void e(String str) {
        if (shouldLog(Level.ERROR)) {
            internalProcess(str);
            accessoriesLogger.e(TAG, str);
        }
    }

    public static void errorWithTag(String str, String str2, Throwable th, Object... objArr) {
        if (shouldLog(Level.ERROR)) {
            errorWithTag(str, StringUtils.safeFormat(Locale.US, str2, objArr), th);
        }
    }

    public static void i(String str, Throwable th) {
        if (shouldLog(Level.INFO)) {
            internalProcess(str, th);
            accessoriesLogger.i(TAG, str, th);
        }
    }

    public static void d(String str, byte[] bArr) {
        d(str, bArr, 0, bArr.length);
    }

    public static void d(String str, Object... objArr) {
        if (shouldLog(Level.DEBUG)) {
            d(StringUtils.safeFormat(Locale.US, str, objArr));
        }
    }

    public static void d(String str, Throwable th, Object... objArr) {
        if (shouldLog(Level.DEBUG)) {
            d(StringUtils.safeFormat(Locale.US, str, objArr), th);
        }
    }

    public static void d(String str, Throwable th) {
        if (shouldLog(Level.DEBUG)) {
            internalProcess(str, th);
            accessoriesLogger.d(TAG, str, th);
        }
    }

    public static void d(String str) {
        if (shouldLog(Level.DEBUG)) {
            internalProcess(str);
            accessoriesLogger.d(TAG, str);
        }
    }

    public static void v(String str, Object... objArr) {
        if (shouldLog(Level.VERBOSE)) {
            v(StringUtils.safeFormat(Locale.US, str, objArr));
        }
    }

    public static void v(String str, byte[] bArr) {
        v(str, bArr, 0, bArr.length);
    }

    public static void v(String str, Throwable th, Object... objArr) {
        if (shouldLog(Level.VERBOSE)) {
            v(StringUtils.safeFormat(Locale.US, str, objArr), th);
        }
    }

    public static void v(String str, Throwable th) {
        if (shouldLog(Level.VERBOSE)) {
            internalProcess(str, th);
            accessoriesLogger.v(TAG, str, th);
        }
    }

    public static void v(String str) {
        if (shouldLog(Level.VERBOSE)) {
            internalProcess(str);
            accessoriesLogger.v(TAG, str);
        }
    }
}
