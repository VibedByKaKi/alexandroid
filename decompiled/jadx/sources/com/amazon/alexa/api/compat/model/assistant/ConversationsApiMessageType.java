package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum ConversationsApiMessageType {
    UPDATE_CONVERSATIONS,
    GET_FRAGMENTS,
    DELETE_CONVERSATIONS,
    SEND_EVENT,
    PUBLISH_CONVERSATION_STATE_JSON,
    DELETE_FRAGMENTS,
    UPDATE_ENTITLEMENT_STATUS;

    public static ConversationsApiMessageType fromOrdinal(int i) {
        ConversationsApiMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
