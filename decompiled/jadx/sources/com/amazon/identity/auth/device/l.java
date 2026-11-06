package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPError;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l extends y4 {
    public static final long f = 300;
    public final Callback c;
    public final m d;
    public final String e;

    public l(m mVar, Callback callback, String str) {
        this.c = callback;
        this.d = mVar;
        this.e = str;
    }

    @Override // com.amazon.identity.auth.device.y4
    public final void onTimeout() {
        yf.a("AccountAuthenticatorQueue", "AccountAuthenticator operation timed out: " + this.e, "AccountAuthenticatorQueue:OperationTimeout:" + this.e);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(MAPError.KEY_ERROR_CODE, MAPError.CommonError.INTERNAL_ERROR.getErrorCode());
            bundle.putString(MAPError.KEY_ERROR_MESSAGE, "AccountAuthenticator operation timed out: " + this.e);
            this.c.onError(bundle);
        } finally {
            asyncOperationComplete();
        }
    }

    @Override // com.amazon.identity.auth.device.y4, java.lang.Runnable
    public final synchronized void run() {
        super.run(Long.valueOf(f), TimeUnit.SECONDS, this.e);
    }

    @Override // com.amazon.identity.auth.device.y4
    public final void startAsyncOperation() {
        k kVar = new k(this);
        yf.a("AccountAuthenticatorQueue", "Pushing task %s on AccountAuthenticatorQueue.", this.e);
        this.d.a(kVar);
    }
}
