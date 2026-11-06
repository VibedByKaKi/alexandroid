package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class EndpointsApiSender {
    private static final String TAG = "EndpointsApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public EndpointsApiSender(Messenger messenger, int i) {
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

    private void sendMessageOrThrow(int i, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            throw e;
        }
    }

    public void deregisterEndpoint(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(EndpointsApiArgumentType.CONFIGURATION_BUNDLE.name(), bundle);
        sendMessage(EndpointsApiMessageType.DEREGISTER_ENDPOINT.ordinal(), bundle2);
    }

    public void registerEndpoint(Bundle bundle, String str) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(EndpointsApiArgumentType.CONFIGURATION_BUNDLE.name(), bundle);
        bundle2.putString(EndpointsApiArgumentType.REQUEST_ID.name(), str);
        sendMessageOrThrow(EndpointsApiMessageType.REGISTER_ENDPOINT.ordinal(), bundle2);
    }
}
