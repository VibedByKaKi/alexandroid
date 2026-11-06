package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class gg implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl f681a;
    public final /* synthetic */ jc b;

    public gg(fl flVar, jc jcVar) {
        this.f681a = flVar;
        this.b = jcVar;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        this.f681a.a();
        this.b.onError(bundle);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        this.f681a.a();
        this.b.onSuccess(bundle);
    }
}
