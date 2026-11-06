package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultEventSender implements TtaEventSender {
    private static final String TAG = "DefaultEventSender";
    private final MetricEventProcessingService metricEventProcessingService;

    public DefaultEventSender(MetricEventProcessingService metricEventProcessingService) {
        this.metricEventProcessingService = metricEventProcessingService;
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender
    public void sendEvent(@NonNull TtaEvent ttaEvent) {
        ttaEvent.getName();
        this.metricEventProcessingService.processEvent(ttaEvent, EventTime.now());
    }
}
