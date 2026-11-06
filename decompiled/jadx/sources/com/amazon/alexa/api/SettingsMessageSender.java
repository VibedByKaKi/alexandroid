package com.amazon.alexa.api;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.messages.messagesender.AlexaMessageSender;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class SettingsMessageSender extends AlexaMessageSender<SettingsMessageType> implements SettingsListener {
    private static final String TAG = "SettingsMessageSender";
    private final ExtendedClient client;

    public SettingsMessageSender(IBinder iBinder, ExtendedClient extendedClient) {
        super(iBinder);
        this.client = extendedClient;
    }

    @Override // com.amazon.alexa.api.SettingsListener
    public void onSettingsUpdated(Map<String, String> map) {
        try {
            sendMessage(SettingsMessageType.ON_SETTINGS_UPDATED, new SettingsMessagePayload(this.client, new HashMap(map)).getBundle());
        } catch (RemoteException e) {
            Log.e(TAG, "Failed to deliver onSettingsUpdated: ", e);
        }
    }
}
