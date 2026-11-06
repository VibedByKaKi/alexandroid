package com.amazon.identity.auth.device.callback;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f557a;
    public final /* synthetic */ d b;

    public b(d dVar, Bundle bundle) {
        this.b = dVar;
        this.f557a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f559a.onSuccess(this.f557a);
    }
}
