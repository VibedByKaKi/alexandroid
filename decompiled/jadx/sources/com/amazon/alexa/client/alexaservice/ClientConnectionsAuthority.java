package com.amazon.alexa.client.alexaservice;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ClientConnectionsAuthority {
    private static final Set<Class<?>> REQUIRED_LISTENERS = Collections.unmodifiableSet(new HashSet());
    private static final String TAG = "ClientConnectionsAuthority";
    private final AlexaClientEventBus eventBus;
    private final Map<ExtendedClient, ClientState> activeClients = new HashMap();
    private final Map<ExtendedClient, Set<Class<?>>> registeredListeners = new HashMap();
    private final Set<ExtendedClient> clientsRequiringForeground = new HashSet();
    private final Set<ExtendedClient> clientsThatAllowBackgroundActivityStarts = new HashSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ClientState {
        CONNECTING,
        LACKING_REQUIRED_LISTENERS,
        CONNECTED
    }

    @Inject
    public ClientConnectionsAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    private int sizeOfConnectedClients() {
        return currentlyActiveClients().size();
    }

    public synchronized Set<ExtendedClient> clearAllClients() {
        HashSet hashSet;
        this.registeredListeners.clear();
        hashSet = new HashSet(this.activeClients.keySet());
        this.activeClients.clear();
        this.clientsRequiringForeground.clear();
        this.clientsThatAllowBackgroundActivityStarts.clear();
        this.eventBus.post(ClientConnectionDisconnectedEvent.create(sizeOfConnectedClients()));
        return hashSet;
    }

    public synchronized void clientConnecting(ExtendedClient extendedClient) {
        extendedClient.getId();
        this.activeClients.put(extendedClient, ClientState.CONNECTING);
        this.registeredListeners.put(extendedClient, new HashSet());
        this.eventBus.post(ClientConnectionConnectedEvent.create(this.activeClients.size(), extendedClient));
    }

    public synchronized void clientDeregisteredListener(ExtendedClient extendedClient, Class<?> cls) {
        if (this.registeredListeners.get(extendedClient) == null) {
            return;
        }
        this.registeredListeners.get(extendedClient).remove(cls);
        this.activeClients.put(extendedClient, ClientState.LACKING_REQUIRED_LISTENERS);
    }

    public synchronized void clientDisconnected(@Nullable ExtendedClient extendedClient) {
        if (extendedClient == null) {
            return;
        }
        extendedClient.getId();
        this.registeredListeners.remove(extendedClient);
        this.clientsRequiringForeground.remove(extendedClient);
        this.clientsThatAllowBackgroundActivityStarts.remove(extendedClient);
        if (this.activeClients.containsKey(extendedClient)) {
            this.activeClients.remove(extendedClient);
            this.eventBus.post(ClientConnectionDisconnectedEvent.create(sizeOfConnectedClients()));
        }
    }

    public synchronized void clientRegisteredListener(ExtendedClient extendedClient, Class<?> cls) {
        try {
            if (this.registeredListeners.get(extendedClient) == null) {
                return;
            }
            this.registeredListeners.get(extendedClient).add(cls);
            this.activeClients.put(extendedClient, this.registeredListeners.get(extendedClient).containsAll(REQUIRED_LISTENERS) ? ClientState.CONNECTED : ClientState.LACKING_REQUIRED_LISTENERS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Set<ExtendedClient> clientsRequiringForeground() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (ExtendedClient extendedClient : this.clientsRequiringForeground) {
            if (this.activeClients.containsKey(extendedClient)) {
                hashSet.add(extendedClient);
            }
        }
        return hashSet;
    }

    public synchronized Set<ExtendedClient> currentlyActiveClients() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (Map.Entry<ExtendedClient, ClientState> entry : this.activeClients.entrySet()) {
            if (ClientState.CONNECTED.equals(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public synchronized Set<ExtendedClient> currentlyInactiveClients() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (Map.Entry<ExtendedClient, ClientState> entry : this.activeClients.entrySet()) {
            if (!ClientState.CONNECTED.equals(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public synchronized boolean hasClientsRequiringForeground() {
        Iterator<ExtendedClient> it2 = this.clientsRequiringForeground.iterator();
        while (it2.hasNext()) {
            if (this.activeClients.containsKey(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean hasClientsThatAllowBackgroundActivityStarts() {
        Iterator<ExtendedClient> it2 = this.clientsThatAllowBackgroundActivityStarts.iterator();
        while (it2.hasNext()) {
            if (this.activeClients.containsKey(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean hasConnectedClients() {
        return !this.activeClients.isEmpty();
    }

    public synchronized boolean isActive(ExtendedClient extendedClient) {
        return ClientState.CONNECTED.equals(this.activeClients.get(extendedClient));
    }

    public synchronized void setClientAllowsBackgroundActivityStarts(ExtendedClient extendedClient, boolean z) {
        extendedClient.getId();
        if (z) {
            this.clientsThatAllowBackgroundActivityStarts.add(extendedClient);
        }
    }

    public synchronized void setClientKeepAlive(ExtendedClient extendedClient, boolean z) {
        extendedClient.getId();
        if (z) {
            this.clientsRequiringForeground.add(extendedClient);
        }
    }
}
