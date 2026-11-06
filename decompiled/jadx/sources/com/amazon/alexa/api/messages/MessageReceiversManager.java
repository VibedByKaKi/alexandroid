package com.amazon.alexa.api.messages;

import android.os.HandlerThread;
import com.amazon.alexa.api.messages.messagereceiver.ExceptionReporter;
import com.amazon.alexa.api.messages.messagereceiver.MessageReceiver;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.security.SignatureVerifier;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MessageReceiversManager {
    private static final String TAG = "MessageReceiversManager";
    private final ExceptionReporter exceptionReporter;
    private final MessageHandlerManager messageHandlerManager;
    private final Map<HandlerThread, Set<MessageReceiver>> messengers;
    private final SignatureVerifier signatureVerifier;

    public MessageReceiversManager(@Nullable SignatureVerifier signatureVerifier, @Nullable ExceptionReporter exceptionReporter) {
        this(signatureVerifier, exceptionReporter, new MessageHandlerManager(), new HashMap());
    }

    private void storeMessageReceiver(HandlerThread handlerThread, MessageReceiver messageReceiver) {
        if (!this.messengers.containsKey(handlerThread)) {
            this.messengers.put(handlerThread, new HashSet());
        }
        this.messengers.get(handlerThread).add(messageReceiver);
    }

    public synchronized void clear() {
        this.messengers.clear();
        this.messageHandlerManager.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T extends AlexaMessageType> MessageReceiver<T> createMessageReceiver(MessageProcessor<T> messageProcessor) {
        MessageReceiver<T> instantiateMessageReceiver;
        Preconditions.notNull(messageProcessor, "messageProcessor is null");
        HandlerThread handlerThread = this.messageHandlerManager.getHandlerThread(messageProcessor.getClass());
        instantiateMessageReceiver = instantiateMessageReceiver(messageProcessor, handlerThread, this.signatureVerifier, this.exceptionReporter);
        storeMessageReceiver(handlerThread, instantiateMessageReceiver);
        return instantiateMessageReceiver;
    }

    public <T extends AlexaMessageType> MessageReceiver<T> instantiateMessageReceiver(MessageProcessor<T> messageProcessor, HandlerThread handlerThread, @Nullable SignatureVerifier signatureVerifier, @Nullable ExceptionReporter exceptionReporter) {
        Objects.toString(messageProcessor);
        Objects.toString(handlerThread.getLooper());
        return new MessageReceiver<>(messageProcessor, handlerThread, signatureVerifier, exceptionReporter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void removeMessageReceiver(MessageReceiver messageReceiver) {
        Preconditions.notNull(messageReceiver, "message receiver is null");
        Objects.toString(messageReceiver);
        MessageProcessor messageProcessor = messageReceiver.getMessageProcessor();
        HandlerThread handlerThread = this.messageHandlerManager.getHandlerThread(messageProcessor.getClass());
        Set<MessageReceiver> set = this.messengers.get(handlerThread);
        if (set == null) {
            this.messageHandlerManager.releaseHandlerThread(messageProcessor.getClass());
            return;
        }
        set.remove(messageReceiver);
        if (set.isEmpty()) {
            messageReceiver.toString();
            this.messengers.remove(handlerThread);
            this.messageHandlerManager.releaseHandlerThread(messageProcessor.getClass());
        }
    }

    public MessageReceiversManager(@Nullable SignatureVerifier signatureVerifier) {
        this(signatureVerifier, null);
    }

    public MessageReceiversManager() {
        this(null);
    }

    public MessageReceiversManager(@Nullable SignatureVerifier signatureVerifier, @Nullable ExceptionReporter exceptionReporter, MessageHandlerManager messageHandlerManager, Map<HandlerThread, Set<MessageReceiver>> map) {
        this.signatureVerifier = signatureVerifier;
        this.exceptionReporter = exceptionReporter;
        this.messageHandlerManager = messageHandlerManager;
        this.messengers = map;
    }
}
