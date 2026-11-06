package com.amazon.alexa.api.messages.messagereceiver;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.api.messages.AlexaMessageType;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.api.messages.Messages;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.security.SignatureVerifier;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MessageReceiver<T extends AlexaMessageType> {
    private static final String TAG = "MessageReceiver";
    private final MessageProcessor<T> messageProcessor;
    private final Messenger messenger;
    private final SignatureVerifier signatureVerifier;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressLint({"HandlerLeak"})
    public class MessageHandler extends Handler {
        private final ExceptionReporter exceptionReporter;
        private final HandlerThread handlerThread;

        public MessageHandler(HandlerThread handlerThread, @Nullable ExceptionReporter exceptionReporter) {
            super(handlerThread.getLooper());
            this.handlerThread = handlerThread;
            this.exceptionReporter = exceptionReporter;
            String unused = MessageReceiver.TAG;
            handlerThread.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AlexaMessageType messageType = MessageReceiver.this.messageProcessor.getMessageType(message);
            String unused = MessageReceiver.TAG;
            Objects.toString(Thread.currentThread());
            Objects.toString(messageType);
            try {
                MessageReceiver.this.messageProcessor.processMessage(messageType, Messages.getPayload(message), Messages.getReplyHandlingMessenger(message));
            } catch (Throwable th) {
                Log.e(MessageReceiver.TAG, "Unable to handle message: " + messageType, th);
                ExceptionReporter exceptionReporter = this.exceptionReporter;
                if (exceptionReporter != null) {
                    exceptionReporter.onError(th);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            if (MessageReceiver.this.signatureVerifier != null && !MessageReceiver.this.signatureVerifier.verify(Binder.getCallingUid())) {
                String str = "Signature Verification failed for client UID: " + Binder.getCallingUid() + " and PID: " + Binder.getCallingPid();
                String unused = MessageReceiver.TAG;
                AtomicFile$$ExternalSyntheticBUOutline0.m(str);
                return false;
            }
            AlexaMessageType messageType = MessageReceiver.this.messageProcessor.getMessageType(message);
            if (this.handlerThread.isAlive()) {
                String unused2 = MessageReceiver.TAG;
                Objects.toString(messageType);
                Objects.toString(super.getLooper());
                return super.sendMessageAtTime(message, j);
            }
            Log.w(MessageReceiver.TAG, "HandlerThread " + this.handlerThread.getThreadId() + " is no longer alive. Dropping message: " + messageType);
            MessageReceiver.this.messageProcessor.onMessageDropped(messageType, message);
            return false;
        }
    }

    public MessageReceiver(MessageProcessor<T> messageProcessor, HandlerThread handlerThread, @Nullable SignatureVerifier signatureVerifier, @Nullable ExceptionReporter exceptionReporter) {
        Preconditions.notNull(messageProcessor, "message processor is null");
        Preconditions.notNull(handlerThread, "handler thread is null");
        this.messageProcessor = messageProcessor;
        this.messenger = new Messenger(new MessageHandler(handlerThread, exceptionReporter));
        this.signatureVerifier = signatureVerifier;
    }

    public MessageProcessor<T> getMessageProcessor() {
        return this.messageProcessor;
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public void reply(Messenger messenger, T t, Bundle bundle) throws RemoteException {
        Preconditions.notNull(messenger, "response receiver is null");
        Preconditions.notNull(t, "message type is null");
        Preconditions.notNull(bundle, "payload is null");
        Log.i(TAG, "sending a reply for " + t);
        Messages.sendMessage(messenger, Messages.createMessage(t, bundle));
    }

    public MessageReceiver(MessageProcessor<T> messageProcessor, HandlerThread handlerThread) {
        this(messageProcessor, handlerThread, null, null);
    }
}
