package com.amazon.alexa.client.alexaservice.base.application.configuration;

import android.util.Log;
import com.amazon.alexa.api.AlexaConfigurationChangeListener;
import com.amazon.alexa.api.AlexaConfigurationName;
import com.amazon.alexa.api.ConfigurationAvailability;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.base.events.ConfigurationAvailabilityChangeEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ConfigurationAuthority {
    private static final String TAG = "ConfigurationAuthority";
    private final AlexaClientEventBus eventBus;
    private final ClientListenerContainer<AlexaConfigurationChangeListener> configurationChangeListeners = new ClientListenerContainer<>();
    private final Map<AlexaConfigurationChangeListener, EnumSet<AlexaConfigurationName>> listenersConfigurationPreferences = new HashMap();
    private final Map<AlexaConfigurationName, Boolean> latestConfigurationAvailability = new HashMap();

    @Inject
    public ConfigurationAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    private ConfigurationAvailability getCurrentConfigurationAvailability(EnumSet<AlexaConfigurationName> enumSet) {
        EnumSet noneOf = EnumSet.noneOf(AlexaConfigurationName.class);
        EnumSet noneOf2 = EnumSet.noneOf(AlexaConfigurationName.class);
        Iterator<E> it2 = enumSet.iterator();
        while (it2.hasNext()) {
            AlexaConfigurationName alexaConfigurationName = (AlexaConfigurationName) it2.next();
            if (Boolean.TRUE.equals(this.latestConfigurationAvailability.get(alexaConfigurationName))) {
                noneOf.add(alexaConfigurationName);
            } else if (Boolean.FALSE.equals(this.latestConfigurationAvailability.get(alexaConfigurationName))) {
                noneOf2.add(alexaConfigurationName);
            }
        }
        if (noneOf.isEmpty() && noneOf2.isEmpty()) {
            return null;
        }
        return new ConfigurationAvailability(noneOf, noneOf2);
    }

    private void postSuccessfulApiCall(ApiCallMetadata apiCallMetadata) {
        this.eventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    private void reportConfigurationAvailability(EnumSet<AlexaConfigurationName> enumSet, AlexaConfigurationChangeListener alexaConfigurationChangeListener) {
        try {
            ConfigurationAvailability currentConfigurationAvailability = getCurrentConfigurationAvailability(enumSet);
            if (currentConfigurationAvailability != null) {
                alexaConfigurationChangeListener.onConfigurationAvailabilityChange(currentConfigurationAvailability);
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
            this.eventBus.post(ClientDisconnectedEvent.create(this.configurationChangeListeners.getClientForListener(alexaConfigurationChangeListener)));
        }
    }

    public void deregisterConfigurationChangeListener(ApiCallMetadata apiCallMetadata, AlexaConfigurationChangeListener alexaConfigurationChangeListener) {
        ExtendedClient remove = this.configurationChangeListeners.remove(alexaConfigurationChangeListener);
        this.listenersConfigurationPreferences.remove(alexaConfigurationChangeListener);
        if (remove != null) {
            Log.i(TAG, "De-registering configuration change listener for client: " + remove.getId());
        }
        postSuccessfulApiCall(apiCallMetadata);
    }

    @Subscribe
    public synchronized void on(ConfigurationAvailabilityChangeEvent configurationAvailabilityChangeEvent) {
        AlexaConfigurationName alexaConfigurationName = configurationAvailabilityChangeEvent.getAlexaConfigurationName();
        this.latestConfigurationAvailability.put(alexaConfigurationName, Boolean.valueOf(configurationAvailabilityChangeEvent.isAvailable()));
        Iterator<AlexaConfigurationChangeListener> it2 = this.configurationChangeListeners.iterator();
        while (it2.hasNext()) {
            AlexaConfigurationChangeListener next = it2.next();
            EnumSet<AlexaConfigurationName> enumSet = this.listenersConfigurationPreferences.get(next);
            if (enumSet != null && enumSet.contains(alexaConfigurationName)) {
                reportConfigurationAvailability(EnumSet.of(alexaConfigurationName), next);
            }
        }
    }

    public void register() {
        this.eventBus.register(this);
    }

    public void registerConfigurationChangeListener(ExtendedClient extendedClient, ApiCallMetadata apiCallMetadata, AlexaConfigurationChangeListener alexaConfigurationChangeListener, AlexaConfigurationName... alexaConfigurationNameArr) {
        EnumSet<AlexaConfigurationName> noneOf = EnumSet.noneOf(AlexaConfigurationName.class);
        noneOf.addAll(Arrays.asList(alexaConfigurationNameArr));
        this.configurationChangeListeners.addListenerForClient(extendedClient, alexaConfigurationChangeListener);
        this.listenersConfigurationPreferences.put(alexaConfigurationChangeListener, noneOf);
        reportConfigurationAvailability(noneOf, alexaConfigurationChangeListener);
        postSuccessfulApiCall(apiCallMetadata);
    }

    public void teardown() {
        if (this.eventBus.isRegistered(this)) {
            this.eventBus.unregister(this);
        }
    }

    @Subscribe
    public synchronized void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        Iterator<AlexaConfigurationChangeListener> it2 = this.configurationChangeListeners.removeAllClientListeners(clientDisconnectedEvent.getClient()).iterator();
        while (it2.hasNext()) {
            this.listenersConfigurationPreferences.remove(it2.next());
        }
    }
}
