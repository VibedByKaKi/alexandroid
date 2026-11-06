package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaUserSpeechProvider;
import com.amazon.alexa.api.AlexaUserSpeechProviderMetadata;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.base.events.UserSpeechProvidersUpdatedEvent;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.ExternalUserSpeechProvider;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.InternalUserSpeechProvider;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProvider;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class UserSpeechProviderRegistry {
    private static final String TAG = "UserSpeechProviderRegistry";
    private final Map<ExternalUserSpeechProvider, AlexaUserSpeechProvider> alexaUserSpeechProviders;
    private final AlexaClientEventBus eventBus;
    private final ClientListenerContainer<ExternalUserSpeechProvider> externalClientProviders;
    private final Map<AlexaUserSpeechProvider, ExternalUserSpeechProvider> externalProviders;
    private final InternalUserSpeechProvider internalUserSpeechProvider;

    @Inject
    public UserSpeechProviderRegistry(AlexaClientEventBus alexaClientEventBus, InternalUserSpeechProvider internalUserSpeechProvider) {
        this(alexaClientEventBus, internalUserSpeechProvider, new ClientListenerContainer(), new HashMap(), new HashMap());
    }

    public synchronized void deregister(ExtendedClient extendedClient, AlexaUserSpeechProvider alexaUserSpeechProvider) {
        ExternalUserSpeechProvider remove = this.externalProviders.remove(alexaUserSpeechProvider);
        if (remove == null) {
            Log.e(TAG, "Attempted to deregister an invalid UserSpeechProvider. client = " + extendedClient.getId() + ", provider = " + alexaUserSpeechProvider);
            return;
        }
        this.externalClientProviders.remove(remove);
        this.alexaUserSpeechProviders.remove(remove);
        this.eventBus.post(UserSpeechProvidersUpdatedEvent.create());
        Log.i(TAG, "Deregistered UserSpeechProvider for " + extendedClient.getId() + ", provider " + remove);
    }

    @Nullable
    public synchronized AlexaUserSpeechProvider get(UserSpeechProvider userSpeechProvider) {
        if (!(userSpeechProvider instanceof ExternalUserSpeechProvider)) {
            return null;
        }
        return this.alexaUserSpeechProviders.get(userSpeechProvider);
    }

    public synchronized Set<UserSpeechProvider> getAll() {
        LinkedHashSet linkedHashSet;
        linkedHashSet = new LinkedHashSet(this.externalClientProviders.getAllListeners());
        linkedHashSet.add(this.internalUserSpeechProvider);
        return linkedHashSet;
    }

    public synchronized Set<UserSpeechProvider> getExternalUserSpeechProviders() {
        return new LinkedHashSet(this.externalClientProviders.getAllListeners());
    }

    public synchronized InternalUserSpeechProvider getInternalUserSpeechProvider() {
        return this.internalUserSpeechProvider;
    }

    @Subscribe
    public synchronized void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        try {
            Set<ExternalUserSpeechProvider> removeAllClientListeners = this.externalClientProviders.removeAllClientListeners(clientDisconnectedEvent.getClient());
            if (!removeAllClientListeners.isEmpty()) {
                Iterator<ExternalUserSpeechProvider> it2 = removeAllClientListeners.iterator();
                while (it2.hasNext()) {
                    this.externalProviders.remove(this.alexaUserSpeechProviders.remove(it2.next()));
                }
                this.eventBus.post(UserSpeechProvidersUpdatedEvent.create());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void register(ExtendedClient extendedClient, AlexaUserSpeechProvider alexaUserSpeechProvider, AlexaUserSpeechProviderMetadata alexaUserSpeechProviderMetadata) {
        ExternalUserSpeechProvider externalUserSpeechProvider = new ExternalUserSpeechProvider(extendedClient, alexaUserSpeechProvider, alexaUserSpeechProviderMetadata);
        this.externalClientProviders.addListenerForClient(extendedClient, externalUserSpeechProvider);
        this.externalProviders.put(alexaUserSpeechProvider, externalUserSpeechProvider);
        this.alexaUserSpeechProviders.put(externalUserSpeechProvider, alexaUserSpeechProvider);
        this.eventBus.post(UserSpeechProvidersUpdatedEvent.create());
        Log.i(TAG, "Registered UserSpeechProvider for " + extendedClient.getId() + ", provider " + externalUserSpeechProvider);
    }

    @VisibleForTesting
    public UserSpeechProviderRegistry(AlexaClientEventBus alexaClientEventBus, InternalUserSpeechProvider internalUserSpeechProvider, ClientListenerContainer<ExternalUserSpeechProvider> clientListenerContainer, Map<AlexaUserSpeechProvider, ExternalUserSpeechProvider> map, Map<ExternalUserSpeechProvider, AlexaUserSpeechProvider> map2) {
        this.eventBus = alexaClientEventBus;
        this.internalUserSpeechProvider = internalUserSpeechProvider;
        this.externalClientProviders = clientListenerContainer;
        this.externalProviders = map;
        this.alexaUserSpeechProviders = map2;
        alexaClientEventBus.register(this);
    }

    @Nullable
    public synchronized ExternalUserSpeechProvider get(AlexaUserSpeechProvider alexaUserSpeechProvider) {
        return this.externalProviders.get(alexaUserSpeechProvider);
    }
}
