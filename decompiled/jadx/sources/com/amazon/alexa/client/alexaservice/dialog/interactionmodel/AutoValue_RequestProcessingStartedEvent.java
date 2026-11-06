package com.amazon.alexa.client.alexaservice.dialog.interactionmodel;

import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RequestProcessingStartedEvent extends RequestProcessingStartedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;

    public AutoValue_RequestProcessingStartedEvent(DialogRequestIdentifier dialogRequestIdentifier) {
        if (dialogRequestIdentifier != null) {
            this.dialogRequestIdentifier = dialogRequestIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestProcessingStartedEvent) {
            return this.dialogRequestIdentifier.equals(((RequestProcessingStartedEvent) obj).getDialogRequestIdentifier());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.interactionmodel.RequestProcessingStartedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    public int hashCode() {
        return this.dialogRequestIdentifier.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RequestProcessingStartedEvent{dialogRequestIdentifier=" + this.dialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
