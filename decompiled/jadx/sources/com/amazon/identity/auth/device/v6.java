package com.amazon.identity.auth.device;

import android.util.Log;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class v6 {
    public static final long f = 1000;
    public static final long g = 60000;
    public static final long h = 78000;

    /* renamed from: a, reason: collision with root package name */
    public final URL f1022a;
    public final long b;
    public final long c;
    public final SecureRandom d;
    public int e;

    public v6(int i, URL url, long j) {
        long min;
        this.e = 0;
        this.f1022a = url;
        SecureRandom secureRandom = new SecureRandom();
        this.d = secureRandom;
        long j2 = f;
        if (j <= j2) {
            Locale locale = Locale.ENGLISH;
            Log.i(yf.a("BackoffInfo"), a$$ExternalSyntheticOutline0.m(j2, " ms", a$$ExternalSyntheticOutline0.m("Backoff interval cannot be less than ", j2, " ms, set interval to ")));
            min = xb.a(j2, 30, secureRandom);
        } else {
            min = Math.min(j, h);
        }
        this.b = min;
        this.c = System.currentTimeMillis() + min;
        this.e = i;
    }

    public final v6 a(URL url) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.c;
        boolean z = currentTimeMillis < j;
        boolean z2 = j - currentTimeMillis < h;
        if (z && z2) {
            return this;
        }
        int min = (int) Math.min(this.b * 2, g);
        Locale locale = Locale.ENGLISH;
        Log.i(yf.a("BackoffInfo"), AppLaunchChecker$$ExternalSyntheticOutline0.m("Last backoff interval is ", this.b, " ms, updating backoff info..."));
        int i = this.e + 1;
        this.e = i;
        return new v6(i, url, xb.a(min, 30, this.d));
    }
}
