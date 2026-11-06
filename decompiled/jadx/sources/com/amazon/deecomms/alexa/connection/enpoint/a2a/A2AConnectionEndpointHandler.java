package com.amazon.deecomms.alexa.connection.enpoint.a2a;

import androidx.annotation.NonNull;
import com.amazon.deecomms.alexa.connection.enpoint.ConnectionEndpointHandler;
import com.amazon.deecomms.calling.controller.CallManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class A2AConnectionEndpointHandler implements ConnectionEndpointHandler {
    final CallManager callManager;

    public A2AConnectionEndpointHandler(@NonNull CallManager callManager) {
        this.callManager = callManager;
    }

    @Override // com.amazon.deecomms.alexa.connection.enpoint.ConnectionEndpointHandler
    public boolean shouldDisconnect() {
        return !this.callManager.isInAlexaCallMode();
    }
}
