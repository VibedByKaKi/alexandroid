package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.events.AttachmentWriteFinishedEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AttachmentWriteFinishedEvent extends AttachmentWriteFinishedEvent {
    private final AttachmentWriteFinishedEvent.EncodingType encodingType;
    private final int getBytesWritten;

    public AutoValue_AttachmentWriteFinishedEvent(int i, AttachmentWriteFinishedEvent.EncodingType encodingType) {
        this.getBytesWritten = i;
        if (encodingType != null) {
            this.encodingType = encodingType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null encodingType");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AttachmentWriteFinishedEvent
    public AttachmentWriteFinishedEvent.EncodingType encodingType() {
        return this.encodingType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttachmentWriteFinishedEvent) {
            AttachmentWriteFinishedEvent attachmentWriteFinishedEvent = (AttachmentWriteFinishedEvent) obj;
            if (this.getBytesWritten == attachmentWriteFinishedEvent.getBytesWritten() && this.encodingType.equals(attachmentWriteFinishedEvent.encodingType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.AttachmentWriteFinishedEvent
    public int getBytesWritten() {
        return this.getBytesWritten;
    }

    public int hashCode() {
        return this.encodingType.hashCode() ^ ((this.getBytesWritten ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AttachmentWriteFinishedEvent{getBytesWritten=" + this.getBytesWritten + ", encodingType=" + this.encodingType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
