package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsMetricEvent;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class OfflinePromptsDownloadMetricsListener implements OfflinePromptsDetectionMetricsListener {
    private final AlexaClientEventBus eventBus;

    @Inject
    public OfflinePromptsDownloadMetricsListener(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsDetectionMetricsListener
    public void onOfflinePromptsDownloadFailure(long j, String str, String str2) {
        this.eventBus.post(OfflinePromptsMetricEvent.OfflinePromptDownloadFailureEvent.create(j, str, str2));
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsDetectionMetricsListener
    public void onOfflinePromptsDownloadInterrupted(long j) {
        this.eventBus.post(OfflinePromptsMetricEvent.OfflinePromptDownloadInterruptedEvent.create(j));
    }

    @Override // com.amazon.alexa.client.alexaservice.features.offlineprompts.OfflinePromptsDetectionMetricsListener
    public void onOfflinePromptsDownloadSuccess(long j, String str) {
        this.eventBus.post(OfflinePromptsMetricEvent.OfflinePromptDownloadSuccessEvent.create(j, str));
    }
}
