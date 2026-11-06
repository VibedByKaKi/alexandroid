package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.common.ParseError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a6 implements zc {

    /* renamed from: a, reason: collision with root package name */
    public final z5 f415a = new z5();
    public final hr b;

    public a6(hr hrVar) {
        this.b = hrVar;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError a(byte[] bArr, int i) {
        if (this.b.c()) {
            this.b.a(bArr, i);
        }
        z5 z5Var = this.f415a;
        if (z5Var.j) {
            z5Var.b(bArr, i);
        }
        return a();
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError b() {
        this.b.b();
        this.f415a.a();
        return a();
    }

    @Override // com.amazon.identity.auth.device.zc
    public final boolean c() {
        return this.b.c() || this.f415a.j;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final Object d() {
        return this.b.d();
    }

    @Override // com.amazon.identity.auth.device.zc
    public final void a(gr grVar) {
        this.b.a(grVar);
        this.f415a.a(grVar);
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError a() {
        if (this.b.a() != ParseError.ParseErrorNoError) {
            return this.b.a();
        }
        return this.f415a.b;
    }
}
