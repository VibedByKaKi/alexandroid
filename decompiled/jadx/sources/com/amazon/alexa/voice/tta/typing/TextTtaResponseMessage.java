package com.amazon.alexa.voice.tta.typing;

import com.amazon.alexa.voice.ui.tta.TtaResponseMessage;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TextTtaResponseMessage implements TtaResponseMessage {
    private String dialogRequestId;
    private final String id;
    private final String message;

    public TextTtaResponseMessage(String str) {
        this(UUID.randomUUID().toString(), str);
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public String getMessage() {
        return this.message;
    }

    public void setDialogRequestId(String str) {
        this.dialogRequestId = str;
    }

    public TextTtaResponseMessage(String str, String str2) {
        this.id = str;
        this.message = str2;
        this.dialogRequestId = "";
    }
}
