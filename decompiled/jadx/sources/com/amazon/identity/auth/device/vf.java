package com.amazon.identity.auth.device;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xf f1029a;

    public vf(xf xfVar) {
        this.f1029a = xfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Log.i(yf.a("MAPJavascriptInterface"), "Javascript interface onCF() is triggered.");
        this.f1029a.f1069a.a();
        this.f1029a.f1069a.b();
    }
}
