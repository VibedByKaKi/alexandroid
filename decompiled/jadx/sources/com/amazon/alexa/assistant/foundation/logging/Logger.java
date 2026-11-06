package com.amazon.alexa.assistant.foundation.logging;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "", "verbose", "", "tag", "", "message", "throwable", "", BuildConfig.BUILD_TYPE, com.amazon.alexa.mobilytics.event.LogLevel.INFO, com.amazon.alexa.mobilytics.event.LogLevel.WARN, "error", "setMinLogLevel", ModelTransformer.KEY_BATTERY_LEVEL, "Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Logger {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void debug$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: debug");
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.debug(str, str2, th);
        }

        public static /* synthetic */ void error$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: error");
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.error(str, str2, th);
        }

        public static /* synthetic */ void info$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: info");
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.info(str, str2, th);
        }

        public static /* synthetic */ void verbose$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: verbose");
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.verbose(str, str2, th);
        }

        public static /* synthetic */ void warn$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: warn");
                return;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            logger.warn(str, str2, th);
        }
    }

    void debug(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void error(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void info(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void setMinLogLevel(@NotNull LogLevel level);

    void verbose(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    void warn(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);
}
