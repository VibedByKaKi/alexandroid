package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PreciseDialogResponseEvent extends PreciseDialogResponseEvent {
    private final DialogRequestIdentifier dialogRequestId;
    private final DialogTurnIdentifier dialogTurnId;
    private final long elapsedTimeOfResponse;

    public AutoValue_PreciseDialogResponseEvent(DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier, long j) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
        this.dialogRequestId = dialogRequestIdentifier;
        if (dialogTurnIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogTurnId");
            throw null;
        }
        this.dialogTurnId = dialogTurnIdentifier;
        this.elapsedTimeOfResponse = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreciseDialogResponseEvent) {
            PreciseDialogResponseEvent preciseDialogResponseEvent = (PreciseDialogResponseEvent) obj;
            if (this.dialogRequestId.equals(preciseDialogResponseEvent.getDialogRequestId()) && this.dialogTurnId.equals(preciseDialogResponseEvent.getDialogTurnId()) && this.elapsedTimeOfResponse == preciseDialogResponseEvent.getElapsedTimeOfResponse()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.PreciseDialogResponseEvent
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.PreciseDialogResponseEvent
    public DialogTurnIdentifier getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.voice.metrics.PreciseDialogResponseEvent
    public long getElapsedTimeOfResponse() {
        return this.elapsedTimeOfResponse;
    }

    public int hashCode() {
        int hashCode = (((this.dialogRequestId.hashCode() ^ 1000003) * 1000003) ^ this.dialogTurnId.hashCode()) * 1000003;
        long j = this.elapsedTimeOfResponse;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreciseDialogResponseEvent{dialogRequestId=");
        sb.append(this.dialogRequestId);
        sb.append(", dialogTurnId=");
        sb.append(this.dialogTurnId);
        sb.append(", elapsedTimeOfResponse=");
        return a$$ExternalSyntheticOutline0.m(this.elapsedTimeOfResponse, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
