package com.amazon.alexa.assistant.foundation.logging;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.devicesetup.softap.listener.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/logging/CompositeLogger;", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "loggers", "", "<init>", "(Ljava/util/List;)V", "verbose", "", "tag", "", "message", "throwable", "", BuildConfig.BUILD_TYPE, com.amazon.alexa.mobilytics.event.LogLevel.INFO, com.amazon.alexa.mobilytics.event.LogLevel.WARN, "error", "setMinLogLevel", ModelTransformer.KEY_BATTERY_LEVEL, "Lcom/amazon/alexa/assistant/foundation/logging/LogLevel;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositeLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeLogger.kt\ncom/amazon/alexa/assistant/foundation/logging/CompositeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1869#2,2:75\n1869#2,2:77\n1869#2,2:79\n1869#2,2:81\n1869#2,2:83\n1869#2,2:85\n*S KotlinDebug\n*F\n+ 1 CompositeLogger.kt\ncom/amazon/alexa/assistant/foundation/logging/CompositeLogger\n*L\n35#1:75,2\n43#1:77,2\n51#1:79,2\n59#1:81,2\n67#1:83,2\n71#1:85,2\n*E\n"})
/* loaded from: classes15.dex */
public final class CompositeLogger implements Logger {

    @NotNull
    private final List<Logger> loggers;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeLogger(@NotNull List<? extends Logger> list) {
        list.getClass();
        this.loggers = list;
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void debug(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).debug(tag, message, throwable);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void error(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).error(tag, message, throwable);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void info(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).info(tag, message, throwable);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void setMinLogLevel(@NotNull LogLevel level) {
        level.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).setMinLogLevel(level);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void verbose(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).verbose(tag, message, throwable);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.logging.Logger
    public void warn(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        tag.getClass();
        message.getClass();
        Iterator<T> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            ((Logger) it2.next()).warn(tag, message, throwable);
        }
    }
}
