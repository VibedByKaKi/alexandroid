package com.amazon.alexa.client.alexaservice.networking.adapters;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import com.amazon.alexa.client.core.messages.Message;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MessageCallbackAdapter implements SendMessageCallback {
    private static final MessageCallbackAdapter INSTANCE = new MessageCallbackAdapter();

    public static MessageCallbackAdapter getInstance() {
        return INSTANCE;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onRequestFinished(RequestIdentifier requestIdentifier) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onRequestQueued(RequestIdentifier requestIdentifier) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onRequestStarted(RequestIdentifier requestIdentifier) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onMessageReceived(RequestIdentifier requestIdentifier, Message message) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onRequestDropped(RequestIdentifier requestIdentifier, SendMessageCallback.DropReason dropReason) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onSuccess(RequestIdentifier requestIdentifier, Collection<Message> collection) {
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onFailure(RequestIdentifier requestIdentifier, @Nullable Integer num, @Nullable Exception exc) {
    }
}
