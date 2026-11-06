package org.apache.commons.lang;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IncompleteArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = 4954193403612068178L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IncompleteArgumentException(java.lang.String r2, java.lang.String[] r3) {
        /*
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " is missing the following items: "
            r0.append(r2)
            java.lang.String r2 = safeArrayToString(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.IncompleteArgumentException.<init>(java.lang.String, java.lang.String[]):void");
    }

    private static final String safeArrayToString(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        return Arrays.asList(objArr).toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IncompleteArgumentException(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " is incomplete."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.IncompleteArgumentException.<init>(java.lang.String):void");
    }
}
