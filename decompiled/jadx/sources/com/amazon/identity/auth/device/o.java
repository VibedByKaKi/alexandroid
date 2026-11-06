package com.amazon.identity.auth.device;

import android.accounts.IAccountAuthenticatorResponse;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class o extends IAccountAuthenticatorResponse.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ig f845a;

    public o(ig igVar) {
        this.f845a = igVar;
    }

    @Override // android.accounts.IAccountAuthenticatorResponse
    public final void onError(int i, String str) {
        this.f845a.onError(e2.a(MAPError.CommonError.INTERNAL_ERROR, str, i, str));
    }

    @Override // android.accounts.IAccountAuthenticatorResponse
    public final void onResult(Bundle bundle) {
        ig igVar = this.f845a;
        SparseIntArray sparseIntArray = e2.f589a;
        if (bundle != null && (bundle.containsKey("com.amazon.dcp.sso.ErrorCode") || bundle.containsKey("errorCode") || bundle.containsKey(MAPError.KEY_ERROR_CODE))) {
            igVar.onError(bundle);
        } else {
            igVar.onSuccess(bundle);
        }
    }

    @Override // android.accounts.IAccountAuthenticatorResponse
    public final void onRequestContinued() {
    }
}
