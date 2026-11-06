package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_ConversationsListenerWrapper extends ConversationsListener implements AlexaConversationsListener {
    private final AlexaConversationsListener alexaConversationsListener;

    public ApiType_ConversationsListenerWrapper(AlexaConversationsListener alexaConversationsListener) {
        this.alexaConversationsListener = alexaConversationsListener;
    }

    @Override // com.amazon.alexa.api.ConversationsListener, com.amazon.alexa.api.AlexaConversationsListener
    public void onConversationUpdated(String str, String str2) {
        this.alexaConversationsListener.onConversationUpdated(str, str2);
    }

    @Override // com.amazon.alexa.api.ConversationsListener, com.amazon.alexa.api.AlexaConversationsListener
    public void onConversationsUpdated(AlexaConversationExtras alexaConversationExtras, String str) {
        this.alexaConversationsListener.onConversationsUpdated(alexaConversationExtras, str);
    }
}
