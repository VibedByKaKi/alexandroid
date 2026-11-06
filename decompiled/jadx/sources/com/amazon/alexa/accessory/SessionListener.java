package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.AccessoryTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class SessionListener {
    public abstract void onSessionConnected();

    public abstract void onSessionDisconnected();

    public abstract void onSessionFailed(Throwable th);

    public void onSessionTransportChanged(Accessory accessory, AccessoryTransport.Type type, AccessoryTransport.Type type2) {
    }
}
