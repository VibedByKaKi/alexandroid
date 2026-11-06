package com.amazon.identity.auth.device;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.dcp.sso.ISubAuthenticatorResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ISubAuthenticatorResponse f852a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nq c;
    public final /* synthetic */ u9 d;

    public o9(u9 u9Var, ISubAuthenticatorResponse iSubAuthenticatorResponse, String str, nq nqVar) {
        this.d = u9Var;
        this.f852a = iSubAuthenticatorResponse;
        this.b = str;
        this.c = nqVar;
    }

    public final void a() {
        try {
            Log.e(yf.a("DMSSubAuthenticator"), "Authentication error when registering the child app.");
            this.d.getClass();
            this.f852a.onResult(u9.a(103, "Authentication error during register"));
        } catch (RemoteException unused) {
            Log.e(yf.a("DMSSubAuthenticator"), "RemoteException during authentication failure callback for registerChildApplication");
        }
    }

    public final void b() {
        try {
            Log.e(yf.a("DMSSubAuthenticator"), "Bad response when registering the child app.");
            this.f852a.onError(5, "Received bad response");
        } catch (RemoteException unused) {
            Log.e(yf.a("DMSSubAuthenticator"), "RemoteException during invalid response callback for registerChildApplication");
        }
    }

    public final void c() {
        try {
            Log.e(yf.a("DMSSubAuthenticator"), "Network error when registering the child app.");
            this.c.a("NetworkError13:DMSSubAuthenticator");
            this.f852a.onError(3, "Network error");
        } catch (RemoteException unused) {
            Log.e(yf.a("DMSSubAuthenticator"), "RemoteException during network failure callback for registerChildApplication");
        }
    }

    public final void a(bm bmVar) {
        try {
            Log.i(yf.a("DMSSubAuthenticator"), "Getting response for the child application registration. Storing results.");
            this.d.a(this.f852a, bmVar, this.b);
        } catch (RemoteException unused) {
            Log.e(yf.a("DMSSubAuthenticator"), "RemoteException when credentials was received for registerChildApplication");
        }
    }
}
