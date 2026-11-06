package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_RecordingEvent_StoppedEvent extends RecordingEvent.StoppedEvent {
    private final DialogRequestIdentifier dialogRequestId;
    private final RecordingEvent.StopRecordingSource stopRecordingSource;

    public AutoValue_RecordingEvent_StoppedEvent(RecordingEvent.StopRecordingSource stopRecordingSource, DialogRequestIdentifier dialogRequestIdentifier) {
        if (stopRecordingSource == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null stopRecordingSource");
            throw null;
        }
        this.stopRecordingSource = stopRecordingSource;
        if (dialogRequestIdentifier != null) {
            this.dialogRequestId = dialogRequestIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecordingEvent.StoppedEvent) {
            RecordingEvent.StoppedEvent stoppedEvent = (RecordingEvent.StoppedEvent) obj;
            if (this.stopRecordingSource.equals(stoppedEvent.getStopRecordingSource()) && this.dialogRequestId.equals(stoppedEvent.getDialogRequestId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StoppedEvent
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent.StoppedEvent
    public RecordingEvent.StopRecordingSource getStopRecordingSource() {
        return this.stopRecordingSource;
    }

    public int hashCode() {
        return this.dialogRequestId.hashCode() ^ ((this.stopRecordingSource.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "StoppedEvent{stopRecordingSource=" + this.stopRecordingSource + ", dialogRequestId=" + this.dialogRequestId + StringSubstitutor.DEFAULT_VAR_END;
    }
}
