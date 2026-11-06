package com.amazon.identity.auth.device;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.MAPCallbackErrorException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public String f821a;
    public String b;
    public String c;
    public String d;

    public static n1 a(Bundle bundle) {
        n1 a2 = a().a(bundle.getString("com.amazon.dcp.sso.property.account.acctId"));
        a2.b = bundle.getString("key_recover_context_reason");
        a2.c = bundle.getString("key_recover_context_url");
        a2.d = bundle.getString("key_recover_context_action");
        return a2;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("com.amazon.dcp.sso.property.account.acctId", this.f821a);
        bundle.putString("key_recover_context_reason", this.b);
        bundle.putString("key_recover_context_url", this.c);
        bundle.putString("key_recover_context_action", this.d);
        return bundle;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBundle("com.amazon.identity.mobi.account.recover.context", b());
        return bundle;
    }

    public static n1 a() {
        yf.a("AccountRecoverContext");
        "user".equalsIgnoreCase(Build.TYPE);
        n1 n1Var = new n1();
        n1Var.d = "action_confirm_credential";
        return n1Var;
    }

    public final n1 a(String str) {
        Log.i(yf.a("AccountRecoverContext"), "Building an account recover context bundle for: ***".concat(str.substring(str.length() - Math.min(2, str.length()))));
        this.f821a = str;
        return this;
    }

    public static n1 a(MAPCallbackErrorException mAPCallbackErrorException) {
        Bundle bundle;
        Bundle errorBundle = mAPCallbackErrorException.getErrorBundle();
        if (errorBundle == null || (bundle = errorBundle.getBundle("com.amazon.identity.mobi.account.recover.context")) == null) {
            return null;
        }
        return a(bundle);
    }
}
