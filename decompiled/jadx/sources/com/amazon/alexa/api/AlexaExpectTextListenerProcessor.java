package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AlexaExpectTextListenerProcessor extends MessageProcessor<ExpectTextMessageType> {
    private final AlexaExpectTextListener alexaExpectTextListener;

    public AlexaExpectTextListenerProcessor(@NonNull AlexaExpectTextListener alexaExpectTextListener) {
        this.alexaExpectTextListener = alexaExpectTextListener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public ExpectTextMessageType getMessageType(Message message) {
        try {
            return ExpectTextMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException unused) {
            return ExpectTextMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(ExpectTextMessageType expectTextMessageType, Bundle bundle, Messenger messenger) {
        if (expectTextMessageType == ExpectTextMessageType.ON_EXPECT_TEXT_RECEIVED) {
            this.alexaExpectTextListener.onExpectTextReceived();
            return;
        }
        Log.w("AlexaExpectTextListenerProcessor", "Unsupported message: " + expectTextMessageType);
    }
}
