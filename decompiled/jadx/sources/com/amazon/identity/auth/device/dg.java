package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class dg implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ig f580a;
    public final k4 b;

    public dg(ig igVar, k4 k4Var) {
        this.f580a = igVar;
        this.b = k4Var;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        this.f580a.onError(bundle);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        if (bundle != null) {
            this.b.a(bundle.getString("secureSessionToken"));
        }
        this.f580a.onSuccess(bundle);
    }
}
