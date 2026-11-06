package com.amazon.identity.auth.device;

import android.accounts.AccountManagerFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountManagerFuture f757a;
    public final /* synthetic */ kp b;

    public jp(kp kpVar, AccountManagerFuture accountManagerFuture) {
        this.b = kpVar;
        this.f757a = accountManagerFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f778a.run(this.f757a);
    }
}
