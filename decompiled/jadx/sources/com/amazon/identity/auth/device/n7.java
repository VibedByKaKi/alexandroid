package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class n7 extends q7 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ q7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Context context, q7 q7Var) {
        super(null);
        this.e = context;
        this.f = q7Var;
    }

    @Override // com.amazon.identity.auth.device.q7, com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        a(2, bundle);
        if (bundle.getInt(MAPError.KEY_ERROR_CODE) == MAPError.AccountError.ACCOUNT_ALREADY_REGISTERED.getErrorCode()) {
            Log.i(yf.a("CBLLogic"), "Cleaning CBL code for ACCOUNT_ALREADY_REGISTERED error.");
            le.b(this.e, "cbl_storage").a();
        }
        Log.i(yf.a("CBLLogic"), "Register with link code was not successful.");
        this.f.onError(bundle);
    }

    @Override // com.amazon.identity.auth.device.q7, com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        a(1, bundle);
        Log.i(yf.a("CBLLogic"), "Register with link code was successful. Clearing the cbl data in MAP");
        le.b(this.e, "cbl_storage").a();
        this.f.onSuccess(bundle);
    }
}
