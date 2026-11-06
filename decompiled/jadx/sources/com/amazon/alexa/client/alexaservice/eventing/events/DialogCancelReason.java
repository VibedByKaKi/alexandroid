package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum DialogCancelReason implements DialogInteractionResult.Reason {
    PAUSE_CONTROL(AlexaMetricsName.VoiceInteraction.Cancelled.PAUSE_CONTROL),
    CANCEL_USER_INTERACTION(AlexaMetricsName.VoiceInteraction.Cancelled.CANCEL_USER_INTERACTION),
    NATURAL_TURN_SESSION_STOPPED(AlexaMetricsName.VoiceInteraction.Cancelled.NATURAL_TURN_SESSION_STOPPED);

    private final AlexaMetricsName metricName;

    DialogCancelReason(AlexaMetricsName alexaMetricsName) {
        this.metricName = alexaMetricsName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public AlexaMetricsName getMetricName() {
        return this.metricName;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public DialogInteractionResult.Type getType() {
        return DialogInteractionResult.Type.CANCEL;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public boolean isNetworkFailure() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public void setTextDialog(boolean z) {
    }
}
