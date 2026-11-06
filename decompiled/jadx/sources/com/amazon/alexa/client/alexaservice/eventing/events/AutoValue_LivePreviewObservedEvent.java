package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.TranscriptSequence;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LivePreviewObservedEvent extends LivePreviewObservedEvent {
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final TranscriptSequence sequence;
    private final String text;

    public AutoValue_LivePreviewObservedEvent(DialogRequestIdentifier dialogRequestIdentifier, TranscriptSequence transcriptSequence, String str) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (transcriptSequence == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null sequence");
            throw null;
        }
        this.sequence = transcriptSequence;
        if (str != null) {
            this.text = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null text");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LivePreviewObservedEvent) {
            LivePreviewObservedEvent livePreviewObservedEvent = (LivePreviewObservedEvent) obj;
            if (this.dialogRequestIdentifier.equals(livePreviewObservedEvent.getDialogRequestIdentifier()) && this.sequence.equals(livePreviewObservedEvent.getSequence()) && this.text.equals(livePreviewObservedEvent.getText())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LivePreviewObservedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LivePreviewObservedEvent
    public TranscriptSequence getSequence() {
        return this.sequence;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.LivePreviewObservedEvent
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() ^ ((((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.sequence.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LivePreviewObservedEvent{dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", sequence=");
        sb.append(this.sequence);
        sb.append(", text=");
        return a$$ExternalSyntheticOutline0.m(sb, this.text, StringSubstitutor.DEFAULT_VAR_END);
    }
}
