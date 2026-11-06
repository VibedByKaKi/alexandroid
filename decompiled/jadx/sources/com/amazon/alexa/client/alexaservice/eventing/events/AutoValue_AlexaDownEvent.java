package com.amazon.alexa.client.alexaservice.eventing.events;

import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaDownEvent extends AlexaDownEvent {
    private final DialogFailureReason dialogFailureReason;
    private final boolean textDialog;

    public AutoValue_AlexaDownEvent(boolean z, DialogFailureReason dialogFailureReason) {
        this.textDialog = z;
        if (dialogFailureReason != null) {
            this.dialogFailureReason = dialogFailureReason;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogFailureReason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaDownEvent) {
            AlexaDownEvent alexaDownEvent = (AlexaDownEvent) obj;
            if (this.textDialog == alexaDownEvent.isTextDialog() && this.dialogFailureReason.equals(alexaDownEvent.getDialogFailureReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AlexaDownEvent
    public DialogFailureReason getDialogFailureReason() {
        return this.dialogFailureReason;
    }

    public int hashCode() {
        return this.dialogFailureReason.hashCode() ^ (((this.textDialog ? 1231 : 1237) ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AlexaDownEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        return "AlexaDownEvent{textDialog=" + this.textDialog + ", dialogFailureReason=" + this.dialogFailureReason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
