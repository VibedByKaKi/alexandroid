package com.amazon.identity.auth.accounts;

import android.accounts.Account;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.y4;
import com.amazon.identity.auth.device.yf;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class t extends y4 implements e0 {
    public final Object[] c = new Object[0];
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final f0 e;
    public final Account f;

    public t(Account account, f0 f0Var) {
        this.e = f0Var;
        this.f = account;
    }

    public final void a(int i, String str) {
        synchronized (this.c) {
            Locale locale = Locale.ENGLISH;
            Log.e(yf.a("DeregisterAccount"), "SubAuth Deregister Error: errorCode=" + i + ", msg=" + str);
            this.d.set(false);
            asyncOperationComplete();
        }
    }

    @Override // com.amazon.identity.auth.device.y4
    public final void onTimeout() {
        synchronized (this.c) {
            Log.e(yf.a("DeregisterAccount"), "SubAuth Deregister Timeout");
            this.d.set(false);
            asyncOperationComplete();
        }
    }

    @Override // com.amazon.identity.auth.device.y4
    public final void startAsyncOperation() {
        u.f.execute(new s(this));
    }

    public final void a() {
        synchronized (this.c) {
            String str = this.e.f393a.f946a;
            yf.a("DeregisterAccount");
            "user".equalsIgnoreCase(Build.TYPE);
            this.d.set(true);
            asyncOperationComplete();
        }
    }
}
