package com.amazon.identity.auth.device;

import android.os.Build;
import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vp implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xp f1035a;

    public vp(xp xpVar) {
        this.f1035a = xpVar;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        yf.a("TokenJobQueue");
        "user".equalsIgnoreCase(Build.TYPE);
        this.f1035a.a();
        this.f1035a.f1077a.onError(bundle);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        yf.a("TokenJobQueue");
        "user".equalsIgnoreCase(Build.TYPE);
        this.f1035a.a();
        this.f1035a.f1077a.onSuccess(bundle);
    }
}
