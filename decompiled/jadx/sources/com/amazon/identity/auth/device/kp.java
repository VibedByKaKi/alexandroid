package com.amazon.identity.auth.device;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class kp implements AccountManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ip f778a;

    public kp(ip ipVar) {
        this.f778a = ipVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        np.g.execute(new jp(this, accountManagerFuture));
    }
}
