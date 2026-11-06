package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.transport.model.ClientState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public /* synthetic */ class ConnectionWaiter$rejectedTokenWait$1 extends FunctionReferenceImpl implements Function1<ClientState, Boolean> {
    public static final ConnectionWaiter$rejectedTokenWait$1 INSTANCE = new ConnectionWaiter$rejectedTokenWait$1();

    public ConnectionWaiter$rejectedTokenWait$1() {
        super(1, ConnectionWaiterKt.class, "isInvalidToken", "isInvalidToken(Lcom/amazon/alexa/assistant/transport/model/ClientState;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ClientState clientState) {
        boolean isInvalidToken;
        clientState.getClass();
        isInvalidToken = ConnectionWaiterKt.isInvalidToken(clientState);
        return Boolean.valueOf(isInvalidToken);
    }
}
