package com.amazon.identity.auth.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseIntArray;
import com.amazon.dcp.sso.ISubAuthenticatorResponse;
import com.amazon.identity.auth.device.api.MAPError;
import com.amazon.identity.auth.device.e2;
import com.amazon.identity.auth.device.pk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class y implements ISubAuthenticatorResponse {

    /* renamed from: a, reason: collision with root package name */
    public final pk f406a;

    public y(pk pkVar) {
        this.f406a = pkVar;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        throw new UnsupportedOperationException("asBinder is not supported in SubAuthenticatorCallbackAdapter");
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticatorResponse
    public final void onError(int i, String str) {
        e2.a(this.f406a, MAPError.CommonError.INTERNAL_ERROR, str, i, str, null);
    }

    @Override // com.amazon.dcp.sso.ISubAuthenticatorResponse
    public final void onResult(Bundle bundle) {
        pk pkVar = this.f406a;
        SparseIntArray sparseIntArray = e2.f589a;
        if (bundle != null && (bundle.containsKey("com.amazon.dcp.sso.ErrorCode") || bundle.containsKey("errorCode") || bundle.containsKey(MAPError.KEY_ERROR_CODE))) {
            pkVar.onError(bundle);
        } else {
            pkVar.onSuccess(bundle);
        }
    }
}
