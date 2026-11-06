package com.amazon.alexa.client.core.capabilities;

import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MessageBundle extends MessageBundle {
    private final MessageProcessingCallbacks callbacks;
    private final Message message;

    public AutoValue_MessageBundle(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        if (message == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            throw null;
        }
        this.message = message;
        if (messageProcessingCallbacks != null) {
            this.callbacks = messageProcessingCallbacks;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null callbacks");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageBundle) {
            MessageBundle messageBundle = (MessageBundle) obj;
            if (this.message.equals(messageBundle.getMessage()) && this.callbacks.equals(messageBundle.getCallbacks())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.capabilities.MessageBundle
    public MessageProcessingCallbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.amazon.alexa.client.core.capabilities.MessageBundle
    public Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.callbacks.hashCode() ^ ((this.message.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "MessageBundle{message=" + this.message + ", callbacks=" + this.callbacks + StringSubstitutor.DEFAULT_VAR_END;
    }
}
