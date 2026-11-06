package com.amazon.identity.auth.device;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private volatile CountDownLatch f1082a = new CountDownLatch(1);
    private final AtomicBoolean b = new AtomicBoolean(false);

    public void asyncOperationComplete() {
        this.f1082a.countDown();
    }

    public synchronized void run(Long l, TimeUnit timeUnit, String str) {
        if (this.b.getAndSet(true)) {
            Log.e(yf.a("AsyncToSyncAdapter"), "Attempted to call run() more than once on the same object.");
            return;
        }
        yf.a("Starting the operation %s and waiting for it to finish", str);
        startAsyncOperation();
        do {
            CountDownLatch countDownLatch = this.f1082a;
            if (l != null) {
                try {
                    if (!countDownLatch.await(l.longValue(), timeUnit)) {
                        onTimeout();
                    }
                } catch (InterruptedException unused) {
                    interruptAsyncOperation();
                }
            } else {
                countDownLatch.await();
            }
        } while (this.f1082a.getCount() > 0);
        yf.a("Completed the operation %s", str);
    }

    public abstract void startAsyncOperation();

    public void interruptAsyncOperation() {
    }

    public void onTimeout() {
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        run(null, null, null);
    }
}
