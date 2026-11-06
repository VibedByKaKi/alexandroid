package com.amazon.alexa.client.alexaservice.features.navigation;

import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.navigation.events.NavigationMetricEvent;
import com.amazon.alexa.client.metrics.core.MetricsCounter;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NavigationMetricsAuthority {
    private static final String TAG = "NavigationMetricsAuthority";
    private final AlexaClientEventBus eventBus;
    private final MetricsService metricsService;

    @Inject
    public NavigationMetricsAuthority(AlexaClientEventBus alexaClientEventBus, MetricsService metricsService) {
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
    public void on(NavigationMetricEvent.FireOS2pLaunchFailureEvent fireOS2pLaunchFailureEvent) {
        recordOccurrenceOfEvent(NavigationMetricNames.FIREOS_2P_LAUNCH_FAILURE_PREFIX + fireOS2pLaunchFailureEvent.getErrorMessage(), fireOS2pLaunchFailureEvent.getDirectiveName());
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }

    @Subscribe
    public void on(NavigationMetricEvent.FireOS2pLaunchSuccessfullEvent fireOS2pLaunchSuccessfullEvent) {
        recordOccurrenceOfEvent(NavigationMetricNames.FIREOS_2P_LAUNCH_SUCCESS, fireOS2pLaunchSuccessfullEvent.getDirectiveName());
    }
}
