package com.amazon.identity.auth.device;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class fh implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final rq f621a;

    public fh(String str) {
        this.f621a = new rq(Executors.newCachedThreadPool(new gh(str)));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f621a.f927a.execute(runnable);
    }
}
