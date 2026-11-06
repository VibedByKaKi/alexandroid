package com.amazon.identity.auth.device;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class oc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f855a;
    public final /* synthetic */ CountDownLatch b;

    public oc(Runnable runnable, CountDownLatch countDownLatch) {
        this.f855a = runnable;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f855a.run();
        } finally {
            this.b.countDown();
        }
    }
}
