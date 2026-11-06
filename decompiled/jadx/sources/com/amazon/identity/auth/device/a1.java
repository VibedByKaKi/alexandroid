package com.amazon.identity.auth.device;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a1 implements AccountManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AccountManagerCallback f411a;
    public final fl b;

    public a1(AccountManagerCallback accountManagerCallback, fl flVar) {
        this.f411a = accountManagerCallback;
        this.b = flVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        this.b.a();
        AccountManagerCallback accountManagerCallback = this.f411a;
        if (accountManagerCallback != null) {
            accountManagerCallback.run(accountManagerFuture);
        }
    }
}
