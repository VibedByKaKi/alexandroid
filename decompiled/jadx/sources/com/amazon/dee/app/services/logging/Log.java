package com.amazon.dee.app.services.logging;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import java.util.Arrays;
import java.util.IllegalFormatException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J9\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJA\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J9\u0010\u001e\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001e\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J9\u0010\u001f\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001f\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J9\u0010 \u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010 \u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J9\u0010!\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010!\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010!\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0007JA\u0010!\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001dJ9\u0010\"\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\"\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010#\u001a\u00020\u0013H\u0007J\b\u0010$\u001a\u00020\u0013H\u0007J\b\u0010%\u001a\u00020\u0013H\u0007J\b\u0010&\u001a\u00020\u0007H\u0007J\b\u0010'\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0007J\u0014\u0010\u0016\u001a\u00020\u00072\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0007J\b\u0010+\u001a\u00020\u0007H\u0007J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0005H\u0007J-\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0019\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u00072\u0006\u00102\u001a\u000203H\u0002J\u000e\u00105\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/amazon/dee/app/services/logging/Log;", "", "<init>", "()V", "STACK_OFFSET", "", "CODE_LINE_FORMAT", "", "ENTER", "THERE", "LEAVE", "LINE_SEPARATOR", "PERIOD", "MAX_TAG_LENGTH", "NOTHING", "NULL_LITERAL", "isRelease", "", "enforceReleaseLogging", "", "resetForTesting", "e", "tag", "message", ElementsRouteKeys.ARGS, "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "tr", "", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "i", "d", "v", "w", "wtf", "enter", "there", "leave", "calledFrom", "line", "value", "classObject", "Ljava/lang/Class;", "getStackTraceString", "traceLimit", "safeFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "safeTag", "getSimpleClassName", "ste", "Ljava/lang/StackTraceElement;", "formatCodeReference", "orNull", "logging"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Log {

    @NotNull
    private static final String CODE_LINE_FORMAT = "(%s:%d)";

    @NotNull
    private static final String ENTER = "Enter-> ";

    @NotNull
    public static final Log INSTANCE = new Log();

    @NotNull
    private static final String LEAVE = "Leave-> ";

    @NotNull
    private static final String LINE_SEPARATOR;
    private static final int MAX_TAG_LENGTH = 23;

    @NotNull
    private static final String NOTHING = "";

    @NotNull
    private static final String NULL_LITERAL = "null";

    @NotNull
    private static final String PERIOD = ".";
    private static final int STACK_OFFSET = 1;

    @NotNull
    private static final String THERE = "There-> ";
    private static volatile boolean isRelease;

    static {
        String lineSeparator = System.lineSeparator();
        lineSeparator.getClass();
        LINE_SEPARATOR = lineSeparator;
    }

    private Log() {
    }

    @JvmStatic
    @NotNull
    public static final String calledFrom() {
        try {
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
            return stackTraceElement.getMethodName() + INSTANCE.formatCodeReference(stackTraceElement);
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    @JvmStatic
    public static final void d(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        if (isRelease) {
            return;
        }
        Log log = INSTANCE;
        log.orNull(tag);
        log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length));
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @NotNull Throwable tr, @Nullable String message, @NotNull Object... args) {
        tr.getClass();
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.e(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)), tr);
    }

    @JvmStatic
    public static final void enforceReleaseLogging() {
        isRelease = true;
    }

    @JvmStatic
    public static final void enter() {
        if (isRelease) {
            return;
        }
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        Log log = INSTANCE;
        stackTraceElement.getClass();
        TableInfo$$ExternalSyntheticOutline0.m8110m(ENTER, stackTraceElement.getMethodName(), log.formatCodeReference(stackTraceElement), log.getSimpleClassName(stackTraceElement));
    }

    private final String formatCodeReference(StackTraceElement ste) {
        return safeFormat(CODE_LINE_FORMAT, ste.getFileName(), Integer.valueOf(ste.getLineNumber()));
    }

    private final String getSimpleClassName(StackTraceElement ste) {
        int lastIndexOf$default;
        String className = ste.getClassName();
        className.getClass();
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(className, ".", 0, false, 6, (Object) null);
        return className.substring(lastIndexOf$default + 1);
    }

    @JvmStatic
    @NotNull
    public static final String getStackTraceString(int traceLimit) {
        if (isRelease) {
            return "";
        }
        StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
        StringBuilder sb = new StringBuilder();
        int min = Math.min(m.length, traceLimit + 1);
        for (int i = 1; i < min; i++) {
            sb.append(m[i].toString());
            sb.append(LINE_SEPARATOR);
        }
        return sb.toString();
    }

    @JvmStatic
    public static final void i(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.i(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)));
    }

    @JvmStatic
    public static final void leave() {
        if (isRelease) {
            return;
        }
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        Log log = INSTANCE;
        stackTraceElement.getClass();
        TableInfo$$ExternalSyntheticOutline0.m8110m(LEAVE, stackTraceElement.getMethodName(), log.formatCodeReference(stackTraceElement), log.getSimpleClassName(stackTraceElement));
    }

    @JvmStatic
    @NotNull
    public static final String line() {
        if (isRelease) {
            return "";
        }
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        Log log = INSTANCE;
        stackTraceElement.getClass();
        return log.formatCodeReference(stackTraceElement);
    }

    private final String orNull(String str) {
        return str == null ? "null" : str;
    }

    @JvmStatic
    @VisibleForTesting
    public static final void resetForTesting() {
        isRelease = false;
    }

    private final String safeFormat(String format, Object... args) {
        if (args.length == 0) {
            return format;
        }
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            return String.format(format, Arrays.copyOf(copyOf, copyOf.length));
        } catch (IllegalFormatException e) {
            e("Log", "bad format: ", e);
            return "Formatting error";
        }
    }

    private final String safeTag(String tag) {
        return tag.length() > 23 ? tag.substring(0, 23) : tag;
    }

    @JvmStatic
    @NotNull
    public static final String tag(@NotNull Class<?> classObject) {
        classObject.getClass();
        return INSTANCE.safeTag(classObject.getSimpleName());
    }

    @JvmStatic
    public static final void there() {
        if (isRelease) {
            return;
        }
        StackTraceElement stackTraceElement = AppLaunchChecker$$ExternalSyntheticOutline0.m()[1];
        Log log = INSTANCE;
        stackTraceElement.getClass();
        TableInfo$$ExternalSyntheticOutline0.m8110m(THERE, stackTraceElement.getMethodName(), log.formatCodeReference(stackTraceElement), log.getSimpleClassName(stackTraceElement));
    }

    @JvmStatic
    public static final void v(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        if (isRelease) {
            return;
        }
        Log log = INSTANCE;
        log.orNull(tag);
        log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length));
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @NotNull Throwable tr, @Nullable String message, @NotNull Object... args) {
        tr.getClass();
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.w(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)), tr);
    }

    @JvmStatic
    public static final void wtf(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.wtf(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)));
    }

    @JvmStatic
    @NotNull
    public static final String tag(@NotNull String value) {
        value.getClass();
        return INSTANCE.safeTag(value);
    }

    @JvmStatic
    public static final void d(@Nullable String tag, @Nullable String message) {
        if (isRelease) {
            return;
        }
        Log log = INSTANCE;
        log.orNull(tag);
        log.orNull(message);
    }

    @JvmStatic
    public static final void v(@Nullable String tag, @Nullable String message) {
        if (isRelease) {
            return;
        }
        Log log = INSTANCE;
        log.orNull(tag);
        log.orNull(message);
    }

    @JvmStatic
    public static final void i(@Nullable String tag, @Nullable String message) {
        Log log = INSTANCE;
        android.util.Log.i(log.orNull(tag), log.orNull(message));
    }

    @JvmStatic
    public static final void wtf(@Nullable String tag, @Nullable String message) {
        Log log = INSTANCE;
        android.util.Log.wtf(log.orNull(tag), log.orNull(message));
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.e(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)));
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @Nullable String message) {
        Log log = INSTANCE;
        android.util.Log.w(log.orNull(tag), log.orNull(message));
    }

    @JvmStatic
    public static final void e(@Nullable String tag, @Nullable String message) {
        Log log = INSTANCE;
        android.util.Log.e(log.orNull(tag), log.orNull(message));
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @NotNull Throwable tr) {
        tr.getClass();
        android.util.Log.w(INSTANCE.orNull(tag), tr);
    }

    @JvmStatic
    public static final void w(@Nullable String tag, @Nullable String message, @NotNull Object... args) {
        args.getClass();
        Log log = INSTANCE;
        android.util.Log.w(log.orNull(tag), log.safeFormat(log.orNull(message), Arrays.copyOf(args, args.length)));
    }

    @JvmStatic
    @NotNull
    public static final String getStackTraceString() {
        if (!isRelease) {
            StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
            StringBuilder sb = new StringBuilder();
            int length = m.length;
            for (int i = 1; i < length; i++) {
                sb.append(m[i].toString());
                sb.append(LINE_SEPARATOR);
            }
            return sb.toString();
        }
        return "";
    }
}
