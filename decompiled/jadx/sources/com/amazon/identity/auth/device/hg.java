package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.MAPError;
import com.amazon.identity.auth.device.api.TypedCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hg implements TypedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq f703a;
    public final /* synthetic */ TypedCallback b;

    public hg(nq nqVar, TypedCallback typedCallback) {
        this.f703a = nqVar;
        this.b = typedCallback;
    }

    @Override // com.amazon.identity.auth.device.api.TypedCallback
    public final void onError(Bundle bundle) {
        if (this.f703a != null) {
            String string = bundle.getString(MAPError.KEY_ERROR_TYPE);
            if (string != null) {
                this.f703a.c.c = string;
            }
            this.f703a.a(false);
            this.f703a.a();
        }
        TypedCallback typedCallback = this.b;
        if (typedCallback != null) {
            typedCallback.onError(bundle);
        }
    }

    @Override // com.amazon.identity.auth.device.api.TypedCallback
    public final void onSuccess(Object obj) {
        nq nqVar = this.f703a;
        if (nqVar != null) {
            nqVar.a(true);
            this.f703a.a();
        }
        TypedCallback typedCallback = this.b;
        if (typedCallback != null) {
            typedCallback.onSuccess(obj);
        }
    }
}
