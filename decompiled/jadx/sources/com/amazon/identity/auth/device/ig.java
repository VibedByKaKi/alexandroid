package com.amazon.identity.auth.device;

import android.os.Build;
import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ig implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq f726a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Callback c;
    public final /* synthetic */ com.amazon.identity.auth.device.token.c d;
    public final /* synthetic */ MAPAccountManager.RegistrationError e;
    public final /* synthetic */ tn f;

    public ig(nq nqVar, boolean z, Callback callback, com.amazon.identity.auth.device.token.c cVar, MAPAccountManager.RegistrationError registrationError, tn tnVar) {
        this.f726a = nqVar;
        this.b = z;
        this.c = callback;
        this.d = cVar;
        this.e = registrationError;
        this.f = tnVar;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        Double valueOf = Double.valueOf(1.0d);
        if (this.d != null) {
            yf.a("MetricsHelper");
            "user".equalsIgnoreCase(Build.TYPE);
            this.d.onFinish(new Bundle());
        }
        String string = bundle.getString(MAPError.KEY_ERROR_TYPE);
        String name = MAPAccountManager.RegistrationError.fromValue(bundle.getInt("com.amazon.dcp.sso.ErrorCode", this.e.value()), this.e).getName();
        nq nqVar = this.f726a;
        if (string != null) {
            String concat = "MAPError:".concat(string);
            tn tnVar = this.f;
            if (tnVar != null) {
                ((u3) tnVar.getSystemService("dcp_device_info")).d();
            }
            nqVar.c.a(concat, valueOf);
            this.f726a.c.c = string;
        } else {
            String a2 = s0.a("Error:", name);
            tn tnVar2 = this.f;
            if (tnVar2 != null) {
                ((u3) tnVar2.getSystemService("dcp_device_info")).d();
            }
            nqVar.c.a(a2, valueOf);
            this.f726a.c.c = name;
        }
        this.f726a.a(false);
        this.f726a.a();
        Callback callback = this.c;
        if (callback != null) {
            callback.onError(bundle);
        }
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        nq nqVar = this.f726a;
        if (nqVar != null) {
            if (this.b) {
                nqVar.a("Success");
            }
            this.f726a.a(true);
            this.f726a.a();
        }
        Callback callback = this.c;
        if (callback != null) {
            callback.onSuccess(bundle);
        }
    }
}
