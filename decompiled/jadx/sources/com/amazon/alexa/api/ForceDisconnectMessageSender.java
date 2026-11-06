package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ForceDisconnectMessageSender extends AlexaMessageSender<ForceDisconnectMessageType> {
    private final ExtendedClient client;

    public ForceDisconnectMessageSender(IBinder iBinder, ExtendedClient extendedClient) {
        super(iBinder);
        this.client = extendedClient;
    }

    public void onForceDisconnect() throws RemoteException {
        sendMessage(ForceDisconnectMessageType.ON_FORCE_DISCONNECT, new BaseMessagePayload(this.client).getBundle());
    }
}
