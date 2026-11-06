package com.amazon.identity.auth.accounts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f402a;

    public s(t tVar) {
        this.f402a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f402a;
        tVar.e.a(tVar.f, tVar);
    }
}
