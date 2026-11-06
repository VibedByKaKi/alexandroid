package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishDialogInteractionEvent_SuccessEvent extends FinishDialogInteractionEvent.SuccessEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final boolean textDialog;

    public AutoValue_FinishDialogInteractionEvent_SuccessEvent(DialogRequestIdentifier dialogRequestIdentifier, boolean z) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishDialogInteractionEvent.SuccessEvent) {
            FinishDialogInteractionEvent.SuccessEvent successEvent = (FinishDialogInteractionEvent.SuccessEvent) obj;
            if (this.dialogRequestIdentifier.equals(successEvent.getDialogRequestIdentifier()) && this.textDialog == successEvent.isTextDialog()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.SuccessEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    public int hashCode() {
        return (this.textDialog ? 1231 : 1237) ^ ((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.SuccessEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuccessEvent{dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
