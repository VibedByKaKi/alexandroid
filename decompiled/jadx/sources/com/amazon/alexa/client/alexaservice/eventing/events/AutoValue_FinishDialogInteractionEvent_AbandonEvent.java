package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_FinishDialogInteractionEvent_AbandonEvent extends FinishDialogInteractionEvent.AbandonEvent {
    private final DialogAbandonReason abandonReason;
    private final DialogRequestIdentifier dialogRequestId;
    private final DialogTurnIdentifier dialogTurnIdentifier;
    private final boolean textDialog;

    public AutoValue_FinishDialogInteractionEvent_AbandonEvent(@Nullable DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, DialogAbandonReason dialogAbandonReason, boolean z) {
        this.dialogTurnIdentifier = dialogTurnIdentifier;
        this.dialogRequestId = dialogRequestIdentifier;
        if (dialogAbandonReason == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null abandonReason");
            throw null;
        }
        this.abandonReason = dialogAbandonReason;
        this.textDialog = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FinishDialogInteractionEvent.AbandonEvent) {
            FinishDialogInteractionEvent.AbandonEvent abandonEvent = (FinishDialogInteractionEvent.AbandonEvent) obj;
            DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnIdentifier;
            if (dialogTurnIdentifier != null ? dialogTurnIdentifier.equals(abandonEvent.getDialogTurnIdentifier()) : abandonEvent.getDialogTurnIdentifier() == null) {
                DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
                if (dialogRequestIdentifier != null ? dialogRequestIdentifier.equals(abandonEvent.getDialogRequestId()) : abandonEvent.getDialogRequestId() == null) {
                    if (this.abandonReason.equals(abandonEvent.getAbandonReason()) && this.textDialog == abandonEvent.isTextDialog()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.AbandonEvent
    public DialogAbandonReason getAbandonReason() {
        return this.abandonReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.AbandonEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.AbandonEvent
    @Nullable
    public DialogTurnIdentifier getDialogTurnIdentifier() {
        return this.dialogTurnIdentifier;
    }

    public int hashCode() {
        DialogTurnIdentifier dialogTurnIdentifier = this.dialogTurnIdentifier;
        int hashCode = ((dialogTurnIdentifier == null ? 0 : dialogTurnIdentifier.hashCode()) ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
        return (this.textDialog ? 1231 : 1237) ^ ((((hashCode ^ (dialogRequestIdentifier != null ? dialogRequestIdentifier.hashCode() : 0)) * 1000003) ^ this.abandonReason.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.FinishDialogInteractionEvent.AbandonEvent
    public boolean isTextDialog() {
        return this.textDialog;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AbandonEvent{dialogTurnIdentifier=");
        sb.append(this.dialogTurnIdentifier);
        sb.append(", dialogRequestId=");
        sb.append(this.dialogRequestId);
        sb.append(", abandonReason=");
        sb.append(this.abandonReason);
        sb.append(", textDialog=");
        return a$$ExternalSyntheticOutline0.m(sb, this.textDialog, StringSubstitutor.DEFAULT_VAR_END);
    }
}
