package com.amazon.identity.auth.device;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class dp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f584a;

    public dp(Runnable runnable) {
        this.f584a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = hp.b;
        this.f584a.run();
        hp.b.get();
    }
}
