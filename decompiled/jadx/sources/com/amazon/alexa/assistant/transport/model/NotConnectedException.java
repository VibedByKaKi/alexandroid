package com.amazon.alexa.assistant.transport.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/NotConnectedException;", "Lcom/amazon/alexa/assistant/transport/model/TransportException;", "clientState", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "<init>", "(Lcom/amazon/alexa/assistant/transport/model/ClientState;)V", "getClientState", "()Lcom/amazon/alexa/assistant/transport/model/ClientState;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotConnectedException extends TransportException {

    @NotNull
    private final ClientState clientState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotConnectedException(@NotNull ClientState clientState) {
        super("Cannot send non-queueable event while not connected: " + clientState, null, 2, null);
        clientState.getClass();
        this.clientState = clientState;
    }

    @NotNull
    public final ClientState getClientState() {
        return this.clientState;
    }
}
