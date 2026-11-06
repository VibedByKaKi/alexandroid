package com.amazon.alexa.voice.ui.ra;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.tta.TtaConversationHistoryListener;
import com.amazon.alexa.voice.ui.tta.TtaMessageRequestListener;
import com.amazon.alexa.voice.ui.tta.TtaMessageResponseListener;
import com.amazon.alexa.voice.ui.tta.TtaRequestMessage;
import com.amazon.alexa.voice.ui.util.BooleanProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AlexaMessageHandler {
    BooleanProperty isThinking();

    void send(TtaRequestMessage ttaRequestMessage);

    void send(TtaRequestMessage ttaRequestMessage, boolean z, boolean z2);

    void setConversationHistoryListener(TtaConversationHistoryListener ttaConversationHistoryListener);

    void setRequestListener(@Nullable TtaMessageRequestListener ttaMessageRequestListener);

    void setResponseListener(@Nullable TtaMessageResponseListener ttaMessageResponseListener);
}
