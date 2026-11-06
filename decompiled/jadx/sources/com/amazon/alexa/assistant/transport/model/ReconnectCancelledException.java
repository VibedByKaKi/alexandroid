package com.amazon.alexa.assistant.transport.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ReconnectCancelledException;", "Lcom/amazon/alexa/assistant/transport/model/TransportException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReconnectCancelledException extends TransportException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReconnectCancelledException(@NotNull Throwable th) {
        super("In-flight request cancelled by a transport reconnect", th);
        th.getClass();
    }
}
