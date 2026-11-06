package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vn {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r4, java.lang.String r5, boolean r6, android.os.Bundle r7) {
        /*
            com.amazon.identity.auth.device.pq r0 = new com.amazon.identity.auth.device.pq
            r1 = 0
            r0.<init>(r4, r1)
            java.lang.String r4 = r0.f886a
            boolean r4 = r4.equals(r5)
            r2 = 1
            if (r4 == 0) goto L10
            goto L5f
        L10:
            boolean r4 = r0.c
            if (r4 == 0) goto L1d
            java.lang.String r4 = "checkIsAmazonDevice"
            boolean r4 = r7.getBoolean(r4)
            if (r4 != 0) goto L1d
            goto L5d
        L1d:
            android.content.pm.PackageManager r4 = r0.b     // Catch: java.lang.Exception -> L26
            java.lang.String r7 = r0.f886a     // Catch: java.lang.Exception -> L26
            int r4 = r4.checkSignatures(r7, r5)     // Catch: java.lang.Exception -> L26
            goto L32
        L26:
            r4 = move-exception
            com.amazon.identity.auth.device.pq.a(r4)
            android.content.pm.PackageManager r4 = r0.b
            java.lang.String r7 = r0.f886a
            int r4 = r4.checkSignatures(r7, r5)
        L32:
            if (r4 != 0) goto L35
            goto L5f
        L35:
            java.util.HashSet r4 = r0.e
            if (r4 != 0) goto L3a
            goto L5d
        L3a:
            android.content.pm.PackageManager r4 = r0.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r7 = 64
            android.content.pm.PackageInfo r4 = com.amazon.identity.auth.device.pq.a(r5, r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.util.HashSet r5 = r0.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r5 != 0) goto L49
            goto L5a
        L49:
            int r7 = r4.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r0 = r1
        L4b:
            if (r0 >= r7) goto L5a
            r3 = r4[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            boolean r3 = r5.contains(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L57
            r4 = r2
            goto L5b
        L57:
            int r0 = r0 + 1
            goto L4b
        L5a:
            r4 = r1
        L5b:
            if (r4 != 0) goto L5f
        L5d:
            r4 = -3
            goto L62
        L5f:
            r4 = r1
            goto L62
        L61:
            r4 = -4
        L62:
            if (r4 != 0) goto L65
            r1 = r2
        L65:
            if (r6 == 0) goto L80
            java.lang.String r4 = "SignatureBasedPackageTrustLogic"
            if (r1 == 0) goto L77
            com.amazon.identity.auth.device.yf.a(r4)
            java.lang.String r4 = android.os.Build.TYPE
            java.lang.String r5 = "user"
            r5.equalsIgnoreCase(r4)
            goto L80
        L77:
            java.lang.String r5 = "MAP doesn't trust the package. Usually it is because the app is signed with a different cert comparing to current package"
            java.lang.String r4 = com.amazon.identity.auth.device.yf.a(r4)
            android.util.Log.e(r4, r5)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.vn.a(android.content.Context, java.lang.String, boolean, android.os.Bundle):boolean");
    }
}
