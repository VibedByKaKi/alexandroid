package com.amazon.identity.auth.device;

import androidx.collection.SieveCacheKt;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class xb {
    public static final HashMap g = new HashMap();
    public final int b;
    public final int c;

    /* renamed from: a, reason: collision with root package name */
    public final SecureRandom f1065a = new SecureRandom();
    public int d = 0;
    public int e = 1;
    public final int f = 30;

    public xb(int i, int i2) {
        this.b = i;
        this.c = i2;
        if (i <= 0) {
            this.b = 10;
            yf.b("ExponentialBackoffHelper", "ExponentialBackoffHelper: was constructed with a first retry interval value less than or equal to zero. It has been set to a default value (%d ms)", 10);
        }
    }

    public static v6 a(URL url) {
        v6 v6Var;
        String str = url.getHost() + url.getPath();
        HashMap hashMap = g;
        synchronized (hashMap) {
            try {
                v6 v6Var2 = (v6) hashMap.get(str);
                v6Var = v6Var2 == null ? new v6(1, url, v6.f) : v6Var2.a(url);
                hashMap.put(str, v6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return v6Var;
    }

    public static v6 b(URL url) {
        v6 v6Var;
        HashMap hashMap = g;
        synchronized (hashMap) {
            v6Var = (v6) hashMap.get(url.getHost() + url.getPath());
        }
        return v6Var;
    }

    public static int a(long j, int i, SecureRandom secureRandom) {
        if (((int) Math.min(SieveCacheKt.NodeLinkMask, ((i * 2) * j) / 100)) == 0) {
            return (int) j;
        }
        return (int) ((j - (r6 / 2)) + secureRandom.nextInt(r6));
    }
}
