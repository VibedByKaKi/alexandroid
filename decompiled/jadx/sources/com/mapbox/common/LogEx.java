package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.accessorykit.ModelTransformer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J&\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J&\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J.\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J&\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J.\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/LogEx;", "", "()V", "logD", "", "throttler", "Lcom/mapbox/common/LogThrottler;", "category", "", "lazyMsg", "Lkotlin/Function0;", "logE", "logI", "logLevelAccepts", "", ModelTransformer.KEY_BATTERY_LEVEL, "Lcom/mapbox/common/LoggingLevel;", "logW", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class LogEx {

    @NotNull
    public static final LogEx INSTANCE = new LogEx();

    private LogEx() {
    }

    public static /* synthetic */ void logD$default(LogEx logEx, LogThrottler logThrottler, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.DEBUG, str) && logThrottler.onLog()) {
            Log.debug((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logE$default(LogEx logEx, LogThrottler logThrottler, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.ERROR, str) && logThrottler.onLog()) {
            Log.error((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logI$default(LogEx logEx, LogThrottler logThrottler, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.INFO, str) && logThrottler.onLog()) {
            Log.info((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logW$default(LogEx logEx, LogThrottler logThrottler, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.WARNING, str) && logThrottler.onLog()) {
            Log.warning((String) function0.invoke(), str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logD(@NotNull LogThrottler throttler, @Nullable String category, @NotNull Function0<String> lazyMsg) {
        throttler.getClass();
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.DEBUG, category) && throttler.onLog()) {
            Log.debug(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logE(@NotNull LogThrottler throttler, @Nullable String category, @NotNull Function0<String> lazyMsg) {
        throttler.getClass();
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.ERROR, category) && throttler.onLog()) {
            Log.error(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logI(@NotNull LogThrottler throttler, @Nullable String category, @NotNull Function0<String> lazyMsg) {
        throttler.getClass();
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.INFO, category) && throttler.onLog()) {
            Log.info(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean logLevelAccepts(@NotNull LoggingLevel level, @Nullable String category) {
        LoggingLevel loggingLevel;
        level.getClass();
        if (category == null || (loggingLevel = LogConfiguration.getLoggingLevel(category)) == null) {
            loggingLevel = LogConfiguration.getLoggingLevel();
        }
        return loggingLevel != null && loggingLevel.compareTo(level) <= 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logW(@NotNull LogThrottler throttler, @Nullable String category, @NotNull Function0<String> lazyMsg) {
        throttler.getClass();
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.WARNING, category) && throttler.onLog()) {
            Log.warning(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logD(@Nullable String category, @NotNull Function0<String> lazyMsg) {
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.DEBUG, category)) {
            Log.debug(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logE(@Nullable String category, @NotNull Function0<String> lazyMsg) {
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.ERROR, category)) {
            Log.error(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logI(@Nullable String category, @NotNull Function0<String> lazyMsg) {
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.INFO, category)) {
            Log.info(lazyMsg.invoke(), category);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void logW(@Nullable String category, @NotNull Function0<String> lazyMsg) {
        lazyMsg.getClass();
        if (logLevelAccepts(LoggingLevel.WARNING, category)) {
            Log.warning(lazyMsg.invoke(), category);
        }
    }

    public static /* synthetic */ void logD$default(LogEx logEx, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.DEBUG, str)) {
            Log.debug((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logE$default(LogEx logEx, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.ERROR, str)) {
            Log.error((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logI$default(LogEx logEx, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.INFO, str)) {
            Log.info((String) function0.invoke(), str);
        }
    }

    public static /* synthetic */ void logW$default(LogEx logEx, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        function0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.WARNING, str)) {
            Log.warning((String) function0.invoke(), str);
        }
    }
}
