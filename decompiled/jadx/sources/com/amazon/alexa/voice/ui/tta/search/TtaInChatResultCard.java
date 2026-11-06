package com.amazon.alexa.voice.ui.tta.search;

import com.amazon.alexa.voice.ui.tta.TtaResponseMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TtaInChatResultCard extends TtaResponseMessage {
    ItemPosition getItemPosition();

    ItemRoute getItemRoute();

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    String getMessage();

    String getSecondMessage();

    int getType();
}
