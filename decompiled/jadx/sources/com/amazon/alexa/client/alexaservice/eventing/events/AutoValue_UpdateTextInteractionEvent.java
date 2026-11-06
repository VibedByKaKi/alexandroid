package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_UpdateTextInteractionEvent extends UpdateTextInteractionEvent {
    private final DialogRequestIdentifier dialogRequestId;
    private final DialogTurnIdentifier dialogTurnId;
    private final String invocationType;

    public AutoValue_UpdateTextInteractionEvent(DialogTurnIdentifier dialogTurnIdentifier, @Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str) {
        if (dialogTurnIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogTurnId");
            throw null;
        }
        this.dialogTurnId = dialogTurnIdentifier;
        this.dialogRequestId = dialogRequestIdentifier;
        this.invocationType = str;
    }

    public boolean equals(Object obj) {
        DialogRequestIdentifier dialogRequestIdentifier;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateTextInteractionEvent) {
            UpdateTextInteractionEvent updateTextInteractionEvent = (UpdateTextInteractionEvent) obj;
            if (this.dialogTurnId.equals(updateTextInteractionEvent.getDialogTurnId()) && ((dialogRequestIdentifier = this.dialogRequestId) != null ? dialogRequestIdentifier.equals(updateTextInteractionEvent.getDialogRequestId()) : updateTextInteractionEvent.getDialogRequestId() == null) && ((str = this.invocationType) != null ? str.equals(updateTextInteractionEvent.getInvocationType()) : updateTextInteractionEvent.getInvocationType() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UpdateTextInteractionEvent
    @Nullable
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UpdateTextInteractionEvent
    public DialogTurnIdentifier getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.UpdateTextInteractionEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    public int hashCode() {
        int hashCode = (this.dialogTurnId.hashCode() ^ 1000003) * 1000003;
        DialogRequestIdentifier dialogRequestIdentifier = this.dialogRequestId;
        int hashCode2 = (hashCode ^ (dialogRequestIdentifier == null ? 0 : dialogRequestIdentifier.hashCode())) * 1000003;
        String str = this.invocationType;
        return hashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateTextInteractionEvent{dialogTurnId=");
        sb.append(this.dialogTurnId);
        sb.append(", dialogRequestId=");
        sb.append(this.dialogRequestId);
        sb.append(", invocationType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.invocationType, StringSubstitutor.DEFAULT_VAR_END);
    }
}
