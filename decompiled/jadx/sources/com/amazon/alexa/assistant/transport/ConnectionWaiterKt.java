package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.transport.model.ClientState;
import com.amazon.alexa.assistant.transport.model.ClientStateError;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"isNoAuthToken", "", "state", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "isInvalidToken", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConnectionWaiterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInvalidToken(ClientState clientState) {
        return (clientState instanceof ClientState.Error) && (((ClientState.Error) clientState).getError() instanceof ClientStateError.InvalidToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNoAuthToken(ClientState clientState) {
        return (clientState instanceof ClientState.Error) && (((ClientState.Error) clientState).getError() instanceof ClientStateError.NoAuthToken);
    }
}
