package org.apache.commons.lang;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IllegalClassException extends IllegalArgumentException {
    private static final long serialVersionUID = 8063272569377254819L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IllegalClassException(java.lang.Class r3, java.lang.Object r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Expected: "
            r0.<init>(r1)
            java.lang.String r3 = safeGetClassName(r3)
            r0.append(r3)
            java.lang.String r3 = ", actual: "
            r0.append(r3)
            if (r4 != 0) goto L18
            java.lang.String r3 = "null"
            goto L20
        L18:
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
        L20:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.IllegalClassException.<init>(java.lang.Class, java.lang.Object):void");
    }

    private static final String safeGetClassName(Class cls) {
        if (cls == null) {
            return null;
        }
        return cls.getName();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IllegalClassException(java.lang.Class r3, java.lang.Class r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Expected: "
            r0.<init>(r1)
            java.lang.String r3 = safeGetClassName(r3)
            r0.append(r3)
            java.lang.String r3 = ", actual: "
            r0.append(r3)
            java.lang.String r3 = safeGetClassName(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.IllegalClassException.<init>(java.lang.Class, java.lang.Class):void");
    }

    public IllegalClassException(String str) {
        super(str);
    }
}
