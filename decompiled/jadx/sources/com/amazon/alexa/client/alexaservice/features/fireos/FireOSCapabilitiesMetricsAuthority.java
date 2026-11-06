package com.amazon.alexa.client.alexaservice.features.fireos;

import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.metrics.core.MetricsCounter;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class FireOSCapabilitiesMetricsAuthority {
    private static final String TAG = "FireOSCapabilitiesMetricsAuthority";
    private final AlexaClientEventBus eventBus;
    private final MetricsService metricsService;

    @Inject
    public FireOSCapabilitiesMetricsAuthority(AlexaClientEventBus alexaClientEventBus, MetricsService metricsService) {
        this.eventBus = alexaClientEventBus;
        this.metricsService = metricsService;
        alexaClientEventBus.register(this);
    }

    private void recordOccurrenceOfEvent(String str, String str2) {
        MetricsCounter startCounter = this.metricsService.startCounter(str, str2, null);
        startCounter.incrementCounter();
        this.metricsService.recordCounter(startCounter);
    }

    @Subscribe
    public void on(FireOSCapabilitiesMetricEvent fireOSCapabilitiesMetricEvent) {
        recordOccurrenceOfEvent(fireOSCapabilitiesMetricEvent.getMetricName(), fireOSCapabilitiesMetricEvent.getDirectiveName());
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }
}
