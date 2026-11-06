package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.AccessoryTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class AccessorySessionListener {
    public void onAccessorySessionConnected(Accessory accessory) {
    }

    public void onAccessorySessionCreated(Accessory accessory) {
    }

    public void onAccessorySessionDisconnected(Accessory accessory) {
    }

    public void onAccessorySessionReleased(Accessory accessory) {
    }

    public void onAccessorySessionFailed(Accessory accessory, Throwable th) {
    }

    public void onAccessorySessionTransportChanged(Accessory accessory, AccessoryTransport.Type type, Accessory accessory2, AccessoryTransport.Type type2) {
    }
}
