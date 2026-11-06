package com.amazon.alexa.assistant.foundation.logging;

import android.util.Log;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/logging/DefaultLogger;", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "minLevel", "Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;)V", "verbose", "", "tag", "", "message", "throwable", "", BuildConfig.BUILD_TYPE, com.amazon.alexa.mobilytics.event.LogLevel.INFO, com.amazon.alexa.mobilytics.event.LogLevel.WARN, "error", "setMinLogLevel", ModelTransformer.KEY_BATTERY_LEVEL, "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultLogger implements Logger {

    @NotNull
    private LogLevel minLevel;

    public /* synthetic */ DefaultLogger(LogLevel logLevel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LogLevel.VERBOSE : logLevel);
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void debug(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.minLevel.ordinal();
        LogLevel.DEBUG.ordinal();
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void error(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        if (this.minLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            if (throwable != null) {
                Log.e(tag, message, throwable);
            } else {
                Log.e(tag, message);
            }
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void info(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        if (this.minLevel.ordinal() <= LogLevel.INFO.ordinal()) {
            if (throwable != null) {
                Log.i(tag, message, throwable);
            } else {
                Log.i(tag, message);
            }
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void setMinLogLevel(@NotNull LogLevel level) {
        level.getClass();
        this.minLevel = level;
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void verbose(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.minLevel.ordinal();
        LogLevel.VERBOSE.ordinal();
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void warn(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        if (this.minLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            if (throwable != null) {
                Log.w(tag, message, throwable);
            } else {
                Log.w(tag, message);
            }
        }
    }

    public DefaultLogger(@NotNull LogLevel logLevel) {
        logLevel.getClass();
        this.minLevel = logLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
