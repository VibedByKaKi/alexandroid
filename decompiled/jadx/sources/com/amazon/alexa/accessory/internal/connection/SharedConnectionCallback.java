package com.amazon.alexa.accessory.internal.connection;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SharedConnectionCallback extends AtomicBoolean implements ConnectionCallback {
    private final ConnectionCallback callback;
    private final AtomicInteger connected;
    private final int count;

    public SharedConnectionCallback(int i, ConnectionCallback connectionCallback) {
        Preconditions.notNegative(i, "count");
        Preconditions.notNull(connectionCallback, "callback");
        this.count = i;
        this.callback = connectionCallback;
        this.connected = new AtomicInteger();
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onActive() {
        this.callback.onActive();
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onConnected() {
        if (!get() && this.connected.incrementAndGet() == this.count) {
            this.callback.onConnected();
        }
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onDisconnected() {
        if (compareAndSet(false, true)) {
            this.callback.onDisconnected();
        }
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onFailed(Throwable th) {
        if (compareAndSet(false, true)) {
            this.callback.onFailed(th);
        }
    }

    @Override // com.amazon.alexa.accessory.internal.connection.ConnectionCallback
    public void onIdle() {
        this.callback.onIdle();
    }
}
