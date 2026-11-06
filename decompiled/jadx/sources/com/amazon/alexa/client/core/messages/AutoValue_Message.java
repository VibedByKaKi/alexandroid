package com.amazon.alexa.client.core.messages;

import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_Message extends Message {

    @Nullable
    private final Endpoint endpoint;
    private final Header header;

    @Nullable
    private final Payload payload;

    public AutoValue_Message(Header header, @Nullable Payload payload, @Nullable Endpoint endpoint) {
        if (header == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null header");
            throw null;
        }
        this.header = header;
        this.payload = payload;
        this.endpoint = endpoint;
    }

    public boolean equals(Object obj) {
        Payload payload;
        Endpoint endpoint;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            if (this.header.equals(message.getHeader()) && ((payload = this.payload) != null ? payload.equals(message.getPayload()) : message.getPayload() == null) && ((endpoint = this.endpoint) != null ? endpoint.equals(message.getEndpoint()) : message.getEndpoint() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.messages.Message
    @Nullable
    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    @Override // com.amazon.alexa.client.core.messages.Message
    public Header getHeader() {
        return this.header;
    }

    @Override // com.amazon.alexa.client.core.messages.Message
    @Nullable
    public Payload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int hashCode = (this.header.hashCode() ^ 1000003) * 1000003;
        Payload payload = this.payload;
        int hashCode2 = (hashCode ^ (payload == null ? 0 : payload.hashCode())) * 1000003;
        Endpoint endpoint = this.endpoint;
        return hashCode2 ^ (endpoint != null ? endpoint.hashCode() : 0);
    }

    public String toString() {
        return "Message{header=" + this.header + ", payload=" + this.payload + ", endpoint=" + this.endpoint + StringSubstitutor.DEFAULT_VAR_END;
    }
}
