package com.amazon.alexa.client.core.messages;

import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MessageMetadata extends MessageMetadata {
    private final DialogRequestIdentifier originatingDialogRequestIdentifier;
    private final String unparsedMessage;

    public AutoValue_MessageMetadata(String str, DialogRequestIdentifier dialogRequestIdentifier) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null unparsedMessage");
            throw null;
        }
        this.unparsedMessage = str;
        if (dialogRequestIdentifier != null) {
            this.originatingDialogRequestIdentifier = dialogRequestIdentifier;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null originatingDialogRequestIdentifier");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageMetadata) {
            MessageMetadata messageMetadata = (MessageMetadata) obj;
            if (this.unparsedMessage.equals(messageMetadata.getUnparsedMessage()) && this.originatingDialogRequestIdentifier.equals(messageMetadata.getOriginatingDialogRequestIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.messages.MessageMetadata
    public DialogRequestIdentifier getOriginatingDialogRequestIdentifier() {
        return this.originatingDialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.core.messages.MessageMetadata
    public String getUnparsedMessage() {
        return this.unparsedMessage;
    }

    public int hashCode() {
        return this.originatingDialogRequestIdentifier.hashCode() ^ ((this.unparsedMessage.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "MessageMetadata{unparsedMessage=" + this.unparsedMessage + ", originatingDialogRequestIdentifier=" + this.originatingDialogRequestIdentifier + StringSubstitutor.DEFAULT_VAR_END;
    }
}
