package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class nq {
    public static final AtomicInteger h = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f843a;
    public final int b;
    public final lg c;
    public final String d;
    public final int e;
    public final long f;
    public boolean g;

    public nq(String str, int i, int i2, String str2, String str3) {
        this.f = System.nanoTime();
        this.g = false;
        this.b = i;
        this.f843a = str;
        this.e = i2;
        yf.a("Tracer created. Tracer Id : %s API Name : %s", Integer.valueOf(i), str);
        lg a2 = jg.a();
        this.c = a2;
        a2.f790a = str;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = a2.k;
            if (sb == null) {
                a2.k = new StringBuilder(str2);
            } else {
                sb.append(",");
                sb.append(str2);
            }
        }
        if (TextUtils.isEmpty(str3)) {
            a2.j = yf.f1091a;
            this.d = yf.f1091a;
        } else {
            a2.j = str3;
            this.d = str3;
        }
    }

    public static nq a(Intent intent, String str) {
        if (intent == null) {
            return new nq(str);
        }
        int intExtra = intent.getIntExtra("traceId", (Process.myPid() * 1000) + (h.incrementAndGet() % 1000));
        String stringExtra = intent.getStringExtra("apiName");
        int intExtra2 = intent.getIntExtra("callingUid", -1);
        String stringExtra2 = intent.getStringExtra("counters");
        String stringExtra3 = intent.getStringExtra("callingPackage");
        if (TextUtils.isEmpty(stringExtra)) {
            yf.a("Tracer");
            "user".equalsIgnoreCase(Build.TYPE);
            return new nq(str, intExtra, intExtra2, stringExtra2, stringExtra3);
        }
        yf.a("Tracer");
        "user".equalsIgnoreCase(Build.TYPE);
        return new nq(stringExtra, intExtra, intExtra2, stringExtra2, stringExtra3);
    }

    public nq(String str) {
        this(str, (Process.myPid() * 1000) + (h.incrementAndGet() % 1000), Binder.getCallingUid(), null, null);
    }

    public static nq a(String str, Bundle bundle) {
        if (bundle == null) {
            return new nq(str);
        }
        int i = bundle.getInt("traceId", (Process.myPid() * 1000) + (h.incrementAndGet() % 1000));
        String string = bundle.getString("apiName");
        int i2 = bundle.getInt("callingUid", -1);
        String string2 = bundle.getString("counters");
        String string3 = bundle.getString("callingPackage");
        if (TextUtils.isEmpty(string)) {
            return new nq(str, i, i2, string2, string3);
        }
        return new nq(string, i, i2, string2, string3);
    }

    public final void a(Intent intent) {
        String sb;
        if (intent == null) {
            return;
        }
        intent.putExtra("traceId", this.b);
        intent.putExtra("apiName", this.f843a);
        StringBuilder sb2 = this.c.k;
        if (sb2 == null) {
            sb = "";
        } else {
            sb = sb2.toString();
        }
        intent.putExtra("counters", sb);
        intent.putExtra("callingPackage", this.d);
    }

    public final void a(Bundle bundle) {
        String sb;
        bundle.putInt("traceId", this.b);
        bundle.putString("apiName", this.f843a);
        StringBuilder sb2 = this.c.k;
        if (sb2 == null) {
            sb = "";
        } else {
            sb = sb2.toString();
        }
        bundle.putString("counters", sb);
        bundle.putString("callingPackage", this.d);
    }

    public final String a(Context context) {
        String[] packagesForUid;
        try {
            return (this.e == -1 || (packagesForUid = context.getPackageManager().getPackagesForUid(this.e)) == null) ? "unknown" : Arrays.toString(packagesForUid);
        } catch (Exception e) {
            Log.w(yf.a("Tracer"), b0.a("Couldn't get packages for the calling uid.Error Message : ", e.getMessage()));
            return "unknown";
        }
    }

    public final void a(String str) {
        this.c.a(str, Double.valueOf(1.0d));
    }

    public final void a(boolean z) {
        this.c.i = Boolean.valueOf(z);
    }

    public final void a() {
        String sb;
        if (this.g) {
            return;
        }
        StringBuilder sb2 = this.c.k;
        if (sb2 == null) {
            sb = "";
        } else {
            sb = sb2.toString();
        }
        if (TextUtils.isEmpty(sb)) {
            return;
        }
        this.g = true;
        lg lgVar = this.c;
        lgVar.l = mn.b;
        lgVar.h = Double.valueOf(Long.valueOf((System.nanoTime() - this.f) / 1000000).doubleValue());
        lgVar.a().a();
    }
}
