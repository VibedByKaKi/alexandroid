package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishDialogInteractionEvent_CancelEvent extends FinishDialogInteractionEvent.CancelEvent {
    private final DialogCancelReason cancelReason;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final DialogTurnIdentifier dialogTurnIdentifier;

    public AutoValue_FinishDialogInteractionEvent_CancelEvent(DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, DialogCancelReason dialogCancelReason) {
        if (dialogTurnIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogTurnIdentifier");
            throw null;
        }
        this.dialogTurnIdentifier = dialogTurnIdentifier;
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (dialogCancelReason != null) {
            this.cancelReason = dialogCancelReason;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null cancelReason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        DialogRequestIdentifier dialogRequestIdentifier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishDialogInteractionEvent.CancelEvent) {
            FinishDialogInteractionEvent.CancelEvent cancelEvent = (FinishDialogInteractionEvent.CancelEvent) obj;
            if (this.dialogTurnIdentifier.equals(cancelEvent.getDialogTurnIdentifier()) && ((dialogRequestIdentifier = this.dialogRequestIdentifier) != null ? dialogRequestIdentifier.equals(cancelEvent.getDialogRequestIdentifier()) : cancelEvent.getDialogRequestIdentifier() == null) && this.cancelReason.equals(cancelEvent.getCancelReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.CancelEvent
    public DialogCancelReason getCancelReason() {
        return this.cancelReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.CancelEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.CancelEvent
    public DialogTurnIdentifier getDialogTurnIdentifier() {
        return this.dialogTurnIdentifier;
    }

    public int hashCode() {
        int hashCode = (this.dialogTurnIdentifier.hashCode() ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestIdentifier;
        return this.cancelReason.hashCode() ^ ((hashCode ^ (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode())) * 1000003);
    }

    public String toString() {
        return "CancelEvent{dialogTurnIdentifier=" + this.dialogTurnIdentifier + ", dialogRequestIdentifier=" + this.dialogRequestIdentifier + ", cancelReason=" + this.cancelReason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
