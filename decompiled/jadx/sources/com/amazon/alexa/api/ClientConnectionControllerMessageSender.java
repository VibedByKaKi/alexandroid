package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ClientConnectionControllerMessageSender extends AlexaMessageSender<ClientConnectionControllerMessageType> {
    private final ExtendedClient client;

    public ClientConnectionControllerMessageSender(IBinder iBinder, ExtendedClient extendedClient) {
        super(iBinder);
        this.client = extendedClient;
    }

    public void onForceDisconnect() throws RemoteException {
        sendMessage(ClientConnectionControllerMessageType.ON_FORCE_DISCONNECT, new BaseMessagePayload(this.client).getBundle());
    }

    public void onStartService() throws RemoteException {
        sendMessage(ClientConnectionControllerMessageType.ON_START_SERVICE, new BaseMessagePayload(this.client).getBundle());
    }
}
