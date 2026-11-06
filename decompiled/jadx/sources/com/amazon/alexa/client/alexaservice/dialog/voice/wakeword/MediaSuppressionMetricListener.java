package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.dialog.voice.wakeword.WakeWordMetricEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MediaSuppressionMetricListener implements MediaSuppressionMetricListening {
    private final AlexaClientEventBus eventBus;

    @Inject
    public MediaSuppressionMetricListener(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening
    public void onArtifactDownloadFailure(@NonNull String str, long j, @NonNull String str2, @NonNull String str3) {
        this.eventBus.post(WakeWordMetricEvent.MediaSuppressionArtifactDownloadFailureEvent.create(str, j, str2, str3));
    }

    @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening
    public void onArtifactDownloadInterrupted(@NonNull String str, long j) {
        this.eventBus.post(WakeWordMetricEvent.MediaSuppressionArtifactDownloadInterruptedEvent.create(str, j));
    }

    @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening
    public void onArtifactDownloadSuccess(@NonNull String str, long j, @NonNull String str2) {
        this.eventBus.post(WakeWordMetricEvent.MediaSuppressionArtifactDownloadSuccessEvent.create(str, j, str2));
    }

    @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening
    public void onArtifactReadFailure(@NonNull String str, @NonNull String str2) {
        this.eventBus.post(WakeWordMetricEvent.MediaSuppressionArtifactReadFailureEvent.create(str, str2));
    }

    @Override // com.amazon.alexa.wakeword.pryon.mediasuppression.MediaSuppressionMetricListening
    public void onArtifactReadSuccess(@NonNull String str) {
        this.eventBus.post(WakeWordMetricEvent.MediaSuppressionArtifactReadSuccessEvent.create(str));
    }
}
