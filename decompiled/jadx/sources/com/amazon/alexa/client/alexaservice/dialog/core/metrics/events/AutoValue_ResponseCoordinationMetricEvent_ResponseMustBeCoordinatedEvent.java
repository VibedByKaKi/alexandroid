package com.amazon.alexa.client.alexaservice.dialog.core.metrics.events;

import com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ResponseCoordinationMetricEvent_ResponseMustBeCoordinatedEvent extends ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final String invocationType;

    public AutoValue_ResponseCoordinationMetricEvent_ResponseMustBeCoordinatedEvent(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        this.invocationType = str;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent) {
            ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent responseMustBeCoordinatedEvent = (ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent) obj;
            String str = this.invocationType;
            if (str != null ? str.equals(responseMustBeCoordinatedEvent.getInvocationType()) : responseMustBeCoordinatedEvent.getInvocationType() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(responseMustBeCoordinatedEvent.getDialogRequestIdentifier()) : responseMustBeCoordinatedEvent.getDialogRequestIdentifier() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.events.ResponseCoordinationMetricEvent.ResponseMustBeCoordinatedEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        String str = this.invocationType;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0);
    }

    public String toString() {
        return "ResponseMustBeCoordinatedEvent{invocationType=" + this.invocationType + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
