package com.amazon.identity.auth.device;

import android.content.Context;
import com.amazon.identity.mobi.common.utils.SystemWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bn {
    public static final long e = 15000;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f538a = new Object[0];
    public final tn b;
    public final n3 c;
    public final SystemWrapper d;

    public bn(Context context) {
        tn a2 = tn.a(context);
        this.b = a2;
        this.c = (n3) a2.getSystemService("sso_alarm_maanger");
        this.d = (SystemWrapper) a2.getSystemService("dcp_system");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r3.longValue() <= r1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.identity.auth.device.an a() {
        /*
            r9 = this;
            java.lang.Object[] r0 = r9.f538a
            monitor-enter(r0)
            com.amazon.identity.mobi.common.utils.SystemWrapper r1 = r9.d     // Catch: java.lang.Throwable -> L2e
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            com.amazon.identity.auth.device.tn r3 = r9.b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "sync_dirty_data_store"
            com.amazon.identity.auth.device.le r3 = com.amazon.identity.auth.device.le.b(r3, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "sync_dirty_data_store_time"
            android.content.SharedPreferences r5 = r3.f789a     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L2e
            r5 = 0
            if (r4 == 0) goto L30
            java.lang.String r4 = "sync_dirty_data_store_time"
            android.content.SharedPreferences r3 = r3.f789a     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            long r3 = r3.getLong(r4, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r9 = move-exception
            goto L96
        L30:
            r3 = r5
        L31:
            if (r3 != 0) goto L34
            goto L3c
        L34:
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L2e
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 > 0) goto L5b
        L3c:
            com.amazon.identity.auth.device.tn r4 = r9.b     // Catch: java.lang.Throwable -> L2e
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = "com.amazon.identity.action.SYNC_DIRTY_DATA"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<com.amazon.identity.auth.device.storage.DirtyDataSyncingService> r7 = com.amazon.identity.auth.device.storage.DirtyDataSyncingService.class
            r6.setClass(r4, r7)     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r8 = 1140850688(0x44000000, float:512.0)
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r4, r7, r6, r8)     // Catch: java.lang.Throwable -> L2e
            com.amazon.identity.auth.device.framework.PendingIntentWrapper$PendingIntentType r6 = com.amazon.identity.auth.device.framework.PendingIntentWrapper$PendingIntentType.Broadcast     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L56
            goto L5b
        L56:
            com.amazon.identity.auth.device.framework.n r5 = new com.amazon.identity.auth.device.framework.n     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
        L5b:
            if (r5 != 0) goto L6b
            java.lang.String r1 = "RetrySyncDirtyDataScheduler"
            com.amazon.identity.auth.device.yf.a(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "user"
            java.lang.String r2 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L2e
            r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L2e
            goto L8f
        L6b:
            java.lang.String r4 = "RetrySyncDirtyDataScheduler"
            com.amazon.identity.auth.device.yf.a(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "user"
            java.lang.String r6 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L2e
            r4.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L2e
            long r6 = com.amazon.identity.auth.device.bn.e     // Catch: java.lang.Throwable -> L2e
            long r1 = r1 + r6
            com.amazon.identity.auth.device.n3 r4 = r9.c     // Catch: java.lang.Throwable -> L2e
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L2e
            com.amazon.identity.auth.device.tn r4 = r9.b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "sync_dirty_data_store"
            com.amazon.identity.auth.device.le r4 = com.amazon.identity.auth.device.le.b(r4, r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "sync_dirty_data_store_time"
            r4.a(r6, r1)     // Catch: java.lang.Throwable -> L2e
        L8f:
            com.amazon.identity.auth.device.an r1 = new com.amazon.identity.auth.device.an     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r9, r5, r3)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r1
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.bn.a():com.amazon.identity.auth.device.an");
    }
}
