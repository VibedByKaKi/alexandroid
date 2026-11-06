package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.MediaPlayersAuthority;
import com.amazon.alexa.client.alexaservice.features.iocomponent.IOComponentsStateMerger;
import com.amazon.alexa.client.alexaservice.features.iocomponent.TrustedStatesStateMerger;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.metrics.core.DeviceInformation;
import dagger.Module;
import dagger.Provides;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ComponentStateModule {
    static final String NAMESPACES_WITHOUT_CAPABILITIES = "namespaces_without_capabilities";

    @Provides
    @Singleton
    @Named(NAMESPACES_WITHOUT_CAPABILITIES)
    public Set<Namespace> provideNamespacesWithoutCapabilities() {
        return new HashSet<Namespace>() { // from class: com.amazon.alexa.client.alexaservice.base.componentstate.ComponentStateModule.1
            {
                add(AvsApiConstants.AccessoryKit.NAMESPACE);
                add(AvsApiConstants.Alexa.IOComponents.NAMESPACE);
                add(AvsApiConstants.Notifications.NAMESPACE);
                add(AvsApiConstants.NotificationsApp.NAMESPACE);
                add(AvsApiConstants.NavigationManager.NAMESPACE);
            }
        };
    }

    @Provides
    @Singleton
    public ComponentStateAuthority providesComponentStateAuthority(ExternalComponentStateAuthority externalComponentStateAuthority, InternalComponentStateProviders internalComponentStateProviders, IOComponentsStateMerger iOComponentsStateMerger, ConnectedAccessoriesStatusProvider connectedAccessoriesStatusProvider, MediaPlayersAuthority mediaPlayersAuthority, DeviceInformation deviceInformation, TrustedStatesStateMerger trustedStatesStateMerger) {
        HashSet hashSet = new HashSet(2);
        hashSet.add(iOComponentsStateMerger);
        hashSet.add(trustedStatesStateMerger);
        return new ComponentStateAuthority(externalComponentStateAuthority, internalComponentStateProviders, hashSet, connectedAccessoriesStatusProvider, mediaPlayersAuthority, deviceInformation);
    }

    @Provides
    @Singleton
    public ExternalComponentStateDao providesExternalComponentStateDao(SqliteExternalComponentStateDao sqliteExternalComponentStateDao) {
        return sqliteExternalComponentStateDao;
    }
}
