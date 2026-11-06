package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.api.TextResponse;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_TextResponseReceivedEvent extends TextResponseReceivedEvent {
    private final TextResponse textResponse;

    public AutoValue_TextResponseReceivedEvent(TextResponse textResponse) {
        if (textResponse != null) {
            this.textResponse = textResponse;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null textResponse");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextResponseReceivedEvent) {
            return this.textResponse.equals(((TextResponseReceivedEvent) obj).getTextResponse());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.TextResponseReceivedEvent
    public TextResponse getTextResponse() {
        return this.textResponse;
    }

    public int hashCode() {
        return this.textResponse.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TextResponseReceivedEvent{textResponse=" + this.textResponse + StringSubstitutor.DEFAULT_VAR_END;
    }
}
