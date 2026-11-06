package com.amazon.alexa.client.alexaservice;

import android.os.IBinder;
import com.amazon.alexa.api.AlexaUserSpeechProvider;
import com.amazon.alexa.api.AlexaUserSpeechProviderMessageSender;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.base.application.ipc.MessageReceiverAuthority;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaUserSpeechProviderFactory {
    private final MessageReceiverAuthority messageReceiverAuthority;

    @Inject
    public AlexaUserSpeechProviderFactory(MessageReceiverAuthority messageReceiverAuthority) {
        this.messageReceiverAuthority = messageReceiverAuthority;
    }

    public AlexaUserSpeechProvider createAlexaUserSpeechProvider(IBinder iBinder, ExtendedClient extendedClient) {
        return new AlexaUserSpeechProviderMessageSender(iBinder, extendedClient, this.messageReceiverAuthority.getReceiversManagerForClient(extendedClient));
    }
}
