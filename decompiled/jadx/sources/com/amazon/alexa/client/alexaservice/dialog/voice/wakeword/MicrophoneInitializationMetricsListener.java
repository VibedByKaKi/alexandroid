package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.audiocapturer.MetricsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.MicrophoneMetricEvent;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MicrophoneInitializationMetricsListener implements MetricsListener {
    private final AlexaClientEventBus eventBus;

    @Inject
    public MicrophoneInitializationMetricsListener(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.audiocapturer.MetricsListener
    public void onMicInitializationFailure() {
        this.eventBus.post(MicrophoneMetricEvent.MicrophoneInitializationFailureEvent.create());
    }

    @Override // com.amazon.alexa.audiocapturer.MetricsListener
    public void onMicInitializationSuccess(long j) {
        this.eventBus.post(MicrophoneMetricEvent.MicrophoneInitializationSuccessEvent.create(j));
    }
}
