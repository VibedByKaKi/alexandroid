package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.MediaPlayersAuthority;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.metrics.core.DeviceInformation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ComponentStateAuthority {
    private static final String TAG = "ComponentStateAuthority";
    private final Set<ComponentStateMerger> componentStateMergers;
    private final ConnectedAccessoriesStatusProvider connectedAccessoriesStatusProvider;
    private final DeviceInformation deviceInformation;
    private final ExternalComponentStateAuthority externalComponentStateAuthority;
    private final InternalComponentStateProviders internalComponentStateProviders;
    private final Object lock = new Object();
    private final MediaPlayersAuthority mediaPlayersAuthority;

    public ComponentStateAuthority(ExternalComponentStateAuthority externalComponentStateAuthority, InternalComponentStateProviders internalComponentStateProviders, Set<ComponentStateMerger> set, ConnectedAccessoriesStatusProvider connectedAccessoriesStatusProvider, MediaPlayersAuthority mediaPlayersAuthority, DeviceInformation deviceInformation) {
        this.externalComponentStateAuthority = externalComponentStateAuthority;
        this.internalComponentStateProviders = internalComponentStateProviders;
        this.componentStateMergers = set;
        this.connectedAccessoriesStatusProvider = connectedAccessoriesStatusProvider;
        this.mediaPlayersAuthority = mediaPlayersAuthority;
        this.deviceInformation = deviceInformation;
    }

    public Set<ComponentState> getComponentStates(boolean z) {
        Set<ComponentState> componentStatesAndNothingElse = getComponentStatesAndNothingElse(z);
        Objects.toString(componentStatesAndNothingElse);
        synchronized (this.lock) {
            this.connectedAccessoriesStatusProvider.updateAccessoryConnectionStatus(componentStatesAndNothingElse);
        }
        return componentStatesAndNothingElse;
    }

    public Set<ComponentState> getComponentStatesAndNothingElse(boolean z) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.externalComponentStateAuthority.getStates());
        hashSet.addAll(this.internalComponentStateProviders.getStates(z));
        Iterator<ComponentStateMerger> it2 = this.componentStateMergers.iterator();
        while (it2.hasNext()) {
            it2.next().merge(hashSet);
        }
        return hashSet;
    }

    public Set<ComponentState> getComponentStates() {
        return getComponentStates(false);
    }
}
