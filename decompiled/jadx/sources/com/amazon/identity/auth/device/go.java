package com.amazon.identity.auth.device;

import android.accounts.AccountManagerFuture;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.amazon.identity.auth.device.api.MAPCallbackErrorException;
import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class go extends y {
    public go(AccountManagerFuture accountManagerFuture) {
        super(accountManagerFuture);
    }

    @Override // com.amazon.identity.auth.device.y
    public final Bundle a(Object obj) {
        Bundle bundle = (Bundle) obj;
        SparseIntArray sparseIntArray = e2.f589a;
        if (bundle != null && (bundle.containsKey("com.amazon.dcp.sso.ErrorCode") || bundle.containsKey("errorCode") || bundle.containsKey(MAPError.KEY_ERROR_CODE))) {
            throw new MAPCallbackErrorException(bundle);
        }
        return bundle;
    }
}
