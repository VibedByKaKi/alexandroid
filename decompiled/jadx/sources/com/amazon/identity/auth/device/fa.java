package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.auth.DeregisterDeviceErrorType;
import com.amazon.identity.kcpsdk.common.ParseError;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class fa extends com.amazon.identity.kcpsdk.common.a {
    public final ds f;
    public ea g;

    public fa() {
        super("com.amazon.identity.kcpsdk.auth.DeregisterDeviceResponseParser");
        this.f = new ds();
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final void a(byte[] bArr, long j) {
        this.f.f586a.write(bArr, 0, (int) j);
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final Object b() {
        return this.g;
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final void c() {
        Document a2 = this.f.a();
        if (a2 == null) {
            a(ParseError.ParseErrorMalformedBody);
            return;
        }
        ea eaVar = new ea();
        if (zb.a(a2) != null) {
            eaVar.f596a = new da(DeregisterDeviceErrorType.DeregisterDeviceErrorTypeFailed);
        }
        this.g = eaVar;
    }
}
