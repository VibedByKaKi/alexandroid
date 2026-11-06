package com.amazon.alexa.client.alexaservice.core.capabilities;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent;
import com.amazon.alexa.client.core.messages.Namespace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class CapabilityAgentRegistry<T extends CapabilityAgent> {
    private static final String TAG = "CapabilityAgentRegistry";
    protected final Map<Namespace, Set<T>> capabilityAgents = new ConcurrentHashMap();

    public Set<T> get(@NonNull Namespace namespace) {
        return this.capabilityAgents.get(namespace);
    }

    public Set<T> getCapabilityAgents() {
        HashSet hashSet = new HashSet();
        Iterator<Set<T>> it2 = this.capabilityAgents.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next());
        }
        return hashSet;
    }

    public synchronized Set<Namespace> getRegisteredNamespaces() {
        return this.capabilityAgents.keySet();
    }

    public boolean hasCapabilityAgentForNamespace(@NonNull Namespace namespace) {
        return this.capabilityAgents.containsKey(namespace);
    }
}
