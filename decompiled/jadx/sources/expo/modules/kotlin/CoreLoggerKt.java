package expo.modules.kotlin;

import expo.modules.core.logging.LogHandlers;
import expo.modules.core.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"logger", "Lexpo/modules/core/logging/Logger;", "getLogger", "()Lexpo/modules/core/logging/Logger;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CoreLoggerKt {

    @NotNull
    private static final Logger logger = new Logger(CollectionsKt.listOf(LogHandlers.INSTANCE.createOSLogHandler("ExpoModulesCore")));

    @NotNull
    public static final Logger getLogger() {
        return logger;
    }
}
