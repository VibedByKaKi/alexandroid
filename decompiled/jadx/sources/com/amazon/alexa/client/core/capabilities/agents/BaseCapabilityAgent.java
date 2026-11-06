package com.amazon.alexa.client.core.capabilities.agents;

import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.capabilities.MessageBundle;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.MessageIdentifier;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BaseCapabilityAgent implements CapabilityAgent {
    private final Set<Capability> capabilities;
    private final Map<MessageIdentifier, MessageBundle> messages = new HashMap();

    public BaseCapabilityAgent(Capability... capabilityArr) {
        this.capabilities = Collections.unmodifiableSet(new HashSet(Arrays.asList(capabilityArr)));
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void cancel(MessageIdentifier messageIdentifier) {
        MessageBundle remove = this.messages.remove(messageIdentifier);
        if (remove != null) {
            onCancel(remove.getMessage(), remove.getCallbacks());
        }
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public Set<Capability> getCapabilities() {
        return this.capabilities;
    }

    public abstract void onProcess(Message message, MessageProcessingCallbacks messageProcessingCallbacks);

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void preprocess(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        this.messages.put(message.getMessageIdentifier(), MessageBundle.create(message, messageProcessingCallbacks));
        onPreprocess(message, messageProcessingCallbacks);
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public void process(MessageIdentifier messageIdentifier) {
        MessageBundle remove = this.messages.remove(messageIdentifier);
        if (remove != null) {
            onProcess(remove.getMessage(), remove.getCallbacks());
        }
    }

    public void onCancel(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
    }

    public void onPreprocess(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
    }
}
