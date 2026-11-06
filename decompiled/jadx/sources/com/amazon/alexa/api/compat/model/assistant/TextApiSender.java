package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class TextApiSender {
    private static final String TAG = "TextApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public TextApiSender(Messenger messenger, int i) {
        this.messenger = messenger;
        this.specIndex = i;
    }

    public void sendMessage(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(TextApiArgumentType.MESSAGE.name(), str);
        bundle2.putBundle(TextApiArgumentType.DIALOG_EXTRAS.name(), bundle);
        sendMessage(TextApiMessageType.SEND_MESSAGE.ordinal(), bundle2);
    }

    private boolean sendMessage(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
            return true;
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            return false;
        }
    }
}
