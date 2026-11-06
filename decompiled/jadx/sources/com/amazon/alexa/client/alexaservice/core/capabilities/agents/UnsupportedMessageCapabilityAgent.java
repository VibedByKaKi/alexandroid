package com.amazon.alexa.client.alexaservice.core.capabilities.agents;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.base.events.SystemErrorEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent;
import com.amazon.alexa.client.core.messages.Header;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.MessageIdentifier;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class UnsupportedMessageCapabilityAgent implements CapabilityAgent {
    private static final String TAG = "UnsupportedMessageCapabilityAgent";
    private final AlexaClientEventBus eventBus;

    @Inject
    public UnsupportedMessageCapabilityAgent(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public Set<Capability> getCapabilities() {
        return Collections.EMPTY_SET;
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void preprocess(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        String unparsedMessage = message.getMessageMetadata().getUnparsedMessage();
        Header header = message.getHeader();
        Log.e(TAG, a$$ExternalSyntheticOutline0.m("Received an unsupported message: ", header.getName().getValue(), " in ", header.getNamespace().getValue(), " namespace"));
        this.eventBus.post(SystemErrorEvent.createUnsupportedOperation(unparsedMessage));
        messageProcessingCallbacks.onFinished();
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void cancel(MessageIdentifier messageIdentifier) {
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void process(MessageIdentifier messageIdentifier) {
    }
}
