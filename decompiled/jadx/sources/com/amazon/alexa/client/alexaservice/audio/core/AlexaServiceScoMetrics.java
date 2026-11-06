package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.bluetooth.sco.ScoMetrics;
import com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsCounterEvent;
import com.amazon.alexa.client.alexaservice.audio.events.ScoMetricsTimerEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaServiceScoMetrics implements ScoMetrics {
    private final AlexaClientEventBus eventBus;

    @Inject
    public AlexaServiceScoMetrics(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.bluetooth.sco.ScoMetrics
    public void recordCount(String str, int i) {
        this.eventBus.post(ScoMetricsCounterEvent.create(str, i));
    }

    @Override // com.amazon.alexa.bluetooth.sco.ScoMetrics
    public void recordTime(String str, long j) {
        this.eventBus.post(ScoMetricsTimerEvent.create(str, j));
    }
}
