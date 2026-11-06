package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.componentstate.ComponentStateHeader;
import com.amazon.alexa.client.core.componentstate.ComponentStateProvider;
import com.amazon.alexa.client.core.messages.Namespace;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class InternalComponentStateProviders {
    private final Map<ComponentStateHeader, ComponentStateProvider> internalComponentStateProviders = new ConcurrentHashMap();

    @Inject
    public InternalComponentStateProviders() {
    }

    private boolean isGeolocationNamespace(Namespace namespace) {
        return AvsApiConstants.Geolocation.NAMESPACE.equals(namespace);
    }

    public void deregister(ComponentStateProvider componentStateProvider) {
        this.internalComponentStateProviders.remove(componentStateProvider.getComponentStateHeader());
    }

    public Set<ComponentState> getStates(boolean z) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<ComponentStateHeader, ComponentStateProvider> entry : this.internalComponentStateProviders.entrySet()) {
            if (z || !isGeolocationNamespace(entry.getKey().getNamespace())) {
                ComponentState state = entry.getValue().getState();
                if (state != null) {
                    hashSet.add(state);
                }
            }
        }
        return hashSet;
    }

    public void register(ComponentStateProvider componentStateProvider) {
        this.internalComponentStateProviders.put(componentStateProvider.getComponentStateHeader(), componentStateProvider);
    }
}
