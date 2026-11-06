package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class ForceDisconnectMessageProcessor extends MessageProcessor<ForceDisconnectMessageType> {
    private static final String TAG = "ForceDisconnectMessageProcessor";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public ForceDisconnectMessageType getMessageType(Message message) {
        ForceDisconnectMessageType forceDisconnectMessageType = ForceDisconnectMessageType.ON_FORCE_DISCONNECT;
        if (forceDisconnectMessageType.ordinal() == message.what) {
            return forceDisconnectMessageType;
        }
        Log.e(TAG, "Unrecognized message type");
        return ForceDisconnectMessageType.UNKNOWN;
    }

    public abstract void onForceDisconnect();

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(ForceDisconnectMessageType forceDisconnectMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (ForceDisconnectMessageType.ON_FORCE_DISCONNECT.equals(forceDisconnectMessageType)) {
            onForceDisconnect();
            return;
        }
        Log.w(TAG, "Unsupported message " + forceDisconnectMessageType);
    }
}
