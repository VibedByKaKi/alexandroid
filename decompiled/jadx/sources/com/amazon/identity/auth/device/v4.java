package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class v4 implements tc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho f1020a;
    public final /* synthetic */ x4 b;

    public v4(x4 x4Var, ho hoVar) {
        this.b = x4Var;
        this.f1020a = hoVar;
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void a(byte[] bArr, int i) {
        pc.a(this.b.b, new q4(this, bArr, i));
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void b() {
        pc.a(this.b.b, new u4(this));
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void onNetworkError() {
        pc.a(this.b.b, new s4(this));
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void a(gr grVar) {
        pc.a(this.b.b, new r4(this, grVar));
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void a() {
        pc.a(this.b.b, new t4(this));
    }
}
