package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vm extends com.amazon.identity.kcpsdk.common.a {
    public final ds f;
    public um g;

    public vm() {
        super("com.amazon.identity.kcpsdk.auth.RenameDeviceResponseParser");
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    @Override // com.amazon.identity.kcpsdk.common.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            com.amazon.identity.auth.device.ds r0 = r8.f
            org.w3c.dom.Document r0 = r0.a()
            if (r0 != 0) goto Le
            com.amazon.identity.kcpsdk.common.ParseError r0 = com.amazon.identity.kcpsdk.common.ParseError.ParseErrorMalformedBody
            r8.a(r0)
            return
        Le:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            java.lang.String r1 = "Received a null response from the server"
            r2 = 7
            r3 = 0
            if (r0 == 0) goto L7f
            java.lang.String r4 = r0.getTagName()
            java.lang.String r5 = "response"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L26
            goto L7f
        L26:
            java.lang.String r4 = "error_code"
            org.w3c.dom.Element r4 = com.amazon.identity.auth.device.es.a(r0, r4)
            java.lang.String r5 = "text"
            org.w3c.dom.Element r0 = com.amazon.identity.auth.device.es.a(r0, r5)
            java.lang.String r4 = com.amazon.identity.auth.device.es.b(r4)
            java.lang.String r0 = com.amazon.identity.auth.device.es.b(r0)
            if (r4 != 0) goto L3e
            goto L7f
        L3e:
            java.lang.Integer r4 = com.amazon.identity.auth.device.no.a(r4)
            if (r4 != 0) goto L4e
            com.amazon.identity.auth.device.um r0 = new com.amazon.identity.auth.device.um
            com.amazon.identity.auth.device.api.MAPError$CommonError r4 = com.amazon.identity.auth.device.api.MAPError.CommonError.INVALID_RESPONSE
            java.lang.String r5 = "No response code found."
            r0.<init>(r4, r1, r2, r5)
            goto L80
        L4e:
            int r5 = r4.intValue()
            if (r5 == 0) goto L72
            r4 = 2
            if (r5 == r4) goto L6a
            r4 = 4
            if (r5 == r4) goto L62
            com.amazon.identity.auth.device.api.MAPError$CommonError r4 = com.amazon.identity.auth.device.api.MAPError.CommonError.INVALID_RESPONSE
            java.lang.String r5 = r4.getErrorMessage()
            r6 = r2
            goto L78
        L62:
            com.amazon.identity.auth.device.api.MAPError$AccountError r4 = com.amazon.identity.auth.device.api.MAPError.AccountError.DUPLICATE_DEVICE_NAME
            java.lang.String r5 = r4.getErrorMessage()
            r6 = 5
            goto L78
        L6a:
            com.amazon.identity.auth.device.api.MAPError$CommonError r4 = com.amazon.identity.auth.device.api.MAPError.CommonError.BAD_REQUEST
            java.lang.String r5 = r4.getErrorMessage()
            r6 = 3
            goto L78
        L72:
            int r6 = r4.intValue()
            r4 = r3
            r5 = r4
        L78:
            com.amazon.identity.auth.device.um r7 = new com.amazon.identity.auth.device.um
            r7.<init>(r4, r5, r6, r0)
            r0 = r7
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L89
            com.amazon.identity.auth.device.um r0 = new com.amazon.identity.auth.device.um
            com.amazon.identity.auth.device.api.MAPError$CommonError r4 = com.amazon.identity.auth.device.api.MAPError.CommonError.INVALID_RESPONSE
            r0.<init>(r4, r1, r2, r3)
        L89:
            r8.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.vm.c():void");
    }
}
