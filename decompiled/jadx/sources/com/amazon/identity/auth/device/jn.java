package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jn {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.amazon.identity.auth.device.pq r4, android.content.ComponentName r5) {
        /*
            r0 = 0
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r2 = r4.b     // Catch: java.lang.Exception -> La android.content.pm.PackageManager.NameNotFoundException -> Lc
            android.content.pm.ServiceInfo r5 = r2.getServiceInfo(r5, r1)     // Catch: java.lang.Exception -> La android.content.pm.PackageManager.NameNotFoundException -> Lc
            goto L17
        La:
            r2 = move-exception
            goto Le
        Lc:
            r4 = move-exception
            goto L3f
        Le:
            com.amazon.identity.auth.device.pq.a(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            android.content.pm.PackageManager r2 = r4.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            android.content.pm.ServiceInfo r5 = r2.getServiceInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
        L17:
            r1 = 1
            if (r5 != 0) goto L1b
            goto L3a
        L1b:
            java.lang.String r2 = r5.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            com.amazon.identity.auth.device.vn r3 = com.amazon.identity.auth.device.pq.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            android.content.Context r4 = r4.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            r3.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            android.os.Bundle r3 = new android.os.Bundle     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            boolean r4 = com.amazon.identity.auth.device.vn.a(r4, r2, r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            if (r4 != 0) goto L3b
            java.lang.String r4 = "TrustedPackageManager"
            java.lang.String r4 = com.amazon.identity.auth.device.yf.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
            java.lang.String r5 = "Cannot get ServiceInfo from package since it is not signed with the Amazon Cert."
            android.util.Log.e(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
        L3a:
            r5 = 0
        L3b:
            if (r5 == 0) goto L3e
            r0 = r1
        L3e:
            return r0
        L3f:
            throw r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L40
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.jn.a(com.amazon.identity.auth.device.pq, android.content.ComponentName):boolean");
    }
}
