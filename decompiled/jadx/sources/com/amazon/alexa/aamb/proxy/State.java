package com.amazon.alexa.aamb.proxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class State {
    private Proxy proxy;

    public State(Proxy proxy) {
        this.proxy = proxy;
    }

    public void onBluetoothChanged(boolean z) {
    }

    public void onWiFiChanged(boolean z) {
    }
}
