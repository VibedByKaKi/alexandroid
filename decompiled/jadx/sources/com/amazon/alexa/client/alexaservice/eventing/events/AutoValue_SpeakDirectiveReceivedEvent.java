package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.CaptionData;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SpeakDirectiveReceivedEvent extends SpeakDirectiveReceivedEvent {
    private final CaptionData caption;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final SpeechToken token;

    public AutoValue_SpeakDirectiveReceivedEvent(DialogRequestIdentifier dialogRequestIdentifier, SpeechToken speechToken, @Nullable CaptionData captionData) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (speechToken == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null token");
            throw null;
        }
        this.token = speechToken;
        this.caption = captionData;
    }

    public boolean equals(Object obj) {
        CaptionData captionData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpeakDirectiveReceivedEvent) {
            SpeakDirectiveReceivedEvent speakDirectiveReceivedEvent = (SpeakDirectiveReceivedEvent) obj;
            if (this.dialogRequestIdentifier.equals(speakDirectiveReceivedEvent.getDialogRequestIdentifier()) && this.token.equals(speakDirectiveReceivedEvent.getToken()) && ((captionData = this.caption) != null ? captionData.equals(speakDirectiveReceivedEvent.getCaption()) : speakDirectiveReceivedEvent.getCaption() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeakDirectiveReceivedEvent
    @Nullable
    public CaptionData getCaption() {
        return this.caption;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeakDirectiveReceivedEvent
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.SpeakDirectiveReceivedEvent
    public SpeechToken getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = (((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.token.hashCode()) * 1000003;
        CaptionData captionData = this.caption;
        return (captionData == null ? 0 : captionData.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "SpeakDirectiveReceivedEvent{dialogRequestIdentifier=" + this.dialogRequestIdentifier + ", token=" + this.token + ", caption=" + this.caption + StringSubstitutor.DEFAULT_VAR_END;
    }
}
