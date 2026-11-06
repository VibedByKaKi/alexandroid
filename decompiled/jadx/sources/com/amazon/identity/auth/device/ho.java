package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ho implements tc {

    /* renamed from: a, reason: collision with root package name */
    public final ba f709a;
    public final zc b;
    public final a6 c;
    public final StringBuilder d = new StringBuilder();

    public ho(hr hrVar, ba baVar, boolean z) {
        this.f709a = baVar;
        this.b = hrVar;
        if (z) {
            a6 a6Var = new a6(hrVar);
            this.c = a6Var;
            this.b = a6Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0.getClass().getMethod("getError", null).invoke(r0, null) != null) goto L17;
     */
    @Override // com.amazon.identity.auth.device.tc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            com.amazon.identity.auth.device.zc r0 = r6.b
            r0.b()
            com.amazon.identity.auth.device.zc r0 = r6.b
            com.amazon.identity.kcpsdk.common.ParseError r0 = r0.a()
            com.amazon.identity.kcpsdk.common.ParseError r1 = com.amazon.identity.kcpsdk.common.ParseError.ParseErrorNoError
            java.lang.String r2 = "user"
            java.lang.String r3 = "StandardAmazonWebServiceCallback"
            if (r0 == r1) goto L27
            com.amazon.identity.auth.device.yf.a(r3)
            java.lang.String r0 = android.os.Build.TYPE
            r2.equalsIgnoreCase(r0)
            com.amazon.identity.auth.device.zc r0 = r6.b
            r0.a()
            com.amazon.identity.auth.device.ba r6 = r6.f709a
            r6.c()
            return
        L27:
            com.amazon.identity.auth.device.a6 r0 = r6.c
            if (r0 == 0) goto L37
            com.amazon.identity.auth.device.z5 r0 = r0.f415a
            boolean r0 = r0.i
            if (r0 != 0) goto L37
            com.amazon.identity.auth.device.ba r6 = r6.f709a
            r6.a()
            return
        L37:
            com.amazon.identity.auth.device.zc r0 = r6.b
            java.lang.Object r0 = r0.d()
            if (r0 != 0) goto L40
            goto L51
        L40:
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "getError"
            r5 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.invoke(r0, r5)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L59
        L51:
            com.amazon.identity.auth.device.yf.a(r3)
            java.lang.String r1 = android.os.Build.TYPE
            r2.equalsIgnoreCase(r1)
        L59:
            com.amazon.identity.auth.device.ba r6 = r6.f709a
            r6.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.ho.a():void");
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void b() {
        this.f709a.a();
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void onNetworkError() {
        this.f709a.b();
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void a(byte[] bArr, int i) {
        if (this.b.c()) {
            if (this.d.length() < 1024) {
                this.d.append(new String(bArr, 0, this.d.length() + i > 1024 ? 1024 - this.d.length() : i));
            }
            this.b.a(bArr, i);
        }
    }

    @Override // com.amazon.identity.auth.device.tc
    public final void a(gr grVar) {
        this.b.a(grVar);
    }
}
