package com.amazon.identity.auth.accounts;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.amazon.identity.auth.device.so;
import com.amazon.identity.auth.device.y4;
import com.amazon.identity.auth.device.yf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class r extends y4 {
    public final f0 c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public r(f0 f0Var) {
        this.c = f0Var;
    }

    public final void a() {
        this.d.set(true);
        asyncOperationComplete();
    }

    public final void b() {
        Log.e(yf.a("DeregisterAccount"), "SubAuth Connection timeout");
        this.d.set(false);
        asyncOperationComplete();
    }

    @Override // com.amazon.identity.auth.device.y4
    public final void startAsyncOperation() {
        boolean z;
        f0 f0Var = this.c;
        synchronized (f0Var.h) {
            if (f0Var.d != SubAuthenticatorConnection$CurrentState.Unbound) {
                throw new IllegalStateException("Cannot open a connection to the service because we are currently connecting or have already connected to the service.");
            }
            if (f0Var.c == null) {
                throw new IllegalStateException("Attempted to reuse a SubAuthenticatorConnection.  openConnection can only be executed once.");
            }
            f0Var.d = SubAuthenticatorConnection$CurrentState.Binding;
            f0Var.e = this;
            Intent intent = new Intent("com.amazon.dcp.sso.AccountSubAuthenticator");
            so soVar = f0Var.f393a;
            intent.setComponent(soVar.b == null ? null : new ComponentName(soVar.f946a, soVar.b));
            try {
                z = f0Var.b.bindService(intent, f0Var.c, 5);
            } catch (SecurityException e) {
                Log.e(yf.a("SubAuthenticatorConnection"), "Unable to talk to package because of SecurityException : " + e.getMessage());
                z = false;
            }
            if (z) {
                new Handler(Looper.getMainLooper()).postDelayed(new c0(f0Var), f0.i);
            } else {
                f0Var.d = SubAuthenticatorConnection$CurrentState.Unbound;
                Log.e(yf.a("SubAuthenticatorConnection"), "Application tried to bind to SubAuthenticator Service and failed.");
                z = false;
            }
        }
        if (z) {
            return;
        }
        Log.e(yf.a("DeregisterAccount"), "Error binding to service");
        this.d.set(false);
        asyncOperationComplete();
    }
}
