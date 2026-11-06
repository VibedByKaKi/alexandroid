package com.amazon.alexa.api;

import android.os.IBinder;
import com.amazon.alexa.client.alexaservice.base.application.ipc.MessageReceiverAuthority;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AlexaVisualTaskFactory {
    private final MessageReceiverAuthority messageReceiverAuthority;

    @Inject
    public AlexaVisualTaskFactory(MessageReceiverAuthority messageReceiverAuthority) {
        this.messageReceiverAuthority = messageReceiverAuthority;
    }

    public AlexaVisualTask createAlexaVisualTask(IBinder iBinder, ExtendedClient extendedClient) {
        return new VisualTaskSender(extendedClient, iBinder, this.messageReceiverAuthority.getReceiversManagerForClient(extendedClient));
    }
}
