package com.amazon.alexa.client.alexaservice.base.metrics;

import com.amazon.alexa.client.alexaservice.dialog.text.TextAvailabilityProvider;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ComponentNameUpdateRequestEvent;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MetricsComponentNameProvider {
    private static final String TAG = "MetricsComponentNameProvider";
    private String cachedAlexaVoiceServiceComponentName;
    private String cachedAppComponentName;
    private final AlexaClientEventBus eventBus;
    private final TextAvailabilityProvider textAvailabilityProvider;

    @Inject
    public MetricsComponentNameProvider(TextAvailabilityProvider textAvailabilityProvider, AlexaClientEventBus alexaClientEventBus) {
        this.textAvailabilityProvider = textAvailabilityProvider;
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
        refreshComponentName();
    }

    private void refreshComponentName() {
        if (this.textAvailabilityProvider.isConversationAvailable()) {
            this.cachedAppComponentName = "vox_conversation";
            this.cachedAlexaVoiceServiceComponentName = "vox_conversation";
        } else {
            this.cachedAppComponentName = "vox_speech";
            this.cachedAlexaVoiceServiceComponentName = AlexaMetricsConstants.MetricsComponents.ALEXA_VOICE_SERVICE;
        }
    }

    public String getAlexaVoiceServiceComponentName() {
        return this.cachedAlexaVoiceServiceComponentName;
    }

    public String getAppComponentName() {
        return this.cachedAppComponentName;
    }

    @Subscribe
    public void on(ComponentNameUpdateRequestEvent componentNameUpdateRequestEvent) {
        refreshComponentName();
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }
}
