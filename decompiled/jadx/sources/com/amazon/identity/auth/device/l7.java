package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.DefaultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l7 extends DefaultCallback {
    public final /* synthetic */ String b;

    public l7(String str) {
        this.b = str;
    }

    @Override // com.amazon.identity.auth.device.api.DefaultCallback, com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        int i = bundle.getInt("com.amazon.dcp.sso.ErrorCode");
        String string = bundle.getString("com.amazon.dcp.sso.ErrorMessage");
        StringBuilder sb = new StringBuilder("Error while deregistering account in ");
        BitVector$$ExternalSyntheticOutline0.m(sb, this.b, " flow. ErrorCode:", i, " ErrorMessage:");
        sb.append(string);
        Log.i(yf.a("CBLLogic"), sb.toString());
    }

    @Override // com.amazon.identity.auth.device.api.DefaultCallback, com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        Log.i(yf.a("CBLLogic"), cg.a(new StringBuilder("Successfully completed deregistering account in "), this.b, " flow"));
    }
}
