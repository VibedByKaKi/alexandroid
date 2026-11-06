package com.amazon.alexa.assistant.foundation.logging;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.assistant.foundation.model.diagnostics.DiagnosticsDelegate;
import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/logging/DiagnosticsDelegateLogger;", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "delegate", "Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/diagnostics/DiagnosticsDelegate;)V", "verbose", "", "tag", "", "message", "throwable", "", BuildConfig.BUILD_TYPE, com.amazon.alexa.mobilytics.event.LogLevel.INFO, com.amazon.alexa.mobilytics.event.LogLevel.WARN, "error", "setMinLogLevel", ModelTransformer.KEY_BATTERY_LEVEL, "Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DiagnosticsDelegateLogger implements Logger {

    @NotNull
    private final DiagnosticsDelegate delegate;

    public DiagnosticsDelegateLogger(@NotNull DiagnosticsDelegate diagnosticsDelegate) {
        diagnosticsDelegate.getClass();
        this.delegate = diagnosticsDelegate;
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void debug(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.delegate.log(LogLevel.DEBUG, tag, message, throwable);
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void error(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.delegate.log(LogLevel.ERROR, tag, message, throwable);
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void info(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.delegate.log(LogLevel.INFO, tag, message, throwable);
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void setMinLogLevel(@NotNull LogLevel level) {
        level.getClass();
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void verbose(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.delegate.log(LogLevel.VERBOSE, tag, message, throwable);
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void warn(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        this.delegate.log(LogLevel.WARN, tag, message, throwable);
    }
}
