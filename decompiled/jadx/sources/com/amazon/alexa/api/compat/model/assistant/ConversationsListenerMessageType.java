package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum ConversationsListenerMessageType {
    ON_REQUEST_RESULT,
    ON_CONVERSATIONS_UPDATED,
    ON_CONVERSATION_UPDATED,
    ON_FRAGMENTS,
    ON_FRAGMENT_RENDERING_PAUSED,
    ON_FRAGMENT_RENDERING_RESUMED,
    ON_ADD_FRAGMENTS,
    ON_UPDATE_CONVERSATION_METADATA,
    ON_DELETE_CONVERSATIONS,
    ON_UPDATE_FRAGMENT_DATA,
    ON_PERSONALITY_DISPLAY,
    ON_PERSONALIZED_CONTENT,
    REGISTER_CALLBACK,
    DEREGISTER_CALLBACK;

    public static ConversationsListenerMessageType fromOrdinal(int i) {
        ConversationsListenerMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
