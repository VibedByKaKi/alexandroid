package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class WakeWordMetricsListener implements WakeWordDetectionMetricsListener {
    private final AlexaClientEventBus eventBus;

    @Inject
    public WakeWordMetricsListener(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onLocaleMismatch() {
        this.eventBus.post(WakeWordMetricEvent.LocaleMismatchEvent.create());
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onPryonErrorEvent(int i) {
        this.eventBus.post(WakeWordMetricEvent.PryonErrorEvent.create(i));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onPryonInitializationFailure(int i, String str) {
        this.eventBus.post(WakeWordMetricEvent.PryonInitializationFailureEvent.create(i, str));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onPryonInitializationSuccess(long j, String str) {
        this.eventBus.post(WakeWordMetricEvent.PryonInitializationSuccessEvent.create(j, str));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onPryonReset(long j) {
        this.eventBus.post(WakeWordMetricEvent.PryonResetEvent.create(j));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onWakeWordModelDownloadFailure(long j, String str, String str2) {
        this.eventBus.post(WakeWordMetricEvent.WakeWordModelDownloadFailureEvent.create(j, str, str2));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onWakeWordModelDownloadInterrupted(long j) {
        this.eventBus.post(WakeWordMetricEvent.WakeWordModelDownloadInterruptedEvent.create(j));
    }

    @Override // com.amazon.alexa.wakeword.pryon.WakeWordDetectionMetricsListener
    public void onWakeWordModelDownloadSuccess(long j, String str) {
        this.eventBus.post(WakeWordMetricEvent.WakeWordModelDownloadSuccessEvent.create(j, str));
    }
}
