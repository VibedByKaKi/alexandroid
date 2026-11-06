package com.amazon.alexa.client.alexaservice.features.fireos;

import com.amazon.alexa.capabilities.FireOSCapabilitiesMetricsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class FireOSCapabilitiesListener implements FireOSCapabilitiesMetricsListener {
    private final AlexaClientEventBus eventBus;

    @Inject
    public FireOSCapabilitiesListener(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.capabilities.FireOSCapabilitiesMetricsListener
    public void onFireOSCapabilitiesMetrics(String str, String str2) {
        this.eventBus.post(FireOSCapabilitiesMetricEvent.create(str, str2));
    }
}
