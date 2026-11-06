package com.amazon.alexa.client.alexaservice.networking.message.callbacks;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.networking.adapters.MessageCallbackAdapter;
import com.amazon.alexa.client.core.messages.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MultipleSendMessageCallback extends MessageCallbackAdapter {
    private final List<MessageCallbackAdapter> messageCallbackAdapters;

    public MultipleSendMessageCallback(Collection<MessageCallbackAdapter> collection) {
        this.messageCallbackAdapters = new ArrayList(collection);
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.adapters.MessageCallbackAdapter, com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onFailure(RequestIdentifier requestIdentifier, @Nullable Integer num, @Nullable Exception exc) {
        Iterator<MessageCallbackAdapter> it2 = this.messageCallbackAdapters.iterator();
        while (it2.hasNext()) {
            it2.next().onFailure(requestIdentifier, num, exc);
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.adapters.MessageCallbackAdapter, com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback
    public void onSuccess(RequestIdentifier requestIdentifier, Collection<Message> collection) {
        Iterator<MessageCallbackAdapter> it2 = this.messageCallbackAdapters.iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess(requestIdentifier, collection);
        }
    }

    public MultipleSendMessageCallback(MessageCallbackAdapter... messageCallbackAdapterArr) {
        this(Arrays.asList(messageCallbackAdapterArr));
    }
}
