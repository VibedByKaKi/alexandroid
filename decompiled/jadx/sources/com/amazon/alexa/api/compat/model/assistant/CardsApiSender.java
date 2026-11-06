package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class CardsApiSender {
    private static final String TAG = "CardsApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public CardsApiSender(Messenger messenger, int i) {
        this.messenger = messenger;
        this.specIndex = i;
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

    public void notifyAplCommandResult(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CardsApiArgumentType.RESULT_BUNDLE.name(), bundle);
        sendMessage(CardsApiMessageType.NOTIFY_APL_COMMAND_RESULT.ordinal(), bundle2);
    }

    public void notifyCardRendered(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(CardsApiArgumentType.CARD_TOKEN.name(), str);
        sendMessage(CardsApiMessageType.NOTIFY_CARD_RENDERED.ordinal(), bundle);
    }

    public void reportAplState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CardsApiArgumentType.APL_STATE_BUNDLE.name(), bundle);
        sendMessage(CardsApiMessageType.REPORT_APL_STATE.ordinal(), bundle2);
    }
}
