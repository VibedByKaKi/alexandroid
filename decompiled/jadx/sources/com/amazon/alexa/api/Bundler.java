package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.messages.AlexaMessageType;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.api.messages.messagereceiver.MessageReceiver;
import com.amazon.alexa.utils.Provider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class Bundler {
    private final Map<MessageProcessor, MessageReceiver> messageReceivers = new HashMap();
    private final Provider<MessageReceiversManager> messageReceiversManagerProvider;

    public Bundler(Provider<MessageReceiversManager> provider) {
        this.messageReceiversManagerProvider = provider;
    }

    public void clear() {
        Iterator<MessageReceiver> it2 = this.messageReceivers.values().iterator();
        while (it2.hasNext()) {
            this.messageReceiversManagerProvider.get().removeMessageReceiver(it2.next());
        }
        this.messageReceivers.clear();
    }

    public abstract Bundle getBundle();

    public <K extends AlexaMessageType> MessageReceiver<K> getMessageReceiver(MessageProcessor<K> messageProcessor) {
        MessageReceiver<K> createMessageReceiver = this.messageReceiversManagerProvider.get().createMessageReceiver(messageProcessor);
        this.messageReceivers.put(messageProcessor, createMessageReceiver);
        return createMessageReceiver;
    }
}
