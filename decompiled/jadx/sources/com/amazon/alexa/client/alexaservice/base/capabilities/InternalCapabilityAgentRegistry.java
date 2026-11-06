package com.amazon.alexa.client.alexaservice.base.capabilities;

import com.amazon.alexa.client.alexaservice.core.capabilities.CapabilityAgentRegistry;
import com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent;
import com.amazon.alexa.client.core.messages.Namespace;
import java.util.HashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class InternalCapabilityAgentRegistry extends CapabilityAgentRegistry<CapabilityAgent> {
    private static final String TAG = "InternalCapabilityAgentRegistry";

    @Inject
    public InternalCapabilityAgentRegistry() {
    }

    public boolean containsNamespace(Namespace namespace) {
        return this.capabilityAgents.containsKey(namespace);
    }

    public void deregister(Namespace namespace) {
        if (this.capabilityAgents.containsKey(namespace)) {
            this.capabilityAgents.remove(namespace);
        } else {
            namespace.getValue();
        }
    }

    public void register(Namespace namespace, CapabilityAgent capabilityAgent) {
        if (containsNamespace(namespace)) {
            Single$$ExternalSyntheticBUOutline0.m$2("Namespace has already been registered for.");
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(capabilityAgent);
        this.capabilityAgents.put(namespace, hashSet);
    }

    public boolean registerIfAbsent(Namespace namespace, CapabilityAgent capabilityAgent) {
        HashSet hashSet = new HashSet();
        hashSet.add(capabilityAgent);
        return this.capabilityAgents.putIfAbsent(namespace, hashSet) == null;
    }
}
