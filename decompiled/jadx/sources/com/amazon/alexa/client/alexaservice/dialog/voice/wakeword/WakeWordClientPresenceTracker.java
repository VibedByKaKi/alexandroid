package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class WakeWordClientPresenceTracker extends InternalWakeWordPrecondition {
    private final Map<ExtendedClient, ClientWakeWordPrecondition> clientPreconditions = new HashMap();
    private final Object lock = new Object();

    public ClientWakeWordPrecondition addClient(ExtendedClient extendedClient) {
        ClientWakeWordPrecondition clientWakeWordPrecondition;
        synchronized (this.lock) {
            clientWakeWordPrecondition = new ClientWakeWordPrecondition(extendedClient);
            this.clientPreconditions.put(extendedClient, clientWakeWordPrecondition);
        }
        notifyStateChanged();
        return clientWakeWordPrecondition;
    }

    @Nullable
    public ClientWakeWordPrecondition getPreconditionForClient(ExtendedClient extendedClient) {
        ClientWakeWordPrecondition clientWakeWordPrecondition;
        synchronized (this.lock) {
            clientWakeWordPrecondition = this.clientPreconditions.get(extendedClient);
        }
        return clientWakeWordPrecondition;
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public boolean isWakeWordAllowed() {
        boolean z;
        synchronized (this.lock) {
            z = !this.clientPreconditions.isEmpty();
        }
        return z;
    }

    public ClientWakeWordPrecondition removeClient(ExtendedClient extendedClient) {
        ClientWakeWordPrecondition remove;
        synchronized (this.lock) {
            remove = this.clientPreconditions.remove(extendedClient);
        }
        if (remove != null) {
            notifyStateChanged();
        }
        return remove;
    }

    @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
    public void teardown() {
        synchronized (this.lock) {
            this.clientPreconditions.clear();
        }
    }
}
