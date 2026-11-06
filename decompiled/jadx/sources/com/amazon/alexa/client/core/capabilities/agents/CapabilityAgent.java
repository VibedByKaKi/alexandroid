package com.amazon.alexa.client.core.capabilities.agents;

import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.MessageIdentifier;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CapabilityAgent {
    void cancel(MessageIdentifier messageIdentifier);

    Set<Capability> getCapabilities();

    void preprocess(Message message, MessageProcessingCallbacks messageProcessingCallbacks);

    void process(MessageIdentifier messageIdentifier);
}
