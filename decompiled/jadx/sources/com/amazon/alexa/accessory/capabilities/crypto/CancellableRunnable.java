package com.amazon.alexa.accessory.capabilities.crypto;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class CancellableRunnable implements Runnable {
    private final AtomicBoolean isCancelled = new AtomicBoolean(false);
    private final Object lock;
    private final Runnable runnable;

    public CancellableRunnable(Object obj, Runnable runnable) {
        this.lock = obj;
        this.runnable = runnable;
    }

    public void cancel() {
        this.isCancelled.set(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.lock) {
            try {
                if (!this.isCancelled.get()) {
                    this.runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
