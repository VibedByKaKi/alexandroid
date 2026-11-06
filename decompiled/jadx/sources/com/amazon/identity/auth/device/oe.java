package com.amazon.identity.auth.device;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class oe implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        r4 = -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.amazon.identity.auth.device.qm r5 = (com.amazon.identity.auth.device.qm) r5
            com.amazon.identity.auth.device.qm r6 = (com.amazon.identity.auth.device.qm) r6
            r4 = 0
            r0 = -1
            if (r5 != 0) goto Lc
            if (r6 == 0) goto L6a
            goto L60
        Lc:
            r1 = 1
            if (r6 != 0) goto L11
            goto L64
        L11:
            r5.f()     // Catch: com.amazon.identity.auth.device.framework.RemoteMAPException -> L14
        L14:
            r6.f()     // Catch: com.amazon.identity.auth.device.framework.RemoteMAPException -> L17
        L17:
            java.lang.Integer r2 = r5.d
            java.lang.Integer r3 = r6.d
            if (r2 != 0) goto L23
            if (r3 == 0) goto L21
            r2 = r0
            goto L34
        L21:
            r2 = r4
            goto L34
        L23:
            if (r3 != 0) goto L27
            r2 = r1
            goto L34
        L27:
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r2 = r2 - r3
            int r2 = java.lang.Integer.signum(r2)
        L34:
            if (r2 == 0) goto L38
        L36:
            r4 = r2
            goto L6a
        L38:
            java.lang.Integer r2 = r5.e
            java.lang.Integer r3 = r6.e
            if (r2 != 0) goto L44
            if (r3 == 0) goto L42
            r2 = r0
            goto L55
        L42:
            r2 = r4
            goto L55
        L44:
            if (r3 != 0) goto L48
            r2 = r1
            goto L55
        L48:
            int r2 = r2.intValue()
            int r3 = r3.intValue()
            int r2 = r2 - r3
            int r2 = java.lang.Integer.signum(r2)
        L55:
            if (r2 == 0) goto L58
            goto L36
        L58:
            java.lang.String r5 = r5.b
            java.lang.String r6 = r6.b
            if (r5 != 0) goto L62
            if (r6 == 0) goto L6a
        L60:
            r4 = r0
            goto L6a
        L62:
            if (r6 != 0) goto L66
        L64:
            r4 = r1
            goto L6a
        L66:
            int r4 = r5.compareTo(r6)
        L6a:
            int r4 = r4 * r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.oe.compare(java.lang.Object, java.lang.Object):int");
    }
}
