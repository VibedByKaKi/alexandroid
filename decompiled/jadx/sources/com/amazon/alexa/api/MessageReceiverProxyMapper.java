package com.amazon.alexa.api;

import com.amazon.alexa.api.messages.AlexaMessageType;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.api.messages.messagereceiver.MessageReceiver;
import com.amazon.alexa.utils.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class MessageReceiverProxyMapper<K, T extends AlexaMessageType> extends ManagedAlexaConnectionProxyMapper<K, MessageReceiver<T>> {
    private final Provider<MessageReceiversManager> messageReceiversManager;

    public MessageReceiverProxyMapper(Provider<MessageReceiversManager> provider) {
        this.messageReceiversManager = provider;
    }

    public void clearValue(K k, MessageReceiver<T> messageReceiver) {
        this.messageReceiversManager.get().removeMessageReceiver(messageReceiver);
    }

    public abstract MessageProcessor<T> createMessageProcessor(K k);

    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public MessageReceiver<T> createValueFor(K k) {
        return this.messageReceiversManager.get().createMessageReceiver(createMessageProcessor(k));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public /* bridge */ /* synthetic */ void clearValue(Object obj, Object obj2) {
        clearValue((MessageReceiverProxyMapper<K, T>) obj, (MessageReceiver) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.alexa.api.ManagedAlexaConnectionProxyMapper
    public /* bridge */ /* synthetic */ Object createValueFor(Object obj) {
        return createValueFor((MessageReceiverProxyMapper<K, T>) obj);
    }
}
