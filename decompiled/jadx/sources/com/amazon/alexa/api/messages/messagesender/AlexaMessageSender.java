package com.amazon.alexa.api.messages.messagesender;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.messages.AlexaMessageType;
import com.amazon.alexa.api.messages.Messages;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMessageSender<T extends AlexaMessageType> {
    private final Messenger messenger;

    public AlexaMessageSender(IBinder iBinder) {
        Preconditions.notNull(iBinder, "binder is null");
        this.messenger = createMessenger(iBinder);
    }

    public Messenger createMessenger(IBinder iBinder) {
        return new Messenger(iBinder);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AlexaMessageSender) && this.messenger.getBinder().equals(((AlexaMessageSender) obj).messenger.getBinder());
        }
        return true;
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public int hashCode() {
        return Objects.hashCode(this.messenger.getBinder());
    }

    public void sendMessage(T t, Bundle bundle) throws RemoteException {
        Preconditions.notNull(t, "message type is null");
        Preconditions.notNull(bundle, "payload is null");
        Messages.sendMessage(this.messenger, Messages.createMessage(t, bundle));
    }
}
