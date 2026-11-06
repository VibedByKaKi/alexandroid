package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.common.ParseError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hr implements zc {

    /* renamed from: a, reason: collision with root package name */
    public final com.amazon.identity.kcpsdk.common.a f712a;

    public hr(com.amazon.identity.kcpsdk.common.a aVar) {
        this.f712a = aVar;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError a(byte[] bArr, int i) {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            return aVar.b(bArr, i);
        }
        return null;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError b() {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final boolean c() {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final Object d() {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @Override // com.amazon.identity.auth.device.zc
    public final void a(gr grVar) {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            aVar.a(grVar);
        }
    }

    @Override // com.amazon.identity.auth.device.zc
    public final ParseError a() {
        com.amazon.identity.kcpsdk.common.a aVar = this.f712a;
        if (aVar != null) {
            return aVar.b;
        }
        return null;
    }
}
