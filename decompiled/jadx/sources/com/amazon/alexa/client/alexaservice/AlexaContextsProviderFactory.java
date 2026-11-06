package com.amazon.alexa.client.alexaservice;

import android.os.IBinder;
import com.amazon.alexa.api.AlexaContextsProvider;
import com.amazon.alexa.api.AlexaContextsProviderMessageSender;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.base.application.ipc.MessageReceiverAuthority;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaContextsProviderFactory {
    private final MessageReceiverAuthority messageReceiverAuthority;

    @Inject
    public AlexaContextsProviderFactory(MessageReceiverAuthority messageReceiverAuthority) {
        this.messageReceiverAuthority = messageReceiverAuthority;
    }

    public AlexaContextsProvider createAlexaContextsProvider(IBinder iBinder, ExtendedClient extendedClient) {
        return new AlexaContextsProviderMessageSender(iBinder, extendedClient, this.messageReceiverAuthority.getReceiversManagerForClient(extendedClient));
    }
}
