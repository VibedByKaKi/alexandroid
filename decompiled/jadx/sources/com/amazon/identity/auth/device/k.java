package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class k implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f759a;

    public k(l lVar) {
        this.f759a = lVar;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        yf.a("AccountAuthenticatorQueue", "onError Popping task %s off AccountAuthenticatorQueue.", this.f759a.e);
        this.f759a.asyncOperationComplete();
        this.f759a.c.onError(bundle);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        yf.a("AccountAuthenticatorQueue", "onSuccess Popping task %s off AccountAuthenticatorQueue.", this.f759a.e);
        this.f759a.asyncOperationComplete();
        this.f759a.c.onSuccess(bundle);
    }
}
