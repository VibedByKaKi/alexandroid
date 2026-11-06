package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jc implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f748a;
    public String b;
    public final /* synthetic */ mc c;

    public jc(mc mcVar, Callback callback) {
        this.c = mcVar;
        this.f748a = callback;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        synchronized (this) {
            if (this.b != null) {
                Log.w(yf.a("GenericIPCSender"), "Duplicate callback detected: onError called after " + this.b);
                return;
            }
            this.b = "onError";
            Callback callback = this.f748a;
            mc mcVar = this.c;
            if (bundle == null) {
                mcVar.getClass();
                bundle = null;
            } else if (mcVar.d != null && bundle.containsKey("ipc_error_code_key")) {
                int i = bundle.getInt("ipc_error_code_key");
                bundle.putInt(mcVar.d, mcVar.f.get(i, i));
                bundle.remove("ipc_error_code_key");
                bundle.putString(mcVar.e, bundle.getString("ipc_error_code_message"));
                bundle.remove("ipc_error_code_message");
            }
            callback.onError(bundle);
        }
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        synchronized (this) {
            if (this.b == null) {
                this.b = "onSuccess";
                this.f748a.onSuccess(bundle);
            } else {
                Log.w(yf.a("GenericIPCSender"), "Duplicate callback detected: onSuccess called after " + this.b);
            }
        }
    }
}
