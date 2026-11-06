package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.amazon.identity.auth.device.api.CrossAppContextProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b9 {
    public static b9 f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f530a;
    public final ExecutorService b;
    public final ConcurrentHashMap c;
    public final HashMap d;
    public final bn e;

    public b9(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f530a = applicationContext;
        fh fhVar = fp.f623a;
        this.b = Executors.newSingleThreadExecutor(new gh("MAP-CrossAppPropagatorThread"));
        this.c = new ConcurrentHashMap();
        this.d = new HashMap();
        this.e = new bn(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r8 = defpackage.a$$ExternalSyntheticOutline0.m2m("DeadObjectException for ", r3, ", attempt ");
        r7 = r7 + 1;
        r8.append(r7);
        com.amazon.identity.auth.device.yf.c("CrossAppContextPropagator", r8.toString(), "CrossAppPropagator:DeadObjectException");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.identity.auth.device.c9 r12, android.content.ContentValues r13, java.util.HashSet r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.b9.a(com.amazon.identity.auth.device.c9, android.content.ContentValues, java.util.HashSet):void");
    }

    public static synchronized b9 a(Context context) {
        b9 b9Var;
        synchronized (b9.class) {
            try {
                if (f == null) {
                    f = new b9(context);
                }
                b9Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b9Var;
    }

    public final HashSet a() {
        List<ResolveInfo> queryIntentContentProviders = this.f530a.getPackageManager().queryIntentContentProviders(new Intent(CrossAppContextProvider.ACTION), 0);
        String packageName = this.f530a.getPackageName();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            ProviderInfo providerInfo = resolveInfo.providerInfo;
            if (providerInfo != null && !packageName.equals(providerInfo.packageName)) {
                hashSet.add(resolveInfo.providerInfo.authority);
            }
        }
        return hashSet;
    }
}
