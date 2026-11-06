package com.amazon.alexa.voice.tta.typing;

import com.amazon.alexa.voice.ui.tta.TranscriptSequence;
import com.amazon.alexa.voice.ui.tta.TtaLivePreviewMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TextTtaRequestMessage implements TtaLivePreviewMessage {
    private final String id;
    private final String requestMessage;
    private final TranscriptSequence sequence;

    public TextTtaRequestMessage(String str, TranscriptSequence transcriptSequence, String str2) {
        this.requestMessage = str;
        this.sequence = transcriptSequence;
        this.id = str2;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaLivePreviewMessage
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaLivePreviewMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public String getMessage() {
        return this.requestMessage;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaLivePreviewMessage
    public TranscriptSequence getSequence() {
        return this.sequence;
    }
}
