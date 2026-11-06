package org.apache.http.conn;

import java.net.ConnectException;
import org.apache.http.HttpHost;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HttpHostConnectException extends ConnectException {
    private static final long serialVersionUID = -3194482710275220224L;
    private final HttpHost host;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpHostConnectException(java.io.IOException r4, org.apache.http.HttpHost r5, java.net.InetAddress... r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connect to "
            r0.<init>(r1)
            if (r5 == 0) goto Le
            java.lang.String r1 = r5.toHostString()
            goto L10
        Le:
            java.lang.String r1 = "remote host"
        L10:
            r0.append(r1)
            if (r6 == 0) goto L2b
            int r1 = r6.length
            if (r1 <= 0) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " "
            r1.<init>(r2)
            java.util.List r6 = java.util.Arrays.asList(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            goto L2d
        L2b:
            java.lang.String r6 = ""
        L2d:
            r0.append(r6)
            if (r4 == 0) goto L44
            java.lang.String r6 = r4.getMessage()
            if (r6 == 0) goto L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = " failed: "
            r6.<init>(r1)
            java.lang.String r6 = com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0.m(r4, r6)
            goto L46
        L44:
            java.lang.String r6 = " refused"
        L46:
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r3.<init>(r6)
            r3.host = r5
            r3.initCause(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.HttpHostConnectException.<init>(java.io.IOException, org.apache.http.HttpHost, java.net.InetAddress[]):void");
    }

    public HttpHost getHost() {
        return this.host;
    }

    @Deprecated
    public HttpHostConnectException(HttpHost httpHost, ConnectException connectException) {
        this(connectException, httpHost, null);
    }
}
