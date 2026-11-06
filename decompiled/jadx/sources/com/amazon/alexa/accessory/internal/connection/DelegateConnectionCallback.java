package com.amazon.alexa.accessory.internal.connection;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class DelegateConnectionCallback implements ConnectionCallback {
    private final ConnectionCallback callback;

    public DelegateConnectionCallback(ConnectionCallback connectionCallback) {
        Preconditions.notNull(connectionCallback, "callback");
        this.callback = connectionCallback;
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onActive() {
        this.callback.onActive();
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onConnected() {
        this.callback.onConnected();
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onDisconnected() {
        this.callback.onDisconnected();
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onFailed(Throwable th) {
        this.callback.onFailed(th);
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onIdle() {
        this.callback.onIdle();
    }
}
