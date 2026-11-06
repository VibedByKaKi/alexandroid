package com.amazon.alexa.voice.events;

import com.amazon.alexa.api.compat.model.UiEventName;
import com.amazon.alexa.voice.metrics.VoxMetricEvent;
import com.amazon.alexa.voice.metrics.VoxMetricEventName;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoxUiEventToMetricEventProcessor implements VoxUiEventProcessor {
    private final VoxMetricEventProcessingService metricEventProcessor;

    public VoxUiEventToMetricEventProcessor(VoxMetricEventProcessingService voxMetricEventProcessingService) {
        this.metricEventProcessor = voxMetricEventProcessingService;
    }

    @Override // com.amazon.alexa.voice.events.VoxUiEventProcessor
    public void process(VoxUiEvent voxUiEvent) {
        if (UiEventName.ALEXA_UI_SHOWN.name().equals(voxUiEvent.getName())) {
            this.metricEventProcessor.process(VoxMetricEvent.create(VoxMetricEventName.SCRIM_SHOWN, voxUiEvent.getTimestamp()));
        }
    }
}
