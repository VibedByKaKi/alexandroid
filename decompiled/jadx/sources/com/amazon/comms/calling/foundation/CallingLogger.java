package com.amazon.comms.calling.foundation;

import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.log.CommsLogger;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\u0002¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/foundation/CallingLogger;", "", "<init>", "()V", "getValue", "Lcom/amazon/comms/log/CommsLogger;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingLogger {
    @NotNull
    public final CommsLogger getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        CommsLogger logger = CommsLogger.getLogger(Constants.LOG_TAG, thisRef.getClass().getSimpleName());
        logger.getClass();
        return logger;
    }
}
