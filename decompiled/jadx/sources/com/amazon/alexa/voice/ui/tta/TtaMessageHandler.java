package com.amazon.alexa.voice.ui.tta;

import com.amazon.alexa.voice.ui.util.BooleanProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TtaMessageHandler {
    BooleanProperty isThinking();

    void recordConversations(boolean z);

    void send(TtaRequestMessage ttaRequestMessage);

    void setConversationHistoryListener(TtaConversationHistoryListener ttaConversationHistoryListener);

    void setRequestListener(TtaMessageRequestListener ttaMessageRequestListener);

    void setResponseListener(TtaMessageResponseListener ttaMessageResponseListener);
}
