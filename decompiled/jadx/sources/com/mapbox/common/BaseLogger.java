package com.mapbox.common;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mapbox/common/BaseLogger;", "", "()V", "loggerInstance", "Lcom/mapbox/base/common/logger/Logger;", "getLoggerInstance$annotations", "getLoggerInstance", "()Lcom/mapbox/base/common/logger/Logger;", "loggerInstance$delegate", "Lkotlin/Lazy;", com.amazon.alexa.devicesetup.softap.listener.BuildConfig.BUILD_TYPE, "", "tag", "", "message", "error", LogLevel.INFO, "warning", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class BaseLogger {

    @NotNull
    public static final BaseLogger INSTANCE = new BaseLogger();

    /* renamed from: loggerInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy loggerInstance = LazyKt.lazy(new Function0<Logger>() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Logger invoke() {
            return (Logger) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLogger, new Function1<MapboxModuleType, ModuleProviderArgument[]>() { // from class: com.mapbox.common.BaseLogger$loggerInstance$2.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final ModuleProviderArgument[] invoke(@NotNull MapboxModuleType mapboxModuleType) {
                    mapboxModuleType.getClass();
                    return new ModuleProviderArgument[0];
                }
            });
        }
    });

    private BaseLogger() {
    }

    @JvmStatic
    public static final void debug(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.d$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    @JvmStatic
    public static final void error(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.e$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    @JvmStatic
    public static final void info(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.i$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    @JvmStatic
    public static final void warning(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Logger.DefaultImpls.w$default(INSTANCE.getLoggerInstance(), new Tag(tag), new Message(message), null, 4, null);
    }

    @NotNull
    public final Logger getLoggerInstance() {
        return (Logger) loggerInstance.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getLoggerInstance$annotations() {
    }
}
