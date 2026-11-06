package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCardListenerMessageSender extends AlexaMessageSender<AlexaCardListenerMessageType> implements AlexaCardListener {
    private static final String TAG = "AlexaCardListenerMessageSender";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CardMessagePayload {
        private final Bundle bundle;

        public CardMessagePayload(String str, AlexaCardExtras alexaCardExtras) {
            Bundle bundle = new Bundle();
            this.bundle = bundle;
            bundle.putString(AlexaCardListenerArgumentKey.CARD_DATA.name(), str);
            bundle.putBundle(AlexaCardListenerArgumentKey.CARD_EXTRAS.name(), alexaCardExtras.getBundle());
        }

        public Bundle getBundle() {
            return this.bundle;
        }
    }

    public AlexaCardListenerMessageSender(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.amazon.alexa.api.AlexaCardListener
    public void onReceivedRenderCard(String str, AlexaCardExtras alexaCardExtras) {
        try {
            sendMessage(AlexaCardListenerMessageType.ON_RECEIVED_RENDER_CARD, new CardMessagePayload(str, alexaCardExtras).getBundle());
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to send render card data", e);
        }
    }
}
