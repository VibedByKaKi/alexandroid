package com.amazon.alexa.client.alexaservice;

import android.os.IBinder;
import android.os.IInterface;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ClientProxyListenerContainer<T extends IInterface> extends ClientListenerContainer<T> {
    private final Map<IBinder, T> bindersToListeners = new HashMap();
    private final Map<IBinder, ExtendedClient> bindersToClients = new HashMap();

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public void addListenerForClient(ExtendedClient extendedClient, T t) {
        Preconditions.notNull(extendedClient, "client cannot be null");
        Preconditions.notNull(t, "listener cannot be null");
        synchronized (this.lock) {
            super.addListenerForClient(extendedClient, (ExtendedClient) t);
            IBinder asBinder = t.asBinder();
            this.bindersToListeners.put(asBinder, t);
            this.bindersToClients.put(asBinder, extendedClient);
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public void clear() {
        synchronized (this.lock) {
            super.clear();
            this.bindersToClients.clear();
            this.bindersToListeners.clear();
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public boolean containsListener(T t) {
        boolean containsKey;
        Preconditions.notNull(t, "listener cannot be null");
        synchronized (this.lock) {
            containsKey = this.bindersToListeners.containsKey(t.asBinder());
        }
        return containsKey;
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public ExtendedClient getClientForListener(T t) {
        ExtendedClient extendedClient;
        Preconditions.notNull(t, "listener cannot be null");
        synchronized (this.lock) {
            extendedClient = this.bindersToClients.get(t.asBinder());
        }
        return extendedClient;
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public ExtendedClient remove(T t) {
        Preconditions.notNull(t, "listener cannot be null");
        synchronized (this.lock) {
            try {
                IBinder asBinder = t.asBinder();
                T remove = this.bindersToListeners.remove(asBinder);
                this.bindersToClients.remove(asBinder);
                if (remove != null) {
                    return super.remove((ClientProxyListenerContainer<T>) remove);
                }
                return super.remove((ClientProxyListenerContainer<T>) t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.ClientListenerContainer
    public Set<T> removeAllClientListeners(ExtendedClient extendedClient) {
        Set<T> removeAllClientListeners;
        Preconditions.notNull(extendedClient, "client cannot be null");
        synchronized (this.lock) {
            try {
                removeAllClientListeners = super.removeAllClientListeners(extendedClient);
                Iterator<T> it2 = removeAllClientListeners.iterator();
                while (it2.hasNext()) {
                    IBinder asBinder = it2.next().asBinder();
                    this.bindersToListeners.remove(asBinder);
                    this.bindersToClients.remove(asBinder);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return removeAllClientListeners;
    }
}
