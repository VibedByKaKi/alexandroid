package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class ClientConnectionControllerMessageProcessor extends MessageProcessor<ClientConnectionControllerMessageType> {
    private static final String TAG = "ClientConnectionControllerMessageProcessor";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.ClientConnectionControllerMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$ClientConnectionControllerMessageType;

        static {
            int[] iArr = new int[ClientConnectionControllerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$ClientConnectionControllerMessageType = iArr;
            try {
                iArr[ClientConnectionControllerMessageType.ON_FORCE_DISCONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$ClientConnectionControllerMessageType[ClientConnectionControllerMessageType.ON_START_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public ClientConnectionControllerMessageType getMessageType(Message message) {
        try {
            return ClientConnectionControllerMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return ClientConnectionControllerMessageType.UNKNOWN;
        }
    }

    public abstract void onForceDisconnect();

    public abstract void onStartService();

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(ClientConnectionControllerMessageType clientConnectionControllerMessageType, Bundle bundle, @Nullable Messenger messenger) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$ClientConnectionControllerMessageType[clientConnectionControllerMessageType.ordinal()];
        if (i == 1) {
            onForceDisconnect();
            return;
        }
        if (i == 2) {
            onStartService();
            return;
        }
        Log.w(TAG, "Unsupported message " + clientConnectionControllerMessageType);
    }
}
