package com.amazon.alexa.api.messages;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.messages.AlexaMessageType;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class MessageProcessor<T extends AlexaMessageType> {
    private static final String TAG = "MessageProcessor";

    public abstract T getMessageType(Message message);

    public abstract void processMessage(T t, Bundle bundle, @Nullable Messenger messenger) throws RemoteException;

    public void reply(Messenger messenger, T t, Bundle bundle) throws RemoteException {
        Preconditions.notNull(messenger, "response receiver is null");
        Preconditions.notNull(t, "message type is null");
        Preconditions.notNull(bundle, "payload is null");
        Log.i(TAG, "sending a reply for " + t);
        Messages.sendMessage(messenger, Messages.createMessage(t, bundle));
    }

    public void release() {
    }

    public void onMessageDropped(T t, Message message) {
    }
}
