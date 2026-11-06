package com.amazon.identity.auth.accounts;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.dcp.sso.ISubAuthenticator;
import com.amazon.identity.auth.device.so;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.utils.ResourceHelper$ResourceNotFoundException;
import com.amazon.identity.auth.device.yf;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class f0 {
    public static final long i = 3000;

    /* renamed from: a, reason: collision with root package name */
    public final so f393a;
    public final tn b;
    public SubAuthenticatorConnection$CurrentState d;
    public r e;
    public ISubAuthenticator f;
    public boolean g;
    public b0 c = new b0(this);
    public final Object[] h = new Object[0];

    public f0(so soVar, tn tnVar) {
        if (soVar == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("SubAuthenticatorDescription cannot be null");
            throw null;
        }
        if (tnVar == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Context cannot be null");
            throw null;
        }
        this.f393a = soVar;
        this.b = tnVar;
        this.d = SubAuthenticatorConnection$CurrentState.Unbound;
        this.g = false;
    }

    public final void a(Account account, e0 e0Var) {
        SubAuthenticatorConnection$CurrentState subAuthenticatorConnection$CurrentState;
        synchronized (this.h) {
            subAuthenticatorConnection$CurrentState = this.d;
        }
        if (subAuthenticatorConnection$CurrentState != SubAuthenticatorConnection$CurrentState.Bound) {
            Log.e(yf.a("SubAuthenticatorConnection"), "Cannot deregister the Sub Authenticator until the connection has been opened");
            ((t) e0Var).a(8, "In bad state. Cannot deregister");
            return;
        }
        d0 d0Var = new d0(this, e0Var);
        try {
            String str = this.f393a.f946a;
            yf.a("SubAuthenticatorConnection");
            "user".equalsIgnoreCase(Build.TYPE);
            this.f.getAccountRemovalAllowed(d0Var, account.type, account.name);
        } catch (RemoteException unused) {
            a(e0Var);
        } catch (RuntimeException e) {
            Log.e(yf.a("SubAuthenticatorConnection"), com.amazon.identity.auth.device.b0.a("SubAuthenticator package caused run time exception in it's getAccountRemovalAllowed implementation. Error Message: ", e.getMessage()));
            a(e0Var);
        }
    }

    public final void a() {
        synchronized (this.h) {
            try {
                if (this.d != SubAuthenticatorConnection$CurrentState.Bound) {
                    Log.e(yf.a("SubAuthenticatorConnection"), "Cannot close the connection because it was not connected");
                    return;
                }
                b0 b0Var = this.c;
                if (b0Var != null) {
                    try {
                        this.b.unbindService(b0Var);
                    } catch (IllegalArgumentException unused) {
                        Log.w(yf.a("SubAuthenticatorConnection"), "IllegalArgumentException is received during unbinding from Subauthenticator package, Ignored.");
                    }
                    this.c = null;
                }
                this.d = SubAuthenticatorConnection$CurrentState.Unbound;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        tn tnVar = this.b;
        Resources resources = tnVar.getResources();
        int identifier = resources.getIdentifier("ErrorConnectingToSubAuth", TypedValues.Custom.S_STRING, tnVar.getPackageName());
        if (identifier != 0) {
            ((t) e0Var).a(-1, String.format(resources.getString(identifier), this.f393a.f946a));
        } else {
            Log.w(yf.a("ResourceHelper"), "The String resource ErrorConnectingToSubAuth has not been found");
            throw new ResourceHelper$ResourceNotFoundException("String Resource ErrorConnectingToSubAuth not found");
        }
    }
}
