package com.amazon.identity.auth.accounts;

import android.util.Log;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f390a;

    public c0(f0 f0Var) {
        this.f390a = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f390a.g) {
            return;
        }
        Log.e(yf.a("SubAuthenticatorConnection"), "Application tried to bind to SubAuthenticator but Service timed out.");
        this.f390a.e.b();
        this.f390a.a();
    }
}
