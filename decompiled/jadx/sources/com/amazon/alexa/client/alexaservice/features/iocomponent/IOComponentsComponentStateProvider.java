package com.amazon.alexa.client.alexaservice.features.iocomponent;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserSpeechProviderScope;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.features.iocomponent.payload.IOComponentsStatePayload;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.IOComponentsStateProvider;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class IOComponentsComponentStateProvider extends BaseComponentStateProvider {
    private ExtendedClient client;
    private final IOComponentsStateProvider componentsStateProvider;
    private AlexaUserSpeechProviderScope scope;

    @Inject
    public IOComponentsComponentStateProvider(@Nullable IOComponentsStateProvider iOComponentsStateProvider) {
        super(AvsApiConstants.Alexa.IOComponents.NAMESPACE, AvsApiConstants.Alexa.IOComponents.ComponentStates.IOComponentStates.NAME);
        this.componentsStateProvider = iOComponentsStateProvider;
    }

    private ExtendedClient getActiveClient(@Nullable ExtendedClient extendedClient) {
        if (extendedClient == null) {
            return null;
        }
        return extendedClient.getActiveSubClient();
    }

    public void clearActiveClient() {
        this.client = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        Set createIOComponents;
        Set hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        IOComponentsStateProvider iOComponentsStateProvider = this.componentsStateProvider;
        if (iOComponentsStateProvider != null && (createIOComponents = iOComponentsStateProvider.createIOComponents()) != null && !createIOComponents.isEmpty()) {
            hashSet2 = new HashSet(this.componentsStateProvider.createActiveIOComponents(getActiveClient(this.client), this.scope));
            hashSet = createIOComponents;
        }
        return ComponentState.create(getComponentStateHeader(), IOComponentsStatePayload.create(hashSet2, hashSet));
    }

    public void setActiveClient(ExtendedClient extendedClient, @Nullable AlexaUserSpeechProviderScope alexaUserSpeechProviderScope) {
        this.client = extendedClient;
        this.scope = alexaUserSpeechProviderScope;
    }
}
