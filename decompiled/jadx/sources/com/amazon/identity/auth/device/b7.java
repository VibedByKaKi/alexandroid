package com.amazon.identity.auth.device;

import android.content.Intent;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f529a;

    public b7(c7 c7Var) {
        this.f529a = c7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        boolean z;
        Intent intent;
        objArr = this.f529a.f555a;
        synchronized (objArr) {
            try {
                c7 c7Var = this.f529a;
                z = c7Var.f;
                if (z) {
                    return;
                }
                intent = c7Var.c;
                Log.e(yf.a("BoundServiceCaller"), "Application timed out trying to bind to " + intent.getComponent().getPackageName());
                c7 c7Var2 = this.f529a;
                c7Var2.e = null;
                c7Var2.serviceTimedOut();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
