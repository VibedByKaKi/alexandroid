package com.amazon.identity.auth.accounts;

import android.os.Bundle;
import com.amazon.dcp.sso.ISubAuthenticatorResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class d0 extends ISubAuthenticatorResponse.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f392a;

    public d0(f0 f0Var, e0 e0Var) {
        this.f392a = e0Var;
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticatorResponse
    public final void onError(int i, String str) {
        e0 e0Var = this.f392a;
        if (e0Var != null) {
            ((t) e0Var).a(i, str);
        }
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticatorResponse
    public final void onResult(Bundle bundle) {
        e0 e0Var = this.f392a;
        if (e0Var != null) {
            ((t) e0Var).a();
        }
    }
}
