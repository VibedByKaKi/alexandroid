package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.Callback;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final rq f819a;

    public n() {
        fh fhVar = fp.f623a;
        this.f819a = new rq(Executors.newSingleThreadExecutor(new gh("MAP-AccountAuthenticatorQueueThread")));
    }

    public final void a(m mVar, Callback callback, String str) {
        rq rqVar = this.f819a;
        rqVar.f927a.execute(new l(mVar, callback, str));
    }
}
