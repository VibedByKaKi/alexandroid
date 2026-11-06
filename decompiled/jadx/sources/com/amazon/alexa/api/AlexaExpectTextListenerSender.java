package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaExpectTextListenerSender extends AlexaMessageSender<ExpectTextMessageType> implements AlexaExpectTextListener {
    private static final String TAG = "AlexaExpectTextListenerSender";
    private final ExtendedClient extendedClient;

    public AlexaExpectTextListenerSender(ExtendedClient extendedClient, IBinder iBinder) {
        super(iBinder);
        this.extendedClient = extendedClient;
    }

    @Override // com.amazon.alexa.api.AlexaExpectTextListener
    public void onExpectTextReceived() {
        try {
            sendMessage(ExpectTextMessageType.ON_EXPECT_TEXT_RECEIVED, new Bundle());
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to send message for: onExpectTextReceived", e);
        }
    }
}
