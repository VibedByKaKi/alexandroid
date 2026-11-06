package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f891a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v4 c;

    public q4(v4 v4Var, byte[] bArr, int i) {
        this.c = v4Var;
        this.f891a = bArr;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f1020a.a(this.f891a, this.b);
    }
}
