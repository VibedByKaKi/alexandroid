package com.amazon.alexa.client.core.messages;

import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Message {
    private transient MessageMetadata messageMetadata;

    public static Message create(Header header) {
        return create(header, EmptyPayload.create());
    }

    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return hasDialogRequestIdentifier() ? getHeader().getDialogRequestIdentifier() : DialogRequestIdentifier.NONE;
    }

    @Nullable
    public abstract Endpoint getEndpoint();

    public abstract Header getHeader();

    public MessageIdentifier getMessageIdentifier() {
        return getHeader().getMessageIdentifier();
    }

    public MessageMetadata getMessageMetadata() {
        return this.messageMetadata;
    }

    public DialogRequestIdentifier getOriginatingDialogRequestIdentifier() {
        return hasDialogRequestIdentifier() ? getDialogRequestIdentifier() : this.messageMetadata.getOriginatingDialogRequestIdentifier();
    }

    @Nullable
    public abstract Payload getPayload();

    public boolean hasDialogRequestIdentifier() {
        return getHeader().hasDialogRequestIdentifier();
    }

    public void setMessageMetadata(MessageMetadata messageMetadata) {
        this.messageMetadata = messageMetadata;
    }

    public static Message create(Header header, Payload payload) {
        return create(header, payload, MessageMetadata.EMPTY);
    }

    public static Message create(Header header, Payload payload, MessageMetadata messageMetadata) {
        return create(header, payload, messageMetadata, null);
    }

    public static Message create(Header header, Payload payload, MessageMetadata messageMetadata, Endpoint endpoint) {
        AutoValue_Message autoValue_Message = new AutoValue_Message(header, payload, endpoint);
        ((Message) autoValue_Message).messageMetadata = messageMetadata;
        return autoValue_Message;
    }
}
