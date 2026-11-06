package com.amazon.identity.auth.device;

import com.amazon.identity.kcpsdk.common.ParseError;
import com.mapbox.common.HttpHeaders;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class z5 extends com.amazon.identity.kcpsdk.common.a {
    public final ds f;
    public final ParseError g;
    public final ParseError h;
    public boolean i;
    public boolean j;

    public z5() {
        super("com.amazon.identity.kcpsdk.auth.AuthenticatedResponseHandler");
        this.f = new ds();
        ParseError parseError = ParseError.ParseErrorNoError;
        this.g = parseError;
        this.h = parseError;
        this.i = true;
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final void a(byte[] bArr, long j) {
        if (this.h == ParseError.ParseErrorNoError && this.j) {
            this.f.f586a.write(bArr, 0, (int) j);
        }
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final boolean b(gr grVar) {
        long j = grVar.c;
        String str = (String) grVar.f688a.get(HttpHeaders.CONTENT_TYPE.toLowerCase(Locale.US));
        boolean z = j == 500 || (j == 200 && (str == null || "text/xml".equals(str)));
        this.j = z;
        if (z) {
            yf.a("AuthenticatedResponseHandler", "AuthenticatedResponseHandler: beginParse: Response could be an authentication error. Will try to parse as an authentication error. Status Code: %d Content-Type: %s", Long.valueOf(j), str);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (((r0 == null || !r0.getTagName().equals("Errors") || (r0 = com.amazon.identity.auth.device.es.a(r0, "Error")) == null || (r0 = com.amazon.identity.auth.device.es.a(r0, "Code")) == null) ? false : "DEVICE_MASTER_SERVICE_ERROR".equals(r0.getTextContent())) != false) goto L28;
     */
    @Override // com.amazon.identity.kcpsdk.common.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r4 = this;
            boolean r0 = r4.j
            if (r0 == 0) goto L63
            com.amazon.identity.kcpsdk.common.ParseError r0 = r4.h
            com.amazon.identity.kcpsdk.common.ParseError r1 = com.amazon.identity.kcpsdk.common.ParseError.ParseErrorNoError
            if (r0 == r1) goto Lb
            goto L60
        Lb:
            com.amazon.identity.auth.device.ds r0 = r4.f
            org.w3c.dom.Document r0 = r0.a()
            if (r0 != 0) goto L14
            goto L60
        L14:
            com.amazon.identity.auth.device.yb r1 = com.amazon.identity.auth.device.zb.a(r0)
            r2 = 0
            if (r1 == 0) goto L21
            com.amazon.identity.kcpsdk.common.FIRSErrorType r1 = r1.f1088a
            com.amazon.identity.kcpsdk.common.FIRSErrorType r3 = com.amazon.identity.kcpsdk.common.FIRSErrorType.FIRSErrorTypeInternalError
            if (r1 == r3) goto L54
        L21:
            org.w3c.dom.Element r0 = r0.getDocumentElement()
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.getTagName()
            java.lang.String r3 = "Errors"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L34
            goto L51
        L34:
            java.lang.String r1 = "Error"
            org.w3c.dom.Element r0 = com.amazon.identity.auth.device.es.a(r0, r1)
            if (r0 != 0) goto L3d
            goto L51
        L3d:
            java.lang.String r1 = "Code"
            org.w3c.dom.Element r0 = com.amazon.identity.auth.device.es.a(r0, r1)
            if (r0 != 0) goto L46
            goto L51
        L46:
            java.lang.String r0 = r0.getTextContent()
            java.lang.String r1 = "DEVICE_MASTER_SERVICE_ERROR"
            boolean r0 = r1.equals(r0)
            goto L52
        L51:
            r0 = r2
        L52:
            if (r0 == 0) goto L60
        L54:
            java.lang.String r0 = "AuthenticatedResponseHandler: endParse: Server returned an authentication error. You can ignore any malformed response errors from the inner parser."
            java.lang.String r1 = "AuthenticatedResponseHandler"
            java.lang.String r1 = com.amazon.identity.auth.device.yf.a(r1)
            android.util.Log.i(r1, r0)
            goto L61
        L60:
            r2 = 1
        L61:
            r4.i = r2
        L63:
            com.amazon.identity.kcpsdk.common.ParseError r0 = r4.g
            com.amazon.identity.kcpsdk.common.ParseError r1 = com.amazon.identity.kcpsdk.common.ParseError.ParseErrorNoError
            boolean r1 = r4.i
            if (r1 == 0) goto L6c
            goto L6e
        L6c:
            com.amazon.identity.kcpsdk.common.ParseError r0 = r4.h
        L6e:
            r4.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.z5.c():void");
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final boolean d() {
        return this.j;
    }

    @Override // com.amazon.identity.kcpsdk.common.a
    public final Object b() {
        return null;
    }
}
