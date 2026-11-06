package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class r4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f912a;
    public final /* synthetic */ v4 b;

    public r4(v4 v4Var, gr grVar) {
        this.b = v4Var;
        this.f912a = grVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho hoVar = this.b.f1020a;
        hoVar.b.a(this.f912a);
    }
}
