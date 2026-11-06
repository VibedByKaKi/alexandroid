package com.amazon.alexa.accessory.speech;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.speechapi.AlexaConnection;
import com.amazon.alexa.accessory.speechapi.listeners.ConnectionListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class RetryingAlexaServicesConnectionListener implements ConnectionListener {
    private int attempts;
    protected final AlexaConnection connection;

    public RetryingAlexaServicesConnectionListener(AlexaConnection alexaConnection, int i) {
        this.connection = alexaConnection;
        this.attempts = i;
    }

    @Override // com.amazon.alexa.accessory.speechapi.listeners.ConnectionListener
    public void onConnected() {
        this.connection.deregisterConnectionListener(this);
    }

    @Override // com.amazon.alexa.accessory.speechapi.listeners.ConnectionListener
    public void onConnectingFailed(ConnectionListener.ConnectingFailedReason connectingFailedReason, String str) {
        Logger.d("AlexaServicesConnection request failed. %d retry attempts left. Reason: %s Message: %s", Integer.valueOf(this.attempts), connectingFailedReason, str);
        int i = this.attempts;
        if (i > 0) {
            this.attempts = i - 1;
            this.connection.connect();
        } else {
            this.connection.deregisterConnectionListener(this);
            Logger.e("RetryingAlexaServicesConnectionListener giving up trying to connect.");
        }
    }

    @Override // com.amazon.alexa.accessory.speechapi.listeners.ConnectionListener
    public void onDisconnected() {
        this.connection.deregisterConnectionListener(this);
    }
}
