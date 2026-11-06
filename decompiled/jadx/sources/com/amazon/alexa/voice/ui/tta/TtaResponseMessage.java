package com.amazon.alexa.voice.ui.tta;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TtaResponseMessage extends TtaMessage {
    String getDialogRequestId();

    String getId();

    @Override // com.amazon.alexa.voice.ui.tta.TtaMessage
    String getMessage();
}
