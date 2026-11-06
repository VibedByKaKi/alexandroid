package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.SpeakPayload;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DialogEvent_TextDialogReceiveEvent extends DialogEvent.TextDialogReceiveEvent {
    private final SpeakPayload speakPayload;

    public AutoValue_DialogEvent_TextDialogReceiveEvent(SpeakPayload speakPayload) {
        if (speakPayload != null) {
            this.speakPayload = speakPayload;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null speakPayload");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DialogEvent.TextDialogReceiveEvent) {
            return this.speakPayload.equals(((DialogEvent.TextDialogReceiveEvent) obj).getSpeakPayload());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DialogEvent.TextDialogReceiveEvent
    public SpeakPayload getSpeakPayload() {
        return this.speakPayload;
    }

    public int hashCode() {
        return this.speakPayload.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TextDialogReceiveEvent{speakPayload=" + this.speakPayload + StringSubstitutor.DEFAULT_VAR_END;
    }
}
